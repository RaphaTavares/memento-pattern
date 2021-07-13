package com.company.tests;

import com.company.*;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class PedidoTest {

    @Test
    public void deveArmazenarEstados(){
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertEquals(3, pedido.getEstados().size());
    }

    @Test
    public void deveRetornarEstadoInicial(){
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        pedido.restauraEstado(0);
        assertEquals(PedidoEstadoRealizado.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveRetornarEstadoAnterior(){
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        pedido.restauraEstado(1);
        assertEquals(PedidoEstadoAceito.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveRetornarExcecaoIndiceInvalido(){
        try{
            Pedido pedido = new Pedido();
            pedido.restauraEstado(1);
            fail();
        } catch(IllegalArgumentException e){
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}

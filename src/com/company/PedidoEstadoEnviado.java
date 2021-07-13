package com.company;

public class PedidoEstadoEnviado implements PedidoEstado{

    private static PedidoEstadoEnviado instance = new PedidoEstadoEnviado();
    public static PedidoEstadoEnviado getInstance() {
        return instance;
    }


    @Override
    public String getEstado() {
        return "pedido em rota de entrega";
    }

    @Override
    public String aceitar(Pedido pedido) {
        return "não é possível aceitar o pedido";
    }

    @Override
    public String enviar(Pedido pedido) {
        return "não é possível enviar o pedido";
    }

    @Override
    public String entregar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        return "pedido entregue com sucesso!";
    }

    @Override
    public String cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return "Pedido cancelado com sucesso";
    }
}

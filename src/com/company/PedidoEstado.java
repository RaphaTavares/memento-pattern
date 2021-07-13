package com.company;

public interface PedidoEstado {

    String getEstado();

    String aceitar(Pedido pedido);

    String enviar(Pedido pedido);

    String entregar(Pedido pedido);

    String cancelar(Pedido pedido);


}

package com.company;

public class PedidoEstadoEntregue implements PedidoEstado{

    private static PedidoEstadoEntregue instance = new PedidoEstadoEntregue();
    public static PedidoEstadoEntregue getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "pedido entregue, agr é só comer!";
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
        return "não é possível entregar o pedido";
    }

    @Override
    public String cancelar(Pedido pedido) {
        return "não é possível cancelar o pedido";
    }
}

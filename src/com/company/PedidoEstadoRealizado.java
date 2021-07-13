package com.company;

public class PedidoEstadoRealizado implements PedidoEstado{

    private static PedidoEstadoRealizado instance = new PedidoEstadoRealizado();
    public static PedidoEstadoRealizado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pedido realizado. Em aprovação.";
    }

    @Override
    public String aceitar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoAceito.getInstance());
        return "pedido aceito";
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
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return "pedido cancelado";
    }
}

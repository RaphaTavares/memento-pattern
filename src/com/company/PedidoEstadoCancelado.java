package com.company;

public class PedidoEstadoCancelado implements PedidoEstado{

    private static PedidoEstadoCancelado instance = new PedidoEstadoCancelado();
    public static PedidoEstadoCancelado getInstance() {
        return instance;
    }


    @Override
    public String getEstado() {
        return "pedido cancelado, faça outro pedido ou morra de fome!";
    }

    @Override
    public String aceitar(Pedido pedido) {
        return "não é possível aceitar o pedido";
    }

    @Override
    public String enviar(Pedido pedido) {
        return "não é possivel enviar o pedido";
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

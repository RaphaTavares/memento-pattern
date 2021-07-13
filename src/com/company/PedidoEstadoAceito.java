package com.company;

public class PedidoEstadoAceito implements PedidoEstado {

    private static PedidoEstadoAceito instance = new PedidoEstadoAceito();
    public static PedidoEstadoAceito getInstance() {
        return instance;
    }

    public String getEstado(){
        return "pedido Aceito. Em preparação.";
    }

    @Override
    public String aceitar(Pedido pedido) {
        return "não é possível aceitar o pedido";
    }

    @Override
    public String enviar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        return "pedido enviado";
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

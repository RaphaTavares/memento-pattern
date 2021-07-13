package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private String lanche;
    private PedidoEstado estado;
    private List<PedidoEstado> memento = new ArrayList<PedidoEstado>();

    public Pedido() {
        this.estado = PedidoEstadoRealizado.getInstance();
        this.memento.add(PedidoEstadoRealizado.getInstance());
    }

    public String getLanche() {
        return lanche;
    }

    public Pedido setLanche(String lanche) {
        this.lanche = lanche;
        return this;
    }

    public PedidoEstado getEstado() {
        return estado;
    }

    public void setEstado(PedidoEstado estado){
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice){
        if(indice < 0 || indice > this.memento.size() -1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<PedidoEstado> getEstados(){
        return this.memento;
    }
    public String aceitar(){
        return estado.aceitar(this);
    }

    public String enviar(){
        return estado.enviar(this);
    }

    public String entregar(){
        return estado.entregar(this);
    }

    public String cancelar(){
        return estado.cancelar(this);
    }
}

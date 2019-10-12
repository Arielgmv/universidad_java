package com.gm.mundopc;

public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamanho;
    private static int contadorMonitores;

    //Constructor vacio
    private Monitor(){
        this.idMonitor = ++contadorMonitores;
    }

    //Constructor sobrecargado con 2 argumentos
    public Monitor(String marca, double tamanho){
        this();
        this.marca = marca;
        this.tamanho = tamanho;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }
}
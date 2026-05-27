package com.logistica;

abstract class Veiculo {
    private String placa;
    private String modelo;
    private double quilometragem;
    private double custo_por_km;
    private double capacidade_carga;

    public Veiculo(String placa, String modelo, double quilometragem, double custo_por_km, double capacidade_carga) {
        this.placa = placa;
        this.modelo = modelo;
        this.quilometragem = quilometragem;
        this.custo_por_km = custo_por_km;
        this.capacidade_carga = capacidade_carga;
    }

    abstract double calcularCusto(double distancia);

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public double getCustoPorKm() {
        return custo_por_km;
    }

    public double getCapacidadeCarga() {
        return capacidade_carga;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void setCustoPorKm(double custo_por_km) {
        this.custo_por_km = custo_por_km;
    }

    public void setCapacidadeCarga(double capacidade_carga) {
        this.capacidade_carga = capacidade_carga;
    }

}

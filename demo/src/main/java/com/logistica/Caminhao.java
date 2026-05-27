package com.logistica;

public class Caminhao extends Veiculo implements Manutenivel {
    private Integer quantidade_eixos;

    public Caminhao(String placa, String modelo, Double quilometragem, Double custo_por_km, Integer quantidade_eixos, Double capacidade_carga) {
        super(placa, modelo, quilometragem, custo_por_km, capacidade_carga);
        this.quantidade_eixos = quantidade_eixos;
    }

    @Override
    double calcularCusto(double distancia) {
        double custo_km = super.getCustoPorKm();
        double calc = distancia * custo_km;
        return calc + (this.quantidade_eixos * 10.0);
    }

    public Integer getQuantidadeEixos() {
        return quantidade_eixos;
    }

    public void setQuantidadeEixos(Integer quantidade_eixos) {
        this.quantidade_eixos = quantidade_eixos;
    }

    @Override
    public void verificarManutencao() {
        if(getQuilometragem() > 50000) {
            System.out.println("Caminhão " + getModelo() + " precisa de manutenção.");
        } else {
            System.out.println("Caminhão " + getModelo() + " está em boas condições.");
        }
    }
}

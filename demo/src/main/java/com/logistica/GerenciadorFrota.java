package com.logistica;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorFrota {

    private List<Veiculo> frota;

    public GerenciadorFrota() {
        this.frota = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        this.frota.add(veiculo);
    }

    public void relatorio_viagem(double distancia) {
        for (Veiculo veiculo : frota) {
            double custo = veiculo.calcularCusto(distancia);
            System.out.println("Veículo: " + veiculo.getModelo() + " - Custo da viagem: R$ " + custo + " - Placa: " + veiculo.getPlaca());
        }
    }

    public void verificarManutencao() {
        for (Veiculo veiculo : frota) {
            if (veiculo instanceof Manutenivel) {
                ((Manutenivel) veiculo).verificarManutencao();
            }
        }
    }

}

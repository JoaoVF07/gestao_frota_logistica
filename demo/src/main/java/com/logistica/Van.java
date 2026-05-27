package com.logistica;

public class Van extends Veiculo {
    private Boolean possui_isolamento_termico;

    public Van(String placa, String modelo, Double quilometragem, Double custo_por_km, Boolean possui_isolamento_termico, Double capacidade_carga) {
        super(placa, modelo, quilometragem, custo_por_km, capacidade_carga);
        this.possui_isolamento_termico = possui_isolamento_termico;
    }

    @Override
    double calcularCusto(double distancia) {
        double custo_km = super.getCustoPorKm();
        double calc = distancia * custo_km;
        return calc + (this.possui_isolamento_termico ? 45.0 : 0.0);
    }

    public Boolean getPossuiIsolamentoTermico() {
        return possui_isolamento_termico;
    }

    public void setPossuiIsolamentoTermico(Boolean possui_isolamento_termico) {
        this.possui_isolamento_termico = possui_isolamento_termico;
    }

}

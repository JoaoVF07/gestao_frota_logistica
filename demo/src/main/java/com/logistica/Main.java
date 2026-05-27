package com.logistica;

public class Main {
    public static void main(String[] args) {
        GerenciadorFrota gerenciador = new GerenciadorFrota();

        Caminhao caminhao1 = new Caminhao("ABC1234", "Volvo FH", 50000.0, 2.5, 3, 20.0);
        Van van1 = new Van("XYZ5678", "Mercedes Sprinter", 30000.0, 1.8, true, 2.0);
        Caminhao caminhao2 = new Caminhao("DEF5678", "Scania R500", 60000.0, 2.8, 4, 25.0);
        Van van2 = new Van("UVW1234", "Fiat Ducato", 20000.0, 1.5, false, 1.5);
        gerenciador.adicionarVeiculo(caminhao1);
        gerenciador.adicionarVeiculo(van1);
        gerenciador.adicionarVeiculo(caminhao2);
        gerenciador.adicionarVeiculo(van2);

        System.out.println("Relatório de Viagem:");
        gerenciador.relatorio_viagem(150.0);

        System.out.println("\nVerificação de Manutenção:");
        gerenciador.verificarManutencao();
    }
}
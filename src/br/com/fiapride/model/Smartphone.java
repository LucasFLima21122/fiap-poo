package br.com.fiapride.model;

public class Smartphone {
    public String marca;
    public String modelo;
    public int armazenamentoInternoGb;
    public int espacoOcupadoGb = 0; // Começa vazio
    public int nivelBateria = 50;  // Começa com 50%

    // MÉTODO 1: Recarregar
    public void recarregarBateria(int quantidade) {
        if (quantidade > 0) {
            nivelBateria += quantidade;
            if (nivelBateria > 100) nivelBateria = 100; // Regra: Não passa de 100%
            System.out.println("Carregando... Bateria atual: " + nivelBateria + "%");
        } else {
            System.out.println("Erro: Quantidade de carga inválida!");
        }
    }

    // MÉTODO 2: Instalar App
    public void instalarApp(int tamanhoGb) {
        if (espacoOcupadoGb + tamanhoGb <= armazenamentoInternoGb) {
            espacoOcupadoGb += tamanhoGb;
            System.out.println("App instalado! Espaço ocupado: " + espacoOcupadoGb + "GB");
        } else {
            System.out.println("Erro: Memória insuficiente para instalar este app!");
        }
    }
}
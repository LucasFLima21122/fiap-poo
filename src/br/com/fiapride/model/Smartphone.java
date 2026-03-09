package br.com.fiapride.model;

public class Smartphone {
    public String marca;
    public String modelo;
    public int armazenamentoTotalGb;
    public int armazenamentoOcupadoGb = 0;
    public int nivelBateria = 50;

    // Ação: Verbo no infinitivo | Argumento: Nome significativo
    public void recarregarBateria(int percentualCarga) {
        if (percentualCarga <= 0) {
            System.out.println("Erro: A carga deve ser positiva.");
            return; // Early return para evitar aninhamento de IFs
        }

        this.nivelBateria += percentualCarga;

        if (this.nivelBateria > 100) {
            this.nivelBateria = 100;
        }
        System.out.println("Bateria em: " + this.nivelBateria + "%");
    }

    // Ação: Verbo no infinitivo | Argumento: Nome significativo
    public void instalarAplicativo(int tamanhoDoAppGb) {
        // Validação clara da regra de negócio
        if (tamanhoDoAppGb <= 0) {
            System.out.println("Erro: Tamanho de app inválido.");
            return;
        }

        if (this.armazenamentoOcupadoGb + tamanhoDoAppGb > this.armazenamentoTotalGb) {
            System.out.println("Erro: Memória insuficiente!");
        } else {
            this.armazenamentoOcupadoGb += tamanhoDoAppGb;
            System.out.println("Instalação concluída. Ocupado: " + this.armazenamentoOcupadoGb + "GB");
        }
    }
}
package br.com.fiapride.main;
import br.com.fiapride.model.Smartphone;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Smartphone meuS24 = new Smartphone();
        meuS24.marca = "Samsung";
        meuS24.armazenamentoInternoGb = 128;

        // Teste de bateria (Valor válido e estouro)
        meuS24.recarregarBateria(20);  // Vai para 70
        meuS24.recarregarBateria(100); // Deve travar em 100

        // Teste de memória (Valor válido e inválido)
        meuS24.instalarApp(50);  // Sucesso
        meuS24.instalarApp(100); // Deve dar erro (50 + 100 > 128)
    }
}
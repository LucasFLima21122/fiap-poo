package br.com.fiapride.main;

// Importamos a nossa nova classe
import br.com.fiapride.model.Smartphone;

public class SistemaPrincipal {

    public static void main(String[] args) {
        
        Smartphone meuCelular = new Smartphone();
        meuCelular.marca = "Apple";
        meuCelular.modelo = "iPhone 15";
        meuCelular.memoriaRamGb = 6;
        meuCelular.armazenamentoInternoGb = 128;
        meuCelular.tem5G = true;

        Smartphone celularReserva = new Smartphone();
        celularReserva.marca = "Samsung";
        celularReserva.modelo = "Galaxy S23";
        celularReserva.memoriaRamGb = 8;
        celularReserva.armazenamentoInternoGb = 256;
        celularReserva.tem5G = true;

        System.out.println("--- Inventário de Dispositivos ---");
        
        System.out.println("Meu Celular Principal: " + meuCelular.marca + " " + meuCelular.modelo);
        System.out.println("Memória RAM: " + meuCelular.memoriaRamGb + "GB");
        
        System.out.println("---------------------------------");
        
        System.out.println("Celular de Reserva: " + celularReserva.marca + " " + celularReserva.modelo);
        System.out.println("Armazenamento: " + celularReserva.armazenamentoInternoGb + "GB");
    }
}
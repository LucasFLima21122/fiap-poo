# FiapRide - Objeto Smartphone

Este projeto representa um smartphone utilizando conceitos de Programação Orientada a Objetos em Java.

A classe `Smartphone` simula algumas funcionalidades básicas de um celular, como gerenciamento de bateria e controle do armazenamento interno para instalação de aplicativos.

## Classe Smartphone

A classe Smartphone possui atributos que representam características de um aparelho celular:

- marca
- modelo
- armazenamentoInternoGb
- espacoOcupadoGb
- nivelBateria

O smartphone inicia com 50% de bateria e 0GB de espaço ocupado.

## Métodos

### recarregarBateria(int quantidade)

Responsável por aumentar o nível de bateria do smartphone.

Regras:
- A quantidade deve ser maior que 0.
- O nível máximo de bateria é 100%.

Exemplo de uso:


smartphone.recarregarBateria(20);


### instalarApp(int tamanhoGb)

Responsável por instalar um aplicativo e ocupar espaço da memória interna.

Regras:
- O aplicativo só pode ser instalado se houver espaço disponível no armazenamento.

Exemplo de uso:


smartphone.instalarApp(50);


## Exemplo de uso no sistema


Smartphone meuS24 = new Smartphone();
meuS24.marca = "Samsung";
meuS24.armazenamentoInternoGb = 128;

meuS24.recarregarBateria(20);
meuS24.recarregarBateria(100);

meuS24.instalarApp(50);
meuS24.instalarApp(100);


## Objetivo do projeto

Praticar conceitos de Programação Orientada a Objetos, incluindo criação de classes, atributos, métodos, validação de regras de negócio e manipulação do estado de um objeto.
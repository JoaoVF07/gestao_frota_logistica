# Sistema CatLog - Gestão de Frota e Logística

Atividade desenvolvida em Java com foco nos conceitos de Programação Orientada a Objetos (POO), utilizando abstração, herança, polimorfismo, interfaces e collections.

## Objetivo

Simular o núcleo de um sistema de gerenciamento de frota para uma empresa de logística, permitindo o cadastro e controle de diferentes tipos de veículos, cálculo de custos de viagem e verificação de manutenção preventiva.

## Conceitos aplicados

- Classes abstratas
- Herança
- Polimorfismo
- Interfaces
- Encapsulamento
- Collections (`List`)
- Sobrescrita de métodos (`@Override`)
- Uso de `instanceof`

## Estrutura do projeto

### Classe abstrata `Veiculo`
Classe base contendo informações comuns aos veículos:
- placa
- modelo
- capacidade máxima de carga
- quilometragem
- custo por km

Também define o método abstrato:
```java
calcularCustoViagem(double distancia)

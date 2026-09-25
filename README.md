# Trabalho - Máquina de Estados

Trabalho acadêmico desenvolvido em Java para demonstrar o funcionamento de uma Máquina de Estados utilizando o padrão State.

## Cenário

O projeto simula a interação entre dois agentes: um Guarda e um Invasor.

O Guarda inicia patrulhando a área, enquanto o Invasor está explorando. Durante a execução, alguns eventos fazem os agentes mudarem de estado.

## Agentes e Estados

### Guarda

O Guarda possui três estados:

- PATRULHANDO
- PERSEGUINDO
- ATACANDO

Transições:

- No ciclo 4, o Guarda detecta o Invasor e passa de PATRULHANDO para PERSEGUINDO.
- No ciclo 7, o Guarda alcança o Invasor e passa de PERSEGUINDO para ATACANDO.
- No ciclo 10, o confronto termina e o Guarda retorna para PATRULHANDO.

### Invasor

O Invasor possui três estados:

- EXPLORANDO
- ESCONDENDO
- FUGINDO

Transições:

- No ciclo 4, o Invasor percebe que foi detectado e passa de EXPLORANDO para ESCONDENDO.
- No ciclo 7, o Invasor percebe a aproximação do Guarda e passa de ESCONDENDO para FUGINDO.
- No ciclo 10, o confronto termina e o Invasor retorna para EXPLORANDO.

## Padrão State

Foi utilizada a interface `Estado`, que define três métodos:

- `enter()` - executado quando o agente entra em um estado.
- `execute()` - executado enquanto o agente permanece no estado.
- `leave()` - executado quando o agente sai do estado.

Cada estado foi implementado em uma classe separada.

As classes `Guarda` e `Invasor` mantêm uma referência para o estado atual e realizam as mudanças de estado durante a execução.

## Comunicação entre os agentes

Existe comunicação entre os dois agentes.

Quando o Guarda detecta o Invasor, o Invasor reage entrando no estado ESCONDENDO.

Quando o Guarda alcança o Invasor, o Invasor reage entrando no estado FUGINDO.

Essas interações também são exibidas no console por meio dos logs de comunicação.

## Logs

Durante a execução, o programa apresenta informações no console indicando:

- ciclo atual;
- eventos;
- entrada em um estado;
- comportamento do estado;
- saída de um estado;
- comunicação entre os agentes.

## Tecnologias utilizadas

- Java
- Eclipse IDE
- Intellij IDEA
- Padrão State

## Autor

Gustavo Taques Senderski

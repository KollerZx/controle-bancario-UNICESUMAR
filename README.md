# Atividade 01 -Programação I - UNICESUMAR

Crie um controle de Bancário para gerenciar uma conta corrente e conta poupança. Onde deverá ter as seguintes classes:
## Conta
- que deverá ser abstrata e toda a conta possui número, agência, cliente e saldo;
- Número da conta e agência deverá ser maior que 0;
- Deverá ter um construtor com número, agência e cliente;
- Deverá iniciar um saldo 0;
- Deverá ter um método de sacar e depositar;
- O atributo saldo deverá ter apenas método get;
- O método sacar deverá ser abstrato;

## Cliente:
- Deverá ter um nome e cpf, ambos String;
- Deverá ter um construtor com todos os atributos;
- Deverá ter apenas métodos gets;

## Conta Corrente:
- deverá herdar de conta;
- Deverá retirar do saldo 0,10 a cada saque;
- Não deverá permitir sacar um valor superior ao saldo;

## Conta poupança: 
- deverá herdar de conta;
- Não deverá permitir sacar um valor superior ao saldo;
- Principal, deverá ter uma classe Principal que terá o método main;
- Deverá instanciar um objeto conta corrente;
- Deverá instanciar um objeto conta poupança;
- Deverá exibir todas as informações de todos os atributos de conta corrente e poupança;

Desafio 1 - multiplicação simples

Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois valores.
Atribua esta operação à variável PROD, mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).   

Entrada
A entrada contém 2 valores inteiros.

Saída
Exiba a variável PROD conforme exemplo abaixo, 
tendo obrigatoriamente um espaço em branco antes e depois da igualdade.
 
Exemplos de Entrada	
3
9
Exemplos de Saída
PROD = 27

Exemplos de Entrada
-30
10
Exemplos de Saída
PROD = -300

Exemplos de Entrada
0
9
Exemplos de Saída
PROD = 0

----------------------------------------------------------------------------------------------------------------------------

Desafio 2 - Coxinha de bueno

Em 2015 um novo record foi alcançado na competição de Coxinhas de Bueno de Andrada, onde Mônica mandou pra dentro 43 coxinhas em apenas 10 minutos, 
passando se antecessor que conseguiu comer, no mesmo tempo, 38 coxinhas em 2014.

O restaurante especializado em coxinhas do pequeno distrito de Bueno de Andrada, interior de São Paulo,
 organiza essa competição todos os anos, mas nunca conseguiram entrar para o livro dos recordes, o Guinness Book.
 Para isso, o restaurante precisa preencher informações sobre a competição, como o número de coxinhas consumidas pelos competidores durante o evento. 

Porém, como jó foi informado, a especialidade deles é coxinha, não matemática, então será que você pode ajudá-los? 
Com base no número total de coxinhas consumidas e o número de participantes na competição,
 o dono do restaurante precisa que você desenvolva um programa para saber a quantidade média de coxinha que os participantes da competição conseguem devorar.

Ah, lembre que, em troca da sua ajuda, você poderá comer quantas coxinhas conseguir.

Entrada
A entrada consiste de uma única linha que contém dois inteiros H e P (1 ≤ H, P ≤ 1000) 
indicando respectivamente o número total de coxinhas consumidas e o número total de participantes na competição.

Saída
Seu programa deve produzir uma única linha com um número racional representando o número 
médio de coxinhas consumidas pelos participantes. 
O resultado deve ser escrito como um número racional com exatamente dois dígitos após o ponto decimal,
arredondado se necessário.

 
Exemplos de Entrada	
10 90
Exemplos de Saída
0.11

Exemplos de Entrada 
840 11
Exemplos de Saída
76.36

Exemplos de Entrada 
1 50
Exemplos de Saída
0.02

----------------------------------------------------------------------------------------------------------------------------
Desafio 3 - Album da Copa

A Copa do Mundo de Futebol é um dos maiores eventos esportivos do Planeta Terra, e o álbum de figurinhas oficial 
é sempre um grande sucesso entre os amantes dessa competição. O álbum contém espaços numerados de 1 a N para colar 
as figurinhas; cada figurinha, também numerada de 1 a N, é uma pequena foto de um jogador de uma das seleções que 
jogará a Copa do Mundo. O objetivo é colar todas as figurinhas nos respectivos espaços no álbum, de modo a completar 
o álbum, ou seja, não deixar nenhum espaço sem a correspondente figurinha.

As figurinhas são vendidas em envelopes fechados, de forma que o comprador não sabe quais figurinhas está comprando, 
e pode ocorrer de comprar uma figurinha que ele já tenha colado no álbum.

Para ajudar os usuários, a empresa responsável pela venda do álbum e das figurinhas quer criar um aplicativo que permita
 gerenciar facilmente as figurinhas que faltam para completar o álbum e está solicitando a sua ajuda.

Dados o número total de espaços e figurinhas do álbum, e uma lista das figurinhas já compradas
 (que pode conter figurinhas repetidas), o seu desafio é determinar quantas figurinhas faltam para completar o álbum.

Entrada
A primeira linha contém um inteiro N (1 ≤ N ≤ 100) indicando o número total de figurinhas e espaços no álbum.
 A segunda linha contém um inteiro M (1 ≤ M ≤ 300) indicando o número de figurinhas já compradas. 
Cada uma das M linhas seguintes contém um número inteiro X (1 ≤ X ≤ N) indicando uma figurinha já comprada.

Saída
Seu programa deve produzir uma única linha contendo um inteiro representando o número de figurinhas que falta
 para completar o álbum.

 
Exemplos de Entrada	
10
3
5
8
3
Exemplos de Saída
7

Exemplos de Entrada
3
4
2
1
3
3
Exemplos de Saída
0

----------------------------------------------------------------------------------------------------------------------------
Desafio 4 - Degustação de vinho

Degustação de vinho às escuras é a habilidade de identificar um vinho usando apenas seus sentidos do olfato e paladar.

Durante uma competição de degustação, uma garrafa de vinho é aberta e dividia em taças para que os cinco 
competidores possam provar. Eles podem cheiras, saborear e avaliar a bebida para conseguir identificar qual 
o tipo do vinho, sendo: (1) Cabernet; (2) Merlot; (3) Pinot Noir. No final, as respostas são verificadas para
 determinar o número de suposições corretas.

Dado o qual foi o tipo do vinho e as respostas fornecidas, determine o número de participantes que receberam a
resposta correta.

Entrada
A primeira linha contém um inteiro T representando o tipo de vinho (1 ≤ T ≤ 4). 
A segunda linha contém cinco inteiros A, B, C, D e E, que indica a resposta dada por cada
 competidor (1 ≤ A, B, C, D, E ≤ 4).

Saída
A saída contém um inteiro representando o número de concorrentes que obtiveram a resposta correta.

Exemplos de Entrada	
1
1 2 3 2 1
Exemplos de Saída
2

Exemplos de Entrada
3
4 1 1 2 1
Exemplos de Saída
0
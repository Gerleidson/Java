Desafio 1

Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

Entrada
Você receberá 1 valor inteiro N, onde N > 0.

Saída
Exiba todos os números pares até o valor de entrada, sendo um em cada linha. 

 
Exemplo de Entrada	
6	

Exemplo de Saída
2
4
6
-------------------------------------------------------------------------------------------------------------------------------

Desafio 2

Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. 
A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. 
As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.

 
Exemplo de Entrada	
576.73

Exemplo de Saída
NOTAS:
5 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
1 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
1 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1.00
1 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
2 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
3 moeda(s) de R$ 0.01

Exemplo de Entrada
4.00

Exemplo de Saída
NOTAS:
0 nota(s) de R$ 100.00
0 nota(s) de R$ 50.00
0 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
0 nota(s) de R$ 5.00
2 nota(s) de R$ 2.00
MOEDAS:
0 moeda(s) de R$ 1.00
0 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
0 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
0 moeda(s) de R$ 0.01

Exemplo de Entrada
91.01

Exemplo de Saída
NOTAS:
0 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
2 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
0 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1.00
0 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
0 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
1 moeda(s) de R$ 0.01

-------------------------------------------------------------------------------------------------------------------------------

Desafio 3

Números em ponto flutuante podem ser bastante extensos para mostrar. Nesses casos, é conveniente usar a notação científica.

Você deve escrever um programa que, dado um número em ponto flutuante, mostre este número na notação científica: 
sempre mostre o sinal da mantissa; sempre mostre 4 casas decimais na mantissa; use o caractere 'E' para separar a mantissa do expoente; 
sempre mostre o sinal do expoente; e mostre o expoente com pelo menos 2 dígitos.

Entrada
A entrada é um número em ponto flutuante de dupla precisão X (de acordo com o padrão IEEE 754-2008). 
Nunca haverá um número com mais de 110 caracteres nem com mais de 6 casas decimais.

Saída
A saída é o número X em uma única linha na notação científica detalhada acima. Veja os exemplos abaixo.

 
Exemplos de Entrada	
3.141592

Exemplos de Saída
+3.1416E+00

Exemplos de Entrada	 
1.618033

Exemplos de Saída
+1.6180E+00

Exemplos de Entrada	 
602214085774747474747474

Exemplos de Saída
+6.0221E+23

Exemplos de Entrada	 
-0.000027

Exemplos de Saída
-2.7000E-05

Exemplos de Entrada	
-10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000

Exemplos de Saída
-1.0000E+100
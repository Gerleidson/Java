Desafio 1

Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. 
Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão na área direita da matriz,
conforme ilustrado abaixo (área verde).

Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), 
indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. 
Seguem os 144 valores de ponto flutuante que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.

Exemplo de Entrada	
S
1.0
330.0
-3.5
2.5
4.1
...

Exemplo de Saída
111.4

-------------------------------------------------------------------------------------------------------------------------------

Desafio 2

Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de um 
laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas informações,
 ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. 
Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'),
 indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, 
sendo que o percentual deve ser apresentado com dois dígitos após o ponto.

Exemplo de Entrada	

10
10 C
6 R
15 S
5 C
14 R
9 C
6 R
8 S
5 C
14 R

Exemplo de Saída

Total: 92 cobaias
Total de coelhos: 29
Total de ratos: 40
Total de sapos: 23

Percentual de coelhos: 31.52 %
Percentual de ratos: 43.48 %
Percentual de sapos: 25.00 %
-------------------------------------------------------------------------------------------------------------------------------

Desafio 3

O senhor Milli, morador da cidade Petland, é o famoso proprietário da maior fábrica de jogos de tabuleiros do mundo. 
Recentemente, ele teve a ideia de lançar um novo jogo exclusivo de tabuleiro, que ele apelidou de Tabuleiro da Frequência.
O jogo ocorre da seguinte forma. Inicialmente, um tabuleiro com dimensões N × N é dado contendo apenas 0’s. 
Depois disso, Q operações são propostas, podendo ser de 4 tipos:

1 X R: Atribuir o valor R a todos os números da linha X;

2 X R: Atribuir o valor R a todos os números da coluna X;

3 X: Imprimir o valor mais frequente na linha X;

4 X: Imprimir o valor mais frequente da coluna X.

Milli não é muito bom com computadores, mas é bastante preguiçoso. Sabendo que você é um dos melhores programadores do mundo,
ele precisa sua ajuda para resolver este problema.

Entrada
A primeira linha da entrada é composta por dois inteiros N e Q (1 ≤ N, Q ≤ 105), representando, respectivamente, 
o tamanho do tabuleiro e a quantidade de operações. As próximas Q linhas da entrada vão conter as Q operações. 
O primeiro inteiro de cada linha vai indicar o tipo da operação. Caso seja 1 ou 2, será seguido por mais dois inteiros X (1 ≤ X ≤ N) e R (0 ≤ R ≤ 50).
Caso seja 3 ou 4, será seguido por apenas mais um inteiro X.

Saída
Para cada operação do tipo 3 ou 4, seu programa deve produzir uma linha, contendo o valor da resposta correspondente. 
Se uma linha ou coluna tiver dois ou mais valores que se repetem o mesmo número de vezes, você deve imprimir o maior deles.
Por exemplo, se uma linha tem os valores [5,7,7,2,5,2,1,3], tanto o 2, 5 e 7 se repetem duas vezes, então a resposta será 7, pois é o maior deles.     
 
Exemplo de Entrada
2 4
1 1 1
2 2 2
3 1
3 2

Exemplo de Saída
2
2

Exemplo de Entrada
3 6
1 1 2
1 2 3
1 3 4
4 3
1 3 0
4 3

Exemplo de Saída
4
3
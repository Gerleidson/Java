Desafio 1

Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. 
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). 
Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 2 valores com uma casa decimal cada um.

Saída
Calcule e imprima a variável MEDIA conforme exemplo abaixo, 
com 5 dígitos após o ponto decimal e com um espaço em branco antes e depois da igualdade. 
Utilize variáveis de dupla precisão (double) e como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário,
 você receberá "Presentation Error".

 
Exemplos de Entrada	Exemplos de Saída
5.0
7.1			MEDIA = 6.43182

0.0
7.1			MEDIA = 4.84091

10.0
10.0			MEDIA = 10.00000

-------------------------------------------------------------------------------------------------------------------------------

Desafio 2

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

Desafio 3

O jogo de xadrez possui várias peças com movimentos curiosos: uma delas é a dama, que pode se mover qualquer quantidade de casas na mesma linha,
 na mesma coluna, ou em uma das duas diagonais, conforme exemplifica a figura abaixo:

O grande mestre de xadrez Kary Gasparov inventou um novo tipo de problema de xadrez: 
dada a posição de uma dama em um tabuleiro de xadrez vazio (ou seja, um tabuleiro 8 × 8, com 64 casas), de quantos movimentos,
 no mínimo, ela precisa para chegar em outra casa do tabuleiro?

Kary achou a solução para alguns desses problemas, mas teve dificuldade com outros, 
e por isso pediu que você escrevesse um programa que resolve esse tipo de problema.  

Entrada
A entrada contém vários casos de teste. A primeira e única linha de cada caso de teste contém quatro inteiros X1, Y1, X2 e Y2 (1 ≤ X1, Y1, X2, Y2 ≤ 8). 
A dama começa na casa de coordenadas (X1, Y1), e a casa de destino é a casa de coordenadas(X2, Y2). 
No tabuleiro, as colunas são numeradas da esquerda para a direita de 1 a 8 e as linhas de cima para baixo também de 1 a 8.
 As coordenadas de uma casa na linha X e coluna Y são (X, Y ).

O final da entrada é indicado por uma linha contendo quatro zeros.

Saída
Para cada caso de teste da entrada seu programa deve imprimir uma única linha na saída, 
contendo um número inteiro, indicando o menor número de movimentos necessários para a dama chegar em sua casa de destino.

 
Exemplo de Entrada	
4 4 6 2
3 5 3 5
5 5 4 3
0 0 0 0

Exemplo de Saída

1
0
2
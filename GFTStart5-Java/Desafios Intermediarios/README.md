Desafio 1 - media 2

Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. 
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. 
Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

Saída
Imprima a variável MEDIA conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade. 
Assim como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

 
Exemplos de Entrada	
5.0
6.0
7.0

Exemplos de Saída
MEDIA = 6.3

Exemplos de Entrada
5.0
10.0
10.0

Exemplos de Saída
MEDIA = 9.0

Exemplos de Entrada
10.0
10.0
5.0

Exemplos de Saída
MEDIA = 7.5

----------------------------------------------------------------------------------------------------------------------------
Desafio 2 - esfera

Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.

Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++), assumem que o resultado da divisão entre dois inteiros é outro inteiro.

Entrada
O arquivo de entrada contém um valor de ponto flutuante (dupla precisão), correspondente ao raio da esfera.

Saída
A saída deverá ser uma mensagem "VOLUME" conforme o exemplo fornecido abaixo, com um espaço antes e um espaço depois da igualdade. O valor deverá ser apresentado com 3 casas após o ponto.
 

Exemplos de Entrada	
3
Exemplos de Saída
VOLUME = 113.097

Exemplos de Entrada
15
Exemplos de Saída
VOLUME = 14137.155

Exemplos de Entrada
1523
Exemplos de Saída
VOLUME = 14797486501.627

----------------------------------------------------------------------------------------------------------------------------
Desafio 3 - Poligonos regulares simples

Na geometria Euclidiana, um polígono regular é um polígono em que todos os ângulos são iguais e todos os lados tem o mesmo comprimento. 
Um polígono simples é aquele cujos segmentos de reta não se interceptam. Abaixo pode-se ver vários mosaicos feitos por polígonos regulares.



Você deve escrever um programa que, dados o número e o comprimento dos lados de um polígono regular, mostre seu perímetro.

Entrada
A entrada tem dois inteiros positivos: N e L, que são, respectivamente, o número de lados e o comprimento de cada lado de um polígono regular (3 ≤ N ≤ 1000000 and 1 ≤ L ≤ 4000).

Saída
A saída é o perímetro P do polígono regular em uma única linha.

 
Exemplos de Entrada	
3 1
Exemplos de Saída
3

Exemplos de Entrada 
9 8
Exemplos de Saída
72

Exemplos de Entrada 
1000000 1000
Exemplos de Saída
1000000000

----------------------------------------------------------------------------------------------------------------------------
Desafio 4 - Maior e Posição

Você recebeu o desafio de ler 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.

Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.

 
Exemplo de Entrada	
2
113
45
34565
6
...
8
 

Exemplo de Saída
34565
4
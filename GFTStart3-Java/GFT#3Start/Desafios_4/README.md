MENSAGEM  DO PADRE

Desafio

Ao voltar de um intenso jogo de RPG na casa de um amigo, o padre do balão desapareceu misteriosamente! Todos estão loucos a procura do padre pelos céus. Enquanto isso, coisas estranhas estão acontecendo em sua casa, como ele conseguir se comunicar com um menino!

Existem exatamente 26 lâmpadas penduradas na parede sa sala do padre, numeradas de 1 a 26 da esquerda para a direita. Além disso, há uma letra do alfabeto pintada na parede embaixo de cada lâmpada. Quando o padre do balão quer enviar uma mensagem, as luzes de alguma forma piscam, uma a uma, as lâmpadas correspondentes a cada letra de sua mensagem. Por exemplo, se ele quer enviar a mensagem HELP, ele irá piscar, nesta ordem, as lâmpadas acima das letras H, E, L e P.

Dada a letra associada a cada lâmpada e a ordem das lâmpadas que foram piscadas por Will, decifre a mensagem que ele enviou!

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso contém uma string de exatamente 26 letras maiúsculas contendo todas as letras do alfabeto inglês. A primeira letra da string está associada à lâmpada 1; a segunda letra está associada à lâmpada 2; e assim por diante. A próxima linha contém um inteiro N (1 ≤ N ≤ 104), o número de lâmpadas que foram piscadas. A terceira linha contém N inteiros li (1 ≤ li ≤ 26), indicando as lâmpadas que foram piscadas, em ordem.

Saída
Para cada caso de teste, imprima uma única linha contendo a mensagem enviada pelo padre do balão.

 
Exemplo de Entrada	    

ABCDEFGHIJKLMNOPQRSTUVWXYZ

4

8 5 12 16

QWERTYUIOPASDFGHJKLZXCVBNM

10

16 3 19 19 9 2 9 4 19 13

Exemplo de Saída

HELP

HELLOWORLD

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
TOP N

Desafio

Recentemente aconteceu a fase regional da Maratona de Programação da SBC, onde mais de 600 times participaram em mais de 40 sedes diferentes pelo Brasil. 
Seu amigo participou da competição, e quando questionado sobre sua colocação lhe disse: “Ficamos no top 10”.

Você ficou feliz pelo seu amigo, mas não pode deixar de ficar curioso sobre qual foi sua real colocação. “Top 10” poderia indicar qualquer posição entre primeiro e décimo colocado, porém se ele estivesse em primeiro provavelmente teria dito “Top 1”, se estivesse em segundo ou terceiro provavelmente teria dito “Top 3”, e se estivesse em quarto ou quinto provavelmente teria dito “Top 5”. Logo, sua real colocação foi entre sexto e décimo, pois as pessoas geralmente se colocam na menor categoria a qual pertencem.

Você reuniu então todas as categorias de colocações que as pessoas mais usam: 1, 3, 5, 10, 25, 50 e 100. Dada uma colocação K, diga o número da menor categoria que esta colocação pertence.

Entrada
Cada caso de teste contém um inteiro K, representando uma colocação (1 ≤ K ≤ 100).

Saída
Para cada caso de teste imprima uma linha contendo a frase “Top N”, e substitua a letra N pelo número da menor categoria que a colocação K pertence.

 
Exemplos de Entrada /	Exemplos de Saída

7 -> Top 10

25 -> Top 25

26 ->	Top 50

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
ACIMA DA DIAGONAL PRINCIPAL

Desafio

Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão acima da diagonal principal da matriz, conforme ilustrado abaixo (área verde).
![image](https://user-images.githubusercontent.com/88213553/150966856-743824ec-0462-42c5-a4f1-52039a579203.png)
 


Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.

 
Exemplo de Entrada

S

1.0

0.0

-3.5

2.5

4.1

...

Exemplo de Saída

12.6

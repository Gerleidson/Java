FASES DA LUA

Desafio:

Jade ganhou de presente de aniversário um telescópio e ficou muito feliz, pois adora olhar a lua à noite. 
Ela sempre foi uma estudante muito boa, e só analizando a lua por duas noites seguidas, 
já consegue identificar as mudanças que ocorreram na iluminação e o percentual aproximado da lua que está iluminada.

Você, que é amigo da Jade e estuda Computação, resolveu fazer um pequeno programa que, 
baseado nesta avaliação que ela fez nas duas últimas noites, informa a fase na qual a lua se encontra.
 Se a porção visível da lua no momento estiver entre 0 e 2%, por exemplo, é lua nova, se for entre 3 e 96% é lua crescente,
 se for entre 97 e 100% é lua cheia e se for entre 96 e 3% (diminuindo) é lua minguante.

Entrada A entrada é composta por uma única linha contendo dois valores inteiros. 
O primeiro valor corresponde ao percentual observado por Jade na noite de dois dias atrás. 
O segundo valor corresponde ao percentual observado por jade na noite anterior.

Saída Baseado nos dois percentuais observados por Jade, imprima na tela a fase na qual a lua se encontrava na noite anterior, 
conforme o exemplo abaixo. Não esqueça de imprimir o caractere de fim de linha após a saída :).

Exemplo de Entrada /	Exemplo de Saída 

0 2	->	nova

2 3	->	crescente

99 97	->	cheia

97 94	->	minguante

30 35	->	crescente

-------------------------------------------------------------------------------------------------------------------------------

RESERVATORIO DE MEL

Desafio:

Seu Júlio é proprietário de um grande apiário situado no interior da Paraíba. 
Todo ano, semestralmente, seu Júlio coleta o mel produzido pelas abelhas da sua propriedade e 
armazena-o em um recipiente de formato CILÍNDRICO para que facilite o transporte do mel para os estabelecimentos 
que encomendam esse produto natural para a comercialização.
Certa vez seu Júlio percebeu que devido a um crescimento na produção do mel, em relação ao semestre anterior, 
o recipiente que possuia não suportaria o volume de mel produzido por suas abelhas. 
Seu Júlio precisa agora que você faça um programa que informado o volume de mel em cm3 e o diâmetro da parte interna do recipiente em cm,
 calcule e mostre:

- Qual deve ser a altura(em cm) da parte interna do recipiente;

- A área(em cm2) da boca(entrada) do recipiente.

Obs.: Considere π = 3.14

Entrada
A entrada contém vários casos de teste e termina com EOF. 
Cada caso de teste consiste de duas linhas contendo em cada uma um valor de ponto flutuante de dupla 
precisão com duas casas decimais após a vírgula, sendo um V (1.00 ≤ V ≤ 10000.00) e outro D (1.00 ≤ D ≤ 100.00), 
representando respectivamente o volume e o diâmetro do recipiente.

Saída
Para cada teste, a saída contém na primeira linha a mensagem "ALTURA = ", 
com um espaço depois de ALTURA e outro depois do símbolo de igualdade, 
seguido do valor da altura do recipiente com duas casas decimais após a vírgula e na segunda linha a mensagem "AREA = ",
 também com um espaço depois de AREA e outro depois do símbolo de igualdade, 
seguido do valor da area da boca(entrada) do recipiente com duas casas decimais após a vírgula.

- Não esqueça da quebra de linha ao final da saída,caso contrário você receberá "Presentation Error".

 
Exemplo de Entrada /	Exemplo de Saída

1450.00	->	ALTURA = 2.96

25.00	->		AREA = 490.62

760.00	->	ALTURA = 0.61

40.00	->		AREA = 1256.00

7500.00	->		ALTURA = 42.46

15.00	->		AREA = 176.62

-------------------------------------------------------------------------------------------------------------------------------

SENHA FIXA

Desafio:

Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. 
Considere que a senha correta é o valor 2002. 

Entrada
A entrada é composta por vários casos de testes contendo valores inteiros.

Saída
Para cada valor lido mostre a mensagem correspondente à descrição do problema.

 
Exemplo de Entrada / Exemplo de Saída

2200->			Senha Invalida

1020->			Senha Invalida

2022->			Senha Invalida

2002->			Acesso Permitido

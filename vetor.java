import java.util.Random;

import java.util.Scanner;

public class vetor {

public static void main(String[] args) {

// João Valério Santana e Jair Augusto

Scanner t = new Scanner(System.in);

int vetor[] = new int[10];
int inicio = 0, termino = 0;

while (true) {

System.out.println("       Menu de opções");

System.out.println("");

System.out.println("1ª opção: coletar dados do Vetor.");

System.out.println("2ª opção: randomizar os valores do Vetor.");

System.out.println("3ª opção: imprime dados do Vetor.");

System.out.println("4ª opção: imprime Vetor invertido.");

System.out.println("5ª opção: soma valores do Vetor");

System.out.println("6ª opção: Soma personalizada dos valores do Vetor.");

System.out.println("7ª opção: Media dos valores do Vetor.");

System.out.println("8ª opção: Maior valor dentro do Vetor.");

System.out.println("9ª opção: Menor valor dentro do Vetor.");

System.out.println("Digite 0 para sair.");

System.out.println("");

System.out.println("Digite a opção desejada:");

int escolha = t.nextInt();
if (escolha == 1) {
coletaVetor(vetor);
} else if (escolha == 2) {
int max = max();
gerarVetorRandomico(vetor, max);
} else if (escolha == 3) {
imprimeVetor(vetor);
} else if (escolha == 4) {
imprimeVetorInvertido(vetor);
} else if (escolha == 5) {
somaTodos(vetor);
} else if (escolha == 6) {
somaPersonalizada(vetor, inicio, termino);
} else if (escolha == 7) {
media(vetor);
} else if (escolha == 8) {
maiorValor(vetor);
} else if (escolha == 9) {
menorValor(vetor);
}

else if (escolha == 0) {

System.out.println("Fim do algoritimo");

break;

} else if (escolha > 9) {

System.out.println("Opção inválida");

}

}

}

public static int[] coletaVetor(int[] vetor) {

Scanner t = new Scanner(System.in);

for (int cont = 0; cont < 10; cont++) {

System.out.println("Informe o " + (cont + 1) + "º Valor do Vetor");

vetor[cont] = t.nextInt();

}

return vetor;

}

public static int[] gerarVetorRandomico(int[] vetor, int max) {

Random ale = new Random();

System.out.print("Valores randômicos gerados: ");

for (int x = 0; x < 10; x++) {

vetor[x] = ale.nextInt(max);

if (x < vetor.length - 1) {

System.out.print(vetor[x] + ",");

} else {

System.out.println(vetor[x]);

System.out.println(" ");

}

}

return vetor;

}

public static int max() {

Scanner t = new Scanner(System.in);

System.out.println("Qual o valor Máximo para os valores do Vetor");

int max = t.nextInt();

return max;

}

public static void imprimeVetor(int[] vetor) {

System.out.println("Dados do vetor: ");

for (int x = 0; x < 10; x++) {

if (x < vetor.length - 1) {

System.out.print(vetor[x] + ",");

} else {

System.out.println(vetor[x]);

System.out.println(" ");

}

}

}

public static void imprimeVetorInvertido(int[] vetor) {

System.out.print("Dados do Vetor: ");

for (int x = 1; x <= vetor.length; x++) {

if (x <= vetor.length - 1) {

System.out.print(vetor[vetor.length - x] + ",");

} else {

System.out.print(vetor[vetor.length - x]);

System.out.println(" ");

}

}

}

public static int somaTodos(int[] vetor) {
int soma = 0;
for (int x = 0; x < vetor.length; x++) {
soma = vetor[x] + soma;
}
System.out.println("Soma de todos os valores do vetor: " + soma);
System.out.println(" ");
return soma;
}

public static int somaPersonalizada(int[] vetor, int inicio, int termino) {
Scanner t = new Scanner(System.in);
int soma = 0;
System.out.println("Indíce de início(inclusive):");
inicio = t.nextInt();
System.out.println("Indíce de término(inclusive):");
termino = t.nextInt();
if (inicio <= vetor.length && termino <= vetor.length) {
if (inicio < termino) {
for (int x = inicio; x <= termino; x++) {
soma = soma + vetor[x];
}
System.out.println("Soma personalizada: " + soma);
System.out.println("  ");
} else {
System.out.println("Verifique restrições do Algoritimo!");
System.out.println("  ");
}
} else {
System.out.println("Verifique restrições do Algoritimo!");
System.out.println(" ");
}
return soma;

}

public static double media(int[] vetor) {
double soma = 0;
for (int x = 0; x < vetor.length; x++) {
soma = vetor[x] + soma;
}
double media = soma / 10;
System.out.println("A média do Vetor é " + media);
System.out.println(" ");
return soma;

}

public static int menorValor(int[] vetor) {
int menor = vetor[0];
for (int x = 0; x < vetor.length; x++) {
if (menor > vetor[x]) {
menor = vetor[x];
}
}
System.out.println("O menor valor do Vetor é: " + menor);
System.out.println(" ");
return menor;

}

public static int maiorValor(int[] vetor) {
int maior = vetor[0];
for (int x = 0; x < vetor.length; x++) {
if (maior < vetor[x]) {
maior = vetor[x];
}
}
System.out.println("O maior valor do Vetor é: " + maior);
System.out.println("  ");

return maior;

}

}
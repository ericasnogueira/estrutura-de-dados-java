package vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo02 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro N e os dados( nome e preço)
        de N Produtos. Armazene os N Produtos em um vetor. Em seguinda, mostrar o preço
        médio dos produtos
         */
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        ProdutosProblemaExemplo02 []vetor = new ProdutosProblemaExemplo02[n];


        for(int i =0; i <n; i++){
            input.nextLine();// quebra de linha
            String nome = input.nextLine();
            double preco = input.nextDouble();
            // o vetor na posição i ira apontar para o objeto
            vetor[i] = new ProdutosProblemaExemplo02(nome, preco);
        }

        //media preços
        double soma = 0;

        // vetor.length - é o recomendado por pegar o tomanho do vetor // so usar ele agora
        for(int i =0; i< vetor.length;i++){
            //o .getPreco é para pegar somente o preco mesmo
            soma += vetor[i].getPreco();
        }

        double media = soma/n;

        System.out.printf("MEDIA : %.2f", media);

    }
}

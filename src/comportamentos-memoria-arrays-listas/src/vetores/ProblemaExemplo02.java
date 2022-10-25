package vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo02 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um n�mero inteiro N e os dados( nome e pre�o)
        de N Produtos. Armazene os N Produtos em um vetor. Em seguinda, mostrar o pre�o
        m�dio dos produtos
         */
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        ProdutosProblemaExemplo02 []vetor = new ProdutosProblemaExemplo02[n];


        for(int i =0; i <n; i++){
            input.nextLine();// quebra de linha
            String nome = input.nextLine();
            double preco = input.nextDouble();
            // o vetor na posi��o i ira apontar para o objeto
            vetor[i] = new ProdutosProblemaExemplo02(nome, preco);
        }

        //media pre�os
        double soma = 0;

        // vetor.length - � o recomendado por pegar o tomanho do vetor // so usar ele agora
        for(int i =0; i< vetor.length;i++){
            //o .getPreco � para pegar somente o preco mesmo
            soma += vetor[i].getPreco();
        }

        double media = soma/n;

        System.out.printf("MEDIA : %.2f", media);

    }
}

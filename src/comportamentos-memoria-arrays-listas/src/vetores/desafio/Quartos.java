package vetores.desafio;

import vetores.desafio.entities.Aluguel;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Quartos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //criando o vetor do tipo aluguel
        Aluguel [] vetor = new Aluguel[10];

        System.out.print("Quantos quartos irá querer ? ");
        int n = entrada.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.println();
            System.out.println("Quarto #"+ i+ ":");
            System.out.print("Nome : ");
            entrada.nextLine();// quebra de linha
            String nome = entrada.nextLine();
            System.out.print("Email : ");
            String email = entrada.next();
            System.out.print("Quarto : ");
            int numeroquarto = entrada.nextInt();


            //atribuindo o numero para a posição desejada
            vetor[numeroquarto] = new Aluguel(nome,email);
        }

        System.out.println();
        System.out.println("Quartos alugados : ");
        for(int i =0;i<10;i++){
            if(vetor[i] != null){
                System.out.println(i + " :" + vetor[i]);
            }
        }

        entrada.close();

    }
}

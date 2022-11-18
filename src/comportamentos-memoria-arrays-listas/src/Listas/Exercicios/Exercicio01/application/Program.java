package Listas.Exercicios.Exercicio01.application;

import Listas.Exercicios.Exercicio01.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro N e depois os dados(ID, nome e salario) de N funcionarios. Não
        deve haver repetição de Id.

        Em seguida, efetuar o aumento de X por cento no salário de um determidado funcionário. Para isso, o programa
        deve ler um id e o valor X. Se o ID informado não exixtir, mostrar uma mensagem e abortar a operação. Ao
        final, mostrar a listagem atualizada dos funcionarios, conforme exemplos.

        Lembre-se de aplicar a técnica de encapsulamento para não permitir que salário possa ser mudado livremente. Um
        salário só pode ser aumentado com base em uma operação de aumento por porcentagem ddada.
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        //criando uma lista do tipo Funcionario(classe)
        List<Funcionario> listaFuncionario = new ArrayList<>();



        System.out.println("Quantos funcionarios iram ser registrado ? ");
        int numeroFuncionario = entrada.nextInt();

        for (int i =0;i <numeroFuncionario;i++){

            System.out.println();

            System.out.println("Funcionario #"+(i +1) + ":");
            System.out.print("Id: ");
            Integer id = entrada.nextInt();
            System.out.print("Nome: ");
            entrada.nextLine();//quebra de linha
            String nome = entrada.nextLine();
            System.out.print("Salario: ");
            Double salario = entrada.nextDouble();


            //instanciando um obj funcionario
            Funcionario fun = new Funcionario(id, nome, salario);

            //adicionando na lista
            listaFuncionario.add(fun);
        }
















    }
}
package Listas.Exercicios.Exercicio01.application;

import Listas.Exercicios.Exercicio01.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um n�mero inteiro N e depois os dados(ID, nome e salario) de N funcionarios. N�o
        deve haver repeti��o de Id.

        Em seguida, efetuar o aumento de X por cento no sal�rio de um determidado funcion�rio. Para isso, o programa
        deve ler um id e o valor X. Se o ID informado n�o exixtir, mostrar uma mensagem e abortar a opera��o. Ao
        final, mostrar a listagem atualizada dos funcionarios, conforme exemplos.

        Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitir que sal�rio possa ser mudado livremente. Um
        sal�rio s� pode ser aumentado com base em uma opera��o de aumento por porcentagem ddada.
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
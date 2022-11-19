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

            System.out.println("Funcionario #"+(i +1) + ":");// p
            System.out.print("Id: ");
            Integer id = entrada.nextInt();
            System.out.print("Nome: ");
            entrada.nextLine();//quebra de linha // se n�o tiver ia pular diretamente para o salario
            String nome = entrada.nextLine();
            System.out.print("Salario: ");
            Double salario = entrada.nextDouble();


            //instanciando um obj funcionario
            Funcionario fun = new Funcionario(id, nome, salario);

            //adicionando na lista
            listaFuncionario.add(fun);
        }

        //perguntando qual funcionario que ira ter o salario encrementado
        System.out.println("Qual funcionanrio gostaria de encrementar o salario:  ");
        int idSalario = entrada.nextInt();

        Integer posicao = posicaoId(listaFuncionario, idSalario);// procurando o idSalario na posi��o //
        if(posicao ==null){
            System.out.println("Esse Id Funcionario n�o existe!");
        } else { // se o id existi tera que aumenta o seu salario
            System.out.print("Entre com a porcentagem de aumento do funcionario : ");
            double porcentagem = entrada.nextDouble();
            //acessando na lista para pegar o id do funcionario para ver o seu salario e fazer o aumento desejado
            listaFuncionario.get(posicao).incrementandoSalario(porcentagem);
        }




    }
    //fun��o auxiliar para ver se o ID do funcionario est� cadastrado ou n�o
    //retorna  a posi��o do funcionario na lista
    //public � opcional por est� na mesma classe
    static Integer posicaoId(List<Funcionario> lista, int id){// o papel do metodo � falar qual � a posi��o do funcionario na lista
        for (int i =0;i<lista.size();i++){//lista.size � o tamanho da lista
            //id da posi��o � igual ao id da posi��o que queremos
            if(lista.get(i).getId()== id) {// get(i) - pegar o elemento na posi��o
                return i;
            }
        }
        return  null; // indicando que o elemento(id) n�o foi encotrado na lista
    }

}
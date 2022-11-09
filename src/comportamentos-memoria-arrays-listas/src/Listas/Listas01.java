package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas01 {
    public static void main(String[] args) {



        //criando uma lista de numeros inteiros
        //List<o tipo de lista> nomedalista == (tipo de lista é para usar a wrapper classes
        List<String> lista = new ArrayList<>();

        //adicionando elementos na lista
        lista.add("Maria");
        lista.add("Alex");
        lista.add("Bob");
        lista.add("Anna");

        //inserindo um elemento pela a posição
        lista.add(2,"Marco");

        //vendo o tamanho da lista
        System.out.println(lista.size());

        //removendo um elemento da lista
        //lista.remove("Anna");// removendo pela a comparação dos elementos
       // lista.remove(1);// removendo pela a posição

        //percorrendo a lista com forEach
        for (String i : lista){
            System.out.println(i);
        }

        System.out.println("------------------------");

        //removendo todos que comecem com a letra M (é usado o predicado)
        lista.removeIf(x -> x.charAt(0)== 'M');

        for (String i : lista){
            System.out.println(i);
        }

        System.out.println("------------------------");

        //encotrando a posição do elemento
        System.out.println("INDEX BOB : " + lista.indexOf("Bob"));
        System.out.println(lista.indexOf("Bob"));


        //filtrando a lista com todo mundo que começa com A

        //declarando uma nova lista e pegando da lista anterior, filtrando os nomes que comeca com A
        List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println("---------------------------");
        for(String i : resultado){
            System.out.println(i);
        }

        System.out.println("---------------------");
        //encontrando na lista um certo elemento que atenda a um predicado
         String nome = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); //findFirst vai pegar o primeiro elemento da string
        System.out.println(nome);

    }
}

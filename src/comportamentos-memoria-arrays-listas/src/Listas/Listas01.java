package Listas;

import java.util.ArrayList;
import java.util.List;

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

    }
}

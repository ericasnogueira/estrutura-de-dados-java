package Arrays_e_Collections.Colecoes.Lista;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");

        //adicionando  u1 na lista
        lista.add(u1);// assim pode

        //lista.add("Erica");// assim não vai

        lista.add(new Usuario("Erica"));// assim pode
        lista.add(new Usuario("Lia"));// assim pode
        lista.add(new Usuario("Bia"));// assim pode
        lista.add(new Usuario("Manu"));// assim pode
        lista.add(new Usuario("Carlos"));// assim pode

        //percorrendo a lista
        //  tipo // variavel :  // nome da lista
        for(Usuario u: lista){
            System.out.println(u);
        }

        System.out.println("========");
        //obtendo um determinado elemento pelo id
        System.out.println(lista.get(3));//acessando  pelo índice
        System.out.println("/////////");
        //removendo
        lista.remove(1);
        lista.remove(new Usuario("Carlos"));
        for(Usuario u: lista){
            System.out.println(u);
        }
    }
}

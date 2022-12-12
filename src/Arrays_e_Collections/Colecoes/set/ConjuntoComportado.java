package Arrays_e_Collections.Colecoes.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {


        // <tipo>
        Set<String>listaDeAprovados = new HashSet<>();
        listaDeAprovados.add("Ana");
        listaDeAprovados.add("Carlos");
        listaDeAprovados.add("Luca");
        listaDeAprovados.add("Pedro");

        //não esta seguindo a ordem que foram adicionados
        for (String nome : listaDeAprovados) {
            System.out.println(nome);
        }

        System.out.println("==============");

        //com o treeset a ordem que forma adicionados ira ser seguida
        Set<String>Aprovados2 =new TreeSet<>();
        Aprovados2.add("Ana");
        Aprovados2.add("Carlos");
        Aprovados2.add("Luca");
        Aprovados2.add("Pedro");

        for(String aprovados : Aprovados2){
            System.out.println(aprovados);
        }

        System.out.println(" -------------------");

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for(int numeros : nums){
            System.out.println(numeros);
        }
    }
}

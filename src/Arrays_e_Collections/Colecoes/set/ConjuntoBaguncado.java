package Arrays_e_Collections.Colecoes.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    //set - heterogeneo

    @SuppressWarnings({"unchecked","rawtypes"})// para não ficar com a linha amarela
    public static void main(String[] args) {


        HashSet conjunto = new HashSet();//aqui ~~~~~~~~


        // não aceita tipos primitivo, automaticamente ira converte eles
        conjunto.add(1.2); // double -> Double  ---------------e aqui na parte do nome variavel/instancia ~~~~~~~~~~~~
        conjunto.add(true); //boobean -> Boolean
        conjunto.add("Teste"); //String
        conjunto.add(1); // int -> Integer
        conjunto.add('x');

        //exibi a  quantidade de elementos do conjunto
        System.out.println(conjunto.size());

        //adicionando um "duplicado"
        conjunto.add("teste");// vai aceitar por causa do t minusculo e o T maiusculo
        System.out.println(conjunto.size());


        // removendo do conjunto
        System.out.println(conjunto.remove("Teste"));// ira da true // se for algo que não está no conjunto o resultado ira da false
        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println(conjunto.size());

        //vendo se ele tem no conjunto
        System.out.println(conjunto.contains(1));//true se tiver ou false se não tiver


        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //unindo os dois
        //ele muda o valor do conjunto ///não manter a ordem
        //conjunto.addAll(nums);//união entre dois conjuntos
        conjunto.retainAll(nums);// pega o valor em comum de ambos


        conjunto.clear();
        System.out.println(conjunto);

    }
}

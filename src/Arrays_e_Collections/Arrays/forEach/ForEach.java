package Arrays_e_Collections.Arrays.forEach;

import java.util.Locale;

public class ForEach {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double [] notas = {9.9,8.7,7.2,9.4};

        for(int i = 0;i < notas.length;i++){
            System.out.println(notas[i] + " ");
        }

        System.out.println();//quebra de linha

        //tipo//nome da variavel // : nome do array
        for (double i : notas) {
            System.out.println(i + " ");
        }
    }
}

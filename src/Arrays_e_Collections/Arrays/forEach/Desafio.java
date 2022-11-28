package Arrays_e_Collections.Arrays.forEach;

import java.util.Locale;

public class Desafio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double [] notasAlunosA = new double[4];

        notasAlunosA[0] = 7.9;
        notasAlunosA[1]= 8;
        notasAlunosA[2]= 6.7;
        notasAlunosA[3] = 9.7;

        double totalA = 0;
        for (double i : notasAlunosA) {
            totalA += i;
        }
        System.out.println(totalA / notasAlunosA.length);


        //notas alunosB
        double [] notasAlunosB = {6.9,8.9,5.5,10};

        double totalB =0;
        for(double i : notasAlunosB){
            totalB += i;
        }

        System.out.println(totalB / notasAlunosB.length);

    }
}

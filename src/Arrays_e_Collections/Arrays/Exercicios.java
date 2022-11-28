package Arrays_e_Collections.Arrays;

import java.util.Arrays;
import java.util.Locale;

public class Exercicios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        //vetor
        //tipo [] nomeDoVetor = new O tipo novamente [tamanho do vetor]
        double [] notasAlunosA = new double [4];

        //adicionando no vetor pelo o index
        notasAlunosA[0] = 7.9;
        notasAlunosA[1]= 8;
        notasAlunosA[2] = 6.7;
        notasAlunosA[3] = 9.7;

        //mostrando o vetor

//       //com forEach
//        //tipo //variave : nome do vetor/lista/matriz
//        for (double a : notasAlunosA) {
//            System.out.println(a);
//        }

        //pode usar uma função do proprio array
        System.out.println(Arrays.toString(notasAlunosA));

        //media do vetor
        double totalAluntosA = 0;
        for (int i=0; i< notasAlunosA.length;i++){
            totalAluntosA += notasAlunosA[i];
        }
        System.out.println(totalAluntosA / notasAlunosA.length);

        // alunos B
        double [] notasAlunoB = {6.9,8.9,5.5,10}; //

        double totalAlunosB =0;
        for(int i=0; i< notasAlunoB.length;i++){
            totalAlunosB += notasAlunoB[i];
        }
        System.out.println(totalAlunosB / notasAlunoB.length);


    }
}

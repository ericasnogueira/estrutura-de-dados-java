package Arrays_e_Collections.Arrays.matriz;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quanto alunos? ");
        int qtdeAlunos = entrada.nextInt();

        System.out.print("Quantas notas por alunos ? ");
        int qtdeNotas = entrada.nextInt();
                                              //linhas       //colunas
        double [][] notasDaTurma = new double [qtdeAlunos] [qtdeNotas];


        double notaTotal = 0;
        for(int i =0;i<notasDaTurma.length; i++){ //passando pelas as linhas
            for(int j=0;j<qtdeNotas;j++){// passando pelas as colunas

                System.out.printf("Informe a nota do aluno %d do aluno %d : ", j +1 ,i +1 );
                notasDaTurma[i][j] = entrada.nextDouble();
                notaTotal += notasDaTurma[i][j];
            }
        }

        double media = notaTotal / (qtdeAlunos * qtdeNotas);
        System.out.println("Media da turma é " + media);

        //usando o forEach para exibi as notas
        for(double [] notas: notasDaTurma){
            System.out.println(Arrays.toString(notas));
        }
    }
}

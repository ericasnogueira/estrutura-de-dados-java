package forEach.entities;

public class Program {
    public static void main(String[] args) {

        //vetor com 3 posições já declaradas
        String [] vetor = new String[]{"Maria", "Bob", "Alex"};


        //mostrando da primeira forma
        for(int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }

        System.out.println("---------------------");

        //usando o for each

        //   tipo do vetor  // o nome do vetor
        for (String i: vetor){
            System.out.println(i);
        }
    }
}

package EqualsHashcode;

public class EqualsHashcode {
    public static void main(String[] args) {
        //equals na pratica

        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@gmail.com.br";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@gmail.com.br";

        System.out.println(u1 == u2);//false
        System.out.println(u1.equals(u2));//true -> por causa da implementação na classe Usuario
        System.out.println(u2.equals(u1));//true -> por causa da implementação na classe Usuario











    }
}

package Arrays_e_Collections.Colecoes.Lista;

import java.util.Objects;

public class Usuario {
    String nome;

    //contrutor
    public Usuario(String nome) {
        this.nome = nome;
    }
    //toString

    @Override
    public String toString() {
        return " meu nome é " + nome ;
    }


    //gerando o hashCode e equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return nome.equals(usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

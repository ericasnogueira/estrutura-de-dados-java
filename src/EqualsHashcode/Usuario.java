package EqualsHashcode;

import java.util.Objects;

public class Usuario {
    String nome;
    String email;

    //implementando  o equal
    @Override
    public boolean equals(Object obj) {

        Usuario outro = (Usuario) obj;

        boolean nomeIgual = outro.nome.equals(this.nome);
        boolean emailIgual = outro.email.equals(this.email);

        return nomeIgual && emailIgual;
    }

    
}

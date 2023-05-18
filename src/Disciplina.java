package org.catolicasc.educational;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Disciplina {
    private String nome;
    //atributo nome
    public Disciplina(String nome) {
        this.nome = nome;
    }
    //metodo que recebe um nome e registra ele como o nome da disciplina
    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina that)) return false;

        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return nome != null ? nome.hashCode() : 0;
    }
//os tres são automaticos
}
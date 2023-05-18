package org.catolicasc.educational;

public class Pessoa {
    private String nome;
    //atributo nome
    private String endereco;
    //atributo endereço
    private String email;
    //atributo email
    private String telefone;
//atributo telefone

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;

        if (getNome() != null ? !getNome().equals(pessoa.getNome()) : pessoa.getNome() != null) return false;
        if (getEndereco() != null ? !getEndereco().equals(pessoa.getEndereco()) : pessoa.getEndereco() != null)
            return false;
        if (getEmail() != null ? !getEmail().equals(pessoa.getEmail()) : pessoa.getEmail() != null) return false;
        return getTelefone() != null ? getTelefone().equals(pessoa.getTelefone()) : pessoa.getTelefone() == null;
    }
    //automatico
    @Override
    public int hashCode() {
        int result = getNome() != null ? getNome().hashCode() : 0;
        result = 31 * result + (getEndereco() != null ? getEndereco().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getTelefone() != null ? getTelefone().hashCode() : 0);
        return result;
    }
//automatico

    public String getNome() {
        return nome;
    }
    //getter do nome(automatico)
    public void setNome(String nome) {
        this.nome = nome;
    }
    //setter do nome(automatico)
    public String getEndereco() {
        return endereco;
    }
    //getter do endereço(automatico)
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    //setter do endereço(automatico)
    public String getEmail() {
        return email;
    }
    //getter do email(automatico)
    public void setEmail(String email) {
        this.email = email;
    }
    //setter do email(automatico)
    public String getTelefone() {
        return telefone;
    }
    //getter do telefone(automatico)
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
//setter do telefone(automatico)
}
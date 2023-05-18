package org.catolicasc.educational;

public class Aluno extends Pessoa {

    private String matricula;
// ----------------------------------------> atributo matricula FEITO

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        if (!super.equals(o)) return false;

        return getMatricula() != null ? getMatricula().equals(aluno.getMatricula()) : aluno.getMatricula() == null;
    }
    // ----------------------------------------> equals? -  se for, o inteliJ faz ele sozinho. Equals compara.
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getMatricula() != null ? getMatricula().hashCode() : 0);
        return result;
    }
    // ----------------------------------------> hashcode? se for, o inteliJ faz ele sozinho. Hashcode é a senha feita a partir do objeto, impossivel fazer o contrário
    public String getMatricula() {
        return matricula;
    }
    // ----------------------------------------> get matricula FEITO
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
// ----------------------------------------> set matricula FEITO
}
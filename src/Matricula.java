package org.catolicasc.educational;

public class Matricula {

    private Aluno aluno;
    //atributo aluno herdado da classe aluno
    private Disciplina disciplina;
    //atributo disciplina herdado da classe disciplina
    private int ano;
    //atributo ano
    private int semestre;
//atributo semestre

    public Matricula(Aluno aluno, Disciplina disciplina, int ano, int semestre) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.ano = ano;
        this.semestre = semestre;
    }
    //atributo que recebe uma variavel aluno do tipo aluno, uma variavel disciplina do tipo disciplina, e variaveis do tipo int ano e semestre,
//e define ESTAS variaveis que recebeu como os valores da matricula, ou seja, se a variavel aluno recebe gustavo, matricula.nome = gustavo.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Matricula that)) return false;

        if (getAno() != that.getAno()) return false;
        if (getSemestre() != that.getSemestre()) return false;
        if (getAluno() != null ? !getAluno().equals(that.getAluno()) : that.getAluno() != null) return false;
        return getDisciplina() != null ? getDisciplina().equals(that.getDisciplina()) : that.getDisciplina() == null;
    }
    //equals automatico
    @Override
    public int hashCode() {
        int result = getAluno() != null ? getAluno().hashCode() : 0;
        result = 31 * result + (getDisciplina() != null ? getDisciplina().hashCode() : 0);
        result = 31 * result + getAno();
        result = 31 * result + getSemestre();
        return result;
    }
//hashcode automatico

    public Aluno getAluno() {
        return aluno;
    }
    //getter aluno do tipo aluno(automatico)
    public Disciplina getDisciplina() {
        return disciplina;
    }
    //getter da disciplina do tipo disciplina(automatico)
    public int getAno() {
        return ano;
    }
    //getter do ano(automatico)
    public int getSemestre() {
        return semestre;
    }
//getter do semestre(automatico)
}
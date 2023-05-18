package org.catolicasc.educational;

import java.util.*;

public class Curso {
    private String nome;
    //atributo nome
    private int duracao;
    //atributo duracao
    private List<Disciplina> listaDisciplinas = new ArrayList<>();
    //criacao de uma arraylist do tipo Disciplina nomeada listaDisciplinas.
    private List<Aluno> listaAlunos = new ArrayList<>();
    //criacao de uma arraylist do tipo Aluno nomeada listaAlunos.
    private List<Matricula> alunosMatriculadosNasDisciplinas = new ArrayList<>();
    //criacao de uma arraylist do tipo Matricula nomeada alunosMatriculadosNasDisciplinas .
    public Curso(String curso, int duracao) {
        this.nome = curso;
        this.duracao = duracao;
    }
    //metodo que recebe o nome do curso e um numero, definindo os mesmos como nome do curso e duracao do curso.
//Por isso o this. ESSE NOME QUE RECEBI é o do curso, ESSA DURACAO QUE RECEBI é do curso.
    public int getDuracao() {
        return duracao;
    }
    //getter duracao
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    //setter duracao
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curso curso)) return false;

        if (duracao != curso.duracao) return false;
        if (getNome() != null ? !getNome().equals(curso.getNome()) : curso.getNome() != null) return false;
        return Objects.equals(listaDisciplinas, curso.listaDisciplinas);
    }
    //equals? automatico?
    @Override
    public int hashCode() {
        int result = getNome() != null ? getNome().hashCode() : 0;
        result = 31 * result + duracao;
        result = 31 * result + (listaDisciplinas != null ? listaDisciplinas.hashCode() : 0);
        return result;
    }
    //hashcode? automatico?
    public String getNome() {
        return nome;
    }
    //getter nome feito (getter e setter são métodos.)
    public void setNome(String nome) {
        this.nome = nome;
    }
//setter nome feito (getter e setter são métodos.)

    public void adicionarDisciplina(Disciplina disciplina) {
        this.listaDisciplinas.add(disciplina);
    }
    //metodo recebe uma variavel disciplina do tipo disciplina
//metodo define que ESSA disciplina que acabou de receber é adicionada na listaDisciplinas (que por sua vez é uma lista do tipo disciplina )
    public List<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }
    //metodo ListaDisciplinas recebe uma lista do tipo disciplinas because giga fuck you
//e após receber a lista retorna a variável listaDisciplinas que contém as disciplinas
    public List<Aluno> obterAlunosDoCurso() {
        return listaAlunos;
    }
    //mesma coisa só que para alunos
    public Map<Aluno, List<Disciplina>> obterDisciplinasPorAluno(int ano, int semestre) {
        Map<Aluno, List<Disciplina>> disciplinasPorAluno = new HashMap<>();
        for (Disciplina disciplina : listaDisciplinas) {

        }
        return disciplinasPorAluno;
    }
//ajuda

    public void solicitarMatricula(Aluno aluno, Disciplina disciplina, int ano, int semestre) {
        Matricula solicitarMatricula = new Matricula(aluno,disciplina, ano, semestre);
        this.solicitarMatricula(solicitarMatricula);
    }
    //ajuda
    private final boolean existeEstaDisciplinaNoCursoAtual(Disciplina disciplina) {
        return listaDisciplinas.contains(disciplina);
    }
    //metodo que recebe uma disciplina do tipo disciplina e usa o contains para percorrer a lista a fim de encontrar a disciplina
//e retornar um valor boleano true se ela existir ou false caso contrario.
    public void solicitarMatricula(Matricula solicitacao) {
//metodo solicitar matricula recebe uma solicitaçao do tipo matricula
        Disciplina disciplinaSolicitada = solicitacao.getDisciplina();
//a variavel disciplina solicitada do tipo disciplina recebe o getter da variavel disciplina do tipo solicitação
        boolean existeDisciplina = existeEstaDisciplinaNoCursoAtual(disciplinaSolicitada);
//variavel boleana que armazena o resultado da verificação de se existe ou não
        if(existeDisciplina) {
            // ok existe a disciplina posso tentar
            Aluno aluno = solicitacao.getAluno();
            boolean alunoDoCurso = existeEsteAlunoNoCursoAtual(aluno);
            if( alunoDoCurso ) {
                // se a disciplina for do curso e o aluno tambem
                this.matricular(solicitacao);
            } else {
                // ops
            }

        } else {
            // ops estao tentando matricular em uma disciplina inexistente
        }

    }

    private void matricular(Matricula solicitacao) {
        // o metodo eh privado e chamado por uma solicitacao
        alunosMatriculadosNasDisciplinas.add(solicitacao);
    }
    //metodo que recebe uma solicitaçao do tipo matricula e adiciona a mesma na lista de alunos matriculados
    private boolean existeEsteAlunoNoCursoAtual(Aluno aluno) {
        return listaAlunos.contains(aluno);
    }
    //mesma coisa da ultima boleana, verifica se tem o aluno no curso
    public void adicionarAlunoNoCurso(Aluno aluno) {
        listaAlunos.add(aluno);
    }
    //metodo recebe uma variavel aluno do tipo aluno e adiciona o que recebeu na listaAlunos
    public List<Disciplina> getDisciplinaPorAluno(Aluno alunoQueVouBuscar) {
        List<Disciplina> disciplinaDoAluno = new ArrayList<>();

        return disciplinaDoAluno;
    }
    //ajuda
    public List<Aluno> getAlunosDaDisciplina(Disciplina disciplinaQueQueroProcurar) {
        List<Aluno> alunosDaDisciplina = new ArrayList<>();
        for (Matricula matricula : alunosMatriculadosNasDisciplinas) {
            Disciplina disciplina = matricula.getDisciplina();
            if( disciplina.equals(disciplinaQueQueroProcurar) )
                alunosDaDisciplina.add(matricula.getAluno());
        }
        return alunosDaDisciplina;
    }
//ajuda
}
package rafsanches.com.br.pi_chamada;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Materia implements Serializable{

    private String nome;
    private String sala;
    private Professor professor;
    private String turma;
    private String qtdeAluno;
//    private List<Aluno> alunos;
    private Date date;

    // construtores
    public Materia (String nome, String sala, /*List<Aluno> alunos*/ String qtdeAluno, String turma) {
        setNome(nome);
        setSala(sala);
        setQtdeAluno(qtdeAluno);
//        setAlunos(alunos);
        setTurma(turma);
    }

    //getters and setters

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSala() {

        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Professor getProfessor() {

        return professor;
    }

    public void setProfessor(Professor professor) {

        this.professor = professor;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

//    public List<Aluno> getAlunos() {
//        return alunos;
//    }
//
//    public void setAlunos(List<Aluno> alunos) {
//        this.alunos = alunos;
//    }

    public Date getDate() {

        return date;
    }

    public void setDate(Date date) {

        this.date = date;
    }

    public String getQtdeAluno() {
        return qtdeAluno;
    }

    public void setQtdeAluno(String qtdeAluno) {
        this.qtdeAluno = qtdeAluno;
    }

    // construtores

    /*
    @NonNull
    @Override
    public String toString() {
        return String.format(
                Locale.getDefault(),
                "%s: %s",
                getDescricao(),
                getStatus()
        );
    }
    public Chamado(Fila fila, String descricao, Date dataAbertura, Date dataFechamento, String status) {
        setFila(fila);
        setDescricao(descricao);
        setDataAbertura(dataAbertura);
        setDataFechamento(dataFechamento);
        setStatus(status);
    }


 */
}

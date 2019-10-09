package rafsanches.com.br.pi_chamada;

import java.io.Serializable;

public class Materia implements Serializable{

    private String nome;
    private Turma turma;
    private Aluno aluno;
    private String sala;
    private Integer faltas;
    private Integer presenca;

    //Construtores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno Aluno) {
        this.aluno = Aluno;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Integer getFaltas() {
        return faltas;
    }

    public void setFaltas(Integer faltas) {
        this.faltas = faltas;
    }

    public Integer getPresenca() {
        return presenca;
    }

    public void setPresenca(Integer presenca) {
        this.presenca = presenca;
    }

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

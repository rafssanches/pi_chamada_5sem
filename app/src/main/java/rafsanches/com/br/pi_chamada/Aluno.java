package rafsanches.com.br.pi_chamada;

import java.util.List;

public class Aluno {
    private String nome;
    private String ra;
    private List<Materia> materias;

    // contrutores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
}

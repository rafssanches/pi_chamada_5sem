package rafsanches.com.br.pi_chamada;

import java.util.List;

public class Professor {
    private String nome;
    private String matricula;

    public Professor(String nome, String matricula){
        setNome(nome);
        setMatricula(matricula);
    }

    // gets and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}

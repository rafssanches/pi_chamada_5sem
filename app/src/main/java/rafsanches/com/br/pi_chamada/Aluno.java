package rafsanches.com.br.pi_chamada;

import androidx.annotation.NonNull;

import java.util.List;

public class Aluno {
    private String nome;
    private String ra;

    public Aluno(@NonNull String ra, @NonNull String nome) {
        setRa(ra);
        setNome(nome);
    }

    public Aluno () {

    }

    // getters setters
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
}

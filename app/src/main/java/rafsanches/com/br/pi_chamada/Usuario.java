package rafsanches.com.br.pi_chamada;

public class Usuario {
    private String nome;
    private String senha;
    private boolean professor;

    public Usuario(String nome, String senha, boolean professor){
        setNome(nome);
        setSenha(senha);
        setProfessor(professor);
    }

    // construtores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isProfessor() {
        return professor;
    }

    public void setProfessor(boolean professor) {
        this.professor = professor;
    }
}

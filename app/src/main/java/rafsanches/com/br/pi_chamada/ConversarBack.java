package rafsanches.com.br.pi_chamada;

public class ConversarBack {
    public Professor getProfessorByMatricula(String matricula){
//        String request = httprequestGET("google.com");
//        return conversorJson.toProfessor(request);
        return new Professor("Nome batata", matricula); // mockado
    }

    public ProfessorDTO getProfessorMain (String matricula){
        return new ProfessorDTO();
    }
}

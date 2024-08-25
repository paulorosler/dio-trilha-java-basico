public class ExemploForEach {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        char jota = 'J';
        for (String aluno : alunos) 
            {
             //   if (aluno == "FELIPE") continue;
             //   if (aluno == "MARCOS")  break;
                if (aluno.charAt(0) == jota) continue;
                System.out.println("O nome do aluno é " + aluno); 
                System.out.println("Inicial: " + aluno.charAt(0)); 
            }
    }
}

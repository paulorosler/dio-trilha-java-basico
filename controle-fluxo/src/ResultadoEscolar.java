public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 4.9;
       
        if(nota >= 7) 
            System.out.println("Aprovado");
        else 
            if (nota >= 5) 
                System.out.println("Prova de Recuperação");
            else              
                System.out.println("Reprovado"); 
    }
}

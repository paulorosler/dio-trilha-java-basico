public class ResultadoEscolarRefatorado {
    public static void main(String[] args) {
        double nota = 6.1;

        String resultado = 
            nota >= 7 ? "Aprovado" 
            : nota < 5 ? "Reprovado" 
            : nota >= 6 ? " Recuperação - Estudar um pouco mais" 
            : "Recuperação - Estudar bastante";

        System.out.println(resultado);
    }
}

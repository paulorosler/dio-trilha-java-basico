public class Operadores {
    public static void main(String[] args) {
        
        String a = "paulo";
        String b = "paulo";
        String c = new String(a);

        if (a == b) {
            System.out.println("é igual");
        }
        else {
            System.out.println("é diferente");
        }

        String comparacao = a==c ? "é igual" : "é diferente"; /* operador ternario ?:*/
        System.out.println(comparacao);

        comparacao = (a.equals(c) && a==c) ? "é igual" : "é parecido mas não igual"; /* operador ternario ?:*/
        System.out.println(comparacao);


    }
}

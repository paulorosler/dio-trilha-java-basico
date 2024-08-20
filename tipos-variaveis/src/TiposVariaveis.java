public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        // Tipos primitivos (byte; short; long; float; double; boolean; char)

        final double PI = 314159264f;
        System.err.println(PI);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal;
        System.err.println(numeroCurto2);



    }
}

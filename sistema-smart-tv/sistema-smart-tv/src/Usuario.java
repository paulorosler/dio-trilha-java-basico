public class Usuario {
    public static void main (String [] args) throws Exception {

        String MTV = new String("Minha TV");
        MTV = "Minha TV mesmo"; /* Não altera MTV, destroi o anterior e cria um novo */
        System.out.println(MTV + "\n");

        SmartTV smartTV = new SmartTV();

        if (!smartTV.ligada) {
            System.out.println("A TV está desligada");
        }
        else {
            System.out.println("A TV está ligada");
        }

        if (smartTV.ligada) {
            System.out.println("Canal: " + smartTV.canal);
            System.out.println("Volume: " + smartTV.volume);
        }

        System.out.println("\nAgora vou mexer no controle \n");
        smartTV.ligar();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.mudarCanal(13);
        System.out.println("A TV está ligada");
        if (smartTV.ligada == true) {
            System.out.println("Canal: " + smartTV.canal);
            System.out.println("Volume: " + smartTV.volume);
        }
    }
}

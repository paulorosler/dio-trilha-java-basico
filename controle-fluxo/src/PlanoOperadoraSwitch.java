public class PlanoOperadoraSwitch {
    public static void main(String [] args) {

        String plano = "M"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
                // Exemplo de swith sem brek by design
                // Horivel para entender a lógica do negocio
			}
			case "M": {
				System.out.println("Whats e Intagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}

    }
    
}

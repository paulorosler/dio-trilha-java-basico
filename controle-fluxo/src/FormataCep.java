public class FormataCep {
    public static void main(String[] args) {
       try {
        String cepFormatado = formatarCep("4662002");
        System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
        // TODO Auto-generated catch block
        System.out.println("O CEP tem que ter 8 digitos");
        e.printStackTrace();
    }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}

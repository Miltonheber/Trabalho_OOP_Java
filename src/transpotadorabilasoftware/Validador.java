package transpotadorabilasoftware;


public class Validador {
    
    public static boolean validarInt(String x){
        if(x == null || x.isEmpty()){
            return false;
        }
        try{
            Integer.parseInt(x);
            return true;
        }catch(Exception e){
            return false;
        }



    }

    public static boolean validarFloat(String x){
        /*
         * por refatorar o codigo para nao permitir a passagem de entradas do tipo (.ab..), onde a, b e ... sao numeros naturais.
         */
        if (x.isEmpty() || x == null){
            return false;
        }

        if(x.indexOf(".") == -1){
            return validarInt(x);
            
        }else{
            try {
                Float.parseFloat(x);
                return true;        
            } catch (Exception e) {
                // TODO: handle exception
                return false;


            }
  
        }

    }
}

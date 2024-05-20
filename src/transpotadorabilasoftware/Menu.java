package transpotadorabilasoftware;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Menu {

    public static BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
    public static String[] catMenu = {"Menu Logistica", "Menu Admin", "Sair"};
    public static String[] listaAdmin = {
        "Adicionar novo Camiao",
        "Adicionar Motorista",
        "Apagar Motorista",
        "Apagar Camiao",
        "Actualizar dados Motorista",
        "Actualizar dados Camiao",
        "Visualizar dados do Motorista",
        "Visualizar dados Camiao",
        "Lista dos Camioes",
        "Lista dos Motoristas",
    }; 

    public static String listaLogistica = {
        "Adicionar novo Cliente",
        "Apagar Cliente",
        "Actualizar dados Cliente",
        "Visualizar dados do Cliente",
        "Adicionar novo Contrato",
        "Apagar Contrato",
        "Actualizar Contrato",
        "Adicionar Carga",
        "Apagar Carga",
        "Actualizar dados da Carga",
        "Adicionar OS",
        "Editar OS",
        "Apagar OS",
        "Visualizar OS"
    };

    public static int entradaOpcoesMenu(String mensagemPersonalizada){
        do{
            System.out.print(mensagemPersonalizada);
            String entrada = leitor.readLine();
            boolean flag = Validador.validarInt(entrada);

        }while(!flag);
        return Integer.parseInt(entrada);

    }

    public static String entradaString(String mensagemPersonalizada){
        System.out.print(mensagemPersonalizada);
        String x = leitor.readLine();
        return x.strip();
    }

    public static float entradaValores(String mensagemPersonalizada){
        do{
            System.out.print(mensagemPersonalizada);
            String x = leitor.readLine();
            boolean flag = Validador.validarFloat(x);
        }while(!flag);
        return Float.parseFloat(x);

    }
    
}

package transpotadorabilasoftware;
import java.util.ArrayList;


public class Cliente extends Pessoa{
    
    private String idCliente;
    private ArrayList<Carga> carga;

    public Cliente(String idCliente, String nome, String cidade, String bairro, String rua) {
        super(nome, cidade, bairro, rua);
        this.idCliente = idCliente;
        this.carga = new ArrayList<Carga>();
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList<Carga> getCarga() {
        return carga;
    }

    public void setCarga(ArrayList<Carga> carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", carga=" + carga + '}';
    }
    
    
    
    
    
}

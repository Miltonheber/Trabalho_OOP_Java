package transpotadorabilasoftware;

public class Camiao {
    
    private String matricula;
    private String modelo;
    private double capacidadeCarga;
    private boolean estadoOcupacao;
    
    public Camiao(String matricula, String modelo, double capacidadeCarga, boolean estadoOcupacao){
        this.matricula = matricula;
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
        this.estadoOcupacao = estadoOcupacao;
        
        
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getModelo(){
        return this.modelo;
        
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public double getCapacidadeCarga(){
        return this.capacidadeCarga;
    }
    
    public void setCapacidadeCarga(double capacidadeCarga){
        this.capacidadeCarga = capacidadeCarga;
    }
    
    public boolean getEstadoOcupacao(){
        return this.estadoOcupacao;
    }
    
    public void setEstadoOcupacao(boolean estadoOcupacao){
        this.estadoOcupacao = estadoOcupacao;
    }

    @Override
    public String toString() {
        return "Camiao{" + "matricula=" + matricula + ", modelo=" + modelo + ", capacidadeCarga=" + capacidadeCarga + ", estadoOcupacao=" + estadoOcupacao + '}';
    }
    
    
}

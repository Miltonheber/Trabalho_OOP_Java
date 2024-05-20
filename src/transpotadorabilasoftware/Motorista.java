package transpotadorabilasoftware;

public class Motorista extends Pessoa {
    
    private String numBi;
    private String categoriaCarta;
    private boolean estadoOcupacao;

    public Motorista(String nome, String cidade, String bairro, String rua, String numBi, String categoriaCarta, boolean estadoOcupacao) {
        super(nome, cidade, bairro, rua);
        this.numBi = numBi;
        this.categoriaCarta = categoriaCarta;
        this.estadoOcupacao = estadoOcupacao;
    }

    public String getNumBi() {
        return numBi;
    }

    public void setNumBi(String numBi) {
        this.numBi = numBi;
    }

    public String getCategoriaCarta() {
        return categoriaCarta;
    }

    public void setCategoriaCarta(String categoriaCarta) {
        this.categoriaCarta = categoriaCarta;
    }

    public boolean isEstadoOcupacao() {
        return estadoOcupacao;
    }

    public void setEstadoOcupacao(boolean estadoOcupacao) {
        this.estadoOcupacao = estadoOcupacao;
    }

    @Override
    public String toString() {
        return "Motorista{" + "numBi=" + numBi + ", categoriaCarta=" + categoriaCarta + ", estadoOcupacao=" + estadoOcupacao + '}';
    }

  
    
    
    
}


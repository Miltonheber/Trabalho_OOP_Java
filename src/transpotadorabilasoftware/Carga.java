package transpotadorabilasoftware;


public class Carga {
    
    private String idCarga;
    private double massa;
    private String tipoCarga;
    private String descricao;

    public Carga(String idCarga, double massa, String tipoCarga, String descricao) {
        this.idCarga = idCarga;
        this.massa = massa;
        this.tipoCarga = tipoCarga;
        this.descricao = descricao;
    }

    public String getIdCarga() {
        return idCarga;
    }

    public void setIdCarga(String idCarga) {
        this.idCarga = idCarga;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Carga{" + "idCarga=" + idCarga + ", massa=" + massa + ", tipoCarga=" + tipoCarga + ", descricao=" + descricao + '}';
    }
    
    
    
}

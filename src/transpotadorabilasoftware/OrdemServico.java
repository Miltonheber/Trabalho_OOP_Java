package transpotadorabilasoftware;

public class OrdemServico {
    
    private String idOS;
    private String descricao;
    private String data;
    private Camiao camiao;
    private Motorista motorista;
    private DespesasViagem despesasViagem;
    private boolean estado;

    public OrdemServico(String idOS, String descricao, String data, Camiao camiao, Motorista motorista, DespesasViagem despesasViagem, boolean estado) {
        this.idOS = idOS;
        this.descricao = descricao;
        this.data = data;
        this.camiao = camiao;
        this.motorista = motorista;
        this.despesasViagem = despesasViagem;
        this.estado = estado;
    }

    public String getIdOS() {
        return idOS;
    }

    public void setIdOS(String idOS) {
        this.idOS = idOS;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Camiao getCamiao() {
        return camiao;
    }

    public void setCamiao(Camiao camiao) {
        this.camiao = camiao;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public DespesasViagem getDespesasViagem() {
        return despesasViagem;
    }

    public void setDespesasViagem(DespesasViagem despesasViagem) {
        this.despesasViagem = despesasViagem;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "OrdemServico{" + "idOS=" + idOS + ", descricao=" + descricao + ", data=" + data + ", camiao=" + camiao + ", motorista=" + motorista + ", despesasViagem=" + despesasViagem + ", estado=" + estado + '}';
    }
    
    
    
    
    
    
}

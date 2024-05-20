package transpotadorabilasoftware;

public class Contrato {
    
    private String idContrato;
    private float valorPagar;
    private String metodoPagamento;
    private String dataPartida;
    private String previsaoChegada;
    private Cliente cliente;

    public Contrato(String idContrato, float valorPagar, String metodoPagamento, String dataPartida, String previsaoChegada, Cliente cliente) {
        this.idContrato = idContrato;
        this.valorPagar = valorPagar;
        this.metodoPagamento = metodoPagamento;
        this.dataPartida = dataPartida;
        this.previsaoChegada = previsaoChegada;
        this.cliente = cliente;
    }

    public String getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(String idContrato) {
        this.idContrato = idContrato;
    }

    public float getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(float valorPagar) {
        this.valorPagar = valorPagar;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    public String getPrevisaoChegada() {
        return previsaoChegada;
    }

    public void setPrevisaoChegada(String previsaoChegada) {
        this.previsaoChegada = previsaoChegada;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Contrato{" + "idContrato=" + idContrato + ", valorPagar=" + valorPagar + ", metodoPagamento=" + metodoPagamento + ", dataPartida=" + dataPartida + ", previsaoChegada=" + previsaoChegada + ", cliente=" + cliente + '}';
    }
    
    
    
}

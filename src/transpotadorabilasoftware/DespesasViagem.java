package transpotadorabilasoftware;

public class DespesasViagem {
    
    private String despesasViagem;
    private float valorCombustivel;
    private float valorAlimentacao;
    private float outrosCustos;

    public DespesasViagem(String despesasViagem, float valorCombustivel, float valorAlimentacao, float outrosCustos) {
        this.despesasViagem = despesasViagem;
        this.valorCombustivel = valorCombustivel;
        this.valorAlimentacao = valorAlimentacao;
        this.outrosCustos = outrosCustos;
    }

    public String getDespesasViagem() {
        return despesasViagem;
    }

    public void setDespesasViagem(String despesasViagem) {
        this.despesasViagem = despesasViagem;
    }

    public float getValorCombustivel() {
        return valorCombustivel;
    }

    public void setValorCombustivel(float valorCombustivel) {
        this.valorCombustivel = valorCombustivel;
    }

    public float getValorAlimentacao() {
        return valorAlimentacao;
    }

    public void setValorAlimentacao(float valorAlimentacao) {
        this.valorAlimentacao = valorAlimentacao;
    }

    public float getOutrosCustos() {
        return outrosCustos;
    }

    public void setOutrosCustos(float outrosCustos) {
        this.outrosCustos = outrosCustos;
    }

    @Override
    public String toString() {
        return "DespesasViagem{" + "despesasViagem=" + despesasViagem + ", valorCombustivel=" + valorCombustivel + ", valorAlimentacao=" + valorAlimentacao + ", outrosCustos=" + outrosCustos + '}';
    }
    
    
}

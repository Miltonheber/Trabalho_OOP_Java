package transpotadorabilasoftware;
import java.util.ArrayList;

public class Pessoa {
    
    private String nome;
    private String cidade;
    private String bairro;
    private String rua;
    private ArrayList<String> telefone;

    public Pessoa(String nome, String cidade, String bairro, String rua) {
        this.nome = nome;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.telefone = new ArrayList<String>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public ArrayList<String> getTelefone(){
        return this.telefone;
    }
    
    public void adicionarTelefone(String telefone){
        this.telefone.add(telefone);
    }
    
}

public class CadastroDeMotorista{
    private String cadastrarNome;
    private int cadastrarId;
    private int cadastrarCpf;
    private int cadastrarIdade;

    CadastroDeMotorista(String cadastrarNomeme, int cadastrarId, int cadastrarCpf, int cadastrarIdade ){
        this.cadastrarNome = cadastrarNome;
        this.cadastrarId = cadastrarId;
        this.cadastrarCpf = cadastrarCpf;
        this.cadastrarIdade = cadastrarIdade;
    }
    public String getCadastrarNome(){
        return cadastrarNome;
    }
    public int getCadastrarId(){
        return cadastrarId;
    }
    public int getCadastrarCpf(){
        return cadastrarCpf;
    }
    public int getCadastrarIdade(){
        return cadastrarIdade;
    }
    public void setCadastrarNome(String cadastrarNome){
        this.cadastrarNome = cadastrarNome;
    }
    public void setCadastrarId(int getCadastrarId){
        this.cadastrarId = cadastrarId;
    }
    public void setCadastrarCpf(int cadastrarCpf){
        this.cadastrarCpf = cadastrarCpf;
    }
    public void setCadastrarIdade(int cadastrarIdade){
        this.cadastrarIdade = cadastrarIdade;
    }
    @Override
    prublic String toString(){
        return "CadastroDeMotorista [cadastraNome=" + cadastrarNome + ",cadastrarId=" + cadastrarId + ", cadastrarCpf=" + cadastrarCpf + "cadastrarIdade=" + cadastrarIdade + "]";

    }

}
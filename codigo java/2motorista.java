public class Motorista{
    private String Nome;
    private String codigoCnh;
    private String cpf;
    private int idade;

    Motorista(String nome, String codigoCnh, String cpf, int idade ){
        this.nome = nome;
        this.codigoCnh = codigoCnh;
        this.cpf = cpf;
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public int getcodigoCnh(){
        return codigoCnh;
    }
    public int getCpf(){
        return cpf;
    }
    public int getIdade(){
        return idade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCodigoCnh(int codigoCnh){
        this.codigoCnh = codigoCnh;
    }
    public void setCpf(int cpf){ 
        this.cpf = cpf;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    @Override
    prublic String toString(){
        return "Motorista [nome=" + nome + ",codigoCnh=" + codigoCnh + ", cpf=" + cpf + "idade=" + idade + "]";

    }

}
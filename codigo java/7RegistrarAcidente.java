public class RegistrarAcidente{
    private Date data;
    private Double horario;
    private String endereco;
    private String causa;
    private String gravidade;

    RegistrarAcidente( Date data, Double horario, String endereco, String causa, String gravidade){
        this.data = data;
        this.horario = horario;
        this.endereco = endereco;
        this.causa = causa;
        this.gravidade = gravidade;
    }
    public Date getData(){
        return data;
    }
    public Double getHorario(){
        return horario;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getCausa(){
        return causa;
    }
    public String getGravidade(){
        return gravidade;
    }
    public void setData(Date data){
        this.data = data;
    }
    public void setHorario(Double horario){
        this.horario = horario;
    }
    public void setEndereco(String endereco){ 
        this.endereco = endereco;
    }
    public void setCausa(String causa){
        this.causa = causa;
    }
    public void setGravidade(String gravidade){
        this.gravidade = gravidade;
    }
    @Override
    prublic String toString(){
        return "RegistrarAcidente [data="+ data + ",horario=" + horario + ",endereco=" + endereco + ",causa=" + causa + ",gravidade=" + gravidade + "]";

    }

}
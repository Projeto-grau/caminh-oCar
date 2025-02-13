public class RegistroDeEntrega{
    private Date dataDaEntrega;
    private Double horarioDaEntrega;
    private String endereco;

    RegistroDeEntrega(Date dataDaEntrega, Double horarioDaEntrega, String endereco ){
        this.dataDaEntrega = dataDaEntrega;
        this.horarioDaEntrega = horarioDaEntrega;
        this.endereco = endereco;
    }
    public Date getDataDaEntrega(){
        return dataDaEntrega;
    }
    public Double getHorarioDaEntrega(){
        return horarioDaEntrega;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setDataDaEntrega(Date dataDaEntrega){
        this.dataDaEntrega = dataDaEntrega;
    }
    public void setHorarioDaEntrega(Double horarioDaEntrega){
        this.horarioDaEntrega = horarioDaEntrega;
    }
    public void setEndereco(String endereco){ 
        this.endereco = endereco;
    }
    @Override
    prublic String toString(){
        return "RegistroDaEntrega [dataDaEntrega=" + dataDaEntrega + ",horarioDaEntrega=" +  horarioDaEntrega + ", endereco=" + endereco + "]";

    }

}
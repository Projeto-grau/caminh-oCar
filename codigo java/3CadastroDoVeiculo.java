public class CadastroDoVeiculo{
    private String placa;
    private String chassi;
    private String marca;
    private int anoDeFabricacao;
    private String tipoDeVeiculo;

    CadastroDoVeiculo(String placa, String chassi, String marca, int anoDeFabricacao, String tipoDeVeiculo ){
        this.placa = placa;
        this.chassi = chassi;
        this.marca = marca;
        this.anoDeFabricacao = anoDeFabricacao;
        this.tipoDeVeiculo = tipoDeVeiculo;
    }
    public String getPlaca(){
        return placa;
    }
    public String getChassi(){
        return chassi;
    }
    public String getMarca(){
        return marca;
    }
    public int getAnoDeFabricacao(){
        return anoDeFabricacao;
    }
    public String getTipoDeVeiculo(){
        return tipoDeVeiculo;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setChassi(String chassi){
        this.chassi = chassi;
    }
    public void setMarca(String marca){ 
        this.marca = marca;
    }
    public void setAnoDeFabricacao(int anoDeFabricacao){
        this.anoDeFabricacao = anoDeFabricacao;
    }
    public void setTipoDeVeiculo(String tipoDeVeiculo){
        this.tipoDeVeiculo = tipoDeVeiculo;
    }
    @Override
    prublic String toString(){
        return "CadastroDoVeiculo [placa=" + placa + ",chassi=" + chassi + ",marca=" + marca + "anoDeFabricacao=" + anoDeFabricacao + ",tipoDeVeiculo=" + tipoDeVeiculo + "]";

    }

}
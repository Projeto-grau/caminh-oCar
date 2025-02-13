public class HistoricoDeRotas{
    private String horarioDaPartida;
    private Date data;
    private String localizacaoDoMotorista;

    HistoricoDeRotas(String horarioDaPartida, Date data, String localizacaoDoMotorista){
        this.horarioDaPartida = horarioDaPartida;
        this.data = data;
        this.localizacaoDoMotorista = localizacaoDoMotorista;
    }
    public String getHorarioDaPartida(){
        return horarioDaPartida;
    }
    public Date getData(){
        return data;
    }
    public String getLocalizacaoDoMotorista(){
        return localizacaoDoMotorista;
    }
    public void setHorarioDaPartida(String horarioDaPartida){
        this.horarioDaPartida = horarioDaPartida;
    }
    public void setData(Date getData){
        this.data = data;
    }
    public void setLocalizacaoDoMotorista(String localizacaoDoMotorista){ 
        this.localizacaoDoMotorista = localizacaoDoMotorista;
    }
    @Override
    prublic String toString(){
        return "HistoricoDeRotas [horarioDaPartida=" + horarioDaPartida + ",data=" + data + ", localizacaoDoMotorista=" + localizacaoDoMotorista + "]";

    }

}
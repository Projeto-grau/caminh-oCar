public class PedidoEntrega{
    private Date dataPrevista;
    private int idDoPedido;
    private String endereco;

    PedidoEntrega(Date dataPrevista, int idDoPedido, String endereco ){
        this.dataPrevista = dataPrevista;
        this.idDoPedido = idDoPedido;
        this.endereco = endereco;
    }
    public Date getDataPrevista(){
        return dataPrevista;
    }
    public int getIdDoPedido(){
        return idDoPedido;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setDataPrevista(Date dataPrevista){
        this.dataPrevista = dataPrevista;
    }
    public void setIdDoPedido(int idDoPedido){
        this.idDoPedido = idDoPedido;
    }
    public void setEndereco(String endereco){ 
        this.endereco = endereco;
    }
    @Override
    prublic String toString(){
        return "PedidoEntrega [dataPrevista=" + dataPrevista + ",idDoPedido=" +  idDoPedido + ", endereco=" + endereco + "]";

    }

}
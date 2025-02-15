public class CadastrarCaminhao {
    private int idDoCaminhao;
    private String placa;
    private String modelo;
    private String marca;
    private int anoDeFabricacao;
    private String chassi;
    private String tipoDeCaminhao;
    private int capacidadeDeCarga;

    CadastrarCaminhao(int idDoCaminhao, String placa, String modelo, String marca, int anoDeFabricacao, String chassi,String tipoDeCaminhao, int capacidadeDeCarga){
        this.idDoCaminhao = idDoCaminhao;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.anoDeFabricacao = anoDeFabricacao;
        this.chassi = chassi;
        this.tipoDeCaminhao = tipoDeCaminhao;
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public int getIdDoCaminhao() {
        return idDoCaminhao;
    }

    public void setIdDoCaminhao(int idDoCaminhao) {
        this.idDoCaminhao = idDoCaminhao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getTipoDeCaminhao() {
        return tipoDeCaminhao;
    }

    public void setTipoDeCaminhao(String tipoDeCaminhao) {
        this.tipoDeCaminhao = tipoDeCaminhao;
    }

    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public String toString() {
        return "CadastrarCaminhao [idDoCaminhao=" + idDoCaminhao + ",placa=" + placa + ",modelo=" + modelo + ",marca=" + marca + ",anoDeFabricacao=" + anoDeFabricacao + ",chassi="+ chassi + ",tipoDeCaminhao=" + tipoDeCaminhao + ",capacidadeDeCarga=" + capacidadeDeCarga + "]";
    }
}

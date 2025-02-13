
public class CadastroDaEmpresa{

    private String nome;
    private int id;
    private String cnpj;
    private String endereco;
    




public CadastroDaEmpresa() {
    }

CadastroDaEmpresa(String nome, int id, String cnpj, String endereco){
    this.nome = nome;
    this.id = id;
    this.cnpj = cnpj;
    this.endereco = endereco;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "CadastroDaEmpresa [nome=" + nome + ", id=" + id + ", cnpj=" + cnpj + "]";
    }


}



public enum caminha0 {
    caminhaoBau ("volvo", 8),
    caminhaoBitren("volvo", 26),
    ("caminhaoCegonha", 16),
    carreta("volvo", 8),

    private final String nome;
    private final int capacidadeDePassageiros;

    // Construtor do enum
    Carro(String nome, int capacidadeDePassageiros) {
        this.nome = nome;
        this.capacidadeDePassageiros = capacidadeDePassageiros;
    }

    // Métodos para acessar as propriedades
    public String getNome() {
        return nome;
    }

    public int getCapacidadeDePassageiros() {
        return capacidadeDePassageiros;
    }

    @Override
    public String toString() {
        return nome + " (Capacidade: " + capacidadeDePassageiros + " passageiros)";
    }
}

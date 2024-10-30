public class CartaoCredito {

    private String nomeDoTitular;
    private String numeroDoCartao;
    private String cvv;
    private String dataDeValidade;
    private double limite;

    public CartaoCredito(String nomeDoTitular, String numeroDoCartao, String cvv, String dataDeValidade, double limite) {
        this.nomeDoTitular = nomeDoTitular;
        this.numeroDoCartao = numeroDoCartao;
        this.cvv = cvv;
        this.dataDeValidade = dataDeValidade;
        this.limite = limite;
    }

    public void realizarCompra(double valor) {
        if (limite > 0 && limite >= valor) {
            limite -= valor;
        } else {
            throw new RuntimeException("Não há limite o bastante para essa compra");
        }
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}

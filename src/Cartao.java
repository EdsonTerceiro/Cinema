public class Cartao extends Pagamento {

    private String nomeTitular;
    private String digitosCartao;
    private String bandeira;
    private int parcela; // Diagrama definia "Int" (invalido em Java) -> usado int
    private String codigoAutorizacao;

    public Cartao(String id, double valor, String nomeTitular, String digitosCartao,
                  String bandeira, int parcela) {
        super(id, valor);
        this.nomeTitular = nomeTitular;
        this.digitosCartao = digitosCartao;
        this.bandeira = bandeira;
        this.parcela = parcela;
    }

    public boolean validarBandeira() {
        return bandeira != null && !bandeira.isEmpty();
    }

    // Implementacao especifica do Cartao para o metodo abstrato de Pagamento
    @Override
    public boolean autorizar() {
        boolean autorizado = validarBandeira();
        if (autorizado) {
            this.codigoAutorizacao = "AUTH-" + digitosCartao + "-" + System.currentTimeMillis();
            this.status = StatusPagamento.CONFIRMADO;
        }
        return autorizado;
    }

    // Getters e Setters
    public String getNomeTitular() { return nomeTitular; }
    public void setNomeTitular(String nomeTitular) { this.nomeTitular = nomeTitular; }

    public String getDigitosCartao() { return digitosCartao; }
    public void setDigitosCartao(String digitosCartao) { this.digitosCartao = digitosCartao; }

    public String getBandeira() { return bandeira; }
    public void setBandeira(String bandeira) { this.bandeira = bandeira; }

    public int getParcela() { return parcela; }
    public void setParcela(int parcela) { this.parcela = parcela; }

    public String getCodigoAutorizacao() { return codigoAutorizacao; }
    public void setCodigoAutorizacao(String codigoAutorizacao) { this.codigoAutorizacao = codigoAutorizacao; }
}


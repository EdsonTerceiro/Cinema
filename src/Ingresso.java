public class Ingresso {

    private String id;
    private double valor;
    private String tipo;
    private String assento;
    private String codigo;

    // Relacionamento * -- 1 com Pedido
    private Pedido pedido;

    // Relacionamento 1 -- 0..* com Sessao
    private Sessao sessao;

    public Ingresso(String id, double valor, String tipo, String assento, Pedido pedido, Sessao sessao) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
        this.assento = assento;
        this.pedido = pedido;
        this.sessao = sessao;
    }

    public String gerarCodigo() {
        this.codigo = "ING-" + id + "-" + System.currentTimeMillis();
        return codigo;
    }

    public boolean validar() {
        return codigo != null && !codigo.isEmpty();
    }

    // Getters e Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getAssento() { return assento; }
    public void setAssento(String assento) { this.assento = assento; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public Pedido getPedido() { return pedido; }
    public void setPedido(Pedido pedido) { this.pedido = pedido; }

    public Sessao getSessao() { return sessao; }
    public void setSessao(Sessao sessao) { this.sessao = sessao; }
}

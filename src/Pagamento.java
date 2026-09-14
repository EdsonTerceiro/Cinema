import java.util.Date;

// Classe abstrata: aplica o principio de Polimorfismo do GRASP.
// Pedido interage apenas com este tipo, sem conhecer as subclasses concretas (Pix, Cartao).
public abstract class Pagamento {

    protected String id;
    protected StatusPagamento status;
    protected double valor;
    protected Date dataPagamento;

    public Pagamento(String id, double valor) {
        this.id = id;
        this.valor = valor;
        this.status = StatusPagamento.PENDENTE;
    }

    public void confirmar() {
        this.status = StatusPagamento.CONFIRMADO;
        this.dataPagamento = new Date();
    }

    public void estornar() {
        this.status = StatusPagamento.ESTORNADO;
    }

    // Metodo abstrato: cada forma de pagamento implementa sua propria logica de autorizacao.
    // E aqui que o polimorfismo acontece: em tempo de execucao a JVM decide
    // se chama a versao de Pix ou de Cartao.
    public abstract boolean autorizar();

    // Getters e Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public StatusPagamento getStatus() { return status; }
    public void setStatus(StatusPagamento status) { this.status = status; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public Date getDataPagamento() { return dataPagamento; }
    public void setDataPagamento(Date dataPagamento) { this.dataPagamento = dataPagamento; }
}


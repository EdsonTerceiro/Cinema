import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private String id;
    private Date dataPedido;
    private StatusPedido status;
    private double valorTotal;

    // Relacionamento 0..* -- 1 com Usuario
    private Usuario usuario;

    // Relacionamento 1 -- * com Ingresso
    private List<Ingresso> ingressos = new ArrayList<>();

    // Relacionamento 1 -- 1 com Pagamento (classe abstrata)
    private Pagamento pagamento;

    public Pedido(String id, Date dataPedido, StatusPedido status, Usuario usuario) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.status = status;
        this.usuario = usuario;
        this.valorTotal = 0.0;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Ingresso ingresso : ingressos) {
            total += ingresso.getValor();
        }
        this.valorTotal = total;
        return total;
    }

    public void cancelar() {
        this.status = StatusPedido.CANCELADO;
    }

    public void verDetalhes() {
        System.out.println("Pedido " + id + " | Status: " + status + " | Total: " + valorTotal);
    }

    // Aqui esta o polimorfismo (GRASP):
    // Pedido nao sabe (e nao precisa saber) se o pagamento e Pix ou Cartao.
    // Ele so conhece a classe abstrata Pagamento e chama autorizar(),
    // que sera executado de acordo com a implementacao concreta em tempo de execucao.
    public boolean realizarpagamento() {
        if (pagamento == null) {
            return false;
        }
        boolean autorizado = pagamento.autorizar();
        if (autorizado) {
            pagamento.confirmar();
            this.status = StatusPedido.PAGO;
        }
        return autorizado;
    }

    public void adicionarIngresso(Ingresso ingresso) {
        ingressos.add(ingresso);
    }

    // Getters e Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Date getDataPedido() { return dataPedido; }
    public void setDataPedido(Date dataPedido) { this.dataPedido = dataPedido; }

    public StatusPedido getStatus() { return status; }
    public void setStatus(StatusPedido status) { this.status = status; }

    public double getValorTotal() { return valorTotal; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public List<Ingresso> getIngressos() { return ingressos; }

    public Pagamento getPagamento() { return pagamento; }
    public void setPagamento(Pagamento pagamento) { this.pagamento = pagamento; }
}


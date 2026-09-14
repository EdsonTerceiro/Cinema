import java.util.ArrayList;
import java.util.List;

public class Sala {

    private String id;
    private int numero;
    private int capacidade;
    private String tipo;

    // Relacionamento 1 -- 0.. com Sessao
    private List<Sessao> sessoes = new ArrayList<>();

    // Relacionamento com Cinemas
    private Cinemas cinema;

    public Sala(String id, int numero, int capacidade, String tipo, Cinemas cinema) {
        this.id = id;
        this.numero = numero;
        this.capacidade = capacidade;
        this.tipo = tipo;
        this.cinema = cinema;
    }

    public void verLugares() {
        System.out.println("Sala " + numero + " | Capacidade: " + capacidade + " | Tipo: " + tipo);
    }

    public void adicionarSessao(Sessao sessao) {
        sessoes.add(sessao);
    }

    // Getters e Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public int getCapacidade() { return capacidade; }
    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public List<Sessao> getSessoes() { return sessoes; }

    public Cinemas getCinema() { return cinema; }
    public void setCinema(Cinemas cinema) { this.cinema = cinema; }
}

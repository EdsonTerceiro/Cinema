import java.util.ArrayList;
import java.util.List;

public class Cinemas {

    private String id;
    private String nome;
    private Object field; // Diagrama define "field: type" de forma generica -> usado Object

    // Relacionamento * -- 0.. com Sala
    private List<Sala> salas = new ArrayList<>();

    public Cinemas(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void verDetalhes() {
        System.out.println("Cinema: " + nome + " | Salas cadastradas: " + salas.size());
    }

    public void adicionarSala(Sala sala) {
        salas.add(sala);
    }

    // Getters e Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Object getField() { return field; }
    public void setField(Object field) { this.field = field; }

    public List<Sala> getSalas() { return salas; }
}

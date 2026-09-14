import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sessao {

    private String id;
    private Date dataHora;
    private String formato;
    private String idioma;
    private int classificacao;

    // Relacionamento 0..* -- 1 com Ingresso
    private List<Ingresso> ingressos = new ArrayList<>();

    // Relacionamento 0..* -- 1 com Filme
    private Filme filme;

    // Relacionamento 0.. -- 1 com Sala
    private Sala sala;

    public Sessao(String id, Date dataHora, String formato, String idioma,
                  int classificacao, Filme filme, Sala sala) {
        this.id = id;
        this.dataHora = dataHora;
        this.formato = formato;
        this.idioma = idioma;
        this.classificacao = classificacao;
        this.filme = filme;
        this.sala = sala;
    }

    // Nome mantido igual ao diagrama (com inicial maiuscula)
    public boolean Disponibilidade() {
        return sala != null && ingressos.size() < sala.getCapacidade();
    }

    public void adicionarIngresso(Ingresso ingresso) {
        ingressos.add(ingresso);
    }

    // Getters e Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Date getDataHora() { return dataHora; }
    public void setDataHora(Date dataHora) { this.dataHora = dataHora; }

    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }

    public String getIdioma() { return idioma; }
    public void setIdioma(String idioma) { this.idioma = idioma; }

    public int getClassificacao() { return classificacao; }
    public void setClassificacao(int classificacao) { this.classificacao = classificacao; }

    public List<Ingresso> getIngressos() { return ingressos; }

    public Filme getFilme() { return filme; }
    public void setFilme(Filme filme) { this.filme = filme; }

    public Sala getSala() { return sala; }
    public void setSala(Sala sala) { this.sala = sala; }
}

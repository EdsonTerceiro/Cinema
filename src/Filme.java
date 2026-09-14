import java.util.ArrayList;
import java.util.List;

public class Filme {

    private String id_filme;
    private String titulo;
    private String sinopse;
    private int duracao;
    private int classificacao;
    private String genero;

    // Relacionamento 1 -- 0..* com Sessao
    private List<Sessao> sessoes = new ArrayList<>();

    public Filme(String id_filme, String titulo, String sinopse, int duracao,
                 int classificacao, String genero) {
        this.id_filme = id_filme;
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.duracao = duracao;
        this.classificacao = classificacao;
        this.genero = genero;
    }

    public void verDetalhes() {
        System.out.println("Filme: " + titulo + " | Genero: " + genero + " | Duracao: " + duracao + " min");
    }

    public void adicionarSessao(Sessao sessao) {
        sessoes.add(sessao);
    }

    // Getters e Setters
    public String getId_filme() { return id_filme; }
    public void setId_filme(String id_filme) { this.id_filme = id_filme; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getSinopse() { return sinopse; }
    public void setSinopse(String sinopse) { this.sinopse = sinopse; }

    public int getDuracao() { return duracao; }
    public void setDuracao(int duracao) { this.duracao = duracao; }

    public int getClassificacao() { return classificacao; }
    public void setClassificacao(int classificacao) { this.classificacao = classificacao; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public List<Sessao> getSessoes() { return sessoes; }
}

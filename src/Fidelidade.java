import java.util.Date;

public class Fidelidade {

    private String id;
    private int qntPontos;
    private Date dataAdesao;

    // Relacionamento 0..1 -- 1 com Usuario
    private Usuario usuario;

    public Fidelidade(String id, int qntPontos, Date dataAdesao, Usuario usuario) {
        this.id = id;
        this.qntPontos = qntPontos;
        this.dataAdesao = dataAdesao;
        this.usuario = usuario;
    }

    public int usarPontos() {
        // logica de uso de pontos
        return qntPontos;
    }

    // Getters e Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public int getQntPontos() { return qntPontos; }
    public void setQntPontos(int qntPontos) { this.qntPontos = qntPontos; }

    public Date getDataAdesao() { return dataAdesao; }
    public void setDataAdesao(Date dataAdesao) { this.dataAdesao = dataAdesao; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
}

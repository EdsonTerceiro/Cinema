import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuario {

    private String id_usuario;
    private String nome;
    private String email;
    private Date dataNascimento;
    private String senha;
    private int telefone;
    private Date dataCadastro;

    // Relacionamento 1 -- 0..1 com Fidelidade
    private Fidelidade fidelidade;

    // Relacionamento 1 -- 0..* com Pedido
    private List<Pedido> pedidos = new ArrayList<>();

    public Usuario(String id_usuario, String nome, String email, Date dataNascimento,
                   String senha, int telefone, Date dataCadastro) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.telefone = telefone;
        this.dataCadastro = dataCadastro;
    }

    public boolean realizarLogin(String email, String senha) {
        return this.email.equals(email) && this.senha.equals(senha);
    }

    // Diagrama define retorno "type" (nao existe em Java) -> usado void
    public void realizarLogout() {
        System.out.println("Usuario " + nome + " deslogado.");
    }

    // Diagrama define retorno "type" (nao existe em Java) -> usado void
    public void atualizarDados(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    // Getters e Setters
    public String getId_usuario() { return id_usuario; }
    public void setId_usuario(String id_usuario) { this.id_usuario = id_usuario; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Date getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(Date dataNascimento) { this.dataNascimento = dataNascimento; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public int getTelefone() { return telefone; }
    public void setTelefone(int telefone) { this.telefone = telefone; }

    public Date getDataCadastro() { return dataCadastro; }
    public void setDataCadastro(Date dataCadastro) { this.dataCadastro = dataCadastro; }

    public Fidelidade getFidelidade() { return fidelidade; }
    public void setFidelidade(Fidelidade fidelidade) { this.fidelidade = fidelidade; }

    public List<Pedido> getPedidos() { return pedidos; }
}

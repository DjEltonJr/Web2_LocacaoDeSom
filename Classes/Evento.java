package Classes;
import java.util.Set;

public class Evento {

    private Long id;

    private String nome;
    private String dataHora;

    private Usuario usuario;
  
    private Set<ItemLocacao> itensLocacao;

    public Evento() {}

    public Evento(String nome, String dataHora, Usuario usuario) {
        this.nome = nome;
        this.dataHora = dataHora;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Set<ItemLocacao> getItensLocacao() {
        return itensLocacao;
    }

    public void setItensLocacao(Set<ItemLocacao> itensLocacao) {
        this.itensLocacao = itensLocacao;
    }
}

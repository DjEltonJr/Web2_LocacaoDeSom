package Classes;
import java.util.Set;

public class Papel {

    private Long id;

    private String nome;  // Exemplo: CLIENTE, ADMIN

    private Set<Usuario> usuarios;

    // Construtores
    public Papel() {}

    public Papel(String nome) {
        this.nome = nome;
    }

    // Getters e Setters
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

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}

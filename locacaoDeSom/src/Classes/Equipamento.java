package Classes;
public class Equipamento {

    private Long id;

    private String nome;
    private String tipo;
    private Double precoDiaria;

    public Equipamento() {}

    public Equipamento(String nome, String tipo, Double precoDiaria) {
        this.nome = nome;
        this.tipo = tipo;
        this.precoDiaria = precoDiaria;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(Double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }
}

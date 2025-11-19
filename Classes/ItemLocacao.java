package Classes;
public class ItemLocacao {

    
    private Long id;
    private Evento evento;
    private Equipamento equipamento;
    private int quantidade;
    private Double precoTotal;
    private String descricao;

    public ItemLocacao() {}

    public ItemLocacao(Evento evento, Equipamento equipamento, int quantidade, Double precoTotal, String descricao) {
        this.evento = evento;
        this.equipamento = equipamento;
        this.quantidade = quantidade;
        this.precoTotal = precoTotal;
        this.descricao = descricao;
    }


    public ItemLocacao(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

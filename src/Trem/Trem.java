package Trem;

public class Trem {

    private int id;
    private String status;
    private int capacidade;

    public Trem(int id, int capacidade, String status) {
        this.id = id;
        this.capacidade = capacidade;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String atualizarStatus() {
        status = "Atualizado para: Em trânsito";
        return status;
    }
}

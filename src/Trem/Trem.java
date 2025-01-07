package Trem;

public class Trem {

    private int id;
    private String status;
    private int lotacao;

    public Trem(int id, int lotacao, String status) {
        this.id = id;
        this.lotacao = lotacao;
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

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public String atualizarStatus() {
        status = "Atualizado para: Em trânsito";
        return status;
    }
}

package StatusViagem;

public class StatusViagem {

    private int id;
    private int atraso;
    private String desvio;
    private int tremId;

    public StatusViagem(int id, boolean atraso, String desvio, int tremId) {
        this.id = id;
        this.atraso = atraso ? 1 : 0;
        this.desvio = desvio;
        this.tremId = tremId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAtraso() {
        return atraso;
    }

    public void setAtraso(boolean atraso) {
        this.atraso = atraso ? 1 : 0;
    }

    public String getDesvio() {
        return desvio;
    }

    public void setDesvio(String desvio) {
        this.desvio = desvio;
    }

    public int getTremId() {
        return tremId;
    }

    public void setTremId(int tremId) {
        this.tremId = tremId;
    }

    public String atualizarStatus() {
        return atraso == 1 ? "Viagem com atraso" : "Viagem no horário";
    }
}

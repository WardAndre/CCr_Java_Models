package StatusViagem;

public class StatusViagem {

    private int id;
    private boolean atraso;

    public StatusViagem(int id, boolean atraso) {
        this.id = id;
        this.atraso = atraso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAtraso() {
        return atraso;
    }

    public void setAtraso(boolean atraso) {
        this.atraso = atraso;
    }

    public String atualizarStatus() {
        this.atraso = !atraso;
        return atraso ? "Viagem com atraso" : "Viagem no horário";
    }
}

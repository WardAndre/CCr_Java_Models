package Horario;

public class Horario {

    private String partida;
    private String chegada;
    private int id;
    private int tremId;

    public Horario(String partida, String chegada, int id, int tremId) {
        this.partida = partida;
        this.chegada = chegada;
        this.id = id;
        this.tremId = tremId;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getChegada() {
        return chegada;
    }

    public void setChegada(String chegada) {
        this.chegada = chegada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTremId() {
        return tremId;
    }

    public void setTremId(int tremId) {
        this.tremId = tremId;
    }

    public boolean verificarHorario() {
        boolean horaAtualAnteriorChegada = true;
        return horaAtualAnteriorChegada ? true : false;
    }
}

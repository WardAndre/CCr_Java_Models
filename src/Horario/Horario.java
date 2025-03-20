package Horario;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Horario {

    private int id;
    private Timestamp horarioPartida;
    private Timestamp horarioChegada;
    private int tremId;

    public Horario(int id, Timestamp horarioPartida, Timestamp horarioChegada, int tremId) {
        this.id = id;
        this.horarioPartida = horarioPartida;
        this.horarioChegada = horarioChegada;
        this.tremId = tremId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getHorarioPartida() {
        return horarioPartida;
    }

    public void setHorarioPartida(Timestamp horarioPartida) {
        this.horarioPartida = horarioPartida;
    }

    public int getTremId() {
        return tremId;
    }

    public void setTremId(int tremId) {
        this.tremId = tremId;
    }

    public Timestamp getHorarioChegada() {
        return horarioChegada;
    }

    public void setHorarioChegada(Timestamp horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

    public String verificarHorario() {
        LocalDateTime agora = LocalDateTime.now();

        // Convertendo Timestamp para LocalDateTime
        LocalDateTime partida = horarioPartida.toLocalDateTime();
        LocalDateTime chegada = horarioChegada.toLocalDateTime();

        if (agora.isBefore(partida)) {
            return "Ainda não partiu";
        } else if (agora.isAfter(chegada)) {
            return "Atrasado";
        } else {
            return "No horário";
        }
    }
}

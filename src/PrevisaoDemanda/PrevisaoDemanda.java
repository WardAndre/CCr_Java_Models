package PrevisaoDemanda;

import Horario.Horario;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public class PrevisaoDemanda {

    private int id;
    private List<Horario> dadosHistoricos;
    private Timestamp picoPrevisto;

    public PrevisaoDemanda(int id, List<Horario> dadosHistoricos) {
        this.id = id;
        this.dadosHistoricos = dadosHistoricos;
        this.picoPrevisto = preverPico();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Horario> getDadosHistoricos() {
        return dadosHistoricos;
    }

    public void setDadosHistoricos(List<Horario> dadosHistoricos) {
        this.dadosHistoricos = dadosHistoricos;
    }

    public Timestamp getPicoPrevisto() {
        return picoPrevisto;
    }

    public void setPicoPrevisto(Timestamp picoPrevisto) {
        this.picoPrevisto = picoPrevisto;
    }

    public Timestamp preverPico() {
        return Timestamp.valueOf(LocalDateTime.now().plusHours(1));
    }
}

package PrevisaoDemanda;

import Horario.Horario;

import java.util.List;

public class PrevisaoDemanda {

    private int id;
    private List<Horario> dadosHistoricos;
    private String picoPrevisto;

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

    public String getPicoPrevisto() {
        return picoPrevisto;
    }

    public void setPicoPrevisto(String picoPrevisto) {
        this.picoPrevisto = picoPrevisto;
    }

    public String preverPico() {
        return "Horário de pico";
    }
}

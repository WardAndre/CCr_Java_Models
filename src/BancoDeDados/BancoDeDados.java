package BancoDeDados;

import Feedback.Feedback;
import Horario.Horario;
import Notificacao.Notificacao;
import PrevisaoDemanda.PrevisaoDemanda;
import Trem.Trem;

import java.util.ArrayList;

public class BancoDeDados {

    private ArrayList<Trem> trens;
    private ArrayList<Horario> horarios;
    private ArrayList<Feedback> feedbacks;
    private ArrayList<Notificacao> notificacoes;
    private ArrayList<PrevisaoDemanda> demandas;

    public BancoDeDados() {
        trens = new ArrayList<Trem>();
        horarios = new ArrayList<Horario>();
        feedbacks = new ArrayList<Feedback>();
        notificacoes = new ArrayList<Notificacao>();
        demandas = new ArrayList<PrevisaoDemanda>();
    }

    public ArrayList<Trem> getTrens() {
        return trens;
    }

    public void setTrens(ArrayList<Trem> trens) {
        this.trens = trens;
    }

    public ArrayList<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(ArrayList<Horario> horarios) {
        this.horarios = horarios;
    }

    public ArrayList<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(ArrayList<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public ArrayList<Notificacao> getNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(ArrayList<Notificacao> notificacoes) {
        this.notificacoes = notificacoes;
    }

    public ArrayList<PrevisaoDemanda> getDemandas() {
        return demandas;
    }

    public void setDemandas(ArrayList<PrevisaoDemanda> demandas) {
        this.demandas = demandas;
    }

    public boolean armazenarDados(Object dado) {
        System.out.println("Dados armazenados no banco.");
        return true;
    }

    public ArrayList<Object> consultarDados(String query) {
        return new ArrayList<>();
    }

    public Trem buscarTremPorId(int id) {
        for (Trem t : trens) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    public Horario buscarHorarioPorId(int id) {
        for (Horario h : horarios) {
            if (h.getId() == id) {
                return h;
            }
        }
        return null;
    }

    public Feedback buscarFeedbackPorId(int id) {
        for (Feedback f : feedbacks) {
            if (f.getId() == id) {
                return f;
            }
        }
        return null;
    }
}

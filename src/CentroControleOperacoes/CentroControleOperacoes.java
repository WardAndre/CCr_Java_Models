package CentroControleOperacoes;

import Feedback.Feedback;
import Notificacao.Notificacao;
import PrevisaoDemanda.PrevisaoDemanda;

import java.util.ArrayList;

public class CentroControleOperacoes {

    private int id;
    private String nome;
    private ArrayList<Feedback> feedbacks;
    private ArrayList<Notificacao> notificacoes;
    private ArrayList<PrevisaoDemanda> previsoesDemanda;

    public CentroControleOperacoes(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.feedbacks = new ArrayList<>();
        this.notificacoes = new ArrayList<>();
        this.previsoesDemanda = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public ArrayList<PrevisaoDemanda> getPrevisoesDemanda() {
        return previsoesDemanda;
    }

    public void setPrevisoesDemanda(ArrayList<PrevisaoDemanda> previsoesDemanda) {
        this.previsoesDemanda = previsoesDemanda;
    }

    public String tomarDecisao() {
        int feedbackPositivo = 0;
        int feedbackNegativo = 0;

        for (Feedback feedback : feedbacks) {
            if (feedback.getDescricao().contains("bom") || feedback.getDescricao().contains("excelente")) {
                feedbackPositivo++;
            } else {
                feedbackNegativo++;
            }
        }

        if (feedbackPositivo >= feedbackNegativo) {
            return "Operação está normal";
        } else {
            return "Operação precisa de ajustes";
        }
    }

    public boolean enviarNotificacaoParaPassageiros(String mensagem) {
        Notificacao notificacao = new Notificacao(1, "Corpo mensagem", "Alerta", "Data de envio");
        notificacoes.add(notificacao);
        return notificacao.enviarNotificacao();
    }
}

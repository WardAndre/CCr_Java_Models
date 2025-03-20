package CentroControleOperacoes;

import Feedback.Feedback;
import Notificacao.Notificacao;
import PrevisaoDemanda.PrevisaoDemanda;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class CentroControleOperacoes {

    private int id;
    private String nome;
    private List<Feedback> feedbacks;
    private List<Notificacao> notificacoes;
    private List<PrevisaoDemanda> previsoesDemanda;

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

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public List<Notificacao> getNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(List<Notificacao> notificacoes) {
        this.notificacoes = notificacoes;
    }

    public List<PrevisaoDemanda> getPrevisoesDemanda() {
        return previsoesDemanda;
    }

    public void setPrevisoesDemanda(List<PrevisaoDemanda> previsoesDemanda) {
        this.previsoesDemanda = previsoesDemanda;
    }

    // Método para tomar decisões baseadas em feedbacks dos passageiros
    public String tomarDecisao() {
        int feedbackPositivo = 0;
        int feedbackNegativo = 0;

        for (Feedback feedback : feedbacks) {
            if (feedback.getDescricao().toLowerCase().contains("bom") || feedback.getDescricao().toLowerCase().contains("excelente")) {
                feedbackPositivo++;
            } else {
                feedbackNegativo++;
            }
        }

        if (feedbackPositivo >= feedbackNegativo) {
            return "Operação está satisfatória. Não é necessária ação imediata.";
        } else {
            return "Operação precisa de ajustes. Considerar aumento de conforto e pontualidade.";
        }
    }

    // Método para enviar notificações aos passageiros
    public boolean enviarNotificacaoParaPassageiros(String mensagem) {
        Notificacao notificacao = new Notificacao(notificacoes.size() + 1, mensagem, "Alerta");
        notificacoes.add(notificacao);
        return notificacao.enviarNotificacao();
    }

    // Método para analisar a previsão de demanda e ajustar frequência dos trens
    public String ajustarFrequenciaTrens() {
        for (PrevisaoDemanda previsao : previsoesDemanda) {
            Timestamp picoPrevisto = previsao.preverPico();
            if (picoPrevisto.before(Timestamp.valueOf(LocalDateTime.now().plusHours(1)))) {
                return "Aumentar frequência dos trens para atender ao pico de demanda previsto.";
            }
        }
        return "Frequência dos trens está adequada.";
    }

    // Método para adicionar feedback à lista para análise
    public void adicionarFeedback(Feedback feedback) {
        feedbacks.add(feedback);
    }

    // Método para adicionar previsão de demanda à lista para análise
    public void adicionarPrevisaoDemanda(PrevisaoDemanda previsao) {
        previsoesDemanda.add(previsao);
    }
}

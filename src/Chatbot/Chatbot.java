package Chatbot;

import Feedback.Feedback;
import Notificacao.Notificacao;

public class Chatbot {

    private int id;
    private String nome;

    public Chatbot(int id, String nome) {
        this.id = id;
        this.nome = nome;
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

    public String fornecerInformacoes() {
        return "Mensagem de retorno com informações sobre horários e status dos trens.";
    }

    public Feedback coletarFeedback() {
        return new Feedback("Nome ou título", "Descrição do Feedback", 1);
    }

    public Notificacao enviarNotificacao() {
        return new Notificacao(1, "Corpo da mensagem", "tipo da notificação", "Data e hora do envio");
    }
}

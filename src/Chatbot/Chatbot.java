package Chatbot;

import Feedback.Feedback;
import Notificacao.Notificacao;

import java.sql.Timestamp;
import java.time.LocalDateTime;

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

    public String fornecerInformacao() {
        return "Informação atualizada sobre horários e status dos trens.";
    }

    public Feedback coletarFeedback() {
        return new Feedback(1, "Serviço bom", Timestamp.valueOf(LocalDateTime.now()), 1);
    }

    public Notificacao enviarNotificacao() {
        return new Notificacao(1, "Notificação enviada com sucesso", "Informação");
    }
}

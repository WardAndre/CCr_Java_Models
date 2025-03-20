package Passageiro;

import Feedback.Feedback;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Passageiro {

    private int id;
    private String nome;
    private String cpf;

    public Passageiro(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String solicitarInformacao() {
        return "Informação solicitada sobre status do trem";
    }

    public Feedback darFeedback() {
        return new Feedback(1, "Descrição do Feedback", LocalDateTime.now());
    }
}

package Passageiro;

import Feedback.Feedback;

public class Passageiro {

    private int id;
    private String nome;
    private String telefone;

    public Passageiro(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String solicitarInformacao() {
        return "Informação solicitada sobre status do trem";
    }

    public Feedback darFeedback() {
        return new Feedback("Nome ou título", "Descrição do Feedback", 1);
    }
}

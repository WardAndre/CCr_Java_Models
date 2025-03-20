package Feedback;

import java.sql.Timestamp;

public class Feedback {

    private int id;
    private String descricao;
    private Timestamp data;  // Agora é Timestamp para corresponder ao banco
    private int passageiroId; // ID do passageiro relacionado

    public Feedback(int id, String descricao, Timestamp data, int passageiroId) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.passageiroId = passageiroId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    public int getPassageiroId() {
        return passageiroId;
    }

    public void setPassageiroId(int passageiroId) {
        this.passageiroId = passageiroId;
    }

    public boolean armazenarFeedback() {
        System.out.println("Feedback armazenado com sucesso.");
        return true;
    }
}

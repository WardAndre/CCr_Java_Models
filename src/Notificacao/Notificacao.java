package Notificacao;

import java.time.LocalDateTime;

public class Notificacao {

    private int id;
    private String mensagem;
    private String tipo;

    public Notificacao(int id, String mensagem, String tipo) {
        this.id = id;
        this.mensagem = mensagem;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean enviarNotificacao() {
        System.out.println("Notificação enviada: " + mensagem);
        return true;
    }
}

package Notificacao;

public class Notificacao {

    private int id;
    private String mensagem;
    private String tipo;
    private String dataEnvio;

    public Notificacao(int id, String mensagem, String tipo, String dataEnvio) {
        this.id = id;
        this.mensagem = mensagem;
        this.tipo = tipo;
        this.dataEnvio = dataEnvio;
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

    public String getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(String dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public boolean enviarNotificacao() {
        System.out.println("Notificação enviada: " + mensagem);
        return true;
    }
}

import BancoDeDados.BancoDeDados;
import CentroControleOperacoes.CentroControleOperacoes;
import Chatbot.Chatbot;
import Feedback.Feedback;
import Horario.Horario;
import Notificacao.Notificacao;
import Passageiro.Passageiro;
import PrevisaoDemanda.PrevisaoDemanda;
import StatusViagem.StatusViagem;
import Trem.Trem;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Teste Chatbot
        Chatbot chatbot = new Chatbot(1, "Assistente de Transporte");

        // Teste Passageiro
        Passageiro passageiro = new Passageiro(1, "Carlos Silva", "123456789");

        // Teste Trem
        Trem trem = new Trem(1, 100, "Em espera");

        // Teste Horario
        Timestamp partida = Timestamp.valueOf(LocalDateTime.now().plusMinutes(30)); // Partida em 30 minutos
        Timestamp chegada = Timestamp.valueOf(LocalDateTime.now().plusHours(2));   // Chegada em 2 horas
        Horario horario = new Horario(1, partida, chegada, trem.getId());

        // Teste Feedback
        Feedback feedback = new Feedback(1, "Muito bom", Timestamp.valueOf(LocalDateTime.now()), passageiro.getId());

        // Teste Notificacao
        Notificacao notificacaoTeste = new Notificacao(1, "Alteração de horário", "Alerta");

        // Teste StatusViagem
        StatusViagem statusViagem = new StatusViagem(1, false, "Sem desvio", trem.getId());

        // Teste PrevisaoDemanda
        List<Horario> dadosHistoricos = new ArrayList<>();
        dadosHistoricos.add(horario);
        PrevisaoDemanda previsaoDemanda = new PrevisaoDemanda(1, dadosHistoricos);

        // Teste CentroControleOperacoes
        CentroControleOperacoes cco = new CentroControleOperacoes(1, "Centro de Controle Operacional");



        // Teste BancoDeDados
        BancoDeDados bancoDeDados = new BancoDeDados();

    }
}

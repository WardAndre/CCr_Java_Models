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
        Chatbot chatbot = new Chatbot(2, "Assistente de Informações");

        // Teste Passageiro
        Passageiro passageiro = new Passageiro(2, "Maria", "3672315671");

        // Teste Trem
        Trem trem = new Trem(2, 75, "Em serviço");

        // Teste Horario
        Timestamp partida = Timestamp.valueOf(LocalDateTime.now());
        Timestamp chegada = Timestamp.valueOf(LocalDateTime.now().plusHours(1));
        Horario horario = new Horario(2, partida, chegada, trem.getId());

        // Teste Feedback
        Feedback feedback = new Feedback(2, "Ótima viagem", Timestamp.valueOf(LocalDateTime.now()), passageiro.getId());

        // Teste Notificacao
        Notificacao notificacao = new Notificacao(2, "Trem em espera", "Alerta");

        // Teste StatusViagem
        StatusViagem statusViagem = new StatusViagem(2, true, "Esperando liberação", trem.getId());

        // Teste PrevisaoDemanda
        List<Horario> dadosHistoricos = new ArrayList<>();
        dadosHistoricos.add(horario);
        PrevisaoDemanda previsaoDemanda = new PrevisaoDemanda(2, dadosHistoricos);

        // Teste CentroControleOperacoes
        CentroControleOperacoes cco = new CentroControleOperacoes(2, "Centro de Controle de Segurança");



        // Teste BancoDeDados
        BancoDeDados bancoDeDados = new BancoDeDados();

//        System.out.println(bancoDeDados.inserirChatBot(chatbot) ? "Chatbot adicionado!" : "Chatbot não adicionado!");

//        System.out.println(bancoDeDados.inserirPassageiro(passageiro) ? "Passageiro adicionado!" : "Passageiro não adicionado!");

//        System.out.println(bancoDeDados.inserirTrem(trem) ? "Trem adicionado!" : "Trem não adicionado!");

//        System.out.println(bancoDeDados.inserirHorario(horario) ? "Horario adicionado!" : "Horario não adicionado!");
//
//        System.out.println(bancoDeDados.inserirFeedBack(feedback) ? "Feedback adicionado!" : "Feedback não adicionado!");
//
//        System.out.println(bancoDeDados.inserirNotificacao(notificacao) ? "Notificação adicionado!" : "Notificação não adicionado!");
//
//        System.out.println(bancoDeDados.inserirStatusViagem(statusViagem) ? "StatusViagem adicionado!" : "StatusViagem não adicionado!");
//
//        System.out.println(bancoDeDados.inserirPrevisaoDemanda(previsaoDemanda) ? "PrevisaoDemanda adicionado!" : "PrevisaoDemanda não adicionado!");
//
//        System.out.println(bancoDeDados.inserirCentroControleOperacoes(cco) ? "CentroControleOperacoes adicionado!" : "CentroControleOperacoes não adicionado!");

    }
}

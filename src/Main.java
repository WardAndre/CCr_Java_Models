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

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Teste Chatbot
        Chatbot chatbot = new Chatbot(1, "Assistente de Transporte");
        System.out.println("Chatbot - fornecerInformacao(): " + chatbot.fornecerInformacoes());
        Feedback feedbackChatbot = chatbot.coletarFeedback();
        System.out.println("Chatbot - coletarFeedback(): " + feedbackChatbot.getDescricao());
        Notificacao notificacao = chatbot.enviarNotificacao();
        System.out.println("Chatbot - enviarNotificacao(): " + notificacao.getMensagem());

        // Teste Passageiro
        Passageiro passageiro = new Passageiro(1, "Carlos Silva", "123456789");
        System.out.println("Passageiro - solicitarInformacao(): " + passageiro.solicitarInformacao());
        Feedback feedbackPassageiro = passageiro.darFeedback();
        System.out.println("Passageiro - darFeedback(): " + feedbackPassageiro);

        // Teste Trem
        Trem trem = new Trem(1, 70, "Em espera");
        System.out.println("Trem - atualizarStatus(): " + trem.atualizarStatus());

        // Teste Horario
        Horario horario = new Horario("hora partida", "hora chegada", 1, 10);
        System.out.println("Horario - verificarHorario(): " + horario.verificarHorario());

        // Teste Feedback
        Feedback feedback = new Feedback("Título do feedback", "Muito bom", 1);
        System.out.println("Feedback - armazenarFeedback(): " + feedback.armazenarFeedback());

        // Teste Notificacao
        Notificacao notificacaoTeste = new Notificacao(1, "Alteração de horário", "Alerta", "data do envio");
        System.out.println("Notificacao - enviarNotificacao(): " + notificacaoTeste.enviarNotificacao());

        // Teste StatusViagem
        StatusViagem statusViagem = new StatusViagem(1, false);
        System.out.println("StatusViagem - atualizarStatus(): " + statusViagem.atualizarStatus());

        // Teste PrevisaoDemanda
        ArrayList<Horario> dadosHistoricos = new ArrayList<>();
        dadosHistoricos.add(horario);
        PrevisaoDemanda previsaoDemanda = new PrevisaoDemanda(1, dadosHistoricos);
        System.out.println("PrevisaoDemanda - preverPico(): " + previsaoDemanda.preverPico());

        // Teste BancoDeDados
        BancoDeDados bancoDeDados = new BancoDeDados();
        System.out.println("BancoDeDados - armazenarDados(): " + bancoDeDados.armazenarDados(trem));
        System.out.println("BancoDeDados - consultarDados(): " + bancoDeDados.consultarDados("Query para selecionar dados no banco"));

        bancoDeDados.getTrens().add(trem);
        Trem tremBuscado = bancoDeDados.buscarTremPorId(1);
        System.out.println("BancoDeDados - buscarTremPorId(): " + (tremBuscado != null ? tremBuscado.atualizarStatus() : "Trem não encontrado"));

        bancoDeDados.getHorarios().add(horario);
        Horario horarioBuscado = bancoDeDados.buscarHorarioPorId(1);
        System.out.println("BancoDeDados - buscarHorarioPorId(): " + (horarioBuscado != null ? horarioBuscado.verificarHorario() : "Horário não encontrado"));

        bancoDeDados.getFeedbacks().add(feedback);
        Feedback feedbackBuscado = bancoDeDados.buscarFeedbackPorId(1);
        System.out.println("BancoDeDados - buscarFeedbackPorData(): " + (feedbackBuscado != null ? feedbackBuscado.getDescricao() : "Nenhum feedback encontrado"));

        //teste CentroControleOperacoes
        CentroControleOperacoes cco = new CentroControleOperacoes(1, "Centro de Controle Operacional");

        // Adicionar feedbacks para teste
        cco.getFeedbacks().add(new Feedback("Equipe de funcionários", "Serviço excelente", 1));
        cco.getFeedbacks().add(new Feedback("Estado das estações", "Serviço ruim", 2));
        cco.getFeedbacks().add(new Feedback("qualidade trens", "Viagem boa", 3));
        cco.getFeedbacks().add(new Feedback("Horário de pico", "Muito lotado", 4));

        // Teste tomarDecisao
        String decisao = cco.tomarDecisao();
        System.out.println("CentroControleOperacoes - tomarDecisao(): " + decisao);

        // Teste enviarNotificacaoParaPassageiros
        boolean notificacaoEnviada = cco.enviarNotificacaoParaPassageiros("Alerta: Mudança na rota");
        System.out.println("CentroControleOperacoes - enviarNotificacaoParaPassageiros(): " + (notificacaoEnviada ? "Notificação enviada com sucesso" : "Falha no envio da notificação"));
    }
}
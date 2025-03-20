package BancoDeDados;

import CentroControleOperacoes.CentroControleOperacoes;
import Chatbot.Chatbot;
import Feedback.Feedback;
import Horario.Horario;
import Notificacao.Notificacao;
import Passageiro.Passageiro;
import PrevisaoDemanda.PrevisaoDemanda;
import StatusViagem.StatusViagem;
import Trem.Trem;
import oracle.jdbc.pool.OracleDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BancoDeDados {

    public static final String user = "";
    public static final String pwd = "";
    private String url = "";
    private Connection conn;

    public BancoDeDados() throws SQLException {
        OracleDataSource ods = new OracleDataSource();
        ods.setURL(url);
        ods.setUser(user);
        ods.setPassword(pwd);
        conn = ods.getConnection();
        System.out.println("Conectado!");
    }

    public boolean inserirPassageiro(Passageiro passageiro) {
        String sql = "INSERT into Passageiro VALUES(?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, passageiro.getId());
            ps.setString(2, passageiro.getNome());
            ps.setString(3, passageiro.getCpf());
            ps.execute();
        } catch (SQLException e) {
            if(conn == null) {
                System.out.println("Conexão nula!");
            } else {
                System.out.println("Erro no PreparedStatement!");
            }
            throw new RuntimeException(e);
        } finally {
            System.out.println("Fechando a conexão com o banco de dados!");
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return true;
    }

    public boolean inserirTrem(Trem trem) {
        String sql = "INSERT into Trem VALUES(?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, trem.getId());
            ps.setString(2, trem.getStatus());
            ps.setInt(3, trem.getCapacidade());
            ps.execute();
        } catch (SQLException e) {
            if(conn == null) {
                System.out.println("Conexão nula!");
            } else {
                System.out.println("Erro no PreparedStatement!");
            }
            throw new RuntimeException(e);
        } finally {
            System.out.println("Fechando a conexão com o banco de dados!");
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return true;
    }

    public boolean inserirHorario(Horario horario) {
        String sql = "INSERT into Horario VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, horario.getId());
            ps.setTimestamp(2, horario.getHorarioPartida());
            ps.setTimestamp(3, horario.getHorarioChegada());
            ps.setInt(1, horario.getTremId());
            ps.execute();
        } catch (SQLException e) {
            if(conn == null) {
                System.out.println("Conexão nula!");
            } else {
                System.out.println("Erro no PreparedStatement!");
            }
            throw new RuntimeException(e);
        } finally {
            System.out.println("Fechando a conexão com o banco de dados!");
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return true;
    }

    public boolean inserirFeedBack(Feedback feedback) {
        String sql = "INSERT into Feedback VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, feedback.getId());
            ps.setString(2, feedback.getDescricao());
            ps.setTimestamp(3, feedback.getData());
            ps.setInt(1, feedback.getPassageiroId());
            ps.execute();
        } catch (SQLException e) {
            if(conn == null) {
                System.out.println("Conexão nula!");
            } else {
                System.out.println("Erro no PreparedStatement!");
            }
            throw new RuntimeException(e);
        } finally {
            System.out.println("Fechando a conexão com o banco de dados!");
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return true;
    }

    public boolean inserirNotificacao(Notificacao notificacao) {
        String sql = "INSERT into Notificacao VALUES(?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, notificacao.getId());
            ps.setString(2, notificacao.getMensagem());
            ps.setString(3, notificacao.getTipo());
            ps.execute();
        } catch (SQLException e) {
            if(conn == null) {
                System.out.println("Conexão nula!");
            } else {
                System.out.println("Erro no PreparedStatement!");
            }
            throw new RuntimeException(e);
        } finally {
            System.out.println("Fechando a conexão com o banco de dados!");
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return true;
    }

    public boolean inserirStatusViagem(StatusViagem statusViagem) {
        String sql = "INSERT into StatusViagem VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, statusViagem.getId());
            ps.setInt(2, statusViagem.getAtraso());
            ps.setString(3, statusViagem.getDesvio());
            ps.setInt(1, statusViagem.getTremId());
            ps.execute();
        } catch (SQLException e) {
            if(conn == null) {
                System.out.println("Conexão nula!");
            } else {
                System.out.println("Erro no PreparedStatement!");
            }
            throw new RuntimeException(e);
        } finally {
            System.out.println("Fechando a conexão com o banco de dados!");
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return true;
    }

    public boolean inserirPrevisaoDemanda(PrevisaoDemanda previsaoDemanda) {
        String sql = "INSERT into PrevisaoDemanda VALUES(?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, previsaoDemanda.getId());
            ps.setTimestamp(2, previsaoDemanda.getPicoPrevisto());
            ps.execute();
        } catch (SQLException e) {
            if(conn == null) {
                System.out.println("Conexão nula!");
            } else {
                System.out.println("Erro no PreparedStatement!");
            }
            throw new RuntimeException(e);
        } finally {
            System.out.println("Fechando a conexão com o banco de dados!");
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return true;
    }

    public boolean inserirCentroControleOperacoes(CentroControleOperacoes centroControleOperacoes) {
        String sql = "INSERT into CentroControleOperacoes VALUES(?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, centroControleOperacoes.getId());
            ps.setString(2, centroControleOperacoes.getNome());
            ps.execute();
        } catch (SQLException e) {
            if(conn == null) {
                System.out.println("Conexão nula!");
            } else {
                System.out.println("Erro no PreparedStatement!");
            }
            throw new RuntimeException(e);
        } finally {
            System.out.println("Fechando a conexão com o banco de dados!");
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return true;
    }

    public boolean inserirChatBot(Chatbot chatbot) {
        String sql = "INSERT into Chatbot VALUES(?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, chatbot.getId());
            ps.setString(2, chatbot.getNome());
            ps.execute();
        } catch (SQLException e) {
            if(conn == null) {
                System.out.println("Conexão nula!");
            } else {
                System.out.println("Erro no PreparedStatement!");
            }
            throw new RuntimeException(e);
        } finally {
            System.out.println("Fechando a conexão com o banco de dados!");
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return true;
    }
}

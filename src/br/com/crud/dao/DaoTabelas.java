package br.com.crud.dao;

import br.com.crud.model.campus;
import br.com.crud.model.curso;
import br.com.crud.model.perg_x_resp;
import br.com.crud.model.pergunta;
import br.com.crud.model.pesquisa;
import br.com.crud.model.resposta;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoTabelas extends Dao {

    public boolean cadastrarPergunta(pergunta perg) {
        String comando = "insert into pergunta (PerguntaCodigo, PerguntaDescricao) values (?,?)";
        this.conectar();
        try {
            this.stmt = (PreparedStatement) this.conn.prepareStatement(comando);
            this.stmt.setInt(1, perg.getPerguntaCodigo());
            this.stmt.setString(2, perg.getPerguntaDescricao());
            this.stmt.execute();

        } catch (SQLException ex) {
            Logger.getLogger(DaoTabelas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public pergunta buscarPergunta(int PerguntaCodigo) {
        String comando = "select * from pergunta where PerguntaCodigo = ?";
        pergunta perg = new pergunta(); //instanciar a classe
        this.conectar();
        try {
            this.stmt = (PreparedStatement) this.conn.prepareStatement(comando);
            this.stmt.setInt(1, PerguntaCodigo);

            ResultSet rs = this.stmt.executeQuery();
            if (rs.next()) {

                perg.setPerguntaCodigo(rs.getInt("PerguntaCodigo"));
                perg.setPerguntaDescricao(rs.getString("PerguntaDescricao"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoTabelas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return perg;
    }

    public boolean excluirPergunta(int PerguntaCodigo) {
        String comando = "delete from pergunta where PerguntaCodigo = ?";
        this.conectar();
        try {
            this.stmt = (PreparedStatement) this.conn.prepareStatement(comando);
            this.stmt.setInt(1, PerguntaCodigo);
            this.stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DaoTabelas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    /* 
    public boolean cadastrarPergResp(perg_x_resp pxr) {
        String comando = "insert into perg_x_resp (PerguntaCodigo, RespostaCodigo) values (?,?)";
        this.conectar();
        try {
            this.stmt = (PreparedStatement) this.conn.prepareStatement(comando);
            this.stmt.setInt(1, pxr.getPerguntaCodigo());
            this.stmt.setInt(2, pxr.getRespostaCodigo());
            this.stmt.execute();

        } catch (SQLException ex) {
            Logger.getLogger(DaoTabelas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public perg_x_resp buscarPergResp(int PerguntaCodigo, int RespostaCodigo) {
        String comando = "select * from perg_x_resp where PerguntaCodigo = ?, RespostaCodigo = ?";
        perg_x_resp pxr = new perg_x_resp(); //instanciar a classe
        this.conectar();
        try {
            this.stmt = (PreparedStatement) this.conn.prepareStatement(comando);
            this.stmt.setInt(1, PerguntaCodigo);
            this.stmt.setInt(2, RespostaCodigo);

            ResultSet rs = this.stmt.executeQuery();
            if (rs.next()) {

                pxr.setPerguntaCodigo(rs.getInt("PerguntaCodigo"));
                pxr.setRespostaCodigo(rs.getInt("RespostaCodigo"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoTabelas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return pxr;
    }

    public boolean excluirPergResp(int PerguntaCodigo, int RespostaCodigo) {
        String comando = "delete from perg_x_resp where PerguntaCodigo = ?, RespostaCodigo = ?";
        this.conectar();
        try {
            this.stmt = (PreparedStatement) this.conn.prepareStatement(comando);
            this.stmt.setInt(1, PerguntaCodigo);
            this.stmt.setInt(2, RespostaCodigo);
            this.stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DaoTabelas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    */
    public boolean cadastrarResposta(resposta resp) {
        String comando = "insert into resposta (RespostaCodigo, RespostaDescricao) values (?,?)";
        this.conectar();
        try {
            this.stmt = (PreparedStatement) this.conn.prepareStatement(comando);
            this.stmt.setInt(1, resp.getRespostaCodigo());
            this.stmt.setString(2, resp.getRespostaDescricao());
            this.stmt.execute();

        } catch (SQLException ex) {
            Logger.getLogger(DaoTabelas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public resposta buscarResposta(int RespostaCodigo) {
        String comando = "select * from resposta where RespostaCodigo = ?";
        resposta resp = new resposta(); //instanciar a classe
        this.conectar();
        try {
            this.stmt = (PreparedStatement) this.conn.prepareStatement(comando);
            this.stmt.setInt(1, RespostaCodigo);

            ResultSet rs = this.stmt.executeQuery();
            if (rs.next()) {

                resp.setRespostaCodigo(rs.getInt("RespostaCodigo"));
                resp.setRespostaDescricao(rs.getString("RespostaDescricao"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoTabelas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return resp;
    }

    public boolean excluirResposta(int RespostaCodigo) {
        String comando = "delete from resposta where RespostaCodigo = ?";
        this.conectar();
        try {
            this.stmt = (PreparedStatement) this.conn.prepareStatement(comando);
            this.stmt.setInt(1, RespostaCodigo);
            this.stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DaoTabelas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public boolean cadastrarCampus(campus camp) {
        String comando = "insert into campus (FilialCodigo, FilialNome) values (?,?)";
        this.conectar();
        try {
            this.stmt = (PreparedStatement) this.conn.prepareStatement(comando);
            this.stmt.setInt(1, camp.getFilialCodigo());
            this.stmt.setString(2, camp.getFilialNome());
            this.stmt.execute();

        } catch (SQLException ex) {
            Logger.getLogger(DaoTabelas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public campus buscarCampus(int FilialCodigo) {
        String comando = "select * from campus where FilialCodigo = ?";
        campus camp = new campus();
        this.conectar();
        try {
            this.stmt = (PreparedStatement) this.conn.prepareStatement(comando);
            this.stmt.setInt(1, FilialCodigo);

            ResultSet rs = this.stmt.executeQuery();
            if (rs.next()) {
                camp.setFilialCodigo(rs.getInt("FilialCodigo"));
                camp.setFilialNome(rs.getString("FilialNome"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoTabelas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return camp;

    }

    public boolean excluirCampus(int FilialCodigo) {
        String comando = "delete from campus where FilialCodigo = ?";
        this.conectar();
        try {
            this.stmt = (PreparedStatement) this.conn.prepareStatement(comando);
            this.stmt.setInt(1, FilialCodigo);
            this.stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DaoTabelas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public boolean cadastrarPesquisa(pesquisa pesq) {
        String comando = "insert into pesquisa (PerguntaCodigo, FilialCodigo, CursoCodigo, RespostaCodigo, TotalResposta) values (?,?,?,?,?)";
        this.conectar();
        try {
            this.stmt = (PreparedStatement) this.conn.prepareStatement(comando);
            this.stmt.setInt(1, pesq.getPerguntaCodigo());
            this.stmt.setInt(2, pesq.getFilialCodigo());
            this.stmt.setInt(3, pesq.getCursoCodigo());
            this.stmt.setInt(4, pesq.getRespostaCodigo());
            this.stmt.setInt(5, pesq.getTotalResposta());
            this.stmt.execute();

        } catch (SQLException ex) {
            Logger.getLogger(DaoTabelas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public pesquisa buscarPesquisa(int PerguntaCodigo) {
        String comando = "select * from pesquisa where PerguntaCodigo = ?";
        pesquisa pesq = new pesquisa(); //instanciar a classe
        this.conectar();
        try {
            this.stmt = (PreparedStatement) this.conn.prepareStatement(comando);
            this.stmt.setInt(1, PerguntaCodigo);

            ResultSet rs = this.stmt.executeQuery();
            if (rs.next()) {

                pesq.setPerguntaCodigo(rs.getInt("PerguntaCodigo"));
                pesq.setFilialCodigo(rs.getInt("FilialCodigo"));
                pesq.setCursoCodigo(rs.getInt("CursoCodigo"));
                pesq.setRespostaCodigo(rs.getInt("RespostaCodigo"));
                pesq.setTotalResposta(rs.getInt("TotalResposta"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoTabelas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return pesq;
    }

    public boolean excluirPesquisa(int PerguntaCodigo) {
        String comando = "delete from pesquisa where PerguntaCodigo = ?";
        this.conectar();
        try {
            this.stmt = (PreparedStatement) this.conn.prepareStatement(comando);
            this.stmt.setInt(1, PerguntaCodigo);
            this.stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DaoTabelas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public boolean cadastrarCurso(curso cu) {
        String comando = "insert into curso (CursoNome, CursoCodigo) values (?,?)";
        this.conectar();
        try {
            this.stmt = (PreparedStatement) this.conn.prepareStatement(comando);
            this.stmt.setString(1, cu.getCursoNome());
            this.stmt.setInt(2, cu.getCursoCodigo());
            this.stmt.execute();

        } catch (SQLException ex) {
            Logger.getLogger(DaoTabelas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public curso buscarCurso(int CursoCodigo) {
        String comando = "select * from curso where CursoCodigo = ?";
        curso cu = new curso();
        this.conectar();
        try {
            this.stmt = (PreparedStatement) this.conn.prepareStatement(comando);
            this.stmt.setInt(1, CursoCodigo);

            ResultSet rs = this.stmt.executeQuery();
            if (rs.next()) {
                cu.setCursoCodigo(rs.getInt("CursoCodigo"));
                cu.setCursoNome(rs.getString("CursoNome"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoTabelas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return cu;
    }

    public boolean excluirCurso(int CursoCodigo) {
        String comando = "delete from curso where CursoCodigo = ?";
        this.conectar();
        try {
            this.stmt = (PreparedStatement) this.conn.prepareStatement(comando);
            this.stmt.setInt(1, CursoCodigo);
            this.stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DaoTabelas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

}

package estocmed.util;

import birdpoint.professor.Professor;
import estocmed.estoqueconsumo.EstoqueConsumo;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

@SuppressWarnings("unchecked")
public abstract class GenericDAO<T> {

    /*
     * Essa classe possui operações comuns a todas as classes persistentes
     * para utilizar-la deverá criar uma classe DAO específica para a classe
     * persistente e extends GenericDAO<T> onde T é a classe Persistente 
     */
    public Session sessao;
    public Transaction transacao;
    private Class classe;

    public GenericDAO(Class classe) {
        this.classe = classe;
    }

    public boolean adicionar(T entity) {
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            this.getSessao().save(entity);
            this.getTransacao().commit();

        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível executar essa operação" + entity.getClass()
                    + ". Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            getSessao().close();

        }
        return true;
    }

    public boolean adicionarPonto(T entity) {
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            this.getSessao().save(entity);
            this.getTransacao().commit();

        } catch (HibernateException e) {
            System.out.println("Erro ao se conectar com o banco de dados! Reconectando...");
            return false;
        } finally {
            getSessao().close();

        }
        return true;
    }

    public boolean atualizar(T entity) {
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            this.getSessao().merge(entity);
            this.getTransacao().commit();

        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível executar essa operação" + entity.getClass()
                    + ". Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            getSessao().close();

        }
        return true;
    }

    public List<T> listaEntreDatas(EstoqueConsumo estoqueConsumo, java.util.Date dataInicio, java.util.Date dataFim) {
        //List<T> lista = null;
        
        this.setSessao(HibernateUtil.getSessionFactory().openSession());
        setTransacao(getSessao().beginTransaction());
        Criteria criteria = this.getSessao().createCriteria(EstoqueConsumo.class)
                .add(Restrictions.between("dataVencimento", dataInicio, dataFim));
        return criteria.list();

//        this.setSessao(HibernateUtil.getSessionFactory().openSession());
//        setTransacao(getSessao().beginTransaction());
//        this.getSessao().createCriteria(EstoqueConsumo.class);
//        lista = this.getSessao().createCriteria(EstoqueConsumo.class)
//                .add(Restrictions.between("dataVencimento", dataInicio, dataFim))
//                .list();
//        return lista;
//        lista = getSessao().createCriteria(EstoqueConsumo.class).
//              add(Restrictions.ge("dataVencimento", dataInicio)).
//              add(Restrictions.le("dataVencimento", dataFim)).
//              list();
        
//        this.setSessao(HibernateUtil.getSessionFactory().openSession());
//        setTransacao(getSessao().beginTransaction());
//        Criteria criteria = this.getSessao().createCriteria(EstoqueConsumo.class);
//        criteria.add(Restrictions.ge("dataVencimento", dataInicio));
//        criteria.add(Restrictions.le("dataVencimento", dataFim));
//        return criteria.list();
    }

    public boolean remover(T entity) {
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            this.setTransacao(getSessao().beginTransaction());
            this.getSessao().delete(entity);
            this.getTransacao().commit();
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível executar essa operação" + entity.getClass()
                    + ". Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            getSessao().close();

        }
        return true;
    }

    public List<T> listar() {
        List<T> lista = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            setTransacao(getSessao().beginTransaction());
            lista = this.getSessao().createCriteria(classe).list();
            //sessao.close();
        } catch (Throwable e) {
            if (getTransacao().isActive()) {
                getTransacao().rollback();
            }
            JOptionPane.showMessageDialog(null, "Não foi possível executar essa operação"
                    + ". Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }

    /*
     * ao passar uma chave primária
     * ele retorna um objeto referente a chave primária
     */
    public int carregaChavePrimaria(String nome) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            int o = (int) sessao.load(classe, nome);
            return o;
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível executar essa operação"
                    + ". Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return 0;
    }

    public List<T> checkExists(String campo, String valor) {
        List<T> lista = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            setTransacao(getSessao().beginTransaction());
            lista = this.getSessao().createCriteria(classe).add(Restrictions.ilike(campo, valor, MatchMode.ANYWHERE)).list();
            sessao.close();
        } catch (Throwable e) {
            if (getTransacao().isActive()) {
                getTransacao().rollback();
            }
            JOptionPane.showMessageDialog(null, "Não foi possível executar essa operação"
                    + ". Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return lista;

    }

    public List<T> checkExistsPonto(String campo, String valor) {
        List<T> lista = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            setTransacao(getSessao().beginTransaction());
            lista = this.getSessao().createCriteria(classe).add(Restrictions.ilike(campo, valor, MatchMode.ANYWHERE)).list();
            sessao.close();
        } catch (Throwable e) {

        }
        return lista;

    }

    public List<T> estoquesMaioresQueZero(String campo, int valor) {
        List<T> lista = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            setTransacao(getSessao().beginTransaction());
            lista = this.getSessao().createCriteria(classe).add(Restrictions.gt(campo, valor)).list();
            sessao.close();
        } catch (Throwable e) {
            if (getTransacao().isActive()) {
                getTransacao().rollback();
            }
            JOptionPane.showMessageDialog(null, "Não foi possível executar essa operação"
                    + ". Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return lista;

    }

    public List<T> checkExistseq(String campo, Object valor) {
        List<T> lista = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            setTransacao(getSessao().beginTransaction());
            lista = this.getSessao().createCriteria(classe).add(Restrictions.eq(campo, valor)).list();
            sessao.close();
        } catch (Throwable e) {
            if (getTransacao().isActive()) {
                getTransacao().rollback();
            }
            JOptionPane.showMessageDialog(null, "Não foi possível executar essa operação"
                    + ". Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return lista;

    }

    public T consultarObjetoId(String campo, Object valor) {
        T objeto = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            setTransacao(getSessao().beginTransaction());
            objeto = (T) this.getSessao().createCriteria(classe).add(Restrictions.eq(campo, valor)).uniqueResult();
            sessao.close();
        } catch (Throwable e) {
            if (getTransacao().isActive()) {
                getTransacao().rollback();
            }
            JOptionPane.showMessageDialog(null, "Não foi possível executar essa operação"
                    + ". Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return objeto;

    }

    public boolean consultarValorRepetido(String campo, Object valor) {
        T objeto = null;
        try {
            this.setSessao(HibernateUtil.getSessionFactory().openSession());
            setTransacao(getSessao().beginTransaction());
            objeto = (T) this.getSessao().createCriteria(classe).add(Restrictions.eq(campo, valor)).uniqueResult();
            sessao.close();
        } catch (Throwable e) {
            if (getTransacao().isActive()) {
                getTransacao().rollback();
            }
            JOptionPane.showMessageDialog(null, "Não foi possível executar essa operação"
                    + ". Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        if (objeto == null) {
            return false;
        } else {
            return true;
        }

    }

    /**
     * @return the sessao
     */
    public Session getSessao() {
        return sessao;
    }

    /**
     * @param sessao the sessao to set
     */
    public void setSessao(Session sessao) {
        this.sessao = sessao;
    }

    /**
     * @return the transacao
     */
    public Transaction getTransacao() {
        return transacao;
    }

    /**
     * @param transacao the transacao to set
     */
    public void setTransacao(Transaction transacao) {
        this.transacao = transacao;
    }

}

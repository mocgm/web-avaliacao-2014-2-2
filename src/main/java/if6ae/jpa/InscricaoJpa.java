/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6ae.jpa;

import if6ae.entity.Inscricao;
import if6ae.entity.Inscricao_;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author a1047809
 */
public class InscricaoJpa extends JpaController {
    
    
    public Inscricao findByNumero(int numero) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Inscricao> cq = cb.createQuery(Inscricao.class);
            Root<Inscricao> rt = cq.from(Inscricao.class);
            cq.where(cb.equal(rt.get(Inscricao_.numero), numero));
            TypedQuery<Inscricao> q = em.createQuery(cq);
            return q.getSingleResult();
        }
        finally {
            if (em != null)
                em.close();
        }
            
    }
    
    public Inscricao findByCpf(int cpf) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Inscricao> cq = cb.createQuery(Inscricao.class);
            Root<Inscricao> rt = cq.from(Inscricao.class);
            cq.where(cb.equal(rt.get(Inscricao_.cpf), cpf));
            TypedQuery<Inscricao> q = em.createQuery(cq);
            return q.getSingleResult();
        }
        finally {
            if (em != null)
                em.close();
        }
    
    }
    
    public List<Inscricao> findAll()
    {
        EntityManager em = null;
        try {
        em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Inscricao> cq = cb.createQuery(Inscricao.class);
        Root<Inscricao> rt = cq.from(Inscricao.class);
        TypedQuery<Inscricao> q = em.createQuery(cq);
        return q.getResultList();
        } 
        finally {
            if (em != null) em.close();
        }
    }
}

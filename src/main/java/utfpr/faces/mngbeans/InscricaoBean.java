/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.faces.mngbeans;

import if6ae.entity.Inscricao;
import if6ae.entity.Minicurso;
import if6ae.jpa.InscricaoJpa;
import if6ae.jpa.InscricaoMinicursoJpa;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped;
import utfpr.faces.support.PageBean;

/**
 *
 * @author a1047809
 */
@ManagedBean
@SessionScoped
public class InscricaoBean extends PageBean {
    
    private List<Inscricao> inscricoes;
    private List<Minicurso> minicursos;

    public List<Minicurso> getMinicursos() {
        try {
            InscricaoMinicursoJpa ctl = new InscricaoMinicursoJpa();
            minicursos = ctl.findAll();
        }
        catch (Exception e)
        {
            minicursos = new ArrayList<>(0);
        }
        return minicursos;
    }

    public void setMinicursos(List<Minicurso> minicursos) {
        this.minicursos = minicursos;
    }

    
    
    public List<Inscricao> getInscricoes() {
        try {
            InscricaoJpa ctl = new InscricaoJpa();
            inscricoes = ctl.findAll();
        }
        catch (Exception e)
        {
            inscricoes = new ArrayList<>(0);
        }
        return inscricoes;
    }

    public void setInscricoes(List<Inscricao> inscricoes) {
        this.inscricoes = inscricoes;
    }

    
}

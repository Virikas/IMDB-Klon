/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imdb.controler;

import imdb.klon.Schauspieler;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dev
 */
@Stateless
public class SchauspielerFacade extends AbstractFacade<Schauspieler> {

    @PersistenceContext(unitName = "ImdbKlonPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SchauspielerFacade() {
        super(Schauspieler.class);
    }
    
}

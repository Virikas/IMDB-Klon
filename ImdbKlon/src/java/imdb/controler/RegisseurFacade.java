/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imdb.controler;

import imdb.klon.Regisseur;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dev
 */
@Stateless
public class RegisseurFacade extends AbstractFacade<Regisseur> {

    @PersistenceContext(unitName = "ImdbKlonPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegisseurFacade() {
        super(Regisseur.class);
    }
    
}

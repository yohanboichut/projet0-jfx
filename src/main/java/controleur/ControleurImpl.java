package controleur;

import controleur.abstractControleur.AbstractControleur;
import modele.FacadeModele;
import vues.GestionnaireVue;


public class ControleurImpl extends AbstractControleur {

    private FacadeModele facadeModele;

    public ControleurImpl(GestionnaireVue gestionnaireVue, FacadeModele facadeModele, ControleurSetUp controleurSetUp) {
        super(gestionnaireVue);
        this.facadeModele = facadeModele;
        controleurSetUp.setUp(this, getGestionnaireVue());
    }

    @Override
    public void run() {

    }
}

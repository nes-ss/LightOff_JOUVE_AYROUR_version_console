/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_jouve_ayrour_version_console;

import java.util.Random;

/**
 *
 * @author ayrou
 */
public class GrilleDeJeu {
 CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;

    /**
     * Constructeur de la classe GrilleDeJeu.
     *
     * @param p_nbLignes     Le nombre de lignes de la grille.
     * @param p_nbColonnes   Le nombre de colonnes de la grille.
     */
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    /**
     * Éteint toutes les cellules de la grille.
     */
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }}
    
    
  
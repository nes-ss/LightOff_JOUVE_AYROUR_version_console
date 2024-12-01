/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_jouve_ayrour_version_console;

import java.util.Scanner;

/**
 *
 * @author ayrou
 */
public class Partie {
     private GrilleDeJeu grille; // Référence à la grille de jeu
    private int nbCoups; // Nombre de coups joués par le joueur

    /**
     * Constructeur de la classe Partie.
     *
     * @param nbLignes     Le nombre de lignes de la grille.
     * @param nbColonnes   Le nombre de colonnes de la grille.
     */
    public Partie() {
        Scanner scanner = new Scanner(System.in);

        int nbLignes;
        int nbColonnes;
        System.out.print("Entrez le nombre de Lignes et de Colonnes (separes par une virgule) : ");
    
        String input = scanner.nextLine();
        String[] parts = input.split(",");

        if (parts.length == 2) {
            nbLignes = Integer.parseInt(parts[0].trim());
            nbColonnes = Integer.parseInt(parts[1].trim());

            grille = new GrilleDeJeu(nbLignes, nbColonnes);
            nbCoups = 0;
        } else {
            System.out.println("Veuillez entrer les valeurs au format 'lignes,colonnes'.");
        }
    }

    /**
     * Initialise la partie en mélangeant la grille de jeu de manière aléatoire.
     *
     * @param nbTours Le nombre de tours de mélange.
     */
    public void initialiserPartie() {
        Scanner scanner = new Scanner(System.in);

        int nbTours;
        System.out.print("Entrez le nombre de Tours de la matrice : ");
        nbTours = scanner.nextInt();
        grille.melangerMatriceAleatoirement(nbTours);
    }

    void lancerPartie() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

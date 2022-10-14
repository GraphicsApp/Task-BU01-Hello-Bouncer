package de.ur.mi.bouncer.hello;

import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.bouncer.apps.BouncerLauncher;

public class HelloBouncer extends BouncerApp {

    /**
     * Diese Methode bildet den Kern des Bouncer-Programms. Beginnend bei der erste Zeile "loadMap(..." werden alle
     * hier notierten Befehl in der angegebenen Reihenfolge bearbeitet. In Abhängigkeit des jeweils vorliegenden
     * Weltzustands sowie der internen States des Programms führen dieser Befehl dann jeweils zu einer Positionsveränderung
     * von Bouncer und/oder eine Manipulation der Welt.
     */
    @Override
    public void bounce() {
        // Hier wird die Welt geladen, in der Bouncer platziert und die weiteren Befehle ausgeführt werden.
        loadMap("World"); // Welt: Bouncer steht vor einem Plateau, auf dem sich ein rotes Feld befindet
        bouncer.move(); // Bouncer bewegt sich genau ein Feld in Blickrichtung nach vorne
        bouncer.turnLeft(); // Bouncer dreht sich um 90 Grad nach links
        bouncer.move(); // Bouncer bewegt sich genau ein Feld in Blickrichtung nach vorne
        bouncer.turnLeft(); // Bouncer dreht sich um 90 Grad nach links
        bouncer.turnLeft(); // Bouncer dreht sich um 90 Grad nach links
        bouncer.turnLeft(); // Bouncer dreht sich um 90 Grad nach links
        bouncer.move(); // Bouncer bewegt sich genau ein Feld in Blickrichtung nach vorne
        bouncer.move(); // Bouncer bewegt sich genau ein Feld in Blickrichtung nach vorne
        // Nach der Ausführung aller Befehle steht Bouncer auf dem roten Feld
    }

    /**
     * Über diese Methode wird das Boucner-Programm gestartet und dadurch auch die von Ihnen vorbereitete bouncer-Methode
     * ausgeführt. Diese main-Methode muss sich in jedem Bouncer-Programm in genau dieser Form befinden. Sie können das
     * Programm dann über einen Klick auf den grünen Pfeil links neben dem Methodennamen und der Auswahl "Run ..." starten.
     * @param args
     */
    public static void main(String[] args) {
        BouncerLauncher.launch();
    }
}

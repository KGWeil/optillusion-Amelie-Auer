
//$PKGLINE
import processing.core.PApplet;

/**
 * Klasse ProcessingTmpl.
 * Beschreibung: Temp
 * ate einer Processing Klasse. Kopieren und "ProcessingTmpl" durch eigenen Namen erstezen.
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen2mitKopfschleife extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(400,500);
    }        
    int d = 50; //großes Quadrat Seitenlänge
    int a = 38; //kleines Quadrat Seitenlänge
    int b = 6; //Abstand zwischen großem und kleinem Qudrat
    int gruen = 0xff228B22; //Farbe Grünton
    int farbe1 = gruen; 
    int weiss = 255; //Farbe weis
    int farbe2 = weiss;
    int y = 0; //y-Koordinate
    int x =0; //x-Koordinate

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {zeichneQuadrate();

    }

    public void zeichneQuadrate(){
        while (y < height) { //während y kleiner als die Höhe ist führe Schleife durch
            while (x < width ){ //während x kleiener als die Breite ist führe Schleife durch
                if (farbe1 == weiss){ //Farbwechsel
                    farbe1 = gruen;
                    farbe2 = weiss;
                } else {
                    farbe1 = weiss;
                    farbe2 = gruen;
                }
                fill (farbe1); //setzt Farbe 
                rect(x*d,y*d,d,d); //großes Recheck
                fill (farbe2); //setzt andere Farbe
                rect(x*d+b,y*d+b,a,a); // kleines Rechteck
                x = x+d; //erhöt k um die Seitenlänge
            }
            y = y+d; //erhöt i um die Seitenlänge
            x = 0; //setzt x wieder auf 0 für ne neue Reihe
        }
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */ 
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Wellen2mitKopfschleife.class.getName() });
    }

}


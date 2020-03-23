
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse hermann_gitter_01.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class hermann_gitter_01 extends PApplet
{    
    int q=70;
    int a=30;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(670,670);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {background(255);
        Quadrate();  

    }

    public void Quadrate(){
        fill(0);
        for (int k=0; k<7; k++) {
            for (int i=0; i<7; i++){
                rect(i*q+i*a,k*a+k*q,q,q);
            }
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
        PApplet.main(new String[] {hermann_gitter_01.class.getName() });
    }

}


import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse hermann_gitter_01.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class hermannGittermitKopfschleife extends PApplet
{    
    int q=70;
    int a=30;
    int i= 0;
    int k = 0;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(770,770);
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
        while (k < height) {
            while (i<width){
                rect(i*q+i*a,k*a+k*q,q,q);
                i = i+1;
            }
            i = 0;
            k = k+1;
            
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
        PApplet.main(new String[] {hermannGittermitKopfschleife.class.getName() });
    }

}

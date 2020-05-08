
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
        size(500,500);
    }        
    int d = 50;
    int a = 38;
    int b = 6;
    int gruen = 0xff228B22;
    int farbe1 = gruen;
    int weiss = 255;
    int farbe2 = weiss;
    int k = 0;
    int i =0;

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
        while (i < width) {
            while (k < height ){
                if (farbe1 == weiss){
                    farbe1 = gruen;
                    farbe2 = weiss;
                } else {
                    farbe1 = weiss;
                    farbe2 = gruen;
                }
                fill (farbe1);
                rect(i*d,k*d,d,d);
                fill (farbe2);
                rect(i*d+b,k*d+b,a,a);
                k = k+d;
            }
            i = i+d;
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



//$PKGLINE
import processing.core.PApplet;

/**
 * Klasse ProcessingTmpl.
 * Beschreibung: Template einer Processing Klasse. Kopieren und "ProcessingTmpl" durch eigenen Namen erstezen.
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class wellen2b extends PApplet
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
    int d = 40;
    int a = 3/4*d;
    int gruen = 0xff228B22;
    int farbe1 = gruen;
    int weiss = 255;
    int farbe2 = weiss;
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
        for (int i=0; i<12; i++){
            for (int k=0; k<12; k++){
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
                rect(i*d+1/8*d,k*d+1/8*d,a,a);
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
        PApplet.main(new String[] {wellen2b.class.getName() });
    }

}



import processing.core.PApplet;

/**
 * Klasse ProcessingTmpl.
 * Beschreibung: Template einer Processing Klasse. Kopieren und "ProcessingTmpl" durch eigenen Namen erstezen.
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen1 extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    int s= 50; 
    int d= s/4;
    int a= 1/4;
    @Override
    public void settings()
    {
        size(430,230);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {background(0xFAA317);
        alleQuadrate();
        zeichneLinie();
    }
int farbwechsel (int farbe){
    if (farbe ==255){
        farbe = 0;
    } else { 
        farbe= 255;
    }
    return farbe; 
}
    
    
    
    public void zeichneQuadrat(int x, int y, int farbe, boolean links) {
        fill (farbe);
        rect (x,y,s,s); 
       fill(farbwechsel(farbe));

        ellipseMode(CORNERS); 
        noStroke(); 
        
        if (links) {
            ellipse(x,y,x+d,y+d);
            ellipse(x,y+3*d, x+d, y+s);
        } else { 
            ellipse (x+3*d,y+3*d,x+s,y+s);
        }
    }

    public void alleQuadrate(){
        noStroke();
        int aktuellefarbe = 255; 
        boolean pos_aktuell = true;
        for (int j=0; j<=3;j++){
            for (int i=0; i<=7; i++){
                zeichneQuadrat(d+i*s,d+j*s,aktuellefarbe, pos_aktuell);
                if (aktuellefarbe == 255){
                    aktuellefarbe = 0;
                } else { 
                    aktuellefarbe = 255;
                }
            }
            if (pos_aktuell == true) { 
                pos_aktuell = false;
            } else { 
                pos_aktuell = true;
            }
        }
    }
    public void zeichneLinie()
    {
        stroke(127,255,0);
        strokeWeight(a);
        for (int i=0; i<= 2; i++){
            line(d-a,d+s+s*i,d+a+8*s,d+s+s*i);
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
        PApplet.main(new String[] {Wellen1.class.getName() });
    }

}


import processing.core.PApplet;

/**
 * Klasse ProcessingTmpl.
 * Beschreibung: Template einer Processing Klasse. Kopieren und "ProcessingTmpl" durch eigenen Namen erstezen.
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class uebung1_vieleRauten extends PApplet
{ 
    int a = 0;
    int b = 0;
    int c = 17;
    int d = 15;
    int e = 20;
    int f = 35;
    int g = 34;
    int r = 0;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(680,700);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(125);
        rauten();
    }

    public void rauten(){
        while (b<height){
            if (r==0){
                a = 0;
                c = 17;
                g = 34;
                while (g<=width){
                    noStroke();
                    fill(0,0,255);
                    quad (a,b,c,d,c,f,a,e);//blaues Quadrat
                    fill(0,255,0);
                    quad (c,d,g,b,g,e,c,f);//grünes Quadrat
                    a = a+34;
                    c = c+34;
                    g = g+34;
                    r = 1;
                } 

            } else {
                c = 0;
                g = 17;
                a = 34;
                g = 17;
                while (g<=width){
                    noStroke();
                    fill (0,255,0);
                    quad (c,d,g,b,g,e,c,f); //grünes Quadrat
                    fill (0,0,255);
                    quad (g,b,a,d,a,f,g,e); //blaues Quadrat
                    a = a+34;
                    c = c+34;
                    g = g+34;
                    r = 0;
                }
            }
            b = b+35;
            e = e+35;
            d = d+35;
            f = f+35;
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
        PApplet.main(new String[] {uebung1_vieleRauten.class.getName() });
    }

}
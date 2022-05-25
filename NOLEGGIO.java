//IMPLEMENTAZIONE DELLA CLASSE NOLEGGIO
package veicolo;
public class Noleggio 
{
    protected String cliente; 
    protected Veicolo v;            //dichiarazione degli attributi di classe
    protected int g;    
    protected double kmpercorsi,litricarb;
    
//implementazione dei metodi set degli attributi di classe

    public void SetGiorni (int g) throws Eccezione
    {
        if (g<1 || g>30)
            throw new Eccezione ("Numero di giorni del noleggio scoretto");
        else
            this.g=g;
    }

    public void SetKmpercorsi (double k) throws Eccezione
    {
        if (g<1 || g>10000)
            throw new Eccezione ("Numero di giorni del noleggio scoretto");
        else
            this.kmpercorsi=k;
    }
    
    public void SetLitriCarb (double lc) throws Eccezione
    {
        if (lc<0 || lc>v.cap)
            throw new Eccezione ("Numero di litri di carburante presenti nel serbatoio scoretto");
        else
            this.litricarb=lc;
    }

//Costruttore di classe
    
    public Noleggio (String cl, Veicolo v, int g, double k, double l) throws Eccezione
    {
        this.cliente=cl;
        this.v=v;
        SetGiorni(g);
        SetKmpercorsi(k);
        SetLitriCarb(l);
    }

//Implementazione del metofo CalcolaCosto che permetta in base alle informazioni suddette di //calcolare il costo che il cliente dovrà pagare per ogni noleggio

    public double CalcolaCosto ()
    {
        double costo=0.00;
        if (v instanceof Automobile)
        {
            costo+=50*g;
            int r=(int) kmpercorsi/25;
            costo+=r;
            double diff=v.cap-this.litricarb;
            costo+=2*diff;
        }
        else
        {
            costo+=70*g;
            int r=(int) kmpercorsi/30;
            costo+=r;
            double diff=v.cap-this.litricarb;
            costo+=2*diff;
            
        }
        return costo;
   }

//implementazione del metodo toString che restituisca una stringa con tutte le informazioni sull'oggetto istanza di classe

     public String toString ()
    {
        return "\n\nCliente: "+this.cliente+", che ha noleggiato il veicolo "+v.toString()+"\nper "+this.g+" giorni percorrendo "+this.kmpercorsi+" km e restituendo "+litricarb+" litri di carburante nel serbatoio. Costo del noleggio: "+this.CalcolaCosto()+" €";
    }
}

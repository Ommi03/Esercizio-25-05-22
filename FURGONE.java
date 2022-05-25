//IMPLEMENTAZIONE CLASSE FURGONE
package veicolo;

//dichiaro la classe Furgone come estensione della classe Veicolo 

public class Furgone extends Veicolo
{
    protected int cmax;    //dichiarazione degli attributi di classe
    
//implementazione dei metodi set degli attributi 

    public void setCaricoMax (int cmax) throws Eccezione
    {
        if (cmax<0)
            throw new Eccezione ("Capacità di carico scorretta");
        else
            this.cmax=cmax;
    }
    
//Costruttore di classe

    public Furgone (String t, String mat, String mar, String mod, int cil, int a, int cap, int cmax) throws Eccezione
    {
        super(t,mat,mar,mod,cil,a,cap);
        setCaricoMax(cmax);
    }
    
//implementazione del metodo toString che restituisca una stringa con tutte le informazioni sull'oggetto istanza di classe

    public String toString ()
    {
        return super.toString()+"\nNumero di posti: "+this.cmax;
    }
}

//IMPLEMENTAZIONE CLASSE AUTOMOBILE
package veicolo;

//dichiaro la classe Automobile come estensione della classe Veicolo

public class Automobile extends Veicolo  {
    protected int posti; //dichiarazione degli attributi di classe
    
//implementazione dei metodi set degli attributi di classe

    public void setPosti (int p) throws Eccezione
    {
        if (p<2 || p>10)
            throw new Eccezione ("Numero di posti scorretto");
        else
            this.posti=p;
    }

//Costruttore di classe
    
    public Automobile (String t, String mat, String mar, String mod, int cil, int a, int cap, int p) throws Eccezione
    {
        super(t,mat,mar,mod,cil,a,cap);
        setPosti(p);
    }
    
//implementazione del metodo toString che restituisca una stringa con tutte le informazioni sull'oggetto istanza di classe

    public String toString ()
    {
        return super.toString()+"\nNumero di posti: "+this.posti;
    }
}


//IMPLEMENTAZIONE CLASSE VEICOLO
package veicolo;
abstract public class Veicolo 
{

    protected String targa,matricola,marca,modello; //dichiarazione degli attributi di classe
    protected int cil,anno,cap;
    
//implementazione dei metodi set degli attributi 

    public void setTarga (String t) throws Eccezione
    {
        if (t.length()!=7)
            throw new Eccezione ("Targa scorretta");
        else
            this.targa=t;
    }
    
    public void setMatricola (String mat) throws Eccezione
    {
        if (mat.length()!=4)
            throw new Eccezione ("Matricola scorretta");
        else
            this.matricola=mat;
    }
    
    public void setCilindrata (int c) throws Eccezione
    {
        if (c<0)
            throw new Eccezione ("Numero di cilindrata scorretto");
        else
            this.cil=c;
    }
    
    public void setAnno (int a) throws Eccezione
    {
        if (a<2005 || a>2020)
            throw new Eccezione ("Anno di acquisto scorretto");
        else
            this.anno=a;
    }

    public void setCap (int c) throws Eccezione
    {
        if (c<30 || c>80)
            throw new Eccezione ("Capacità del serbatoio scorretta");
        else
            this.cap=c;
    }

//Costruttore di Classe 
    
    public Veicolo (String t, String mat, String mar, String mod, int cil, int a, int cap) throws Eccezione
    {
        setTarga (t);
        setMatricola (mat);
        this.marca=mar;
        this.modello=mod;
        setCilindrata(cil);
        setAnno(a);
        setCap(cap);
    }
    
//implementazione del metodo toString che restituisca una stringa con tutte le informazioni sull'oggetto istanza di classe

    public String toString ()
    {
        String s="";
        s+="\nNumero di targa: "+this.targa;
        s+="\nNumero di matricola: "+this.matricola;
        s+="\nMarca del veicolo: "+this.marca;
        s+="\nModello del veicolo: "+this.modello;
        s+="\nNumero di cilindrata del veicolo: "+this.modello+" cm cubici";
        s+="\nAnno di acquisto del veicolo: "+this.anno;
        s+="\nCapacità del serbatoio del veicolo: "+this.cap+" litri";
        return s;
    }

}

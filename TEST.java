//IMPLEMENTAZIONE DELLA CLASSE TEST
package veicolo;
public class Test 
{
    public static void main (String[] mia)
    {
        try
        {
            Automobile a1=new Automobile ("AB123CD","A001","Fiat","Punto",250,2018,50,4);  //Creo un nuovo oggetto automobile e metto le sue caraterristiche
            Automobile a2=new Automobile ("AB123DE","A002","Fiat","Panda",250,2019,60,4);  //Creo un nuovo oggetto automobile e metto le sue caraterristiche
            Furgone f1=new Furgone ("CD345EF","F001","Iveco","Cargo",300,2019,60,1000);    //Creo un nuovo oggetto furgone e metto le sue caraterristiche
            Furgone f2=new Furgone ("CD345EG","F002","Iveco","Cargo",300,2019,60,1000);    //Creo un nuovo oggetto furgone e metto le sue caraterristiche
            Noleggio n1=new Noleggio ("Rossi Marco",a1,3,200,10); //Creo un nuovo oggetto Noleggio e metto le sue caraterristiche
            Noleggio n2=new Noleggio ("Neri Marco",f1,4,300,10); //Creo un nuovo oggetto Noleggio e metto le sue caraterristiche
            System.out.println(a1);        //stampa dei vari oggetti
            System.out.println(a2);
            System.out.println(f1);
            System.out.println(f2);
            System.out.println(n1);
            System.out.println(n2);
        }

        catch (Eccezione e)
        {
            System.out.println (e.messaggio);
        }
    }
}

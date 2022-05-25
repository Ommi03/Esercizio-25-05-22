#  Persone

Le persone coinvolte in questo progetto sono: 
- Omar Adil (https://github.com/Ommi03)
- Gioele Caiti (https://github.com/GioeleCaiti)
- Riccardo Ventrici (https://github.com/v3ntri)

# Descrizione 

Una grande catena di autonoleggio desidera gestire con un sistema informatico i propri veicoli (automobili e furgoni) e per ogni veicolo dovranno essere memorizzate le seguenti informazioni:

• targa (controllare che sia composta da 7 caratteri alfanumerici, altrimenti far scattare un'eccezione);
• numero di matricola (controllare che sia composta da 4 caratteri alfanumerici, altrimenti far scattare un'eccezione);
• marca;
• modello;
• cilindrata (controllare che sia un numero non negativo, altrimenti far scattare un'eccezione);
• anno di acquisto (controllare che sia compreso tra il 2005 ed il 2020, altrimenti far scattare un'eccezione);
• capacità del serbatoio in litri (controllare che sia compresa tra 30 ed 80 litri, altrimenti far scattare un'eccezione).

Per le automobili è inoltre necessario memorizzare il numero di posti (controllare che sia compreso tra 2 e 10, altrimenti far scattare un'eccezione), mentre per i furgoni deve essere memorizzata la capacità di carico (controllare che sia un numero positivo, altrimenti far scattere un'eccezione).
Ogni classe dovrà possedere, oltre ai metodi setter/getter ritenuti opportuni, il costruttore di classe ed un metodo toString che restituisca una stringa con tutte le informazioni sull'oggetto istanza di classe. Sapendo inoltre che i veicoli vengono forniti con il pieno di carburante e che il costo del noleggio è così calcolato:

• automobili: 50 € al giorno, più 1 € ogni 25 km percorsi, più 2 € per ogni litro di carburante che manca dal pieno al momento della
restituzione;

• furgoni: 70 € al giorno, più 1 € ogni 30 km percorsi dopo i primi 100 km, più 2 € per ogni litro di carburante che manca al pieno al momento della restituzione.

Implementare anche una classe Noleggio che contenga come attributi:

• nominativo del cliente noleggiante;
• il veicolo noleggiato;
• numero di giorni di durata del noleggio (controllare che sia un numero compreso tra 1 e 30, altrimenti far scattare un'eccezione);
• km percorsi dal veicolo durante il periodo di noleggio (controllare che sia un numero compreso tra 1 e 10000, altrimenti far scattare un'eccezione);
• litri di carburante presenti nel serbatoio alla restituzione (controllare che sia compreso tra 0 e la capacità massima del serbatoio del veicolo, altrimenti far scattare un'eccezione);

e che contenga come metodi, oltre ai metodi setter/getter ritenuti opportuni, il costruttore di classe ed un metodo toString che restituisca una stringa con tutte le informazioni sull'oggetto istanza di classe un metodo CalcolaCosto che permetta in base alle informazioni suddette di calcolare il costo che il cliente dovrà pagare per ogni noleggio.

# Struttura del Progetto

Il progetto è diviso in 5 file contenuti tutti nello stesso package (veicolo) che sono : 
- VEICOLO.java : Contenente la classe Veicolo e i suoi seguenti metodi;
- AUTOMOBILE.java : Contenente la classe Automobile e i suoi seguenti metodi;
- FURGONE.java : Contenente la classe Furgone e i suoi seguenti metodi;
- NOLEGGIO.java : Contenente la classe Noleggio e i suoi seguenti metodi;
- TEST.java: Contenente la classe Test, ovvero la classe che contiene al suo interno il main;

# Esecuzione e Prova del Progetto 

Per eseguire il progetto è necessario avviare il file TEST.java, in quanto in esso è contenuto il main. 


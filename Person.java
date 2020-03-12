
/**
 * Die Klasse Person enthält alle persönlichen Daten sowie die Untersuchungsart weswegen die Person in die Praxis kommt. Die Person wird von ihrem Arzt 
 * zu einer speziellen Arztpraxis geschickt, um die Diagnose durch eine Untersuchung zu bestätigen. Diese Person gibt seine persönlichen Daten,
 * die Diagnse sowie die Untersuchungsart (MRT,CT,Röntgen oder Ultraschall) an. Durch die jeweilige Untersuchung kann sich die Person dann ihren 
 * Wunschtermin aussuchen.
 * @author () 
 * @version (11.03.2020)
 */
public class Person
{
    private int Patientennummer;
    private String Name; 
    private String Adresse; 
    private String Geburtsdatum; 
    private String EMail; 
    private String Telefonnummer;
    private String Diagnose; 
    private boolean Untersuchung; 
    private Termin Termin1; 

    /**
     * Standradkonstruktor für Objekte der Klasse Person
     */
    public Person()
    {
        Patientennummer = 100;
        Name = "Mustermann Max";
        Adresse = "Musterstraße 12 Schwenningen";
        Geburtsdatum = "12.03.1999";
        EMail = "maxMustermann@gmail.de";
        Telefonnummer = "0158479638";
        Diagnose = "Schmerzen im rechten Knie";
        Untersuchung = "MRT";
        Termin1 = 12;
    }
    
    /**
     *  Spezieller Konstruktor für Objekte der Klasse Person
     *  Bei dem der Anwender beliebige personelle Daten eingeben kann.
     */
    public Person (int Patientennummer, String Name, String Adresse, String Geburtsdatum, String EMail,String Telefonnummer, String Diagnose,
    boolean Untersuchung, Termin Termin1)
    {
        this.Patientennummer = Patientennummer;
        this.Name = Name;
        this.Adresse = Adresse; 
        this.Geburtsdatum = Geburtsdatum;
        this.EMail = EMail; 
        this.Telefonnummer = Telefonnummer; 
        this.Diagnose = Diagnose; 
        this.Untersuchung = Untersuchung; 
        this.Termin1 = Termin1; 
    }

    /**
     * Methode zum Setzen der Patientennummer
     * 
     * @param PNummer (Patientennummer)
     * @return keine Rueckgabe       
     */
    public void setPatientennummer(int PNummer)
    {
        Patientennummer = PNummer; 
    }
    
    /** 
     * Methode zum Setzen des Namens der Person
     * 
     * @param Name
     * @return keine Rueckgabe
     */
    public void setName (String Name)
    {
        this.Name = Name; 
    }
    
    /**
     * Methode zum Setzen der Adresse der Person
     * 
     * @param Adresse
     * @return keine Rueckgabe
     */
    public void setAdresse (String Adresse)
    {
        this.Adresse = Adresse; 
    }
    
    /**
     * Methode zum Setzen des Geburtsdatums der Person
     * 
     * @param Geburtsdatum
     * @return keine Rueckgabe
     */
    public void setGeburtsdatum (String Geburtsdatum)
    {
        this.Geburtsdatum = Geburtsdatum;
    }
    
    /**
     * Methode zumm Setzen der EMail der Person
     * 
     * @param EMailAdresse
     * @return keine Rueckgabe
     */
    public void setEMailAdresse (String EMailAdresse)
    {
        EMail = EMailAdresse; 
    }
    
   /**
    * Methode zum Setzen der Telefonnummer der Person
    * 
    * @param TelNummer
    * @return keine Rueckgabe 
    */
   public void setTelefonnummer (String TelNummer)
   {
       Telefonnummer = TelNummer; 
   }
   
   /**
    * Methode zum Setzen der Diagnose der Person
    * 
    * @param Diagnose
    * @return keine Rueckgabe
    */
   public void setDiagnose (String Diagnose)
   {
       this.Diagnose = Diagnose; 
   }
   
   /** 
    * Methode zum Setzen der Untersuchungsart der Person
    * 
    * @param Untersuchung
    * @return keine Rueckgabe
    */
   public void setUntersuchungsart (boolean Untersuchung)
   {
       this.Untersuchung = Untersuchung; 
   }
   
   /**
    * Methode zum Setzen des Termins
    * 
    * @param Termin2
    * @return keine Rueckgabe
    */
   public void setTermin (Termin Termin2)
   {
       Termin1 = Termin2; 
   }
   
   /**
    * Methode zur Rueckgabe der Patientennummer der Person
    * 
    * @param keine Eingabe
    * @return Patientennummer
    */
   public int getPatientennummer ()
   {
       return Patientennummer; 
   }
   
   /**
    * Methode zur Rueckgabe des Namen der Person
    * 
    * @param keine Eingabe
    * @return Namen
    */
   public String getNamen ()
   {
       return Name; 
   }
   
   /**
    * Methode zur Rueckgabe der Adresse der Person
    * 
    * @param keine Eingabe
    * @return Adresse
    */
   public String getAdresse ()
   {
       return Adresse; 
   }
   
   /**
    * Methode zur Rueckgabe des Geburtsdatums der Person 
    * 
    * @param keine Eingabe
    * @return Geburtsdatum
    */
   public String getGeburtsdatum ()
   {
       return Geburtsdatum; 
   }
   
   /**
    * Methode zur Rueckgabe der EMailAdresse der Person
    * 
    * @param keine Eingabe
    * @return EMailAdresse
    */
   public String getEMail ()
   {
       return EMail; 
   }
   
   /**
    * Methode zur Rueckgabe der Telefonnummer der Person
    * 
    * @param keine Eingabe
    * @return Telefonnummer
    */
   public String getTelefonnummer ()
   {
       return Telefonnummer; 
   }
   
   /**
    * Methode zur Rueckgabe der Diagnose der Person
    * 
    * @param keine Rueckgabe
    * @return Diagnose
    */
   public String getDiagnose ()
   {
       return Diagnose; 
   }
   
   /**
    * Methode zur Rueckgabe der Untersuchungsart der Person
    * 
    * @param keine Eingabe
    * @return Untersuchungsart
    */
   public boolean getUntersuchung ()
   {
       return Untersuchung; 
   }
   
   /**
    * Methode zur Rueckgabe des Termins
    * 
    * @param keine Eingabe
    * @return Termin1
    */
   public Termin getTermin ()
   {
       return Termin1;
   }
   
   /**
    * Methode zur Ausgabe der Personendaten und des Termins 
    * 
    * @param keine Eingabe
    * @return Personendaten und Termin der Person
    */
   public String Ausgabe ()
   {
       return Name; 
       return Adresse;
       return Geburtsdatum;
       return EMail;
       return Telefonnummer; 
       return Diagnose; 
       
   }
}

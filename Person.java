
/**
 * Beschreiben Sie hier die Klasse Person.
 * 
 * @author (Dick und Doof) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Person
{
    private int Patientennummer;
    private String Name;
    private String Adresse;
    private String Geburtsdatum;
    private String Email;
    private String Telefonnummer;
    private String Diagnose;
    private boolean Untersuchung;
    /**
     * Konstruktor 1
     */
    public Person(String Name,String Adresse,String Geburtsdatum,String Email,String Telefonnummer,String Diagnose)
    {
        int z = 100;
        this.Patientennummer = z;
        this.Name = Name;
        this.Adresse = Adresse;
        this.Geburtsdatum = Geburtsdatum;
        this.Email = Email;
        this.Telefonnummer = Telefonnummer;
        this.Untersuchung = Untersuchung;
        this.Diagnose = Diagnose;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void setName(String neuerName) 
    {
        Name = neuerName;
    }
    
    public void setAdresse(String neueAdresse)
    {
        Adresse = neueAdresse;
    }
    
    public void setGeburtsdatum(String neuerGeburtsdatum)
    {
        Geburtsdatum = neuerGeburtsdatum;
    }
    
    public void setEmail(String neueEmail)
    {
        Email = neueEmail;
    }
    
    public void setTelefonnummer(String neueTelefonnummer)
    {
        Telefonnummer = neueTelefonnummer;   
    }
    
    public void setUntersuchung(boolean neueUntersuchung)
    {
        Untersuchung = neueUntersuchung;
    }
    
    public void setDiagnose(String neueDiagnose)
    {
        Diagnose = neueDiagnose;
    }
    
    public String getName()
    {
        return Name;
    }
    
    public String getAdresse()
    {
        return Adresse;
    }
    
    public String getGeburtsdatum()
    {
        return Geburtsdatum;
    }
    
    public String getEmail()
    {
        return Email;
    }
    
    public String getTelefonnummer()
    { 
       return Telefonnummer;
    }
    
    public boolean getUntersuchung()
    {
        return Untersuchung;
    }
    
    public String getDiagnose()
    {
        return Diagnose;
    }
    
    public void Ausgabe()
    {
        System.out.println(getName());
        System.out.println(getAdresse());
        System.out.println(getGeburtsdatum());
        System.out.println(getEmail());
        System.out.println(getTelefonnummer());
        System.out.println(getUntersuchung());
        System.out.println(getDiagnose());
    }
}

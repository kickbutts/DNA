
/**
 * Beschreiben Sie hier die Klasse DNA.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class DNA
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String DNAcodogenerStrang;
    private String RNA;
    private String DNAnichtcodogenerStrang;
    private String amminosaeuersequenz="";
    private DNAValidation validation;
    private KomplementaererStrang komp;
    private DNAToRNA transkript;
    private TranslateRNATripletToAmminoacid translation;

    /**
     * Konstruktor für Objekte der Klasse DNA
     */
    public DNA(String pDNA, boolean codogen)
    {
        validation = new DNAValidation();
        komp = new KomplementaererStrang();
        transkript = new DNAToRNA();
        translation = new TranslateRNATripletToAmminoacid();
        if (validation.validiereDNA(pDNA))
        {
            if (codogen==true)
            {
                DNAcodogenerStrang=pDNA;
                DNAnichtcodogenerStrang=komp.erstelleKomplementaerenStrand(DNAcodogenerStrang);
            }
            if (codogen==false)
            {
                DNAnichtcodogenerStrang=pDNA;
                DNAcodogenerStrang=komp.erstelleKomplementaerenStrand(DNAnichtcodogenerStrang);
            }
            RNA=transkript.transcriptDNAToRNA(DNAcodogenerStrang, true);
            inTrippletsSchneidenUndASSequeznZusammensetzen();
        }
        else
        {
            System.out.println("Keine valide DNA Sequenz eingegeben");
        }
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void inTrippletsSchneidenUndASSequeznZusammensetzen()
    {
        String copyOfRNA=RNA;
        for (int i = 0, n = RNA.length()/3; i<n; i++)
        {
            String triplet=copyOfRNA.substring(0,3);
            copyOfRNA=copyOfRNA.substring(3);
            amminosaeuersequenz=amminosaeuersequenz+translation.RNAToAmminoacid(triplet)+" ";
        }
    }
}

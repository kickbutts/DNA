
/**
 * Nimmt einen DNA-Strang als String entgegen und liefert den komplementären Strang zurück.
 * 
 * @author Thomas Konnemann
 * @version 12.3.2015
 */
public class KomplementaererStrang
{
    private String komplementaererStrang ="";
    private String basisStrang;

    /**
     * Konstruktor für Objekte der Klasse KomplementaererStrang
     */
    public KomplementaererStrang()
    {
       
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public String erstelleKomplementaerenStrand(String pStrang)
    {
        char[] arrayDNA = pStrang.toCharArray();
        for (int i = 0, n = arrayDNA.length; i < n; i++)
        {
            switch(arrayDNA[i])
                {
                    case 'A' : komplementaererStrang=komplementaererStrang+"T";
                        break;
                    case 'G' : komplementaererStrang=komplementaererStrang+"C";
                        break;
                    case 'T' : komplementaererStrang=komplementaererStrang+"A";
                        break;
                    case 'C' : komplementaererStrang=komplementaererStrang+"G";
                        break;
                    
                }
        }
        return komplementaererStrang;
    }
}

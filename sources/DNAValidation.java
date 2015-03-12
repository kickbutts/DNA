
/**
 * Beschreiben Sie hier die Klasse DNAValidation.
 * Überprüft einen String mit DNA Daten und gibt zurück ob es sich ume eine valide DNA handelt.
 * 
 * @author Thomas Konnemann 
 * @version 12.03.2015
 */
public class DNAValidation
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse DNAValidation
     */
    public DNAValidation()
    {

    }

    /**
     * Die Methode validiert DNA. Sie überprüft einen String und liefert true zurück, 
     * wenn es sich um eine valide DNA handelt.
     * 
     * @param  pDNA   ein String der eine DNA beinhaltet
     * @return        true, wenn es sich um eine valide DNA handelt, sonst false
     */
    public boolean validiereDNA(String pDNA)
    {
        String rawDNA = pDNA;
        rawDNA = rawDNA.toUpperCase();
        char[] arrayDNA = rawDNA.toCharArray();
        for (int i = 0, n = arrayDNA.length; i < n; i++)
        {
            if(arrayDNA[i] != 'A')
            {
                if(arrayDNA[i] != 'T')
                {
                    if(arrayDNA[i] != 'G')
                    {
                        if(arrayDNA[i] != 'C')
                        {
                            return false;
                        }
                    }
                }
            }

            
        }
        return true;
    }
}

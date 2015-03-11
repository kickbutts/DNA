
/**
 * Beschreiben Sie hier die Klasse DNAToRNA.
 * 
 * @author Thomas Konnemann
 * @version 11.3.2015
 */
public class DNAToRNA
{

    /**
     * Konstruktor für Objekte der Klasse DNAToRNA
     */
    public DNAToRNA()
    {

    }

    /**
     * 
     * @param  pDNA erwartet eine DNA-Strang
     * @param  codogen ist true, wenn es sich um einen codogenen Strang handelt, sonst false
     * @return gibt die dazugehörige RNA als String zurück
     */
    public String transcriptDNAToRNA(String pDNA, boolean codogen)
    {
        String rawDNA = pDNA;
        String rna;
        if (codogen==true)
        {
            rawDNA = rawDNA.toUpperCase();
            char[] arrayDNA = rawDNA.toCharArray();
            for (int i = 0, n = arrayDNA.length; i < n; i++)
            {
                switch(arrayDNA[i])
                {
                    case 'A' : arrayDNA[i]='U';
                        break;
                    case 'G' : arrayDNA[i]='C';
                        break;
                    case 'T' : arrayDNA[i]='A';
                        break;
                    case 'C' : arrayDNA[i]='G';
                        break;
                    
                }
            }
            //rawDNA = rawDNA.replace('A', 'U');
            //rawDNA = rawDNA.replace('G', 'C');
            //rawDNA = rawDNA.replace('T', 'A');
            //rawDNA = rawDNA.replace('C', 'G');
            rna = String.valueOf(arrayDNA);
            return rna;
        }

        if (codogen==false)
        {
            rawDNA = rawDNA.toUpperCase();
            rna = rawDNA.replace('T', 'U');
            return rna;
        }
        return "Keine korrekte DNA gefunden";
    }
}


/**
 * Beschreiben Sie hier die Klasse TranslateRNATripletToAmminoaccid.
 * Die Klasse translatiert RNA Tripplets in die Passende Amminosäuren.
 * 
 * @author Thomas Konnemann 
 * @version 11.03.2015
 */
public class TranslateRNATripletToAmminoacid
{

    /**
     * Konstruktor für Objekte der Klasse TranslateRNATripletToAmminoaccid
     */
    public TranslateRNATripletToAmminoacid()
    {

    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  pRNA   Methode erwartet ein Tripplet an RNA
     * @return        gibt die zugehörige Amminosäure zurück
     */
    public String RNAToAmminoacid(String pRNA)
    {
        char[] RNAArray=pRNA.toCharArray();
        char ersteBase = RNAArray[0];
        char zweiteBase = RNAArray[1];
        char dritteBase = RNAArray[2];

        //System.out.println(ersteBase);
        //System.out.println(zweiteBase);
        //System.out.println(dritteBase);

        if (ersteBase == 'A')
        {
            if (zweiteBase == 'U')
            {
                if (dritteBase == 'G')
                {
                    return "Met";
                }

                if (dritteBase == 'G'|| dritteBase == 'A'|| dritteBase == 'C'|| dritteBase == 'U')
                {
                    return "Ile";
                }
            }
            if (zweiteBase == 'C')
            {
                return "Thr";
            }
            if (zweiteBase == 'A')
            {
                if (dritteBase == 'C'||dritteBase == 'U')
                {
                    return "Asn";
                }

                if (dritteBase == 'G'|| dritteBase == 'A')
                {
                    return "Lys";
                }
            }
            if (zweiteBase == 'G')
            {
                if (dritteBase == 'C'||dritteBase == 'U')
                {
                    return "Ser";
                }

                if (dritteBase == 'G'|| dritteBase == 'A')
                {
                    return "Arg";
                }
            }
        }
        if (ersteBase == 'G')
        {
            if (zweiteBase == 'U')
            {
                return "Val";
            }
            if (zweiteBase == 'C')
            {
                return "Ala";
            }
            if (zweiteBase == 'A')
            {
                if (dritteBase == 'C'||dritteBase == 'U')
                {
                    return "Asp";
                }

                if (dritteBase == 'G'|| dritteBase == 'A')
                {
                    return "Glu";
                }
            }
            if (zweiteBase == 'G')
            {
                return "Gly";
            }
        }
        if (ersteBase == 'U')
        {
            if (zweiteBase == 'U')
            {
                if (dritteBase == 'C'||dritteBase == 'U')
                {
                    return "Phe";
                }

                if (dritteBase == 'G'|| dritteBase == 'A')
                {
                    return "Leu";
                }
            }
            if (zweiteBase == 'C')
            {
                return "Ser";
            }
            if (zweiteBase == 'A')
            {
                if (dritteBase == 'C'||dritteBase == 'U')
                {
                    return "Tyr";
                }

                if (dritteBase == 'G'|| dritteBase == 'A')
                {
                    return "Stop";
                }
            }
            if (zweiteBase == 'G')
            {
               if (dritteBase == 'C'||dritteBase == 'U')
                {
                    return "Cys";
                }

                if (dritteBase == 'A')
                {
                    return "Stop";
                }
                if (dritteBase == 'G')
                {
                    return "Trp";
                }
            }
        }
        if (ersteBase == 'C')
        {
            if (zweiteBase == 'U')
            {
                return "Leu";
            }
            if (zweiteBase == 'C')
            {
                return "Pro";
            }
            if (zweiteBase == 'A')
            {
                if (dritteBase == 'C'||dritteBase == 'U')
                {
                    return "His";
                }

                if (dritteBase == 'G'|| dritteBase == 'A')
                {
                    return "Gln";
                }
            }
            if (zweiteBase == 'G')
            {
               return "Arg";
            }
        }
        return "ERROR: Keine passende Amminosäure gefunden";

    }
}



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse DNATest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class DNATest
{
    /**
     * Konstruktor fuer die Test-Klasse DNATest
     */
    public DNATest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testInitalDNA()
    {
        DNA dNA1 = new DNA("ATGCGGCTA", true);
        assertEquals("ATGCGGCTA", dNA1.getDNA());
    }

    @Test
    public void testRNA()
    {
        DNA dNA1 = new DNA("ATGCGGCTA", true);
        assertEquals("UACGCCGAU", dNA1.getRNA());
    }
}



package uk.ac.tees.strategy.username;

import Strategy.V8161959.JapaneseInvoice;
import Strategy.V8161959.Customer;
import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;

/** A unit test to check the Japanese invoicing algorithm. Spaces are irrelevant.
 *
 * Based on work created by Mark Truran </p>
 */
public class JapaneseInvoiceTest {
    
   /**
     * Test of getInvoice method, of class JapaneseInvoice.
     */
    @Test
    public void testGetInvoice() {
        System.out.println("Producing Japanese invoice");
        final int invoiceAmount = 7200;
        final Customer c = new Customer("Honda", invoiceAmount);
        c.setInvoicingAlgorithm(new JapaneseInvoice());
        String actualOutput = c.getInvoice();
        final File f = new File("actual-japanese.txt");
        FileUtility.resetFile(f);
        FileUtility.writeFile(f, actualOutput);
        String expectedOutput = FileUtility.readFile(new File("expected-japanese.txt"));
        System.out.println(actualOutput);
        System.out.println(expectedOutput);
        actualOutput = actualOutput.replaceAll("\\s", "");
        expectedOutput = expectedOutput.replaceAll("\\s", "");
        //System.out.println(actualOutput);
        //System.out.println(expectedOutput);
        assertEquals(actualOutput, expectedOutput);
    }

    
}

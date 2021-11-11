/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy.V8161959;

import java.text.DecimalFormat;

/**
 *
 * @author v8161959
 */
public class AmericanInvoice implements InvoicingAlgorithm{

    
    @Override
    public String getInvoice(String CustomerName, double amount) {
        DecimalFormat d = new DecimalFormat("'$'0.00");
        double total = 0;
        total = amount * 1.57;
        String output = ("--------------------------------------\n"
                + "TO:	" + CustomerName
                + "\nFROM:	Easyflap (UK)\n"
                + "\nAMOUNT:	" + d.format(total)
                + "\n--------------------------------------");          
        return output;
    }
    
}

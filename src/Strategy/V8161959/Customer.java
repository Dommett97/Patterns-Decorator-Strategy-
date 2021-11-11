package Strategy.V8161959;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author v8161959
 */
public class Customer{
    
    protected String name;
    protected double amount;
    protected InvoicingAlgorithm i;

    public Customer(String name, double amount) {
        this.name = name;
        this.amount = amount;
    } 
    
    public void setInvoicingAlgorithm(InvoicingAlgorithm invoice){
        this.i = invoice;
    }
    
    public String getInvoice() {
        return i.getInvoice(name, amount);  
    }
    

    
}

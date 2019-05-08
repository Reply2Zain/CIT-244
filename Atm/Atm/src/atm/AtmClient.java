/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Zain
 */
public class AtmClient {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ATM atm = new ATM();
            atm.setAccountMade("yes");
            atm.setBalance(50);
            atm.setScannerWorking("no");
            atm.setMode(Mode.DEPOSIT);
        
            
            
        
        try{
            
            System.out.println(atm.startATM());
            
           
            
            
            
        } catch (AtmException me){
            System.out.println(me.getMessage());
            System.out.println("Severity: " + me.severity.name());
        }    }
    
}

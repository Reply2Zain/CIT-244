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
public enum Mode {
    WELCOME ("Welcome to the ATM Machine."),
    OPTIONS("Would you like to make a "
            + "Deposit, Transfer, Withdrawal, or check Balance"),
    DEPOSIT ("You are depositing money"),
    WITHDRAWAL ("You are withdrawing money"),
    TRANSFER ("Initiating a transfer..."),
    BALANCE ("Your balance is ");
    
    private String machineView;
    
    Mode(String s){
        machineView = s;
    }
    
    public String getMachineView(){
        return machineView;
    }
}

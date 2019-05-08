/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author Zain
 */
public class ATM {
    private Mode atmScreen;
    private int balance;
    private String accountMade = "no";
    private String scannerWorking = "yes";
    private String atmScreenWorking = "yes";
    private String transferRecipient;
    private int transferBalance = 0;
    
    
   Scanner sc = new Scanner (System.in);
    
    public ATM(){
        atmScreen = Mode.WELCOME;
    }
    
    public Mode getMode(){
        return atmScreen;
    }
    
    public void setMode(Mode m){
        
        if(m == null){
            atmScreen = Mode.WELCOME;
            
        } else {
            
            atmScreen = m;
        }
    System.out.print("Screen: ");
        System.out.println(m.toString());
        
    }    
    
    public void setBalance(int d){
        balance = d;
    }
    
    public int getBalance(){
        return balance;
    }
    /**
     * Takes in a String of either 'yes' or 'no' to represent the creation
     * or existence of an account with a bank. Default value is 'no'. 
     * @param s
     */
    public void setAccountMade(String s){
        accountMade = s;
    }
    
    public String getAccountMade(){
        return accountMade;
    }
    /**
     * Takes in a String of either 'yes' or 'no' to represent whether the 
     * money scanner is working or not. Default value is 'yes'.
     * @param s 
     */
    public void setScannerWorking(String s){
        scannerWorking = s;
    }
    /**
     * Takes in a String of either 'yes' or 'no' to represent whether the 
     * money scanner is working or not. Default value is 'yes'.
     * @param s 
     */
    public void setAtmScreenStatus(String s){
        atmScreenWorking = s;
    }
    public String getAtmScreenStatus(){
        return atmScreenWorking;
    }
    
    public String getInputString(){
        String input = sc.next();
        return input;
    }
    
    public int getInputInt(){
        int input = sc.nextInt();
        return input;
    }
    
    public String setTransferRecipientScan(){
        System.out.println("Who would you like to transfer to: ");
        String name = sc.next();
        return name;
    }
     public String getTransferRecipient(){
         return transferRecipient;
     }
    
    public int setTransferAmount(int t){
        transferBalance = t;
        return transferBalance;
    }
    
    public int getTransferAmount(){
        return transferBalance;
    }
    
    public String getScannerWorking(){
        if (scannerWorking.equalsIgnoreCase("yes"))
        System.out.println("Scanner Status: functional");
        else
            System.out.println("Scanner Status: Not functional");
        return scannerWorking;
    }
    
        public int startATM() throws AtmException{
            
            
            if(balance <= 0){
                throw new AtmException("No Balance!", ExceptionSeverity.LOW);
            }


            if(accountMade.equalsIgnoreCase("yes")){
            
                switch(atmScreen){
                    case WELCOME:
                            System.out.println(Mode.WELCOME.getMachineView());

                            System.out.print("Balance: ");
                        return balance;
                    case DEPOSIT:
                        if(scannerWorking.equalsIgnoreCase("yes")){
                        System.out.println(Mode.DEPOSIT.getMachineView());
                        }
                        else{
                            throw new AtmException("Msg: The money scanner is not working. Please try again later.", ExceptionSeverity.MODERATE);
                        }
                        System.out.println("Balance:");
                        return balance;
                    
                    case WITHDRAWAL:
                        if(balance <= 0){
                            System.out.println("Balance: " + balance);
                        throw new AtmException("You can't withdraw!", ExceptionSeverity.LOW);
                        }
                        else{
                            System.out.println(Mode.WITHDRAWAL.getMachineView());
                        }

                        return 2;
                    case TRANSFER:
                        if(transferRecipient == null){
                            throw new AtmException("No transfer recipient!", ExceptionSeverity.LOW);
                        }
                        if(balance <= 0){
                            throw new AtmException("You have no money to give!'", ExceptionSeverity.LOW);
                        }
                        else{
                        System.out.println(Mode.TRANSFER.getMachineView());
                        }
                        return 3;
                    case BALANCE:

                        return balance;

                    default:
                        System.out.println("Default case");
                        return 100;
                
                }
            }
                else{
                throw new AtmException("Please make an account.", ExceptionSeverity.USER_BASED);
            }
                
        } // close switch
            } // close start ATM
            
        

        


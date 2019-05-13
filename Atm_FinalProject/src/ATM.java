/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    private int transferAmount = 0;
    private int depositAmount = 0;
    
    
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
    
    public String setInputString(){
        String input = sc.next();
        return input;
    }
    
    public int setInputInt(){
        int input = sc.nextInt();
        return input;
    }
    
    public String setTransferRecipientScan(){
        System.out.println("Who would you like to transfer to: ");
        String name = sc.next();
        this.transferRecipient = name;
        return transferRecipient;
    }
     public String setTransferRecipient(String t){
         this.transferRecipient = t;
         return t;
     }
     public String getTransferRecipient(){
         return transferRecipient;
     }
    
    public int setTransferAmount(int t){
        transferAmount = t;
        return transferAmount;
    }
    
    public int setTransferAmountScan(){
        System.out.println("Current Balance: " + balance);
        System.out.println("How much would you like to transfer: ");
        transferAmount = sc.nextInt();
        return transferAmount;
    }
    
    public int getTransferAmount(){
        return transferAmount;
    }
    
    public int setDepositAmount(int d){
        depositAmount = d;
        return depositAmount;
    }
    
    public int getDepositAmount(){
        return depositAmount;
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
                throw new AtmException("Exception: No Balance!", ExceptionSeverity.LOW);
            }


            if(accountMade.equalsIgnoreCase("yes")){
            
                switch(atmScreen){
                    case WELCOME:
                            System.out.println(Mode.WELCOME.getMachineView());

                            System.out.print("Current Balance: ");
                        return balance;
                    
                    case DEPOSIT:
                        if(scannerWorking.equalsIgnoreCase("yes")){
                        System.out.println(Mode.DEPOSIT.getMachineView());
                        System.out.println("Deposited: " + depositAmount);
                        }
                        else{
                            throw new AtmException("Exception: The money scanner is not working. Please try again later.", ExceptionSeverity.MODERATE);
                        }
                        System.out.println("Current Balance:");
                        return balance;
                    
                    
                    case WITHDRAWAL:
                        if(balance <= 0){
                        throw new AtmException("Exception: You can't withdraw!", ExceptionSeverity.LOW);
                        }
                        else{
                            System.out.println(Mode.WITHDRAWAL.getMachineView());
                        }
                        System.out.print("Current Balance:");
                        return balance;
                    
                    case TRANSFER:
                        if(transferRecipient == null){
                            throw new AtmException("Exception: No transfer recipient stated.", ExceptionSeverity.LOW);
                        }
                        if(balance <= 0){
                            throw new AtmException("Exception: You have no money to give!'", ExceptionSeverity.LOW);
                        }
                        if (transferAmount <= 0){
                            setTransferAmountScan();
                            while (transferAmount > balance){
                                System.out.println("You do not have enough in your bank");
                                setTransferAmountScan();
                            }
                            System.out.println("You are transferring $" + transferAmount);
                            System.out.println(Mode.TRANSFER.getMachineView());
                            balance = balance - transferAmount;
                        }
                        else{
                            System.out.println("You are transferring $" + transferAmount);
                            System.out.println(Mode.TRANSFER.getMachineView());
                            balance = balance - transferAmount;
                        }
                        System.out.print("Current Balance:");
                        return balance;
                    case BALANCE:
                        if (balance >=0){
                            balance = balance + depositAmount;
                            return balance;
                        }
                        else{
                            throw new AtmException("Exception: Balance should never be negative. Please see an associate.'", ExceptionSeverity.SOFTWARE);
                        }

                    default:
                        System.out.print("Balance:");
                        return balance;
                
                }
            }
                else{
                throw new AtmException("Exception: Please make an account.", ExceptionSeverity.USER_BASED);
            }
                
        } // close switch
            } // close start ATM
            
        

        


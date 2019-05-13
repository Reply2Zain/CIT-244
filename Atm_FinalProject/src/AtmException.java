/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Zain
 */
public class AtmException extends Exception{
    ExceptionSeverity severity;    
    public AtmException(String msg, ExceptionSeverity sev){
        super(msg);
        severity = sev;
    }
}


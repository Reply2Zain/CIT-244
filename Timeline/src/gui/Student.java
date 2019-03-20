/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


/**
 *
 * @author zain.aaban
 */
public class Student {
 public int id; 
 public String name;
 public String course;
 String fileName;
 
   @Override
   public String toString(){
       StringBuilder sb = new StringBuilder();
       sb.append(id);
       sb.append("; Name:");
       sb.append(name);
       sb.append ("; Course: ");
       sb.append (course);
       return sb.toString();
               
   }
}

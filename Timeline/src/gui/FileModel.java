/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edarsow
 */
public class FileModel {

    String fileName = "input.txt";

    public void writeFile(String fileName) {
        PrintWriter fileWriter = null;
        StringBuilder sb = new StringBuilder();
        sb.append("src/files/");
        sb.append(fileName);

        try {
            java.io.File nameFile = new java.io.File(sb.toString());
            System.out.println("Writing to: " + nameFile.getAbsolutePath());
            // connect our writer object with the file to write to
            fileWriter = new PrintWriter(nameFile);
            fileWriter.print("16, Mr. R, FLStudio");
            fileWriter.print("9, Mr. E, BurgerKing");

            fileWriter.flush();
            fileWriter.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }

    public List<Student> readFile(String studentFileName) {
        List<Student> studList = new LinkedList<>();
        String fname = "src/files/" + studentFileName;
        Scanner fileScanner = null;

        try {
            File file = new File(fname);
            fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException | NullPointerException e) {
            System.out.println("Error: File not found");

        }
        if(fileScanner != null){
            while (fileScanner.hasNext()) {
                Student stud = new Student();
                StringTokenizer tokenizer
                        = new StringTokenizer(",", fileScanner.next());
                stud.id = Integer.parseInt(tokenizer.nextToken());
                stud.name = tokenizer.nextToken();
                stud.course = tokenizer.nextToken();
                studList.add(stud);
            }
        }
        System.out.println("Returning student list size: " + studList.size());
        return studList;
    }

    /*
    public String readFile(String fn) {
        StringBuilder sb = new StringBuilder();
        String fname = "src/files/" + fn;
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(new File(fname));
//        fileScanner.useDelimiter("\n");
//        System.out.println("Delim: " + fileScanner.delimiter());
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }

        while(fileScanner.hasNext()){
            sb.append(fileScanner.next());
            
            
        }
//        sb.append(fileScanner.next());
//        sb.append(fileScanner.next());
//        sb.append(fileScanner.next());
        System.out.println("File Contents: " + sb.toString());
        return sb.toString();
    }

     */
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package inputoutput;
import java.util.Scanner;
/**
 *
 * @author Asus PC
 */
public class Inputoutput4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    String nama;
    char jeniskelamin;
    int tinggibadan;
    String menikah;
    
    System.out.print("masukan nama :");
    nama = input.nextLine();
    System.out.print("masukan jenis kelamin :");
    jeniskelamin = input.next().charAt(0);
    System.out.print("masukan tingi badan :");
    tinggibadan = input.nextInt();
    System.out.print("masukan status menikah :");
    menikah=input.next();}
    
        
}
   

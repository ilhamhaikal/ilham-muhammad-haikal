/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class registasi {
public static void main(String[] args) {
System.out.println ("Selamat Datang");
Scanner sc= new Scanner (System.in);
System.out.println("masukan nama:");
String nama = sc.nextLine();
System.out.println ("masukan umur:");
int umur= sc.nextInt();
System.out.println("masukan alamat:"); sc.nextLine();
String alamat = sc.nextLine();
System.out.println("hello"+nama+" Anda sudah registrasi");
}
}



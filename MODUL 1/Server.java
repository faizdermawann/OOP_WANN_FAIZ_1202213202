package MODUL1;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        System.out.println("Selamat Datang di Restoran EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("======================================");

        System.out.println("Nama: ");
        Scanner input = new Scanner (System.in);
        String name = input.nextLine();
        System.out.println("Phone Number: ");
        Scanner input = new Scanner (System.in);
        String no = input.nextLine();
        User a = new User();
        a.setName(name);
        a.setNo(no);
        a.Register();

        System.out.println("1. Menu");
        System.out.println("2. Pilih Menu");
        System.out.println("3. Keluar");
        Menu b = new Menu();


        // TODO Create Menu

        // TODO Insert Menu to Database

        // TODO Display Main Menu

        // TODO Create User

        // Display Menu

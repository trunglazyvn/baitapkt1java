package BT;

import java.util.Scanner;

public class bai03 {
    private String xau;
    private String xauDN;

    public String nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap xau: ");
        xau = sc.nextLine();
        while(xau.isEmpty()){
            System.out.print("xau rong! nhap lai: ");
            xau = sc.nextLine();
        }
        return xau;
    }

    public String xauDaoNguoc(){
        xauDN = "";
        for(int i = xau.length() - 1; i >= 0; i--){
            xauDN += xau.charAt(i);
        }

        return xauDN;
    }

    public static void main(String[] args){
        bai03 ba = new bai03();

        String xau = ba.nhap();
        System.out.println("xau ban dau la: " + xau +"\n" + "xau dao nguoc la: " + ba.xauDaoNguoc() );
    }
}

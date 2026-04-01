package BT;
import java.util.Scanner;
public class bai02{

    private String hoten;
    private String ho;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ho & ten: ");
        hoten = sc.nextLine();
        System.out.print("nhap ho: ");
        ho = sc.nextLine();
        while(hoten.isEmpty() || ho.isEmpty()){
            if(hoten.isEmpty()){
                System.out.print("ko duoc de trong ho & ten!; nhap lai: ");
                hoten = sc.nextLine();
            }else{
                System.out.print("ko duoc de trong ho!; nhap lai: ");
                ho = sc.nextLine();
            }
        }
    }

    public void kiemtra(){
        hoten = hoten.replace(" ", "");
        for(int i = 0; i < ho.length(); i++){
            if(hoten.charAt(i) != ho.charAt(i)){
                System.out.println("ko phai la ho " + ho + "!");
                return;
            }
        }
        System.out.println("co ho " + ho + " trong ten!");
    }

    public void kiemtrathucong(){
        int start = 0;
        while(start < hoten.length() && hoten.charAt(start) == ' '){
            start++;
        }

        int end = start;
        while(end < hoten.length() && hoten.charAt(end) != ' '){
            end++;
        }

        int dodaiho = end - start;

        if(dodaiho != ho.length()){
            System.out.println("ko co ho " + ho + " trong ten!");
            return;
        }

        for(int i = 0; i < ho.length(); i++){
            if(hoten.charAt(start + i) != ho.charAt(i)){
                System.out.println("ko co ho " + ho + " trong ten!");
                return;
            }
        }
        System.out.println("co ho " + ho + " trong ten!");
    }

    public static void main(String[] args){
        bai02 nw = new bai02();

        nw.nhap();
        nw.kiemtrathucong();
    }
}
package BT;
import java.util.Scanner;
public class bai04 {
    private String duongDan;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap duong dan: ");
        duongDan = sc.nextLine();
        while(duongDan.isEmpty()){
            System.out.print("duong dan rong! nhap lai: ");
            duongDan = sc.nextLine();
        }
        
    }

    public void tachduongdan(){
        String ten, morong, duongdan;

        ten = "";
        morong = "";
        duongdan = "";

        int icham = -1;
        int iduongdan = -1;

        int end = duongDan.length();
        
        for(int i = end - 1; i >= 0; i--){
            if(icham == -1 && duongDan.charAt(i) == '.'){
                icham = i;
                break;
            }
        }

        for(int i = end - 1; i >=0; i--){
            if(iduongdan == -1 && duongDan.charAt(i) == '/'){
                iduongdan = i;
                break;
            }
        }

        if(icham == -1 || iduongdan == -1 || icham < iduongdan){
            System.out.println("duong dan sai!");
            return;
        }

        for(int i = 0; i <= iduongdan; i++){
            duongdan += duongDan.charAt(i);
        }

        for(int i = iduongdan + 1; i < icham; i++){
            ten += duongDan.charAt(i);
        }

        for(int i = icham + 1; i < end; i++){
            morong += duongDan.charAt(i);
        }

        System.out.println("duong dan la: " + duongdan);
        System.out.println("ten la: " + ten);
        System.out.println("mo rong la: " + morong);
    }

    public static void main(String[] args){
        bai04 bon = new bai04();

        bon.nhap();
        bon.tachduongdan();
    }
}

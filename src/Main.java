import java.util.Scanner;

class Biodata{
    Biodata (String nama, String hobi, int umur){
        this.nama = nama;
        this.hobi = hobi;
        this.umur = umur;
    }
    public static int test(){
        return 100;
    }
}

public class Main {
    public static void calc(int a,int b, String op){
        if (op.equals("+")) {
            System.out.print(a + b);
        } else if (op.equals("-")) {
            System.out.print(a - b);
        } else if (op.equals("x")) {
            System.out.print(a * b);
        } else if (op.equals(":")) {
            System.out.print(a / b);
        } else if (op.equals("%")) {
            System.out.print(a % b);
        } else {
            System.out.print("input Tidak Valid!");
        }
    }

    public static void main(String[] args) {
        Biodata dataSaya = new Biodata(nama="risa", hobi="nonton", umur=12);
        dataSaya.menyapa();
        System.out.println(dataSaya.hobi);
    }
//    public static void calc(int a,int b, String op){
//        if (op.equals("+")) {
//            System.out.print(a + b);
//        } else if (op.equals("-")) {
//            System.out.print(a - b);
//        } else if (op.equals("x")) {
//            System.out.print(a * b);
//        } else if (op.equals(":")) {
//            System.out.print(a / b);
//        } else if (op.equals("%")) {
//            System.out.print(a % b);
//        } else {
//            System.out.print("input Tidak Valid!");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        boolean kondisi = true;
//        while (kondisi) {
//            System.out.print("Masukkan a: ");
//            int a = Integer.parseInt(scanner.nextLine());
//            System.out.print("Masukkan b: ");
//            int b = Integer.parseInt(scanner.nextLine());
//            System.out.print("Masukkan Operator: ");
//            String op = scanner.nextLine();
//
//            calc(a,b,op);
//
//            System.out.print("\nLanjut?");
//            String tanya = scanner.nextLine();
//            if (tanya.equals("ya")) {
//                kondisi = true;
//            } else {
//                kondisi = false;
//            }
//        }
//        scanner.close();
//    }
}
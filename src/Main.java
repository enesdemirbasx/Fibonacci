import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int sayi1=0,sayi2=1,sonuc;
        System.out.print("Kaç elemanlı bir fibonacci dizisi istersiniz?: ");
        int elemansay= inp.nextInt();
        for (int i=0;i<elemansay;i++){
            sonuc=sayi1+sayi2;
            System.out.println(sayi1+"+"+sayi2+"= "+sonuc);
            sayi1=sayi2;
            sayi2=sonuc;
        }
    }
}
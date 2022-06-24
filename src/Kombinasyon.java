import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r;
        int ndeger = 1,rdeger = 1,nrdeger=1;
        System.out.println("Eleman sayisini giriniz : ");
        n = input.nextInt();
        System.out.println("R yi giriniz : ");
        r = input.nextInt();
        if (n>=r) {
            for (int i = 1; i <= n; i++) {
                ndeger *= i;
            }

            System.out.println(ndeger);

            for (int i = 1; i <= r; i++) {
                rdeger *= i;
            }

            System.out.println(rdeger);

            for (int i = 1; i <= (n - r); i++) {
                nrdeger *= i;
            }

            System.out.println(nrdeger);

            int sonuc = ndeger / (rdeger * nrdeger);
            System.out.println(sonuc);
        }else{
            System.out.println("r degeri, n degerinden buyuk olamaz!");
        }
    }
}

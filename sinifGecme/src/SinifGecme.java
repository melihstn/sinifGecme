import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {

        int matematik, fizik, kimya, turkce, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("matematik notunu giriniz : ");
        matematik = inp.nextInt();
        int mat = (matematik > 100 || matematik < 0) ? 0 : matematik;


        System.out.print("fizik notunu giriniz: ");
        fizik = inp.nextInt();
        int fiz = (fizik > 100 || fizik < 0) ? 0 : fizik;


        System.out.print("kimya notunu giriniz :");
        kimya = inp.nextInt();
        int kim = (kimya > 100 || kimya < 0) ? 0 : kimya;


        System.out.print("türkçe notunu giriniz : ");
        turkce = inp.nextInt();
        int turko = (turkce > 100 || turkce < 0) ? 0 : turkce;


        System.out.print("müzik notunu giriniz : ");
        muzik = inp.nextInt();
        int muzikk = (muzik > 100 || muzik < 0) ? 0 : muzik;


         int total = (mat + fiz + kim + turko + muzikk);
         double avarage = total / 5;

        if(avarage <= 55){
            System.out.println("kaldınız!");

        } else {
            System.out.println("sınıfı geçtiniz!!");
        }

        System.out.print("sınıf geçme notunuz " + avarage );


    }
}

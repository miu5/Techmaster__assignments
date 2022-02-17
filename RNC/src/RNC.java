import java.util.Random;
import java.util.Scanner;

public class RNC {
        public static void main(String[] args){

            Random rd = new Random();
            Scanner sc = new Scanner(System.in);

            int a = rd.nextInt(100);//Random một số.
            System.out.println("Nhập một số ngẫu nhiên: ");
            int b = sc.nextInt();
            System.out.println("Số của chương trình là: "+a);

            String c = (a > b) ? a+" lớn hơn "+b : a+" nhỏ hơn "+b;
            System.out.println(c);

        }
    }


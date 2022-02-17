import java.util.Scanner;

public class Hypo {
        public static void main(String[] args){

            double a; //Cạnh a.
            double b; //Cạnh b.
            double c; //Cạnh huyền c.

            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập cạnh a: ");
            a = sc.nextDouble();
            System.out.println("Nhập cạnh b: ");
            b = sc.nextDouble();

            // Áp dụng định lý Pytagore, ta có cạnh huyền c = căn của (a^2) + (b^2)
            c = Math.sqrt((a*a)+(b*b));

            System.out.println("Cạnh huyền c là: "+c);
            sc.close();
        }
    }


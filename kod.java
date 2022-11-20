public class Faktoriyel {

public static void main(String[] args) {
	
java.util.Scanner scan = new java.util.Scanner(System.in);
System.out.print("Sayi Girsi : ");
double val = Double.parseDouble(scan.nextLine());
double result = Hesapla.Faktoriyel(val);
System.out.println("Sonuc = " + result);
}

public static int Foo() {
return 10;
}

}
class Hesapla{
public static double Faktoriyel(double a) {
if (a == 1 || a == 0)
return 1;
else
return a * Faktoriyel(a - 1);
}
}

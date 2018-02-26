package firstPracticeLecture.bekelabs;

import java.util.Scanner;

/*
	A program c�lja hogy az els� �s m�sodik gyakorlaton megcsin�lt feladatokat egy oszt�lyon bel�l,k�l�n met�dusokba szervezve 
 */

public class BasicExamples {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Milyen programr�szt szeretn�l kipr�b�lni?");
		System.out.println(" 1:HelloWorld! \n 2:Bumm! \n 3:M�sodfok� egyenlet megold�k�plet");
		int Kod = sc1.nextInt();

		switch (Kod) {
		case 1:
			HelloWorld();
			break;

		case 2:
			Bumm();
			break;

		case 3:
			Masodfoku();
			break;

		default:
			System.out.println("�rv�nytelen m�velet!");

		}
		sc1.close();

	}

	public static void Chocice() {
		Scanner sc2 = new Scanner(System.in);

		System.out.println("Ha szeretn�l m�s programot kipr�b�lni akkor irj igent!");
		String Choice = sc2.nextLine();

		if (Choice.toLowerCase().equals("igen")) {
			main(null);
		} else {
			System.out.println("A programot k�szitette Beke D�niel");

		}
		sc2.close();
		return;
	}

	private static void HelloWorld() {
		System.out.println("Hello World");
		Chocice();
	}

	private static void Bumm() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}

		System.out.println("Bumm");
		Chocice();
	}

	private static void Masodfoku() {
		// K�tf�le kiirat�st pr�bak�pp,02.22. el�ad�son tanultak alapj�n.

		Scanner sc3 = new Scanner(System.in);
		System.out.println("Add meg a m�sodfok� tagot!");
		int a = sc3.nextInt();
		System.out.println("Add meg az els�fok� tagot!");
		int b = sc3.nextInt();
		System.out.println("Add meg a konstans tagot!");
		int c = sc3.nextInt();

		double root1, root2;

		double determinant = (b * b) - (4 * a * c);

		if (determinant > 0) {
			root1 = (-b + Math.sqrt(determinant)) / (2 * a);
			root2 = (-b - Math.sqrt(determinant)) / (2 * a);

			System.out.format("Az egyik gy�k = %.2f a m�sik gy�k root2 = %.2f", root1, root2);
		}
		// Ha a k�t gy�k egyenl�
		else if (determinant == 0) {
			root1 = root2 = -b / (2 * a);

			System.out.format("x1 = x2 = %.2f;", root1);
		}
		// Komplex gy�k�k
		else {
			double realPart = -b / (2 * a);
			double imaginaryPart = Math.sqrt(-determinant) / (2 * a);

			System.out.println("Az egyik komplex gy�k: " + realPart + " + " + imaginaryPart + "i"
					+ " a m�sik komplex gy�k: " + realPart + " - " + imaginaryPart + "i");
		}

		Chocice();
		sc3.close();
	}

}

import java.util.Scanner;
public class Extra2_RGM {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Cuantas horas trabajas a la semana");
		int horas = sc.nextInt();
		int salario=0;
		int salario2=0;

		if (horas <= 40) {
			salario=horas*16;
			System.out.println("Buenas, tu salario semanal es de : "+ salario+" €");
		} else {
			
			int resto=horas-40;
			
			salario=40*16;
			salario2+=resto*20;
			
			System.out.println("Buenas, tu salario semanal es de : "+ (salario+salario2)+" €");
			System.out.println("Horas normales: "+salario+" €.");
			System.out.println("Horas extras: "+salario2+" €.");
		}

	}
}

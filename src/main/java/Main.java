import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	System.out.println("Kullan�c� Ad�n� Giriniz : ");
	String username = scanner.nextLine();
	
	System.out.println("�ifreyi Giriniz : ");
	String password = scanner.nextLine();
	
	System.out.println("Hedef Kullan�c�  Giriniz");
	String targetProfile = scanner.nextLine();
		
	App app = new App();
	app.loginWith(username, password);
	app.profileGit(targetProfile);
	app.ilkG�nderiyeT�kla();
	app.B�t�nPostlar�Be�en();
		
	}

}

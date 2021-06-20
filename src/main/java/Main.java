import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	System.out.println("Kullanýcý Adýný Giriniz : ");
	String username = scanner.nextLine();
	
	System.out.println("Þifreyi Giriniz : ");
	String password = scanner.nextLine();
	
	System.out.println("Hedef Kullanýcý  Giriniz");
	String targetProfile = scanner.nextLine();
		
	App app = new App();
	app.loginWith(username, password);
	app.profileGit(targetProfile);
	app.ilkGönderiyeTýkla();
	app.BütünPostlarýBeðen();
		
	}

}

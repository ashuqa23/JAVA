import java.util.Scanner;
public class ReverseStringusingBuiltinMethod{
	public static void main(String[] args) {
		// Create scanner object to take input
		Scanner sc = new Scanner(System.in);
		//Ask user to input string
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		// Convert string into stringbuilder
		StringBuilder sb = new StringBuilder(str);
		// Use builtin reverse method
		sb.reverse();
		// Print reversed string
		System.out.println("Reversed String: " + sb);
		// close scanner
		sc.close();
	}
}
package Week3ArrayLabs;
import java.util.Scanner;
public class DNASWITCH 
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        int count = 0;
        while (count < 8) {
            System.out.print("Enter a DNA nucleotide (A, C, G, T): ");
            String input = scanner.nextLine().toUpperCase();

            switch (input) {
                case "A":
                    result.append("A. Adenine ");
                    break;
                case "C":
                    result.append("C. Cytosine ");
                    break;
                case "G":
                    result.append("G. Guanine ");
                    break;
                case "T":
                    result.append("T. Thymine ");
                    break;
                default:
                    result.append("Other. Unknown ");
                    break;
            }
            
            count++;
        }

        System.out.println("Final string: " + result.toString());
        scanner.close();
    }
}


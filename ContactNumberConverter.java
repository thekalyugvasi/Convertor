import java.util.Scanner;

public class ContactNumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter contact number with letters: ");
        String contactNumber = scanner.nextLine();
        String convertedNumber = convertContactNumber(contactNumber);
        System.out.println("Converted number: " + convertedNumber);
        scanner.close();
    }

    private static String convertContactNumber(String contactNumber) {
        // Conversion logic goes here
        // Example: replace 'A' with '2', 'B' with '2', ..., 'Z' with '9'
        return contactNumber.replaceAll("[A-C]", "2")
                .replaceAll("[D-F]", "3")
                .replaceAll("[G-I]", "4")
                .replaceAll("[J-L]", "5")
                .replaceAll("[M-O]", "6")
                .replaceAll("[P-S]", "7")
                .replaceAll("[T-V]", "8")
                .replaceAll("[W-Z]", "9");
    }
}

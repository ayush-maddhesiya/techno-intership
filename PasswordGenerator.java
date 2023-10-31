import java.security.SecureRandom;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
      
        int length = 12; // Default password length
        boolean useUppercase = true;
        boolean useLowercase = true;
        boolean useDigits = true;
        boolean useSpecialChars = true;



        String password = generateRandomPassword(length, useUppercase, useLowercase, useDigits, useSpecialChars);
        System.out.println("Generated Password: " + password);
    }

    public static String generateRandomPassword(int length, boolean useUppercase, boolean useLowercase, boolean useDigits, boolean useSpecialChars) {

      
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String digitChars = "0123456789";
        String specialChars = "!@#$%^&*()-_+=<>?";

        StringBuilder validChars = new StringBuilder();
        if (useUppercase) validChars.append(uppercaseChars);
        if (useLowercase) validChars.append(lowercaseChars);
        if (useDigits) validChars.append(digitChars);
        if (useSpecialChars) validChars.append(specialChars);

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(validChars.length());
            password.append(validChars.charAt(randomIndex));
        }

        return password.toString();
    }
}

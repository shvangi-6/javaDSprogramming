
   

import java.security.SecureRandom;

public class Ppgenerator {

    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String ALL_CHARS = LOWERCASE + UPPERCASE + DIGITS;

    private static final int PASSWORD_LENGTH = 8;

    public static void main(String[] args) {
        System.out.println("Generated Password: " + generatePassword());
    }

    private static String generatePassword() {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(PASSWORD_LENGTH);

        // Ensure the password has at least one lowercase letter
        password.append(LOWERCASE.charAt(random.nextInt(LOWERCASE.length())));

        // Ensure the password has at least one uppercase letter
        password.append(UPPERCASE.charAt(random.nextInt(UPPERCASE.length())));

        // Ensure the password has at least one digit
        password.append(DIGITS.charAt(random.nextInt(DIGITS.length())));

        // Fill the rest of the password with random characters
        for (int i = 3; i < PASSWORD_LENGTH; i++) {
            password.append(ALL_CHARS.charAt(random.nextInt(ALL_CHARS.length())));
        }

        // Shuffle the characters to ensure randomness
        return shuffleString(password.toString(), random);
    }

    private static String shuffleString(String input, SecureRandom random) {
        char[] characters = input.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            int j = random.nextInt(characters.length);
            // Swap characters at positions i and j
            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
        }
        return new String(characters);
    }


}


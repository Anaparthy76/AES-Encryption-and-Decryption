import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class AESDecryption {
    private static SecretKey secretKey; // The same secret key used for encryption

    public static String decrypt(String encryptedMessage) {
        try {
            // Create Cipher instance
            Cipher cipher = Cipher.getInstance("AES");

            // Initialize Cipher in decryption mode with the secret key
            cipher.init(Cipher.DECRYPT_MODE, secretKey);

            // Decode the Base64 encoded encrypted message
            byte[] encryptedBytes = Base64.getDecoder().decode(encryptedMessage);

            // Decrypt the message
            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

            // Convert the decrypted bytes back to the original message
            return new String(decryptedBytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

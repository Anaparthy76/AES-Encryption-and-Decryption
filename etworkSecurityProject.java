public class NetworkSecurityProject {
    public static void main(String[] args) {
        String message = "Hello, this is a network security project!";
        System.out.println("Original Message: " + message);

        // Encryption
        String encryptedMessage = AESEncryption.encrypt(message);
        System.out.println("Encrypted Message: " + encryptedMessage);

        // Decryption
        String decryptedMessage = AESDecryption.decrypt(encryptedMessage);
        System.out.println("Decrypted Message: " + decryptedMessage);
    }
}

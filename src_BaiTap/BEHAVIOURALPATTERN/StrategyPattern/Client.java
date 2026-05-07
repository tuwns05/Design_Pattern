package BEHAVIOURALPATTERN.StrategyPattern;

public class Client {
    public static void main(String[] args) throws Exception {
        String secret = "Hello, Strategy Pattern!";

        //Base64
        FileEncryptor encryptor = new FileEncryptor(new Base64Encryption());
        String enc = encryptor.encrypt(secret);
        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + encryptor.decrypt(enc));

        // AES
        encryptor.setStrategy(new AESEncryption());
        enc = encryptor.encrypt(secret);
        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + encryptor.decrypt(enc));

        //RSA
        encryptor.setStrategy(new RSAEncryption());
        enc = encryptor.encrypt(secret);
        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + encryptor.decrypt(enc));
    }
}

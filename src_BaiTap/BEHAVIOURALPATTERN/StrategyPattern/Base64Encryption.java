package BEHAVIOURALPATTERN.StrategyPattern;

import java.util.Base64;

public class Base64Encryption implements Strategy{
    @Override
    public String encrypt(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    @Override
    public String decrypt(String encryptedData) {
        return new String(Base64.getDecoder().decode(encryptedData));
    }
}

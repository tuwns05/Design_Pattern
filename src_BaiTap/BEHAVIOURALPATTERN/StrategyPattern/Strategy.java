package BEHAVIOURALPATTERN.StrategyPattern;

public interface Strategy {
    String encrypt(String data);
    String decrypt(String encryptedDat);
}

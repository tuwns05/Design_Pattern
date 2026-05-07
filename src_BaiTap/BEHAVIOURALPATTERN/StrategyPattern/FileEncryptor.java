package BEHAVIOURALPATTERN.StrategyPattern;


//Bộ mã hóa tệp tin
public class FileEncryptor {
    private Strategy strategy;

    public FileEncryptor(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String encrypt(String data) {
        System.out.println("Encrypting with: " + strategy.getClass().getSimpleName());
        return strategy.encrypt(data);
    }

    public String decrypt(String data) {
        System.out.println("Decrypting with: " + strategy.getClass().getSimpleName());
        return strategy.decrypt(data);
    }
}

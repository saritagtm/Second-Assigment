package QuestionNoFour;

public abstract class Bank {
    public int BankA = 1000;
    public int BankB = 1500;
    public int BankC = 2000;

    public abstract void getBalance();

    public int getBankA() {
        return BankA;
    }

    public void setBankA(int bankA) {
        BankA = bankA;
    }

    public int getBankB() {
        return BankB;
    }

    public void setBankB(int bankB) {
        BankB = bankB;
    }

    public int getBankC() {
        return BankC;
    }

    public void setBankC(int bankC) {
        BankC = bankC;
    }
}

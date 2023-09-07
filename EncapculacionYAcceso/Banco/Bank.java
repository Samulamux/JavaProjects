public class Bank {
    
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;
    private CheckingAccount accountThree;
    
    public Bank(){
        accountOne = new CheckingAccount("\nZeus",100);
        accountTwo = new CheckingAccount("\nHades",200);
        accountThree = new CheckingAccount("\nCronos",800);
    }

    public static void main(String[] args) {
        Bank bankOfGods = new Bank();
        System.out.println(bankOfGods.accountOne.name);
        System.out.println(bankOfGods.accountOne.balance);
        System.out.println(bankOfGods.accountTwo.name);
        System.out.println(bankOfGods.accountTwo.balance);
        System.out.println(bankOfGods.accountThree.name);
        System.out.println(bankOfGods.accountThree.balance);
    }
    
}

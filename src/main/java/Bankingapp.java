import java.util.Scanner;

public class Bankingapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountDetails account = new AccountDetails();

        System.out.println("Witaj w aplikacji banowej");
        account.createAccount();

        int inputNumber = scanner.nextInt();
        do {
            System.out.println("Co dzisiaj robimy? \n 1. Pokaż informacje o koncie \n 2. Wpłata gotówy \n 3. Wypłata gotówy \n 4. Wyjście");
            switch (inputNumber){
                case 1:
                    account.showAccount();
                    break;
            }
        } while(inputNumber != 4);
    }
}

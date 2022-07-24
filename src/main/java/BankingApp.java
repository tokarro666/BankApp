import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountDetails account = new AccountDetails();
        System.out.println("Witaj w naszej aplikacji bankowej");
        account.createAccount();
        int inputNumber;
        do {
            System.out.println("Co chcesz zrobić? \n 1.Pokaż informacje o koncie \n 2.Wpłata gotówki \n 3.Wypłata gotówki \n 4.Wyjście");
            inputNumber = scanner.nextInt();
            switch (inputNumber) {
                case 1:
                    account.showAccount();

                    break;

                case 2:
                    account.deposit();
                    break;

                case 3:
                    account.withdrawal();
                    break;
            }
        }
        while(inputNumber != 4);
    }


}

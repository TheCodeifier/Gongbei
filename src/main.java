import java.util.Scanner;

abstract class Payment {
    public final void Payment() {
        verifyCustomerData();
        executePayment();
        showConfirmation();
    }

    protected abstract void verifyCustomerData();
    protected abstract void executePayment();
    protected abstract void showConfirmation();
}

class iDeal extends Payment {
    @Override
    protected void verifyCustomerData() {
        System.out.println("Uw gegevens worden geverifieerd.");
    }

    @Override
    protected void executePayment() {
        System.out.println("Betaling wordt uitgevoerd");
    }

    @Override
    protected void showConfirmation() {
        System.out.println("Betaling succesvol!");
    }
}

class Creditcard extends Payment {
    @Override
    protected void verifyCustomerData() {
        System.out.println("Uw gegevens worden geverifieerd.");
    }

    @Override
    protected void executePayment() {
        System.out.println("Betaling wordt uitgevoerd.");
    }

    @Override
    protected void showConfirmation() {
        System.out.println("Betaling succesvol!");
    }
}

class PayPal extends Payment {
    @Override
    protected void verifyCustomerData() {
        System.out.println("Uw gegevens worden geverifieerd.");
    }

    @Override
    protected void executePayment() {
        System.out.println("Betaling wordt uitgevoerd.");
    }

    @Override
    protected void showConfirmation() {
        System.out.println("Betaling succesvol!");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kies een methode om te betalen: iDeal, Creditcard of PayPal");
        String choice = scanner.nextLine().toLowerCase();

        MessageSender sender;

        switch (choice) {
            case "iDeal":
                sender = new iDeal();
                break;
            case "Creditcard":
                sender = new Creditcard();
                break;
            case "PayPal":
                sender = new Creditcard();
                break;
            default:
                System.out.println("Ongeldige keuze.");
                scanner.close();
                return;
        }

        sender.pay();
        scanner.close();
    }
}
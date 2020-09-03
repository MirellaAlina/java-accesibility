package ar.com.ada.online.second.javaaccessibility.access.modifiers;

public class Bank {
    private Integer numberAccount;
    private String amount;

    private void showAttributesValues() {
        System.out.println("Number Account: " + this.numberAccount);
        System.out.println("Amount: " + this.amount);
    }
}

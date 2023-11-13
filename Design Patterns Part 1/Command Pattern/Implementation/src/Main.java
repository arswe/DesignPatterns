import Fx.Button;

public class Main {
    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new addCustomerCommand(service);
        var button = new Button(command);
        button.click();

        var deleteCommand = new deleteCustomerCommand(service);
        var deleteButton = new Button(deleteCommand);
        deleteButton.click();

    }
}
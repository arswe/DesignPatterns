import Fx.Command;

public class addCustomerCommand implements Command {
    private CustomerService service;

    public addCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}

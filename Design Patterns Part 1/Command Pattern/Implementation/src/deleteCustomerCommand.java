import Fx.Command;

public class deleteCustomerCommand implements Command {
    private CustomerService service;

    public deleteCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.deleteCustomer();
    }
}

package framework;

import framework.ICommand;

public class AddCustomerCommand implements ICommand {
    private CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();

    }
}

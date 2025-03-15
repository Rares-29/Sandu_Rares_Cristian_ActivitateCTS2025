package classic_factory_method.wash_machine.creator;

import classic_factory_method.wash_machine.product.SoapOperation;
import classic_factory_method.wash_machine.product.WashOperation;

public class SoapMachine extends BaseMachine{
    @Override
    public WashOperation createWashOperation() {
        return new SoapOperation();
    }
}

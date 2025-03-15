package classic_factory_method.wash_machine.creator;

import classic_factory_method.wash_machine.product.WashOperation;
import classic_factory_method.wash_machine.product.WaterOperation;

public class WaterMachine extends BaseMachine{
    @Override
    public WashOperation createWashOperation() {
        return new WaterOperation();
    }
}

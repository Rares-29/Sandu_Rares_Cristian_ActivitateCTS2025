package classic_factory_method.wash_machine.creator;

import classic_factory_method.wash_machine.product.WashOperation;
import classic_factory_method.wash_machine.product.WaterSoapOperation;

public class WaterSoapMachine extends BaseMachine{
    @Override
    public WashOperation createWashOperation() {

        return new WaterSoapOperation();
    }
}

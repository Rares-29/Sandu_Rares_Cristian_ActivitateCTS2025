package classic_factory_method.wash_machine.creator;

import classic_factory_method.wash_machine.product.WashOperation;

public abstract class BaseMachine {



    public abstract WashOperation createWashOperation();

    public void startWashing() {
        System.out.println("-----Start washing-------");
        WashOperation washOperation = createWashOperation();
        washOperation.displayOnScreen();
        washOperation.startOperation();
        System.out.println("------Finish of washing--------");
    }

}

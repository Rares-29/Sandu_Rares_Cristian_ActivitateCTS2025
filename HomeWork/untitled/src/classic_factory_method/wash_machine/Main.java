package classic_factory_method.wash_machine;

import classic_factory_method.wash_machine.creator.BaseMachine;
import classic_factory_method.wash_machine.creator.WaterMachine;

public class Main {

    public static void main(String[] args) {

        BaseMachine washMachine = new WaterMachine();
        washMachine.startWashing();

    }
}

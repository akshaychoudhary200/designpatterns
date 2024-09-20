package statepattern;

import javax.xml.transform.stream.StreamSource;

public class IdleState implements State {


    @Override
    public void insertCoin(Machine machine) {
        System.out.println("coin inserted idle -> CoinInsertedState ");
        machine.setState(new CoinInsertedState());
    }

    @Override
    public void selectProduct(Machine machine) {

    }

    @Override
    public void dispenseProduct(Machine machine) {
    }
}

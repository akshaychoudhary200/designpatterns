package statepattern;

public class CoinInsertedState implements State{


    @Override
    public void insertCoin(Machine machine) {
    }

    @Override
    public void selectProduct(Machine machine) {
        System.out.println("product selected coin inserted -> product dispense state");
        machine.setState(new ProductDispenseState());
    }

    @Override
    public void dispenseProduct(Machine machine) {

    }
}

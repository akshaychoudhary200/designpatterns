package statepattern;

public class ProductDispenseState implements State {


    @Override
    public void insertCoin(Machine machine) {

    }

    @Override
    public void selectProduct(Machine machine) {

    }

    @Override
    public void dispenseProduct(Machine machine) {
        System.out.println("product dispensed product dispensed -> idle state");
        machine.setState(new IdleState());
    }
}

package statepattern;

public class StatePattern {
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.dispenseProduct();

        machine.insertCoin();
        machine.selectProduct();
        machine.dispenseProduct();

        Machine mac = new Machine();
        mac.setState(new ProductDispenseState());
        mac.insertCoin();
    }
}

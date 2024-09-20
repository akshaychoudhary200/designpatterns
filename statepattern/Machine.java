package statepattern;

public class Machine {
    private State state;

    public Machine() {
        this.state = new IdleState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }

    public void insertCoin() {
        if(this.state instanceof CoinInsertedState || this.state instanceof ProductDispenseState) {
            System.out.println("illegal state select product of collect your product");
            return;
        }
        state.insertCoin(this);
    }

    public void selectProduct() {
        if(this.state instanceof IdleState || this.state instanceof ProductDispenseState) {
            System.out.println("illegal state insert coin or collect your product first");
            return;
        }
        state.selectProduct(this);
    }

    public void dispenseProduct() {
        if(this.state instanceof IdleState || this.state instanceof CoinInsertedState) {
            System.out.println("illegal state insert coin or select product first");
            return;
        }
        state.dispenseProduct(this);
    }
    
}

package behavioral.state.HeadFirst;

public class GumballMachine {

    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State soldOutQuarterState;

    State state;
    int count = 0;

    GumballMachine() {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutQuarterState = new SoldOutState();

        state = soldOutQuarterState;
        if(count > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        if(count != 0) {
            count -= 1;
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}

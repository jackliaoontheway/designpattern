package behavioral.state.HeadFirst;

public class HasQuarterState implements State {

    GumballMachine machine;

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.print("You can't inserted another quarter");
    }

    @Override
    public void ejectQuarter() {
        machine.setState(machine.noQuarterState);
    }

    @Override
    public void turnCrank() {
        machine.setState(machine.soldState);
    }

    @Override
    public void dispense() {

    }
}

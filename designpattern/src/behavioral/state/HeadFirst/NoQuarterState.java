package behavioral.state.HeadFirst;

public class NoQuarterState implements State {

    GumballMachine machine;

    public NoQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.print("You inserted a quarter");
        machine.setState(machine.hasQuarterState);
    }

    @Override
    public void ejectQuarter() {
        System.out.print("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.print("You haven't inserted a quarter");
    }

    @Override
    public void dispense() {
        System.out.print("You need to pay first");
    }
}

package behavioral.command.HeadFirst;

public class CellingFanHighCommand implements Command {

    private CellingFan cellingFan;
    private int preSpeed;

    public CellingFanHighCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        this.preSpeed = cellingFan.getSpeed();
        this.cellingFan.high();
    }

    @Override
    public void undo() {
        if (preSpeed == CellingFan.HIGH) {
            this.cellingFan.high();
        } else if (preSpeed == CellingFan.MEDIUM) {
            this.cellingFan.medium();
        } else if (preSpeed == CellingFan.LOW) {
            this.cellingFan.low();
        } else if (preSpeed == CellingFan.OFF) {
            this.cellingFan.off();
        }
    }
}


package behavioral.command.HeadFirst;

/**
 * Receiver
 */
public class Light {

    private String status;

    public String getStatus() {
        return status;
    }

    public void off() {
        this.status = "OFF";
    }

    public void on() {
        this.status = "ON";
    }

}

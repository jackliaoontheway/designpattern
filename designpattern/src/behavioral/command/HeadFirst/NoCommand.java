package behavioral.command.HeadFirst;

/**
 * 空对象 do nothing，客户将处理null的责任转移到空对象
 */
public class NoCommand implements Command {

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}

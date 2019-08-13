package structural.adapter.DeepThinking;

import java.util.List;

public class Adapter implements LogDbOperateApi {

    private LogFileOperateApi adaptee;

    public Adapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void createLog(LogModel logModel) {
        List<LogModel> list = adaptee.readLogFile();

        list.add(logModel);

        adaptee.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel logModel) {

    }

    @Override
    public void removeLog(LogModel logModel) {
        List<LogModel> list = adaptee.readLogFile();
        list.remove(logModel);
        adaptee.writeLogFile(list);
    }

    @Override
    public List<LogModel> getAllLog() {
        return adaptee.readLogFile();
    }
}

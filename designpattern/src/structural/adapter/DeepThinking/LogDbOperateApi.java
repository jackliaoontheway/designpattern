package structural.adapter.DeepThinking;

import java.util.List;

public interface LogDbOperateApi {

    void createLog(LogModel logModel);

    void updateLog(LogModel logModel);

    void removeLog(LogModel logModel);

    List<LogModel> getAllLog();
}

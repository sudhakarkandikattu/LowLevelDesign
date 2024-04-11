package CodeBase.Logger;

public class Logger {
    private LogType logType;
    private LogSink logSink;
    private static Logger logger;
    private Logger(LogType logType,LogSink logSink)
    {
        this.logSink = logSink;
        this.logType = logType;
    }
    public static Logger getInstance()
    {
        if(logger == null)
        {
            return new Logger(LogType.INFO , new ConsoleLogSink());
        }
        return logger;
    }
    public void setLogType(LogType logType) {
        this.logType = logType;
    }
    public void setLogSink(LogSink logSink) {
        this.logSink = logSink;
    }
}

package CodeBase.Logger.ChainOfResponsibility;

import CodeBase.Logger.LogSink;

public abstract class LogProcesser {
    public static int ERROR = 1;
    public static int DEBUG = 2;
    public static int INFO = 3;

    LogProcesser nextLogProcesser;
    LogSink logSink;
    public LogProcesser(LogProcesser nextLogProcesser, LogSink logSink) {
        this.nextLogProcesser = nextLogProcesser;
        this.logSink = logSink;
    }
    public void log(int logType,String message)
    {
        if(nextLogProcesser != null)
        {
            nextLogProcesser.log(logType, message);
        }
    }
    public void setLogSink(LogSink logSink)
    {
        this.logSink = logSink;
    }
}

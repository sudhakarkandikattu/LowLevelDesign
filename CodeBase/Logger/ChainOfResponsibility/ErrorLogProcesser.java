package CodeBase.Logger.ChainOfResponsibility;

import CodeBase.Logger.LogSink;
public class ErrorLogProcesser extends LogProcesser {

    public ErrorLogProcesser(LogProcesser nextLogProcesser, LogSink logSink) {
        super(nextLogProcesser, logSink);
    }
    public void log(int logType,String message)
    {
        if(logType == ERROR){
            logSink.log(message);
        }
        else{
            super.log(logType,message);
        }
    }
}

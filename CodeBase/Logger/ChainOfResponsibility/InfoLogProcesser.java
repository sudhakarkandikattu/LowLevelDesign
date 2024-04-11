package CodeBase.Logger.ChainOfResponsibility;

import CodeBase.Logger.LogSink;

public class InfoLogProcesser extends LogProcesser {

    public InfoLogProcesser(LogProcesser nextLogProcesser, LogSink logSink) {
        super(nextLogProcesser, logSink);
    }
    public void log(int logType,String message)
    {
        if(logType == INFO){
            logSink.log(message);
        }else{
            super.log(logType, message);
        }
    }
    
}

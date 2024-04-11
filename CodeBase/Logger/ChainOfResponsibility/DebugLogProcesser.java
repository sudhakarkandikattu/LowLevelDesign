package CodeBase.Logger.ChainOfResponsibility;

import CodeBase.Logger.LogSink;

public class DebugLogProcesser extends LogProcesser {

    public DebugLogProcesser(LogProcesser nextLogProcesser, LogSink logSink) {
        super(nextLogProcesser, logSink);
        //TODO Auto-generated constructor stub
    }
    public void log(int logType,String message)
    {
        if(logType == DEBUG){
            logSink.log(message);
        }else{
            super.log(logType, message);
        }
    }
    
}

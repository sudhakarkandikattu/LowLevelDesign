package Tester.LoggerTester;

import java.util.UUID;

import CodeBase.Logger.ConsoleLogSink;
import CodeBase.Logger.FileLogSink;
import CodeBase.Logger.LogSink;
import CodeBase.Logger.LogType;
import CodeBase.Logger.Logger;
import CodeBase.Logger.ChainOfResponsibility.DebugLogProcesser;
import CodeBase.Logger.ChainOfResponsibility.ErrorLogProcesser;
import CodeBase.Logger.ChainOfResponsibility.InfoLogProcesser;
import CodeBase.Logger.ChainOfResponsibility.LogProcesser;
import CodeBase.UUIDgenerator.UuidGenerator;

public class LoggerTester {
    public static void main(String[] args) {
        LogSink logSink = new FileLogSink("Logger/logger.text");
        ErrorLogProcesser errorLogProcesser = new ErrorLogProcesser(null, logSink);
        DebugLogProcesser debugLogProcesser = new DebugLogProcesser(errorLogProcesser, logSink);
        LogProcesser logProcesser = new InfoLogProcesser(debugLogProcesser, logSink);
        logProcesser.log(LogProcesser.ERROR, "this is ERROR log");
        logProcesser.log(LogProcesser.INFO, "this is INFO log");
        logProcesser.log(LogProcesser.DEBUG, "this is DEBUG log");
    }
}

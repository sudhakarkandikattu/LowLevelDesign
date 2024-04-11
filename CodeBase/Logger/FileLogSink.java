package CodeBase.Logger;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogSink implements LogSink {
    private final String filename;
    public FileLogSink(String filename)
    {
        this.filename = filename;
    }
    @Override
    public void log(String message) {
        try{
            FileWriter writer = new FileWriter(filename,true);
            writer.write(message + "\n" );
            writer.close();
        }catch(IOException e){
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
        
    }

}

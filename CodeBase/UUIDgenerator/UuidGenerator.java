package CodeBase.UUIDgenerator;

import java.util.Random;

public class UuidGenerator {
    private static int counter = 0;
    public static String generate()
    {
        long timeStramp = System.currentTimeMillis();
        int randomNumber = new Random().nextInt(1000);
        String uuid = timeStramp + "-" + randomNumber + "-" + counter;
        counter++;
        return uuid;
    }
}

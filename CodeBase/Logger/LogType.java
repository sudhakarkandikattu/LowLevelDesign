package CodeBase.Logger;

public enum LogType {
    INFO(3),
    DEBUG(2),
    ERROR(1);
    private final int id;
    LogType(int id)
    {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}

public class Stopwatch {
    private long startTime = 0, endTime = 0;

    public void startTime() {
        startTime = System.currentTimeMillis();
    }

    public void endTime() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        long elapsedTime = endTime - startTime;
        return elapsedTime;
    }
}

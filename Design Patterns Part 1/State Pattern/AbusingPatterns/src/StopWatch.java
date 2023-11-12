public class StopWatch {
    private boolean isRunning;

    public void click() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Stop");
        } else {
            isRunning = true;
            System.out.println("Start");
        }
    }
}

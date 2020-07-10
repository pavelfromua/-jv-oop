public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Track is started to work");
    }

    @Override
    public void stopWork() {
        System.out.println("The Track is stopped");
    }
}

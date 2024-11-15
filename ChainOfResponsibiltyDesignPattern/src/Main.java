public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Logging FrameWork");
        Logger l = new DebugLevel(new InfoLevel(new ErrorLevel(null)));
        l.HandleRequest("ERROR");


    }
}
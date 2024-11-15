public class DebugLevel extends Logger{
    Logger logger;
    ErrorLevel level;

    public DebugLevel(Logger logger) {
        super(logger);
    }



        @Override
        public void HandleRequest(String logglevel) {
            if(LoggLevels.INFO.equals(logglevel)){
                System.out.println("The message comes under "+LoggLevels.DEBUG+"level");
            } else {
                super.HandleRequest(logglevel);
            }
        }

}

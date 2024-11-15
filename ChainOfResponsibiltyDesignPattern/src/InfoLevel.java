public class InfoLevel extends Logger{
    Logger logger;
    LoggLevels loggLevels;
    InfoLevel(Logger logger){
      super(logger);
    }


    @Override
    public void HandleRequest(String logglevel) {
          if(LoggLevels.INFO.equals(logglevel)){
              System.out.println("The message comes under "+LoggLevels.INFO +"level");
          }
          else {
              super.HandleRequest(logglevel);
          }
    }
}

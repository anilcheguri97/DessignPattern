public class ErrorLevel extends Logger{
    Logger logger;
    LoggLevels loggLevels;
    ErrorLevel(Logger logger){
        super(logger);
    }

    @Override
    public void HandleRequest(String str) {
     if(LoggLevels.ERROR.toString().equals("ERROR")){
         System.out.println("The message comes under "+LoggLevels.ERROR +"level");
     }
     else {
         super.HandleRequest(str);
     }

    }
}

public abstract class Logger {
    Logger nextLogger;
    Logger(Logger logger){
        this.nextLogger=logger;

    }
    public  void  HandleRequest(String str){
        if(nextLogger != null){
            nextLogger.HandleRequest(str);
        }
        else {
            System.out.println(str+"log level is not available");
        }
    }

}

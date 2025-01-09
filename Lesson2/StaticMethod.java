public class StaticMethod {
    
    public static String method() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return stackTrace[2].getMethodName();
    }
}
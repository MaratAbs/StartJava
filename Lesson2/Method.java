public class Method {
    
    public static String revertName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
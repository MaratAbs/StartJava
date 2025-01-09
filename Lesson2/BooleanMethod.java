public class BooleanMethod {
    
    public void executeSecondMethodBlock() {
        System.out.println(" " + shouldTerminateProgram());
        System.out.println(" " + isDeletedFile());
        System.out.println(" " + hasUniqueDigit());
        System.out.println(" " + hasEnteredLetter());
        System.out.println(" " + hasEqualDigits());
        System.out.println(" " + hasGameAttempts());
        System.out.println(" " + isEmptyLine());
        System.out.println(" " + isEvenNumber());
        System.out.println(" " + isValidFile());
        System.out.println(" " + isExistFile());
    }

    private boolean shouldTerminateProgram() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.print(stackTrace[1].getMethodName() + 
                "() - программа выполняется далее или завершается?");
        return false;
    }

    private boolean isDeletedFile() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.print(stackTrace[1].getMethodName() + 
                "() - удалился ли файл на жестком диске или флешке?");
        return false;
    }

    private boolean hasUniqueDigit() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.print(stackTrace[1].getMethodName() + 
                "() - последовательность содержит уникальную цифру?");
        return false;
    }

    private boolean hasEnteredLetter() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.print(stackTrace[1].getMethodName() + 
                "() - пользователь ввел букву или что-то другое?");
        return false;
    }

    private boolean hasEqualDigits() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.print(stackTrace[1].getMethodName() + 
                "() - в проверяемых числах, есть равные цифры?");
        return false;
    }

    private boolean hasGameAttempts() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.print(stackTrace[1].getMethodName() + 
                "() - в игре \"Марио\" остались попытки?");
        return false;
    }

    private boolean isEmptyLine() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.print(stackTrace[1].getMethodName() + 
                "() - пользователь ввёл пустую строку или из одних пробелов?");
        return false;
    }

    private boolean isEvenNumber() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.print(stackTrace[1].getMethodName() + 
                "() - на кубике, который бросил компьютер, выпало четное число?");
        return false;
    }

    private boolean isValidFile() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.print(stackTrace[1].getMethodName() + 
                "() - путь до файла, который вы ищите на ssd, действительный?");
        return false;
    }

    private boolean isExistFile() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.print(stackTrace[1].getMethodName() + 
                "() - файл по указанному адресу существует?");
        return false;
    }
}
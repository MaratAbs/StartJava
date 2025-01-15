public class BooleanMethod {

    public boolean shouldTerminateProgram() {
        System.out.print(Method.revertName() + 
                "() - программа выполняется далее или завершается?");
        return false;
    }

    public boolean isDeletedFile() {
        System.out.print(Method.revertName() + 
                "() - удалился ли файл на жестком диске или флешке?");
        return false;
    }

    public boolean hasUniqueDigit() {
        System.out.print(Method.revertName() + 
                "() - последовательность содержит уникальную цифру?");
        return false;
    }

    public boolean isEnteredLetter() {
        System.out.print(Method.revertName() + 
                "() - пользователь ввел букву или что-то другое?");
        return false;
    }

    public boolean hasEqualDigits() {
        System.out.print(Method.revertName() + 
                "() - в проверяемых числах, есть равные цифры?");
        return false;
    }

    public boolean hasGameAttempts() {
        System.out.print(Method.revertName() + 
                "() - в игре \"Марио\" остались попытки?");
        return false;
    }

    public boolean isEmptyLine() {
        System.out.print(Method.revertName() + 
                "() - пользователь ввёл пустую строку или из одних пробелов?");
        return false;
    }

    public boolean isEvenNumber() {
        System.out.print(Method.revertName() + 
                "() - на кубике, который бросил компьютер, выпало четное число?");
        return false;
    }

    public boolean isValidFile() {
        System.out.print(Method.revertName() + 
                "() - путь до файла, который вы ищите на ssd, действительный?");
        return false;
    }

    public boolean isExistFile() {
        System.out.print(Method.revertName() + 
                "() - файл по указанному адресу существует?");
        return false;
    }
}
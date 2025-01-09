public class NonBooleanMethod {

    public void executeFirstMethodBlock() {
        findLongestWord();
        selectMenuItem();
        countNumberUiqueWords();
        displayErrorMessage();
        synchronizeData();
        restoreData();
        pauseFileDownload();
        resetToFactoryDefaults();
        writeContentsToFile();
        convertTemperature();
        enterMathExpression();
        determineWinner();
        findBookByAuthor();
    }

    private void findLongestWord() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[1].getMethodName() + 
                "() - найти самое длинное слово в предложении из книги по Java");
    }

    private void selectMenuItem() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[1].getMethodName() + 
                "() - выбрать пункт меню в текстовом редакторе на macOS");
    }

    private void calculateAverageGrades() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[1].getMethodName() + 
                "() - вычислить среднее значение оценок в школе №1234");
    }

    private void countNumberUiqueWords() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[1].getMethodName() + 
                "() - подсчитать количество уникальных слов в \"Война и Мир\"");
    }

    private void displayErrorMessage() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[1].getMethodName() + 
                "() - вывести сообщение об ошибке");
    }

    private void synchronizeData() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[1].getMethodName() + 
                "() - синхронизировать данные с облачным хранилищем");
    }

    private void restoreData() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[1].getMethodName() + 
                "() - восстановить данные из резервной копии от 11.03.2024");
    }

    private void pauseFileDownload() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[1].getMethodName() + 
                "() - приостановить загрузку mp3-файла группы \"Ария\"");
    }

    private void resetToFactoryDefaults() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[1].getMethodName() + 
                "() - сбросить настройки до заводских для пылесоса Mi");
    }

    private void writeContentsToFile() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[1].getMethodName() + 
                "() - записать содержимое в файл по указанному пути на флешку");
    }
    
    private void convertTemperature() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[1].getMethodName() + 
                "() - преобразовать температуру из Цельсия в Фаренгейт");
    }

    private void enterMathExpression() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[1].getMethodName() + 
                "() - ввести математическое выражение с тремя аргументами");
    }

    private void determineWinner() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[1].getMethodName() + 
                "() - выявить победителя среди гонщиков игры \"Need For Speed\"");
    }

    private void findBookByAuthor() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[1].getMethodName() + 
                "() - найти книгу по имени писателя");
    }
}

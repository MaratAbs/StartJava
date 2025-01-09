public class Main {

    public static void main(String[] args) { 
        NonBooleanMethod object1 = new NonBooleanMethod();
        System.out.println("1. Не boolean-методы\n");
        object1.executeFirstMethodBlock();

        BooleanMethod object2 = new BooleanMethod();
        System.out.println("\n2. Boolean-методы\n");
        object2.executeSecondMethodBlock();

        System.out.println("\n3. Статический метод\n");
        StaticMethod.method();
    }
}
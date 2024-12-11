public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "самец";
        wolfOne.name = "Вася";
        wolfOne.weight = 20.6F;
        wolfOne.age = 1;
        wolfOne.color = "белый";
        System.out.println("Пол: " + wolfOne.gender +
                "\nКличка: " + wolfOne.name + 
                "\nВес: " + wolfOne.weight + " кг." +
                "\nВозраст: " + wolfOne.age + " г." +
                "\nОкрас: " + wolfOne.color);
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}
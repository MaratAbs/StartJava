public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("самец");
        wolfOne.setName("Вася");
        wolfOne.setWeight(20.6F);
        wolfOne.setAge("10");
        wolfOne.setColor("белый");
        System.out.println("Пол: " + wolfOne.getGender() +
                "\nКличка: " + wolfOne.getName() + 
                "\nВес: " + wolfOne.getWeight() + " кг." +
                "\nВозраст: " + wolfOne.getAge() +
                "\nОкрас: " + wolfOne.getColor());
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}
package gb.HomeWorkApp4;



public class Main {

    public static void main(String[] args) {
        int foot = 0;
        Plate plate = new Plate(foot);
        plate.info();
        Cat[] cats = {
                new Cat("Tom", 10),
                new Cat("Barsik", 15),
                new Cat("Vasa", 20),
        };

            for (Cat cat : cats) {
                cat.eat(plate);

            }
        }
    }





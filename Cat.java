package gb.HomeWorkApp4;

public class Cat {
    private String name;
    private int appetite;
    private String full;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full =full;

    }

    public void eat(Plate n) {
        if (n.info1(appetite)) {
             full="сытый";
            System.out.printf("Кот %s сьел %d  еды и %s \n", name, appetite,full);
        } else  {
            System.out.printf("Коту %s с аппетитом %s не хватило еды\n", name, appetite);
        }
    }
}











public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BasePizza bp = new Margherita();
        Toppings tp = new Mushroom(bp);
        System.out.println(tp.cost());

        Toppings tp1 = new Mushroom(new ExtraCheese(bp));

        System.out.println(tp1.cost());


    }
}
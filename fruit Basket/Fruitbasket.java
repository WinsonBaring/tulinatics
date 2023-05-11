public import java.util.ArrayList;

public class FruitBasket {
    private ArrayList<Fruit> fruits;


    public FruitBasket() {
        fruits = new ArrayList<>();
    }
    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public void countApple() {
        int ctr_apple = 0;
        for(Fruit f : fruits) {
            if(f instanceof Apple) {
                ctr_apple++;
            }
        }
        System.out.println("Number of Apples in the basket: " + ctr_apple);
    }

    public void countOrange() {
        int ctr_orange = 0;
        for(Fruit f : fruits) {
            if(f instanceof Orange) {
                ctr_orange++;
            }
        }
        System.out.println("Number of Oranges in the basket: " + ctr_orange);
    }

    public void countBanana() {
        int ctr_banana = 0;
        for(Fruit f : fruits) {
            if(f instanceof Banana) {
                ctr_banana++;
            }
        }
        System.out.println("Number of Bananas in the basket: " + ctr_banana);
    }

    public void fruitBasketTastes() {
        for(Fruit f : fruits) {
            if(f instanceof Orange) {
                Orange o = (Orange) f;
                o.getTaste();
            } else if(f instanceof Apple) {
                Apple a = (Apple) f;
                a.getTaste();
            } else {
                Banana b = (Banana) f;
                b.getTaste();
            }
        }
    }

    public void fruitBasketTextures() {
        for(Fruit f : fruits) {
            if(f instanceof Orange) {
                Orange o = (Orange) f;
                o.getTexture();
            } else if(f instanceof Apple) {
                Apple a = (Apple) f;
                a.getTexture();
            } else {
                Banana b = (Banana) f;
                b.getTexture();
            }
        }
    }

} {
    
}

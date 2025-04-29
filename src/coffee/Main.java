package coffee;

public class Main {
    // 속성

    // 생성자

    // 기능
    public static void main(String[] args) {

        CoffeeShop coffeeShop = new CoffeeShop("이디야");
        Coffee coffeeA = coffeeShop.makeCoffee("뜨아", false);
        Coffee coffeeB = coffeeShop.makeCoffee("뜨아", false);
        Coffee coffeeC = coffeeShop.makeCoffee("아아", true);

        System.out.println("커피A 와 커피B 비교:" + (coffeeA == coffeeB));
        System.out.println("커피A 와 커피C 비교:" + (coffeeA == coffeeC));
        System.out.println("커피B 와 커피C 비교:" + (coffeeB == coffeeC));

        int a = 1;
        int b = 1;
        int c = 2;

        System.out.println("a 와 b 비교: " + (a == b));
        System.out.println("a 와 c 비교: " + (a == c));
        System.out.println("b 와 c 비교: " + (b == c));

        System.out.println("동등성비교 커피A 와 커피B 비교: " + coffeeA.equals(coffeeB));


    }
}

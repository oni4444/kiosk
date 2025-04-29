package kiosk.lv2;

public class MenuItem {

    // 속성
    String name;
    double price;
    String explain;



    // 생성자
    MenuItem (String name, double price, String explain) {
        this.name = name;
        this.price = price;
        this.explain = explain;
    }



    // 기능

    // 게터
    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    String getExplain() {
        return explain;
    }
}

package coffee;

public class Coffee {

    // 속성
    private String name;
    private boolean isIce;


    // 생성자
    Coffee(String name, boolean isIce) {
        this.name = name;
        this.isIce = isIce;
    }


    // 기능 단축키 alt+ins
    @Override
    public boolean equals(Object obj) {
        Coffee coffee = (Coffee) obj;
        if (this.name == coffee.name && this.isIce == coffee.isIce) {
            return true;
        } else {
            return false;
        }
    }



}

package kiosk.lv2;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner sc = new Scanner(System.in);

        int num = 1; //??? 왜 변수는 초기화 해야하나요

        System.out.print("메뉴를 선택하세요: ");
        sc.nextInt();

        do {
            switch (num) {
                case 1:
                    System.out.println(menuItems.get(0)); // 왜 주소값? 리스트에 정의했는데
                    break;
                case 2:
                    System.out.println(menuItems.get(1));
                    break;
                case 3:
                    System.out.println(menuItems.get(2));
                    break;
                case 4:
                    System.out.println(menuItems.get(3));
                    break;
            }
        } while (num == 0);

    }
}

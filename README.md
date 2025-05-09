Lv 1. 기본적인 키오스크를 프로그래밍해보자
요구사항이 가지는 의도
입력 처리와 간단한 흐름 제어를 복습합니다. (프로그래밍 검증)
Scanner 활용법, 조건문, 반복문을 재확인하며 입력 데이터를 처리하는 방법 강화
햄버거 메뉴 출력 및 선택하기
Scanner를 사용하여 여러 햄버거 메뉴를 출력합니다.
제시된 메뉴 중 입력받은 숫자에 따라 다른 로직을 실행하는 코드를 작성합니다.
반복문을 이용해서 특정 번호가 입력되면 프로그램을 종료합니다.
Lv1을 구현하면 터미널에 이렇게 보여집니다.
[ SHAKESHACK MENU ]
1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
0. 종료      | 종료
   0 <- // 0을 입력

프로그램을 종료합니다.

### Lv 2. 객체 지향 설계를 적용해 햄버거 메뉴를 클래스로 관리하기

- [ ]  **요구사항이 가지는 의도**
    - [ ]  객체 지향 개념을 학습하고, 데이터를 구조적으로 관리하며 프로그램을 설계하는 방법을 익힙니다.
    - [ ]  햄버거 메뉴를 `MenuItem` 클래스와 `List`를 통해 관리합니다.

---

- [ ]  **`MenuItem` 클래스 생성하기**
    - [ ]  설명 : 개별 음식 항목을 관리하는 클래스입니다. 현재는 햄버거만 관리합니다.
    - [ ]  클래스는 `이름`, `가격`, `설명` 필드를 갖습니다.
- [ ]  `main` 함수에서 `MenuItem` 클래스를 활용하여 햄버거 메뉴를 출력합니다.
    - [ ]  `MenuItem` 객체 생성을 통해 `이름`, `가격`, `설명`을 세팅합니다.
        - [ ]  키워드: `new`
    - [ ]  `List`를 선언하여 여러 `MenuItem`을 추가합니다.
        - [ ]  `List<MenuItem> menuItems = new ArrayList<>();`
    - [ ]  반복문을 활용해 `menuItems`를 탐색하면서 하나씩 접근합니다.
    - 
- 구조 예시
  public static void main(String[] args) {
  // List 선언 및 초기화
  // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
  // (add 보다 더 좋은 방법이 있다면 그렇게 해도 됩니다!)

  	// Scanner 선언
  	
  	// 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
  	// 숫자를 입력 받기
  	// 입력된 숫자에 따른 처리
  		// 프로그램을 종료
  		// 선택한 메뉴 : 이름, 가격, 설명
}
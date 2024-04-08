package useful.ex06;

interface CoffeeMaker {
    void brew();
}

// public class CoffeeMachine implements CoffeeMaker {
public class CoffeeMachine  {
    public CoffeeMaker getCoffeeMaker(String type) {
    	// 익명 내부 클래스 
        return new CoffeeMaker() {
            @Override
            public void brew() {
                switch (type) {
                    case "에스프레소":
                        System.out.println("에스프레소를 내려요");
                        break;
                    case "아메리카노":
                        System.out.println("아메리카노를 내려요");
                        break;
                    case "카푸치노":
                        System.out.println("카프치노를 내려요");
                        break;
                    default:
                        System.out.println("다시 주문해 주세요");
                        break;
                }
            }
        };
    }

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        
        // 에스프레소 제조
        CoffeeMaker espressoMaker = coffeeMachine.getCoffeeMaker("에스프레소");
        espressoMaker.brew();
        
        // 아메리카노 제조
        CoffeeMaker americanoMaker = coffeeMachine.getCoffeeMaker("아메리카노");
        americanoMaker.brew();
        
        // 카푸치노 제조
        CoffeeMaker cappuccinoMaker = coffeeMachine.getCoffeeMaker("카푸치노");
        cappuccinoMaker.brew();
    }
}
package ex_23;

// 추상 클래스: 음료 제조 과정을 정의하는 템플릿
public abstract class BeverageMaker {

    // 템플릿 메서드: 음료 제조 과정의 뼈대를 정의
    public final void makeBeverage() {
        boilWater(); // 물 끓이기
        brew(); // 우려내기 (추상 메서드)
        pourInCup(); // 컵에 따르기
        addCondiments(); // 첨가물 추가 (추상 메서드)
    }

    // 물 끓이기
    public void boilWater() {
        System.out.println("물을 끓입니다.");
    }

    // 우려내기 (추상 메서드)
    public abstract void brew();

    // 컵에 따르기
    public void pourInCup() {
        System.out.println("컵에 따르기");
    }

    // 첨가물 추가 (추상 메서드)
    public abstract void addCondiments();
}

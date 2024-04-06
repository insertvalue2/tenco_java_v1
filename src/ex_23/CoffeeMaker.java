package ex_23;

//커피 클래스: 음료 제조 과정을 구체화
public class CoffeeMaker extends BeverageMaker {

 @Override
 public void brew() {
     System.out.println("필터로 커피를 우려내는 중");
 }

 @Override
 public void addCondiments() {
     System.out.println("설탕과 우유를 추가합니다.");
 }
}


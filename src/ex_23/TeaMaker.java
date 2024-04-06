package ex_23;

//차 클래스: 음료 제조 과정을 구체화
public class TeaMaker extends BeverageMaker {

 @Override
 public void brew() {
     System.out.println("차를 우려내는 중");
 }

 @Override
 public void addCondiments() {
     System.out.println("레몬을 추가합니다.");
 }
}

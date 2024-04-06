package ex_19;

// Bank 와 Customer 는 어떤 관계에 있나요? 
// Bank 는 Customer 객체의 생성과 소멸은 서로 독립적입니다. 
// 즉, 고객과 은행은 서로 협력하지만, 고객이 은행 서비스를 
// 이용하지 않아도 둘은 독립적으로 존재할 수 있습니다.
// 이럴 때 우리는 서로 연관관계에 놓여 있다라고 말 할 수 있습니다.
public class Bank {

	private String name;

	// 은행 이름을 초기화하는 생성자
	public Bank(String name) {
		this.name = name;
	}

	public void provideService(ServiceType serviceType, String customerName) {
		switch (serviceType) {
		case ACCOUNT_INFO:
			System.out.println(customerName + "님의 계좌 정보를 조회합니다.");
			break;
		case DEPOSIT:
			System.out.println(customerName + "님이 입금을 진행합니다.");
			break;
		case WITHDRAW:
			System.out.println(customerName + "님이 출금을 진행합니다.");
			break;
		// 다른 서비스들도 추가할 수 있음
		default:
			System.out.println("해당 서비스는 제공되지 않습니다.");
		}
	}

	public void showAccountInfo(Customer customer) {
		System.out.println("customer 의 해당 계좌 조회 후 화면에 출력");
	}

	// Getter
	public String getName() {
		return name;
	}
}

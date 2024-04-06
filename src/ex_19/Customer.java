package ex_19;

//Customer 클래스
public class Customer {
	
	private String name;

	// 고객 이름을 초기화하는 생성자
	public Customer(String name) {
		this.name = name;
	}

	// 은행 서비스를 이용하는 메서드
	// Customer 클래스는 Bank 객체와 ServiceType 열거형에 의존하고 있음
	public void useBankService(Bank bank, ServiceType serviceType) {
		bank.provideService(serviceType, this.name);
	}

	// Getter
	public String getName() {
		return name;
	}
}

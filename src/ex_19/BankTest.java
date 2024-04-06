package ex_19;

public class BankTest {

	public static void main(String[] args) {
		Bank bank = new Bank("그린은행");
        Customer customer1 = new Customer("춘식이");
        Customer customer2 = new Customer("삼봉이");
        
        bank.provideService(ServiceType.ACCOUNT_INFO, customer1.getName());
        System.out.println("------------------");
        bank.provideService(ServiceType.WITHDRAW, customer2.getName());

	}

}

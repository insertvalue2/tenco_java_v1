package exercise;

import java.util.Scanner;

public class PhoneBookManager {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Contact[] contacts = new Contact[100];
		int lastIndexNumber = 0;

		boolean flag = true;

		while (flag) {
			System.out.println("** 전화번호 관리 프로그램 ** ");
			System.out.println("1. 추가 2. 조회 3. 수정 4. 삭제 0. 종료");
			System.out.print("메뉴를 선택하세요: ");
			String selectedNumber = scanner.nextLine();

			switch (selectedNumber) {
			case "1":
				lastIndexNumber = addContact(scanner, contacts, lastIndexNumber);
				break;
			case "2":
				searchContact(scanner, contacts, lastIndexNumber);
				break;
			case "3":
				modifyContact(scanner, contacts, lastIndexNumber);
				break;
			case "4":
				deleteContact(scanner, contacts, lastIndexNumber);
				break;
			case "0":
				flag = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 입력 값 입니다.\n다시 선택하세요.");
				break;
			}
		}
		scanner.close();
	}

	public static int addContact(Scanner scanner, Contact[] contacts, int lastIndexNumber) {
		System.out.println("전화번호 추가");
		System.out.print("이름을 입력하세요: ");
		String name = scanner.nextLine();
		System.out.print("전화번호를 입력하세요: ");
		String phoneNumber = scanner.nextLine();

		Contact contact = new Contact(name, phoneNumber);
		contacts[lastIndexNumber] = contact;
		lastIndexNumber++;

		System.out.println("전화번호가 추가되었습니다.");
		return lastIndexNumber;
	}

	public static void searchContact(Scanner scanner, Contact[] contacts, int lastIndexNumber) {
		System.out.println("전화번호 조회");
		System.out.print("이름을 입력하세요: ");
		String name = scanner.nextLine();

		boolean found = false;
		for (int i = 0; i < lastIndexNumber; i++) {
			if (contacts[i].getName().equals(name)) {
				System.out.println("이름: " + contacts[i].getName() + ", 전화번호: " + contacts[i].getPhoneNumber());
				found = true;
			}
		}
		if (!found) {
			System.out.println("해당하는 이름의 전화번호가 없습니다.");
		}
	}

	public static void modifyContact(Scanner scanner, Contact[] contacts, int lastIndexNumber) {
		System.out.println("전화번호 수정");
		System.out.print("수정할 이름을 입력하세요: ");
		String name = scanner.nextLine();

		boolean found = false;
		for (int i = 0; i < lastIndexNumber; i++) {
			if (contacts[i].getName().equals(name)) {
				System.out.print("새로운 전화번호를 입력하세요: ");
				String newPhoneNumber = scanner.nextLine();
				contacts[i].setPhoneNumber(newPhoneNumber);
				System.out.println("전화번호가 수정되었습니다.");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("해당하는 이름의 전화번호가 없습니다.");
		}
	}

	public static void deleteContact(Scanner scanner, Contact[] contacts, int lastIndexNumber) {
		System.out.println("전화번호 삭제");
		System.out.print("삭제할 이름을 입력하세요: ");
		String name = scanner.nextLine();

		boolean found = false;
		for (int i = 0; i < lastIndexNumber; i++) {
			if (contacts[i].getName().equals(name)) {
				contacts[i] = null;
				System.out.println("전화번호가 삭제되었습니다.");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("해당하는 이름의 전화번호가 없습니다.");
		}
	}

}

// 하나의 자바 파일에 public class를 제외 하고 
// 여러 클래스를 작성할 수 있다. 
class Contact {
	private String name;
	private String phoneNumber;

	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}

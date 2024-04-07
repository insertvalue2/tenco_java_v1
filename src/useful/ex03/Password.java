package useful.ex03;

public class Password {
	
	private String password;
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password) throws PasswordException{
		
		if(password == null){
			throw new PasswordException("비밀번호는 null 일 수 없습니다");
		}
		else if( password.length() < 5){
			throw new PasswordException("비밀번호는 5자 이상이어야 합니다.");
		}
		else if (password.matches("[a-zA-Z]+")){
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}
		// [...] - 대괄호는 문자열을 나타냄 
		// a-z 소문자 a ~ z , A-Z 대문자 A ~ Z 모든 알파벳 문자열을 말함 
		// + : 바로 앞의 표현식이 하나 이상 반복되어야 함을 나타냅니다.
		// 이 정규식은 "Hello", "world", "A1", "b2b", "Z"  이런 단어면 true을 반환 
		// password.matches("[a-zA-Z]+")
		// --> true 을 반환 하면 특수문자나 숫자가 없다고 판단 됨!!  
		this.password = password;
	}
	

}

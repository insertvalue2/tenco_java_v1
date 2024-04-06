package useful.ex02;

class EBook {
	
	private int bookTypeId; 
	private String title;
	private String author;
	
	public EBook(int bookTypeId, String title, String author) {
		this.bookTypeId = bookTypeId;
		this.title = title;
		this.author = author;
	}
	
	public String toString() {
		return "[[ " + bookTypeId + ", " + title + "," + author + "]]"; 
	}
	
	// EBook 클래스의 실제 인스턴스는 다르지만 [논리적]으로 
	// 책 제목이 같다면 동일한 녀석이라고 판단 할 꺼임!! 
	public boolean equals(Object obj) {
		if( obj instanceof EBook) {
			EBook eBook = (EBook)obj; // 넘겨 받은 Object를 다운 캐스팅 
			if(this.title.equals(eBook.title)) {
				return true;
			} else {
				return false;
			}
		}
		// 넘겨 받은 데이터 타입이 EBook 이 아니라면 false 
		return false;
	}
	
	// 논리적으로 동일함을 위해 equals() 메서드를 재정의 하였다면 
	// hashCode()메서드도 재정의 하여 동일한 hashCode 값이
	// 반환되도록 하는 것을 권장 한다.
	@Override
	public int hashCode() {
		return bookTypeId;
	}

	
}

package useful.ex01;

import java.lang.*; // 자동으로 import 해 준다. 

// extends Object 컴파일러가 .class 파일을 만들 때 
// 코드를 넣어 준다. 
class Book extends Object {
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String toString() {
		return title + "," + author;
	}
	
}


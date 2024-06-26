package useful.ex03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileExceptionHandling {
	public static void main(String[] args) {

		FileInputStream fis = null;

//		try {
//			fis = new FileInputStream("temp");   // <-- 예외 발생 가능 코드
//		} catch(FileNotFoundException f) {
//			System.out.println("temp 라는 파일이 없습니다.");
//		}
		// try-catch-finally
		try {
			fis = new FileInputStream("test1.txt");
			return;
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("파일명 확인해주세요");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 반드시 수행 되는 코드 이다.
			// 심지어 return 키워드를 만나더라도 수행이 된다 !! 아주 강력한 녀석!
			System.out.println("finally 수행!!!");
		}

		System.out.println("비정상 종료 되지 않았어요!");
	} // end of main

}

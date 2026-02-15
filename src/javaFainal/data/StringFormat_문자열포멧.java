package javaFainal.data;

public class StringFormat_문자열포멧 {
	public static void main(String[] args) {

		// 문자열 포멧
		// %s, %d, %f == 서식 지정자 (String, Decimal Integer, Floating-point)
		// /n == 다음 단에 출력시켜줍니다.
		System.out.printf("저는 %s입니다. 나이는 %d살이고요, 키는 %fcm입니다.\n", "홍길동", 20, 180.5f);

		String str = String.format("저는 %s입니다. 나이는 %d살이고요, 키는 %fcm입니다.\n", "홍길동", 20, 180.5f);

		System.out.println(str);
	}
}

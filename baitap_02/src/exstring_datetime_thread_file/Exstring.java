package exstring_datetime_thread_file;

import java.util.Scanner;

public class Exstring {
	// a.Tạo pthuc chấp nhận 1 list các từ
	// và trả ra một chuoi là các từ đó được nối với nhau bởi dấu cách.
	public static void Chuoi(String[] listWord) {
		String str = "";
		for (int i = 0; i < listWord.length - 1; i++) {
			str += listWord[i] + " ";
		}
		str += listWord[listWord.length - 1];
		System.out.println(str);
	}

	// b.Tạo pthuc mà nhận vào tên đầy đủ dưới dạng 1 chuoi duy nhất
	// và trả ra là 1 chuoi bao gồm tên viết tắt
	public static void TenVietTat(String name) {
		String[] listWord = name.split(" ");
		String newName = "";
		for (int i = 0; i < listWord.length; i++) {
			newName += listWord[i].substring(0, 1);
		}
		System.out.println(newName);
	}

	// c. Tạo pthuc mà nhận vào tên đầy đủ giống như (cau b)
	public static void hoTen(String name) {
		String[] listWord = name.split(" ");
		String hoTen = listWord[0] + " " + listWord[listWord.length - 1];
		System.out.println(hoTen);
	}

	public static void main(String[] args) {
		String[] listWord = { "Nguyễn", "Thị", "Thu", "Trang", "Intern", "Tai", "Nguyen" ,"va", "Moi", "Truong"};
		Chuoi(listWord);
		String name = "Nguyễn Thị Thu Trang";
		TenVietTat(name);
		hoTen(name);
	}

}

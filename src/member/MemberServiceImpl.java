package member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberServiceImpl implements MemberService{
	ArrayList<String> name = new ArrayList<>();
	
	public void memberSave() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등록할 회원의 이름을 입력해주세요. : ");
		name.add(sc.next());
	}
	
	public void memeberShow() {
		System.out.println("현재 멤버의 수는 " + name.size() + "명 입니다.");
	}
}

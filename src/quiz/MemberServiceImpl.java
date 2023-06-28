package quiz;

import java.util.Scanner;

public class MemberServiceImpl implements MemberService{
	MemberDTO dto = new MemberDTO();
	Scanner sc = new Scanner(System.in);
	
	public void memSave() {
		System.out.print("이름을 입력해주세요. : ");
		dto.setName(sc.next());
		System.out.print("주소를 입력해주세요. : ");
		dto.setAddr(sc.next());
		System.out.print("나이를 입력해주세요. : ");
		dto.setAge(sc.nextInt());
	}

	public void memPrint() {
		System.out.println("이름 : " + dto.getName());
		System.out.println("주소 : " + dto.getAddr());
		System.out.println("나이 : " + dto.getAge());
	}

	public void memDel() {
		dto.setName(null);
		dto.setAddr(null);
		dto.setAge(0);
		System.out.println("삭제가 완료되었습니다.");
	}

	public void memEdit() {
		System.out.println("수정할 부분을 선택해주세요.");
		System.out.println("1. 이름");
		System.out.println("2. 주소");
		System.out.println("3. 나이");
		System.out.print(">>> : ");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.print("수정할 이름을 입력해주세요. : ");
			dto.setName(sc.next());
		}else if (num == 2) {
			System.out.print("수정할 주소를 입력해주세요. : ");
			dto.setAddr(sc.next());
		}else if (num == 3) {
			System.out.print("수정할 나이를 입력해주세요. : ");
			dto.setAge(sc.nextInt());
		}else {
			System.out.println("숫자를 잘못 입력하셨습니다. 처음으로 돌아갑니다.");
		}
		
	}
	
	

}

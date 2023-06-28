package quiz;

import java.util.Scanner;

public class LoginService03 extends TimeService{
	LoginDTO03 login;
	MyFrame myFrame;
	MemberServiceImpl member;
	
	public LoginService03() {
		login = new LoginDTO03();
		myFrame = new MyFrame();
		member = new MemberServiceImpl();
	}
	public void display() {
		Scanner sc = new Scanner(System.in);
		String inputId, inputPwd;
		int num;
		while(true ) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 탈퇴");
			System.out.println("4. 종료");
			System.out.print(">>> : ");
			num = sc.nextInt();
			switch( num ) {
			case  1:
				if( login.getId() == null ) {
					System.out.println("회원가입 먼저 진행해주세요.");
					break;
				}
				System.out.print("id를 입력해주세요. :");
				inputId = sc.next();
				System.out.print("비밀번호를 입력해주세요. : ");
				inputPwd = sc.next();

				if( inputId.equals( login.getId() ) ) {
					if(inputPwd.equals( login.getPwd() ) ) {
						System.out.println("로그인 되었습니다.");
						setStartTime();
						myFrame.start();
						while(true) {
							System.out.println("-------------------");
							System.out.println("1. 회원 정보 등록");
							System.out.println("2. 회원 정보 보기");
							System.out.println("3. 회원 정보 삭제");
							System.out.println("4. 회원 정보 수정");
							System.out.println("5. 나가기");
							System.out.print(">>> : ");
							int memNum = sc.nextInt();
							if(memNum == 1) {
								member.memSave();
							}else if (memNum == 2) {
								member.memPrint();
							}else if (memNum == 3) {
								member.memDel();
							}else if (memNum == 4) {
								member.memEdit();
							}else if(memNum == 5){
								break;
							}else {
								System.out.println("다시 입력해주세요.");
							}
						}

					}else {
						System.out.println("비밀번호가 틀렸습니다");
					}
				}else {
					System.out.println("존재하지 않는 아이디입니다");
				}
				break;
			case  2:
				if( login.getId() == null ) {
					System.out.print("저장 아이디 입력 : ");
					inputId = sc.next();
					System.out.print("저장 비밀번호 입력 : ");
					inputPwd = sc.next();
					login.setId(inputId);
					login.setPwd(inputPwd);
					System.out.println("가입에 성공하셨습니다.");
				}else {
					System.out.println("사용자가 존재합니다");
				}
				break;
			case  3:
				if(login.getId() == null) {
					System.out.println("회원가입 먼저하세요");
				}else {
					login.setId( null );
					login.setPwd( null );
					System.out.println("탈퇴하였습니다.");
				}
				break;
			case  4:
				setEndTime();
				System.out.println( getResultTime() );
				myFrame.setFlag(false);
				myFrame.setLable( getResultTime() );
				return ;
			}
		}
	}
}
















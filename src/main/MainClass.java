package main;

import java.util.Scanner;

import event.EventServiceImpl;
import member.MemberServiceImpl;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberServiceImpl mem = new MemberServiceImpl();
		EventServiceImpl eve = new EventServiceImpl();
		
		while(true) {
			System.out.println("==================");
			System.out.println("1. 회원 이동");
			System.out.println("2. 이벤트 이동");
			System.out.println("3. 종료");
			System.out.print(">>> : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				while(true) {
					System.out.println("==================");
					System.out.println("1. 회원 저장하기");
					System.out.println("2. 회원 수 보기");
					System.out.println("3. 나가기");
					System.out.print(">>> : ");
					int memNum = sc.nextInt();
					if(memNum == 1) {
						mem.memberSave();
					}else if(memNum == 2){
						mem.memeberShow();
					}else if(memNum == 3) {
						break;
					}else {
						System.out.println("다시 입력해주세요.");
					}
				}
				break;
				
			case 2:
				while(true) {
					System.out.println("==================");
					System.out.println("1. 이 달의 이벤트 보기");
					System.out.println("2. 전체 이벤트 보기");
					System.out.println("3. 나가기");
					System.out.print(">>> : ");
					int eveNum = sc.nextInt();
					if(eveNum == 1) {
						System.out.print("지금은 몇달인가요? ");
						int now = sc.nextInt();
						eve.nowEvent(now);
					}else if(eveNum == 2){
						eve.allEvent();
					}else if(eveNum == 3) {
						break;
					}else {
						System.out.println("다시 입력해주세요.");
					}
				}
				break;
			case 3:
				return;
			default:
				System.out.println("다시 입력해주세요.");
				break;
			}
		}
	}
}

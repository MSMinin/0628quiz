package event;

public class EventServiceImpl implements EventService{
	// String배열로 분기별로 4개 이벤트를 만들고, 몇월인지 입력한 후, 그 달에 맞는 이벤트를 출력하게 하기
	String[] event = {"벚꽃 축제", "계곡", "꽃 구경", "눈 싸움"};
	
	public void nowEvent(int num) { // 현재 이벤트 보기
		if(12 >= num && num > 9) {
			System.out.println("이 달의 이벤트는 " + event[3] + "입니다.");
		}else if(9 >= num && num > 6) {
			System.out.println("이 달의 이벤트는 " + event[2] + "입니다.");
		}else if(6 >= num && num > 3) {
			System.out.println("이 달의 이벤트는 " + event[1] + "입니다.");
		}else if(3 >= num && num > 1) {
			System.out.println("이 달의 이벤트는 " + event[0] + "입니다.");
		}else {
			System.out.println("다시 입력해주세요.");
		}
	}

	public void allEvent() { // 전체 이벤트 보기
		for(int i = 0; i < event.length; i++) {
			System.out.println((i+1)+"분기때의 이벤트는 : " + event[i]);
		}
	}
}

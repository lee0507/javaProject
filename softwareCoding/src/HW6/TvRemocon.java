package HW6;

public class TvRemocon {
	int k30_limit_up_Vol = 5;//숫자형 전역변수 k30_limit_up_Vol을 정의하고 값을 5로 초기화한다.
	int k30_limit_down_Vol = 0;//숫자형 전역변수 k30_limit_down_Vol을 정의하고 값을 0로 초기화한다.
	int k30_Vol = 0;//숫자형 전역변수 k30_Vol을 정의하고 값을 0로 초기화한다.
	int k30_limit_up_Channel = 10;//숫자형 전역변수 k30_limit_up_Channel을 정의하고 값을 10로 초기화한다.
	int k30_limit_down_Channel = 0;//숫자형 전역변수 k30_limit_down_Channel을 정의하고 값을 0로 초기화한다.
	int k30_Channel = 0;//숫자형 전역변수 k30_limit_Channel을 정의하고 값을 0로 초기화한다.
	String k30_help;//문자열형 전역변수 k30_help를 정의한다


	void VolUp() {//VolUp이라는 함수 생성
		if(k30_Vol == k30_limit_up_Vol) {//만약 변수 floor가 최대볼륨인 limit_up_Vol와 같아진다면
			k30_help = "더이상 볼륨을 올릴 수 없습니다!";//변수 help에 더이상 볼륨을 올릴 수 없습니다!를 값으로 저장한다. 
		} else {//if조건을 만족하지 않는 경우라면
			k30_Vol++;//변수 Vol를 1 증가시킨다.
			k30_help = String.format("현재 볼륨은 %d입니다.", k30_Vol);//변수 help에 Vol를 string으로 형변환한 현재 볼륨은 %d입니다를 값으로 저장한다. 
		}
	}
	
	void VolDn() {//VolDn이라는 함수 생성
		if(k30_Vol == k30_limit_down_Vol) {//만약 변수 floor가 최저볼륨인 limit_down_Vol와 같아진다면
			k30_help = "더이상 볼륨을 내릴 수 없습니다!";//변수 help에 더이상 볼륨을 내릴 수 없습니다!를 값으로 저장한다. 
		} else {//if조건을 만족하지 않는 경우라면
			k30_Vol--;//변수 Vol를 1 감소시킨다.
			k30_help = String.format("현재 볼륨은 %d입니다.", k30_Vol);//변수 help에 Vol를 string으로 형변환한 현재 볼륨은 %d입니다를 값으로 저장한다. 
		}
	}
	
	void ChannelUp() {//ChannelUp이라는 함수 생성
		if(k30_Channel == k30_limit_up_Channel) {//만약 변수 floor가 최대채널인 limit_up_Vol와 같아진다면
			k30_help = "더이상 채널이 없습니다!";//변수 help에 더이상 채널이 없습니다!를 값으로 저장한다. 
		} else {//if조건을 만족하지 않는 경우라면
			k30_Channel++;//변수 Channel를 1 증가시킨다.
			k30_help = String.format("현재 채널은 %d번입니다.", k30_Channel);//변수 help에 Channel를 string으로 형변환한 현재 채널은 %d번입니다.를 값으로 저장한다. 
		}
	}
	
	void ChannelDn() {//ChannelDn이라는 함수 생성
		if(k30_Channel == k30_limit_down_Channel) {//만약 변수 floor가 최저채널인 limit_down_Vol와 같아진다면
			k30_help = "더이상 채널이 없습니다!";//변수 help에 더이상 채널이 없습니다!를 값으로 저장한다. 
		} else {//if조건을 만족하지 않는 경우라면
			k30_Channel--;//변수 Channel를 1 감소시킨다.
			k30_help = String.format("현재 채널은 %d번입니다.", k30_Channel);//변수 help에 Channel를 string으로 형변환한 현재 채널은 %d번입니다.를 값으로 저장한다. 
		}
	}

}

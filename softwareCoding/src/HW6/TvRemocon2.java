package HW6;

public class TvRemocon2 {
	int k30_limit_up_Vol;//숫자형 전역변수 k30_limit_up_Vol을 정의한다.
	int k30_limit_down_Vol;//숫자형 전역변수 k30_limit_down_Vol을 정의한다.
	int k30_Vol;//숫자형 전역변수 k30_Vol을 정의한다.
	int k30_limit_up_Channel;//숫자형 전역변수 k30_limit_up_Channel 을 정의한다.
	int k30_limit_down_Channel;//숫자형 전역변수 k30_limit_up_Vol을 정의한다.
	int k30_Channel;//숫자형 전역변수 k30_limit_up_Vol을 정의한다.
	String k30_help;//숫자형 전역변수 k30_limit_up_Vol을 정의한다.
	String k30_help2;//숫자형 전역변수 k30_limit_up_Vol을 정의한다.
	
	TvRemocon2() {
		k30_limit_up_Vol = 10;//숫자형 전역변수 k30_limit_up_Vol을 정의하고 값을 5로 초기화한다.
		k30_limit_down_Vol = 0;//숫자형 전역변수 k30_limit_down_Vol을 정의하고 값을 0로 초기화한다.
		k30_Vol = 0;//숫자형 전역변수 k30_Vol을 정의하고 값을 0로 초기화한다.
		k30_limit_up_Channel = 10;//숫자형 전역변수 k30_limit_up_Channel을 정의하고 값을 10로 초기화한다.
		k30_limit_down_Channel = 0;//숫자형 전역변수 k30_limit_down_Channel을 정의하고 값을 0로 초기화한다.
		k30_Channel = 0;//숫자형 전역변수 k30_limit_Channel을 정의하고 값을 0로 초기화한다.

	}
	
	TvRemocon2(int k30_a) {
		k30_limit_up_Vol = 10;//숫자형 전역변수 k30_limit_up_Vol을 정의하고 값을 5로 초기화한다.
		k30_limit_down_Vol = 0;//숫자형 전역변수 k30_limit_down_Vol을 정의하고 값을 0로 초기화한다.
		k30_Vol = 0;//숫자형 전역변수 k30_Vol을 정의하고 값을 0로 초기화한다.
		k30_limit_up_Channel = 10;//숫자형 전역변수 k30_limit_up_Channel을 정의하고 값을 10로 초기화한다.
		k30_limit_down_Channel = 0;//숫자형 전역변수 k30_limit_down_Channel을 정의하고 값을 0로 초기화한다.
		k30_Channel = 0;//숫자형 전역변수 k30_limit_Channel을 정의하고 값을 0로 초기화한다.
		System.out.printf("TV 전원을 켰습니다[%d]\n", k30_a);//변수 k30_a를 출력한다.
		
		if(k30_a > 0) {//만약 변수 k30_a가 0보다 크다면
			for (int k30_i = 0; k30_i < k30_a; k30_i++) {//for반복문을 k30_i는 1부터 k30_i가 k30_a보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
				this.VolUp();//클래스 내의 VolUp메소드를 실행한다.
			}
			if (k30_a > 0) {//만약 변수 k30_a가 0보다 크다면
				for (int k30_j = 0; k30_j < k30_a; k30_j++) {//for반복문을 k30_j는 1부터 k30_j가 k30_a보다 작을 때까지 k30_j를 1씩 증가시키면서 수행한다.
					this.ChannelUp();//클래스 내의 ChannelUp메소드를 실행한다.
				}
			} else if (k30_a < 0) {//만약 변수 k30_a가 0보다 작다면
				for (int k30_j = 0; k30_j < (k30_a * -1); k30_j++) {//for반복문을 k30_j는 1부터 k30_j가 k30_a보다 작을 때까지 k30_j를 1씩 증가시키면서 수행한다.
					this.ChannelDn();//클래스 내의 ChannelDn메소드를 실행한다.
				}
			}
			
		} else if (k30_a < 0) {//만약 변수 k30_a가 0보다 작다면
			for (int k30_i = 0; k30_i < (k30_a * -1); k30_i++) {//for반복문을 k30_i는 1부터 k30_i가 k30_a보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
				this.VolDn();//클래스 내의 VolDn메소드를 실행한다.
			}
			if (k30_a > 0) {//만약 변수 k30_a가 0보다 크다면
				for (int k30_j = 0; k30_j < k30_a; k30_j++) {//for반복문을 k30_j는 1부터 k30_j가 k30_a보다 작을 때까지 k30_j를 1씩 증가시키면서 수행한다.
					this.ChannelUp();//클래스 내의 ChannelUp메소드를 실행한다.
				}
			} else if (k30_a < 0) {//만약 변수 k30_a가 0보다 작다면
				for (int k30_j = 0; k30_j < (k30_a * -1); k30_j++) {//for반복문을 k30_j는 1부터 k30_j가 k30_a보다 작을 때까지 k30_j를 1씩 증가시키면서 수행한다.
					this.ChannelDn();//클래스 내의 ChannelDn메소드를 실행한다.
				}
			}
		}

	}
	

	void VolUp() {//VolUp이라는 함수 생성
		if(k30_Vol == k30_limit_up_Vol) {//만약 변수 floor가 최대볼륨인 limit_up_Vol와 같아진다면
			k30_help = "더이상 볼륨을 올릴 수 없습니다!";//변수 help에 더이상 볼륨을 올릴 수 없습니다!를 값으로 저장한다. 
		} else {//if조건을 만족하지 않는 경우라면
			k30_Vol++;//변수 Vol를 1 증가시킨다.
			k30_help = String.format("현재 볼륨은 %d입니다.", k30_Vol);//변수 help에 Vol를 string으로 형변환한 현재 볼륨은 %d입니다를 값으로 저장한다.
		}
	}
	
	void VolDn() {//VolDn이라는 함수 생성
		if(k30_Vol == k30_limit_down_Vol) {//만약 변수 floor가 최저볼륨인 limit_up_Vol와 같아진다면
			k30_help = "더이상 볼륨을 내릴 수 없습니다!";//변수 help에 더이상 볼륨을 내릴 수 없습니다!를 값으로 저장한다. 
		} else {//if조건을 만족하지 않는 경우라면
			k30_Vol--;//변수 Vol를 1 감소시킨다.
			k30_help = String.format("현재 볼륨은 %d입니다.", k30_Vol);
		}
	}
	
	void ChannelUp() {//ChannelUp이라는 함수 생성
		if(k30_Channel == k30_limit_up_Channel) {//만약 변수 floor가 최대채널인 limit_up_Vol와 같아진다면
			k30_help2 = "더이상 채널이 없습니다!";//변수 help에 더이상 채널이 없습니다!를 값으로 저장한다. 
		} else {//if조건을 만족하지 않는 경우라면
			k30_Channel++;//변수 Channel를 1 증가시킨다.
			k30_help2 = String.format("현재 채널은 %d번입니다.", k30_Channel);//변수 help에 Channel를 string으로 형변환한 현재 채널은 %d번입니다.를 값으로 저장한다. 
		}
	}
	
	void ChannelDn() {//ChannelUp이라는 함수 생성
		if(k30_Channel == k30_limit_down_Channel) {//만약 변수 floor가 최저채널인 limit_down_Vol와 같아진다면
			k30_help2 = "더이상 채널이 없습니다!";//변수 help에 더이상 채널이 없습니다!를 값으로 저장한다. 
		} else {//if조건을 만족하지 않는 경우라면
			k30_Channel--;//변수 Channel를 1 감소시킨다.
			k30_help2 = String.format("현재 채널은 %d번입니다.", k30_Channel);//변수 help에 Channel를 string으로 형변환한 현재 채널은 %d번입니다.를 값으로 저장한다. 
		}
	}
}

package test;

import model.Hammer;
import model.Spade;

public class TestTool {
	public static void main(String[] args) {
		/*	기존 제어방식
		 * 	어떤 작업을 수행하기 위해 Hammer 또는 Spade가 필요하다.
		 * 	필요시 생성해서 사용하는 것이 기존의 방식이ㅣ다.
		 * 	만약 Hammer에서 Spade로 도구를 변경하기 위해서는
		 * 	객체 생성부를 변경해야 한다.
		 * 	도구(의존 대상 객체)의 변경이 필요할 때 코드를 수정해야 하므로
		 * 	유지보수성이 낮다.
		 *  →	Spring Framework에서 지원하는 IOC Container를 이용해
		 *  유지보수성이 높은 프로그램으로 개선해 본다.
		 */
		//Hammer tool=new Hammer();		//첫번째 객체 Hammer 실행 후 두번째 객체인 Spade를 실행하기 위해서는
		Spade tool=new Spade();			//첫번째 객체 Hammer를 주석처리 해주어야 변경이 가능하다.
		tool.work();					//이것이 기존의 시스템 방식이다.
	}
}

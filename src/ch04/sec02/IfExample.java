/**
 * 
 */
package ch04.sec02;

/**
 * 
 */
public class IfExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 93;
		
		if (90 <= score) {
			
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
			
		}
		
		if (score < 90) {
			
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
			
		}
		
	} // main 끝

} // class 끝

/**
 * 
 */
package ch04.sec04;


/**
 * 
 */
public class FloatCounterExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// float형은 정확하게 소수점을 표현하지 못한다.
		for(float x = 0.1f; x <= 1.0f; x += 0.1f) {
			
			System.out.println(x);
			
		}
		
		
	} // main 끝

} // class 끝

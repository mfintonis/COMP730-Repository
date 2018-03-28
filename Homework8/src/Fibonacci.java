//Programmed by: Matthew Fintonis

public class Fibonacci {

	public int GetResultFromIndex(int index) {
		
		if(index <= 0) {
			return 0;			
		}
		
		if(index <= 2) {
			return 1;
		}
		
		return GetResultFromIndex(index - 1) + GetResultFromIndex(index - 2);
	}
	
}

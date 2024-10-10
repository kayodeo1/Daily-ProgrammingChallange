
public class palindromeChecker {
	
	public static boolean isPalindrome(String sentence) {
		
		int i,j;
		i=0;
		j=sentence.length()-1;
		while (i<j) {
			
			if (sentence.charAt(i)!=sentence.charAt(j)){
				return false;
				
			}
			i++;
			j--;
		}
		
		
		
		return true;
	}
		
		
		
		public static void main(String[] args) {
			System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
			
		}
		

	
}

package ch2projects;

public class example {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println(stringScramble("A is for Apple"));
			System.out.println(stringScramble("BA is for BApple And A"));
			
		}
		
		public static String stringScramble(String str){
			String newStr="";
			//Loop through the str and look for the letter A
			for(int i=0; i<str.length()-1; i++)
			{
				//Check to see if the current letter is an A. If A is the last letter, then just leave it.
				if(str.substring(i,i+1).equals("A")){
					newStr= newStr+str.substring(i+1, i+2)+str.substring(i, i+1);
					i++;
								
				}
				else{
					newStr=newStr+str.substring(i,i+1);
					
				}
				
			}
			
			return newStr+str.substring(str.length()-1);
		}

}

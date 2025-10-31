public class StringCaseToggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Mayur Kulkarni";
		char[] c = s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			if(c[i] >= 'A' && c[i] <='Z')
			{
				c[i] =  (char) (c[i]+32);
//				System.out.println(c[i]);
			}
			
			else if(c[i] >= 'a' && c[i] <='z')
			{
				c[i] = (char) (c[i]-32);
//				System.out.println(c[i]);
			}
			System.out.print(c[i]);
		}
		
	}

}
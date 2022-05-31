package Exercise3;

public class StringReplaceConsonants {
	static boolean isConsonants(char ch)
	{
		if(ch != 'a' && ch!='e'  && ch!='i' && ch!='o' && ch!='u') {
		return true;
			
		}
		return false;
	}
		static String alterString(char[] s)
		{
			for(int i = 0; i<s.length; i++) {
				if(! isConsonants(s[i])) {
					if(s[i]== 'z') {
						s[i] = 'b';
					}
					else {
						s[i] = (char)(s[i]+1);
						if(isConsonants(s[i])) {
							s[i] = (char) (s[i] +1);
						}
					}
				}
			}
			return null;
		}
	}
			
		
	

	



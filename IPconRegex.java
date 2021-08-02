import java.util.regex.Pattern;

public class IPconRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//127.0.0.1
		System.out.println(IPconRegex.isValidIp("127.0.0"));
		
	}

	public static boolean isValidIp (String ipAddress) {
		if(ipAddress == null || ipAddress.isEmpty()) {
			return false;
			
		}
		String digitRegEx = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	
		String ipRegEx = digitRegEx + "\\." +
			   
				digitRegEx + "\\." +
				digitRegEx + "\\." +
				digitRegEx;
		Pattern pattern = Pattern.compile(ipRegEx);
		return	pattern.matcher(ipAddress).matches();
	}


}
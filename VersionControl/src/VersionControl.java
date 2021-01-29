
public class VersionControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VersionControl obj = new VersionControl();
		obj.hello();
		System.out.println(obj.validatePassword("GreetingsFe11owKids"));


	}

	private void hello() {
		System.out.println("ECSE3038 - Engineering IoT Systems");
	}
	
	private boolean validatePassword(String password) {
		boolean valid = false;
		int checks = 0; //increment when an alphanumeric character is met
		int numChecks = 0; // increment when a number character is met
		
		// check if length is greater than or equal to 8
		if (password.length()>=8) {
			// check for alphanumeric characters and retrieve numeric count
			for ( int x = 0 ; x < password.length() ; x++) {
				if(password.charAt(x) < 127 && password.charAt(x) > 32)  // Alphanumeric range of the ASCII chart 31 - 126
					checks++;
				if(password.charAt(x) < 58 && password.charAt(x) > 47) // Numeric range of ASCII chart is 48 - 57
					numChecks++;
			}
			if(checks == password.length()) {
				// check for at least 2 numbers
				if(numChecks >= 2) 
					valid = true;
				 else 
					valid = false;	
			} else {
				valid = false;
			}
				
		} else {
			valid = false;
		}
		
		return valid;
	}
}

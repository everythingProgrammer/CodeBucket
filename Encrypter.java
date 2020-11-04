class Validator{
	public boolean validate(String name) {
		return true;
	}
}

class Enc2{
	public static void func() {
		Encrypter.getEncryptedName("Something");
	}
}

public class Encrypter {
	
	public static String getEncryptedName(String name) {
		String name2 = "";
		Validator obj = new Validator();
		if(obj.validate(name)) {
			for(int i = name.length() -1; i>= 0;i++) {
				name2 = name2+name.charAt(i);
				
			}
			name2 = name2.toLowerCase();
		}
		else {
			throw new IllegalArgumentException("Try again with valid name");
		}
		return name2;
	}
	
}

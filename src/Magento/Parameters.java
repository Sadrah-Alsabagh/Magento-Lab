package Magento;

import java.util.Random;

public class Parameters {
	static String url ="https://magento.softwaretestingboard.com";
	static String randomFirstName;
	static String randomLastName;
	static String password = "passWord01@";
	static String randomEmail;
    static {
        randomFirstName = generateRandomFirstName();
        randomLastName = generateRandomLastName();
        randomEmail = generateRandomEmail();
    }
	public static String generateRandomFirstName() {
        String[] firstNames = {"Sedra", "Elham", "Eslam", "Roua", "Yara"};
         randomFirstName = firstNames[new Random().nextInt(firstNames.length)];
        return  randomFirstName ;
    }

    public static String generateRandomLastName() {
        String[] lastNames = {"Mousa", "Yousef", "Amjad", "Moutaz", "Hasan"};
         randomLastName = lastNames[new Random().nextInt(lastNames.length)];
        return randomLastName;    }

    public static String generateRandomEmail() {
//        String firstName = generateRandomFirstName().toLowerCase();
//        String lastName = generateRandomLastName().toLowerCase();
        String domain = "gmail.com";
     return randomFirstName.toLowerCase() + randomLastName.toLowerCase() + "@" + domain;
    }
    
    
    public static String getRandomEmail() {
        return randomEmail;
    }
	public static void main(String[] args) {
System.out.print(randomEmail);
	}

}

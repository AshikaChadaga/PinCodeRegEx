package com.bridgelabz.pincoderegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeRegEx {

public static boolean checkValidPincode(String pinCode){
		
		String pinCodeRegex = "[0-9]{6}$";
		Pattern patternObject = Pattern.compile(pinCodeRegex);
		if (pinCode == null) {
            return false;
        }
        Matcher matcherObject = patternObject.matcher(pinCode);
        return matcherObject.matches();
	}

	public static void main(String[] args) {
		
		System.out.println("----- Welcome To Pin Code Validatior -----");
		
		String pinCode = "400088";
		boolean isPinCode = checkValidPincode(pinCode);
		
		if(isPinCode)
			System.out.println(pinCode+" is an Valid PinCode");
		else
			System.out.println(pinCode+" is an Invalid PinCode");
	}

}

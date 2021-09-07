package com.bridgelabz.pincoderegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeRegEx {

	public static void checkValidPincode(String pinCode){
		
		boolean isPinCode;
		String pinCodeRegex = "^[0-9]{3}\\s{0,1}[0-9]{3}$";
		Pattern patternObject = Pattern.compile(pinCodeRegex);
		if (pinCode == null) {
            isPinCode = false;
        }
        Matcher matcherObject = patternObject.matcher(pinCode);
        isPinCode =  matcherObject.matches();
        
        if(isPinCode)
			System.out.println(pinCode+" is an Valid PinCode");
		else
			System.out.println(pinCode+" is an Invalid PinCode");
	}

	public static void main(String[] args) {
		
		System.out.println("----- Welcome To Pin Code Validatior -----");
		
		String pinCode = "400088";
		checkValidPincode(pinCode);
		
		pinCode = "A400088";
		checkValidPincode(pinCode);
		
		pinCode = "400088B";
		checkValidPincode(pinCode);
		
		pinCode = "400 088";
		checkValidPincode(pinCode);
		
		pinCode = "400  088";
		checkValidPincode(pinCode);
		
		
	}

}

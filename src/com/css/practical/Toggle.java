package com.css.practical;

public class Toggle {
    String toggle(String string)
    {
        String tCaseStr = "";

        for(int i = 0; i < string.length(); i++)  {
            if(Character.isUpperCase(string.charAt(i)))  {
                tCaseStr +=  Character.toLowerCase(string.charAt(i));
            }
            else if(Character.isLowerCase(string.charAt(i))) {
                tCaseStr +=  Character.toUpperCase(string.charAt(i));
            }
            else {
                tCaseStr += string.charAt(i);
            }
        }
        return tCaseStr;
    }
}

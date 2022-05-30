package String.StringToRoman;

public class Main {
    String convertToRoman(int n) {
        String roman="";
        while(n>=1000)
        {
            roman+="M";
            n=n-1000;
        }

        if(n>=900)
        {
            roman+="CM";
            n=n-900;
        }

        while(n>=500)
        {
            roman+="D";
            n=n-500;
        }
        if(n >= 400){
            roman = roman + "CD";
            n= n - 400;

        }
        while(n>=100)
        {
            roman+="C";
            n=n-100;
        }

        if(n >= 90){
            roman = roman + "XC";
            n = n - 90;
        }
        while(n>=50)
        {
            roman+="L";
            n=n-50;

        }
        if(n >= 40){
            roman = roman + "XL";
            n = n- 40;
        }
        while(n>=10)
        {
            roman+="X";
            n=n-10;
        }
        if(n == 9){
            roman = roman + "IX";
            n = n - 9;
        }

        while(n>=5)
        {
            roman+="V";
            n=n-5;
        }

        if(n == 4)
        {
            roman = roman + "IV";
            n = n - 4;
        }

        while(n>=1)
        {
            roman=roman+"I";
            n=n-1;
        }
        return roman;
    }
}

package com.e.converter_dibash;

public class NumbertoWord {
    private int num;
    private int x, y, z;
    private String word;

    private final String[] numnames={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven",
            "Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private final String[] tensname={"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};



    public NumbertoWord(int num) {
        this.num = num;
    }

    public String NumbertoWord(){
        if (num<20){
            word =(numnames[num]);
        }
        else if ((num/10)<10){
            int a,b;
            a= num/10;

            b= num%10;

            word= (tensname[a]+numnames[b]);

        }
        else if ((num/10)>=10){
            int a,b,c;
            String hundreds,tens,ones;
            a=num/100;
            num = num%100;
            b=num/10;
            c=num%10;

            hundreds= numnames[a]+" Hundred ";
            tens= tensname[b];
            ones= numnames[c];
            word=(hundreds+tens+ones);
        }
        return word;
    }

}
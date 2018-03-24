public class Solution11 {
    public double Power(double base, int exponent) {
        if(equals(base,0.0)&&exponent < 0){
            return 0.0;
        }
        if(equals(base,0.0) && exponent == 0){
            return 1.0;
        }
        int newExponent = exponent;
        if(exponent < 0){
            newExponent = -newExponent;
        }
        double result = calPower(base,newExponent);
        if(exponent < 0){
            result = 1.0/result;
        }
        return result;
    }
    public double calPower(double base,int exponent){
        if(exponent == 1) return base;
        if(exponent == 0) return 1.0;
        double result = calPower(base,exponent >> 1);
        result *= result;
        if(exponent %2 == 1){
            result *= base;
        }
        return result;
    }
    public boolean equals(double a,double b){
        if(a-b < 0.00000001 && a-b > -0.00000001){
            return true;
        }
        return false;
    }
}
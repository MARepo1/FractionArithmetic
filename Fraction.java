/**
 * Code Template Authors: Dr. Stephen Roehrig and David G. Cooper
 * In collbaration with Luke
 * I was confused on how to add fractions, so I found an online video to see the logic on how it was done.
 * Link to Source: https://www.youtube.com/watch?v=9N02GU_BVxs //Video Timestamp: 4:28
 * Submission Author: Muhammad Amer
 * Date: 9/25/2022
 * Purpose: An object for holding and adding fractions
 */
public class Fraction {
    private int numerator;
    private int denominator;
    
    public Fraction(int n, int d) {
        int gcd = gcd(n,d);
        
        this.numerator = n;
        this.denominator = d;
        
         if(denominator < 0){
            numerator = (n / gcd) * -1;
            denominator = (d / gcd) * -1;   
         }
         else{
            numerator = n / gcd;
            denominator = d / gcd;
         
         }
    }
    // greatest common divisor:
    public static int gcd(int a, int b) { 
        if (b == 0) {
            return (a);
        } else {
            return (gcd(b, a % b));
        }
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public String toDecimal() {
        double doubleDecimal = (double)numerator / denominator;
        String decimal = Double.toString(doubleDecimal);
        
        return decimal;
    }

    public Fraction add(Fraction f) {
        int fracOne = numerator * f.denominator;
        int fracTwo = f.numerator * denominator;
        int num = fracOne + fracTwo;
        int denom = denominator * f.denominator;
        
        
      
        int gcd = gcd(num, denom);
        
        num = num / gcd;
        denom = denom / gcd;
        
        
        Fraction result = new Fraction(num,denom);
        
        
        return result;
    }
}

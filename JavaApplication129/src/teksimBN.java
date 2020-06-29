
import java.util.Random;
import java.util.Scanner;


public class teksimBN {

    public static void main(String[] args) {
        Scanner fe = new Scanner (System.in);
        System.out.println("How many darts do you want in each trials?");
        int darts = fe.nextInt();
        for(int i = 0; i < darts; i++){
            xVal(darts);
            yVal(darts);
            hits(darts);
            System.out.println(piCalc(darts));
        }
    }
    
    public static double [] xVal(int darts){
        double [] xVal = new double [darts];
        Random random = new Random();
        for (int i = 0; i < darts; i++){
            xVal[i] = -1 + random.nextDouble()*2;
        }
        return xVal;
    }
    
    public static double [] yVal(int darts){
        double [] yVal = new double[darts];
        Random random = new Random();
        for (int i = 0; i < darts; i++){
            yVal[i] = -1 + random.nextDouble()*2;
    }
        return yVal;
    }
    
    public static int hits (int darts){
        int hits = 0;
        double [] xVal = xVal(darts);
        double [] yVal = yVal(darts);
        for (int i = 0; i < darts; i++){
            if((Math.pow(xVal[i], 2) + Math.pow(yVal[i], 2)) <= 1){
                hits++;
            }
        }
        return hits;
    }
    
    public static double piCalc(int darts){
        double hits = hits(darts);
        double pi = (hits/darts) * 4;
        return pi;
    }
    
}

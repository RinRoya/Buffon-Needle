/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuffonNeedle;

/**
 *
 * @author OWNER
 */
public class AlgoritmaBuffonNeedle {

    public String SolveBN(double d, double l, double Nr) {
        int Ni = 0;
        double r1, r2, a, theta,P;
        for (int i = 0; i < Nr; i++) {
            r1 = Math.random();
            r2 = Math.random();
            a = r1 * d / 2;
            theta = r2 * Math.PI;
            if (a <= l * Math.sin(theta) / 2) {
                Ni++;
            }
        }
        P=Ni/Nr*100;
        return String.format("%.2f",P).replace(",", ".")+" %";
    }
    public static void main(String[] args) {
//        System.out.println(SolveBN(20,10,3000));
    }
}

package chrisg.Numerics;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num = key.next();

        try {
            if (Integer.MIN_VALUE < Integer.parseInt(num) && Integer.parseInt(num) < Integer.MAX_VALUE) {
                System.out.println(Integer.TYPE);
            }
        } catch (Exception e){
            try {
                if (Byte.MIN_VALUE < Integer.parseInt(num) && Integer.parseInt(num) < Byte.MAX_VALUE) {
                    System.out.println(Byte.TYPE);

                }
            } catch (Exception ex){
                try {
                    if (Long.MIN_VALUE < Integer.parseInt(num) && Integer.parseInt(num) < Long.MAX_VALUE) {
                        System.out.println(Long.TYPE);
                    }
                } catch (Exception exc){
                    System.out.println("Answer is not a number.");
                }
            }
        }



    }
}

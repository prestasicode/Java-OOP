
package Clock;

import java.util.Scanner;

public class Clock {
    
    public static void main (String [] args) {
        //Meminta inputan jumlah pelanggan
        Scanner input = new Scanner ( System.in);
        System.out.print("\nMasukkan jumlah pelanggan : ");
        int cust = input.nextInt();
        
        System.out.println("Clock"+"\t\t"+"Time"+"\t\t"+"Event"+"\t\t"+"No. System");
        
        int [] tiba = new int [cust];
        int [] layani = new int [cust];
        int [] selesai = new int [cust];
        int [] fix = new int [cust];
        
        int sistem = 1;
        int clock = 1;
        
        for ( int i = 0; i < cust ; i++) {
            tiba [i] = (int)(Math.random()*20);
            layani [i] = (int) (Math.random()*5);
        } 
        
        
        for ( int i = 1; i < cust ; i++) {
            tiba [i] = tiba [i-1] + tiba[i];
            
        }
        
        for ( int i =0; i< cust ; i++) {
            if ( sistem == 1) {
                fix [i] = tiba [i];
            } else {
                fix [i] = selesai [i-1];
            }
            
            selesai [i] = fix [i] + layani [i];
        }
        
        //inisialisasi clock
        
        System.out.println(clock+"\t\t"+tiba[0]+"\t\t"+"t1"+"\t\t"+sistem);
            
        if ( fix [0] != tiba [0]) {
            clock++;
            System.out.println(clock+"\t\t"+fix[0]+"\t\t"+"b1"+"\t\t"+sistem);  
        } else {
            System.out.println(" "+"\t\t"+fix[0]+"\t\t"+"b1"+"\t\t"+sistem); 
        }
        
        
        if ( selesai [0] != fix [0]) {
            clock++;
            sistem--;
            System.out.println(clock+"\t\t"+selesai[0]+"\t\t"+"c1"+"\t\t"+sistem);  
        } else {
             sistem--;
            System.out.println(" "+"\t\t"+selesai[0]+"\t\t"+"c1"+"\t\t"+sistem);
           
        }
        
        for (int i = 1; i< cust; i++) {
            if ( tiba[i] != selesai [i]) { //
                clock++;
                sistem++;
                System.out.println(clock+"\t\t"+tiba[i]+"\t\t"+"t"+(i+1)+"\t\t"+sistem);
            } else {
                sistem++;
                System.out.println(" "+"\t\t"+tiba[i]+"\t\t"+"t"+(i+1)+"\t\t"+sistem);
                
            }
            
            if ( fix[i] != tiba[i]) {
                clock++;
                System.out.println(clock+"\t\t"+fix[i]+"\t\t"+"b"+(i+1)+"\t\t"+sistem);
            } else {
                sistem++;
                System.out.println(" "+"\t\t"+fix[i]+"\t\t"+"b"+(i+1)+"\t\t"+sistem);
            }
            
            if ( selesai [i] != fix [i]) {
            clock++;
            sistem--;
            System.out.println(clock+"\t\t"+selesai[i]+"\t\t"+"c"+(i+1)+"\t\t"+sistem);  
        } else {
            sistem--;
            System.out.println(" "+"\t\t"+selesai[i]+"\t\t"+"c"+(i+1)+"\t\t"+sistem);
            
        }
        }
        
        
        
    }

    
    
    }

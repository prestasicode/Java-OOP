
package javaapplication130;
import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ASUS_X200M
 */
public class JavaApplication130 {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
            int      N = 0, //JUMLAH  KASTAMER YANG DILAYANI
                     T = 0, //WAKTU KEDATANGAN KASTAMER 
                     K = 0, //JUMLAH SEMUA KASTAMER 
                     Ti = 0; //INDEKS
            double   TN = 0 ; 
       
              
        int[] arrivetime = new int[500], //Waktu kedatangan
            servicetime = new int[500], //Waktu pelayanan
            banyakpelanggan = new int [500],
            c = new int[500],
            b = new int[500],
            t = new int[500],
            Wait = new int[500]; //Waktu menunggu sampai kedatangan selanjutnya
        
       
        System.out.println("\t\t\t\tPROGRAM ANALISA");
        System.out.println("RATA2 JUMLAH PELANGGAN DALAM SISTEM  & RATA2 WAKTU PELANGGAN DALAM SISTEM ");
        System.out.print("WAKTU MAKS SIMULASI (BEBAS) : ");
        double Tmaks = input.nextDouble(); 
        System.out.println("WAKTU KEDATANGAN");
        System.out.print("Batas Bawah Interval Waktu Kedatangan  :  ");
        double lowerrangearr = input.nextDouble();
        System.out.print("Batas Atas Interval Waktu Kedatangan :  ");
        double upperrangearr = input.nextDouble();
        System.out.println("");
        System.out.println("LAMA SIMULASI");
        System.out.print("Batas Bawah Interval Lama Simulasi  :  ");
        double lowerrangeser = input.nextDouble();
        System.out.print("Batas Atas Interval Lama Simulasi :  ");
        double upperrangeser = input.nextDouble();
         
       
        
        
      
        for (int i=0; i<500; i++){
            //arrivetime[i] = (int)(Math.round(1*(Math.random())+1));
            arrivetime[i] = (int) (Math.random()*(upperrangearr-lowerrangearr)+ lowerrangearr);
            //servicetime[i] = (int) (Math.round(1*Math.random()+1));   
            servicetime[i] = (int) (Math.random()*(upperrangeser-lowerrangeser) + lowerrangeser);
            //banyak pelanggan
            
        }
        
        while (arrivetime[Ti]<Tmaks){ 
            if(arrivetime[Ti+1] <= arrivetime[Ti]+servicetime[Ti]){ 
                TN = TN + (arrivetime[Ti]-T)*N;
                T = arrivetime[Ti];
                N=N+1;
                K++;
                
                //arrivetime[Ti + 1] = T + (int)(Math.round(1*Math.random()+1));
                arrivetime[Ti + 1] = T + (int) (Math.random()*(upperrangearr-lowerrangearr) + lowerrangearr); 
                banyakpelanggan[Ti] = N;
                //membuat random range 5 -- 15
         
                if (N==1){
                    //servicetime [Ti +1] = T + (int)(Math.round(1*Math.random()+1));
                    servicetime [Ti +1] = T + (int) (Math.random()*(upperrangeser-lowerrangeser) + lowerrangeser);
                   
                //membuat random range 6 -- 20
                }}
//                int C = 0;
//      banyakpelanggan[1] = 1;
//      if (arrivetime[Ti+1] <= arrivetime[Ti]+servicetime[Ti]) {
//          banyakpelanggan [Ti] = C+1;    
//      }
//      else if(arrivetime[Ti+1] > arrivetime[Ti]+servicetime[Ti]){
//          banyakpelanggan [Ti] = C;
//      }
                
            else{
                TN = TN + (servicetime[Ti]-T)*N;
                T = servicetime[Ti];
                N = N-1;
                banyakpelanggan [Ti] = N-1;
                
                if (N==0){
                    //servicetime [Ti +1] = T + (int)(Math.round(1*Math.random()+1));
                    servicetime [Ti +1] = T + (int) (Math.random()*(upperrangeser-lowerrangeser) + lowerrangeser);
            }

            if (Tmaks>500){
                System.out.println("Waktu Maksimal melebihi batas");
            }
            }
            
        Wait [Ti] = arrivetime [Ti +1] - arrivetime [Ti];
        Ti++;
        }
        
       
        System.out.println("==================================================TABEL SIMULASI================================================");
        System.out.println("TIME\t\tARRIVE TIME\t\tWAIT UNTIL NEXT CUSTOMERS\t\t SERVICE TIME\t\tCUSTOMER");
        for (int i=0; i<Ti; i++){
            System.out.println("    "+(i+1)+"\t\t\t"+arrivetime[i]+"\t\t\t"+Wait[i]+
                    "\t\t\t\t\t"+servicetime[i]+"\t\t"+banyakpelanggan[i]); }
        //HITUNG
        System.out.println("");
        System.out.println("n = " + TN/T);
        System.out.println("w = " + Math.floor((TN/K)*100)/100);
    }
    
}

    
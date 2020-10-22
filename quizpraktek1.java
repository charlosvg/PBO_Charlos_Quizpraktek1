import java.util.Scanner;

public class quizpraktek1{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int bayar,totalharga,harga = 0; 
		int kembalian,jumlah;
		int m,M,k,K,l,L = 0;
		String nama;
		char tipe,merek;
		boolean loop = true;
		
		bayar=0;	
		System.out.print("Silahkan Masukkan Nama Anda : ");
		nama = input.nextLine();
		
	    System.out.println("Merk :      Tipe  :      Harga ");
		System.out.println("G           Meja(M)      Rp.  95.000 ");
		System.out.println("            Kursi(K)     Rp. 125.000 ");
		System.out.println("            Lemari(L)    Rp. 450.000 ");
		System.out.println();
		System.out.println("O           Meja(M)      Rp. 115.000 ");
		System.out.println("            Kursi(K)     Rp. 135.000 ");
		System.out.println("            Lemari(L)    Rp. 550.000 ");
		
		System.out.print("Masukkan Merek : ");
		merek = input.next().charAt(0);
		while(loop){
		System.out.print("Masukkan tipe : ");
		
        tipe = input.next().charAt(0);
		

		 switch(tipe)
		 {
		 	case 'm':
            case 'M'  :
               if (merek =='G')
               {harga = 95000;
               }
               else {harga = 115000;
               }
                loop = false;
                break;
           case 'k':     
           case 'K' :
               if (merek =='G')
               {harga = 125000;
               }
               else {harga = 135000;
               }
                loop = false;
                break;
                
		   case 'l':
           case 'L'  :
               if (merek =='G')
               {harga = 450000;
               }
               else {harga = 550000;
               }
                loop = false;
                break;
                        
           
               default :
                System.out.println("Pilihan salah atau tidak ada, mohon input ulang");
               
                
        }
        
	  
	}
	
       System.out.println("Masukkan Jumlah Pesanan : ");
       jumlah = input.nextInt();
       totalharga = jumlah*harga;
       System.out.println("Total Harga : Rp. "+totalharga);
       
		while(bayar<totalharga){
		System.out.print("Masukkan Jumlah Bayaran = Rp."); 
		bayar = input.nextInt();
			if (bayar > totalharga){
				kembalian=bayar-totalharga;
			}
			else if (bayar<totalharga){
				System.out.println("Mohon Maaf Uang Anda Kurang");
			}
		}
	   
	   kembalian = bayar - totalharga;
	   
	   System.out.println("------------------------------");
	   System.out.println("Berikut Adalah Data Pembelian");
	   System.out.println("Nama        : "+nama );
	   System.out.println("Total Harga : Rp."+totalharga);
	   System.out.println("Bayar       : Rp."+bayar);
	   System.out.println("Kembalian   : Rp."+kembalian);
	    
	   
	    	
		
				
	}
}
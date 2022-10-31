package switchExample;

import javax.swing.JOptionPane;

public class switchExp {

	public static void main(String[] args) {
		String string =JOptionPane.showInputDialog(null,"Ayı tam sayı olarak gir :","Girilecek Ay",
				JOptionPane.INFORMATION_MESSAGE );
		int int1=Integer.parseInt(string);
			System.out.println("Girilen Ay="+int1);
			
			String Yil = JOptionPane.showInputDialog(null,"Yılı tam sayı olarak gir:", "Artık yıl mı?",
					JOptionPane.QUESTION_MESSAGE);
			
			int int2 =Integer.parseInt(Yil);
			System.out.println("Girilen yıl= " +int2);
			
			int AyinGunSayisi =AyinGunSayisi(int1,int2);
			System.out.println("Girilen ayın gün sayısı :" + AyinGunSayisi);
			

	}
	
	static int AyinGunSayisi(int Ay,int yil) 
	{
	    switch(Ay) 
	    {
	    case 4 :
	    case 6 :
	    case 9 :
	    case 11: return 30;
	    case 2 :{
	    	if (yil % 4 ==0) 
	    	{ 
	    		return 29;
	    	}
	    else
	    {
	    	return 28 ;
	    	}
	    	}
	    default :return 31;
	    }	
		
	}
	

}

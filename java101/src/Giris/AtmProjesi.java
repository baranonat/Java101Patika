package Giris;

import java.util.Scanner;

public class AtmProjesi {

	public static void main(String[] args) {
		
		
		
		
		
		String kullaniciAdi,password;
		int right=3;
		int select = 0;
		int balance=1500;
		int para=0;
		Scanner input =new Scanner(System.in);
		
		
		while(right>0) {
			System.out.print("Kullanıcı Adınızı Giriniz: ");
			kullaniciAdi=input.nextLine();
			System.out.print("Şifrenizi Giriniz: ");
			password=input.nextLine();
			if(kullaniciAdi.equals("baran") && password.equals("onat")) {
				 System.out.println("Akbank bankasına başarıyla giriş yaptınız!\n");
				 while(select!=4) {
					 System.out.println("1-Para Ekleme\n"+
								"2-Para Çekme\n"+
								"3-Bakiye Sorgulama\n"+
								"4-Çıkış\n");
						System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
						select=input.nextInt();
						if(select==1) {
							
							System.out.print("Eklemek istediğiniz para miktarı: ");
							para=input.nextInt();
							balance+=para;
							System.out.println(para + " Tl hesabınıza eklenmiştir.");
						}
						else if(select==2) {
							System.out.print("Çekmek istediğiniz para miktarı: ");
							para=input.nextInt();
							if(para>balance) {
								System.out.println("Hesabınızda para yeterli değildir");
							}else {
								
								balance-=para;
								System.out.println(para + " Tl hesabınızdan çekilmiştir.");
							}
							
						}
						else if(select==3) {
							System.out.println("Bakiyeniz: "+balance);
					
							
						}
						else if(select==4) {
							System.out.println("Çıkış Yapıldı..");
							
						}
						else {
							System.out.println("Lütfen doğru rakam giriniz!!!");
						}
						
				 }
				break;
			}else {
				right--;
				System.out.println("Kullanıcı adı veya şifreniz yanlış! Kalan hakkınız "+right);
			}
			if(right==0) {
				System.out.println("Hesabınız bloke olmuştur.Lütfen Tekrar deneyiniz.");
			}

		}
		

		
		
		
		
		
		
		
		
	}

}

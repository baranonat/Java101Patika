package Giris;


import java.util.Random;
import java.util.Scanner;



public class MineSweeper {

	
	int rowNumber;
	int colNumber;
	String map[][];
	String board[][];
	int mine;
	
	
	
	
	
	public MineSweeper(int rowNumber,int colNumber) {
		
		this.rowNumber=rowNumber;
		this.colNumber=colNumber;
		this.map=new String[rowNumber][colNumber];
		this.board=new String[rowNumber][colNumber];
		this.mine=(rowNumber*colNumber)/4;

		
	}
	void printBoard() {
		for(int i=0; i<rowNumber; i++) {
			for(int j=0; j<colNumber; j++) {
				System.out.print(this.board[i][j]="-"+ " ");
			}
			System.out.println();
		}
	}
	
	
	void run() {
		System.out.println("Mayınların Konumu:");
		printMap();
		System.out.println("Mayın Tarlasına Hoşgeldiniz!!!");
		printBoard();
		Scanner input=new Scanner(System.in);
		int row,col,right=(rowNumber*colNumber)-(this.mine);
		
		while(right>0) {
			 System.out.print("Satır Giriniz:");
			 row=input.nextInt();
			 System.out.print("Sütun Giriniz:");
			 col=input.nextInt();
			 if( (row<0 || row>=rowNumber) || (col<0 || col>=  colNumber) ) {
				 System.out.println("Lütfen doğru koordinatları giriniz!!!");
				 continue;
			 }
			 if(map[row][col]=="*") {
				 System.out.println("Game Over...");
				 break;
			 }
			 if(map[row][col]!="-") {
				 System.out.println("Aynı koordinatları girdiniz!!");
				 continue;
			 }
			 else {
				 int point=0;
				 int minRow =(row-1),highRow=(row+1);
				 int minCol=(col-1),highCol=(col+1);
				 if( (minRow<0) ) {
					 minRow=0;
				 }
				 if(highRow>=rowNumber) {
					 highRow=row;
				 }
				 if( (minCol<0) ) {
					 minCol=0;
				 }
				 if(highCol>=colNumber) {
					 highCol=col;
				 }
				 for(int i=minRow; i<=highRow; i++) {
					 for(int j=minCol; j<=highCol; j++) {
						 if(map[i][j]=="*") {
							 point++;
						 }
					 }
				 }
				 String pointCounter=Integer.toString(point);
				 map[row][col]=pointCounter;
				 right--;
				 for(int i=0; i<rowNumber; i++) {
					 for(int j=0; j<colNumber; j++) {
						 System.out.print(map[i][j]+" ");
					 }
					 System.out.println();
				 }
				 
				
			}
			 
			 
			 
			 
			 if(right==0) {
				 System.out.println("Oyunu Kazandınız!!!!");
				 break;
			 }
			 
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	void produceMine() {
		
		Random rand=new Random();
		
		for(int i=0; i<this.mine; i++) {
			int rndRow=rand.nextInt(rowNumber);
			int rndCol=rand.nextInt(colNumber);
			if(map[rndRow][rndCol]!="*") {
				map[rndRow][rndCol]="*";
			}
			else {
				i--;
			}
		}
		for(int i=0; i<rowNumber; i++) {
			for(int j=0; j<colNumber; j++) {
				if(map[i][j]!="*") {
					map[i][j]="-";
				}
			}
		}
		
	
		
		
	}
	
	void printMap() {
		produceMine();
		for(int i=0; i<rowNumber; i++) {
			for(int j=0; j<colNumber; j++) {
				System.out.print(this.map[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class main {

	static char[] chars = {
	        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
	        'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
	        'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
	        'y', 'z', '0', '1', '2', '3', '4', '5',
	        '6', '7', '8', '9', 'A', 'B', 'C', 'D',
	        'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
	        'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
	        'U', 'V', 'W', 'X', 'Y', 'Z', '!', '@',
	        '#', '$', '%', '^', '&', '(', ')', '+',
	        '-', '*', '/', '[', ']', '{', '}', '=',
	        '<', '>', '?', '_', '"', '.', ',', ' '
	    };
	
	static int i = 0;
	
	public static void main (String[] args) throws IOException
	{
		
		Scanner sc = new Scanner(System.in);
		int value ;

		
		System.out.println("Select Option to Data Encryption and decryption");
		
		
		while (i==0)
		{

			
			System.out.println("\nSelect Option to Data Encryption and decryption");
			
			System.out.println("\n 1 .Encrypt my mission data  ");
			
			System.out.println("\n 2 .Decrypt my misson data ");
			
			System.out.println("\n 3. Exit  ");

			
			value = sc.nextInt();
			
			switch(value)
			{
			case 1 :
				dataencryption();
				break;
			case 2 :
				datadecryption();
				break;
			case 3 :
				System.exit(0);
				
			default :
				System.out.println("\nInvalid selection");
			}

		}
		
		
	}
	
	public static void dataencryption() throws IOException
	{
		 File f2 = new File("JOHNSON.txt");
		  f2.createNewFile();
		  FileWriter writer = new FileWriter(f2); 
		  
		  
		  BufferedWriter buffer = new BufferedWriter(writer);  
	        String text = "Johnson 	Khristi !\n" + 
	        		"infiltration \n" + 
	        		"Sweden \n" + 
	        		"25/11/2017 \n" + 
	        		"\n"  
	        		;
	        int offset = 0;
	        
	        String enc = encrypt(text, offset);
	        System.out.println("Encrypted text: \n" + enc);
	        System.out.println(enc.length());

	        
	        buffer.write(enc); 
	        buffer.close();  
	        System.out.println("Data is encrypted ");  
	        
	}
	
	// Encryption Method
	
	 static String encrypt(String text, int offset)
	 
	    {
		 
		 
		 StringBuilder s = new StringBuilder(text.length());

		 CharacterIterator it = new StringCharacterIterator(text);
		 for (char ch = it.first(); ch != CharacterIterator.DONE; ch = it.next()) {
		     switch (ch) {
		         case 'a' :
		         case 'A' :
		             s.append("2");
		             s.append(".");

		             break;
		         case 'b':
		         case 'B':
		             s.append("3");
		             s.append(".");


		             break;
		         case 'c' :
		         case 'C' :
		             s.append("5");
		             s.append(".");

		             break;
		         case 'd':
		         case 'D':
		             s.append("7");
		             s.append(".");

		             break;
		         case 'e' :
		         case 'E' :
		             s.append("11");
		             s.append(".");

		             break;
		         case 'f':
		         case 'F':
		             s.append("13");
		             s.append(".");

		             break;
		         case 'g' :
		         case 'G' :
		             s.append("17");
		             s.append(".");

		             break;
		         case 'h':
		         case 'H':
		             s.append("19");
		             s.append(".");

		             break;
		         case 'i' :
		         case 'I' :
		             s.append("23");
		             s.append(".");

		             break;
		         case 'j':
		         case 'J':
		             s.append("29");
		             s.append(".");
		             break;
		         case 'k' :
		         case 'K' :
		             s.append("31");
		             s.append(".");

		             break;
		         case 'l':
		         case 'L':
		             s.append("37");
		             s.append(".");

		             break;
		         case 'm' :
		         case 'M' :
		             s.append("41");
		             s.append(".");

		             break;
		         case 'n':
		         case 'N':
		             s.append("47");
		             s.append(".");

		             break;
		         case 'o' :
		         case 'O' :
		             s.append("53");
		             s.append(".");

		             break;
		         case 'p':
		         case 'P':
		             s.append("59");
		             s.append(".");

		             break;
		         case 'q' :
		         case 'Q' :
		             s.append("61");
		             s.append(".");

		             break;
		         case 'r':
		         case 'R':
		             s.append("67");
		             s.append(".");

		             break;
		         case 's' :
		         case 'S' :
		             s.append("71");
		             s.append(".");

		             break;
		         case 't':
		         case 'T':
		             s.append("73");
		             s.append(".");

		             break;
		         case 'u' :
		         case 'U' :
		             s.append("79");
		             s.append(".");

		             break;
		         case 'v':
		         case 'V':
		             s.append("83");
		             s.append(".");

		             break;
		         case 'w' :
		         case 'W' :
		             s.append("89");
		             s.append(".");

		             break;
		         case 'x':
		         case 'X':
		             s.append("97");
		             s.append(".");

		             break;
		         case 'y':
		         case 'Y':
		             s.append("101");
		             s.append(".");
		             break;
		         case 'z':
		         case 'Z':
		             s.append("103");
		             s.append(".");

		             break;
		         case '1':
		             s.append("A");
		             s.append(".");

		             break;
		         case '2':
		             s.append("C");
		             s.append(".");

		             break;
		         case '3':
		             s.append("E");
		             s.append(".");

		             break;
		         case '4':
		             s.append("G");
		             s.append(".");

		             break;
		         case '5':
		             s.append("I");
		             s.append(".");

		             break;
		         case '6':
		             s.append("K");
		             s.append(".");

		             break;
		         case '7':
		             s.append("M");
		             s.append(".");

		             break;
		         case '8':
		             s.append("O");
		             s.append(".");

		             break;
		         case '9':
		             s.append("Q");
		             s.append(".");

		             break;
		         case '0':
		             s.append("S");
		             s.append(".");

		             break;
		         case '/':
		             s.append("@");
		             s.append(".");

		             break;
		         default:
		             s.append("#");
		             s.append(".");

		             break;
		     }
		 }

		 text = s.toString();
		 
	        char[] plain = text.toCharArray();
	       
	        

	        for (int i = 0; i < plain.length; i++) {
	            for (int j = 0; j < chars.length; j++) {
	                if (j <= chars.length - offset) {
	                	
	                    if (plain[i] == chars[j]) {
	                        plain[i] = chars[j + offset];
	                        break;
	                    }
	                } 
	                else if (plain[i] == chars[j]) {
	                    plain[i] = chars[j - (chars.length - offset + 1)];
	                }
	            }
	        }
	        return String.valueOf(plain);
	    }
	 

	// Decryption methods 
	 
	 public static void datadecryption() throws IOException {
		 
			FileReader file = new FileReader("JOHNSON.txt");
	    	BufferedReader reader = new BufferedReader(file);
	    	String text = "";
	    	String line = reader.readLine();
	    	while(line != null)
	    	{
	    		text += line;
	    		line = reader.readLine();
	    		
	    	}
	    	
	    //	System.out.println(text);

	        int offset = 0;  
	       
	        
	        String dec = decrypt(text, offset);
	        System.out.println("\n Decrypted text: \n" + dec);
	        reader.close();
			// TODO Auto-generated method stub
	        
	        
	        File fileout = new File("descyption.txt");
	        fileout.createNewFile();
	        FileWriter write = new FileWriter(fileout);
	        BufferedWriter bufferwrite = new BufferedWriter(write);
	        bufferwrite.write(dec);
	        bufferwrite.close();
	 }
	 
	 static String decrypt(String cip, int offset)
	    {

		 
		 StringBuilder s = new StringBuilder(cip.length());
		 
		 List<String> list = new ArrayList<String>();
		 
		 

		 StringTokenizer token = new StringTokenizer(cip, ".");
		 
		 

			while (token.hasMoreTokens()) {
			
			
					list.add(token.nextToken());
				 
			}
	    
		 for (int k =0 ; k<=list.size()-1;k++)
		 {
			 String temp = "";
			 
			 temp = list.get(k).toString();
			 
			 switch (temp) {
	         case "2" :
	             s.append("A");
	             break;
	             
	         case "3":
	             s.append("B");
	             break;
	         case "5":
	             s.append("C");
	             break;
	         case "7":
	             s.append("D");
	             break;
	         case "11":
	             s.append("E");
	             break;
	         case "13":
	             s.append("F");
	             break;
	         case "17":
	             s.append("G");
	             break;
	         case "19":
	             s.append("H");
	             break;
	         case "23":
	             s.append("I");
	             break;
	         case "29":
	             s.append("J");
	             break;
	         case "31":
	             s.append("K");
	             break;
	             case "37":
		             s.append("L");
		             break;
		             case "41":
			             s.append("M");
			             break;
		             case "47":
			             s.append("N");
			             break;
		             case "53":
			             s.append("0");
			             break;
		             case "59":
			             s.append("P");
			             break;
		             case "61":
			             s.append("Q");
			            
			           break;
		             case "67":
			             s.append("R");
			             break;
		             case "71":
			             s.append("S");
			             break;
		             case "73":
			             s.append("T");
			             break;
		             case "79":
			             s.append("U");
			             break;
		             case "83":
			             s.append("V");
			             break;
		             case "89":
			             s.append("W");
			             break;
		             case "97":
			             s.append("X");
			             break;
		             case "101":
			             s.append("Y");
			             break;
		             case "A":
			             s.append("1");
			             break;
		             case "C":
			             s.append("2");
			             break;
		             case "E":
			             s.append("3");
			             break;
		             case "G":
			             s.append("4");
			             break;
		             case "I":
			             s.append("5");
			             break;
		             case "K":
			             s.append("6");
			             break;
		             case "M":
			             s.append("7");
			             break;
		             case "O":
			             s.append("8");
			             break;
		             case "Q":
			             s.append("9");
			             break;
		             case "S":
			             s.append("0");
			             break;
		             case "@":
			             s.append("/");
			             break;
			             
	         default:
	             s.append(" ");

	             break;

		 }
		 }
		 cip = s.toString();
		 

		 
	        char[] cipher = cip.toCharArray();
	        
	        
	        for (int i = 0; i < cipher.length; i++) {
	            for (int j = 0; j < chars.length; j++) {
	                if (j >= offset && cipher[i] == chars[j]) {
	                    cipher[i] = chars[j - offset];
	                    break;
	                }
	                if (cipher[i] == chars[j] && j < offset) {
	                    cipher[i] = chars[(chars.length - offset +1) + j];
	                    break;
	                }
	            }
	        }
	        return String.valueOf(cipher);
	    }
	
}

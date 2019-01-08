package test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class xlambton {
	public static String t_id;
	public static String date_from;
	public static String date_to;
	public static String[] agents;
	public static String[] team_agents;
	public static int t=0;
	public static int s=0;
	public static int value;
	public static String dec = "";
    
	static StringBuilder str = new StringBuilder();

    public static Scanner sc ;
    public static Scanner sc1 ;

static char[] chars = {
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
        'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
        'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
        'y', 'z', '0', '1', '2', '3', '4', '5',
        '6', '7', '8', '9', 'A', 'B', 'C', 'D',
        'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
        'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
        'U', 'V', 'W', 'X', 'Y', 'Z', '@',
        '#', '$', '%', '^', '&', '(', ')', '+',
        '-', '*', '/', '[', ']', '{', '}', '=',
        '<', '>', '?', '_', '"', '.', ',', ' '
    };
		public static void main(String ar[]) throws IOException
		{
			
			System.out.println("##### Welcome to Agent Portal #####\n");
			System.out.println("###################");
			System.out.println("#   Agents List   #");
			System.out.println("###################\n");
			System.out.println("   Agent Name   |   Mission   |   Country   |   Date   |   Team\n");
			
			
			try
			{
			 sc = new Scanner(System.in);
		
			
			File file = new File("Secret" + ".txt");
			
			
			if(!file.exists())
			{
				System.out.println("The file " + "Secret" + ".txt does not exist.");
				System.exit(0);
			}
			Scanner filesc = new Scanner(file);
			
		
		
		String line="" ; 
		
		
		String array[]=new String[100];
		
		PrintWriter pw=new PrintWriter("output.txt");
			while(filesc.hasNext())
			{
				int c=0;
				line = filesc.nextLine();
				
				for(int j=0; j<10; j++)
				{
					 String temp="";
					array=line.split("/") ;
					temp = array[j];
						
					
						switch(temp)
						{						
						
							case "2":
									temp="A";
									break;
							case "3":
								temp="B";
								break;
							
							case "5":
								temp = "C";
								break;
							case "7":
								temp="D";
								break;
							case "11":
								temp="E";
								break;
							case "13":
								temp="F";
								break;
							case "17":
								temp="G";
								break;
							case "19":
								temp="H";
								break;
							case "23":
								temp="I";
								break;
							case "29":
								temp="J";
								break;
							case "31":
								temp="K";
								break;
							case "37":
								temp="L";
								break;
							case "41":
								temp="M";
								break;
							case "47":
								temp="N";
								break;
							case "53":
								temp="O";
								break;
							case "59":
								temp="P";
								break;
							case "61":
								temp="Q";
								break;
							case "67":
								temp="R";
								break;
							case "71":
								temp="S";
								break;
							case "73":
								temp="T";
								break;
							case "79":
								temp="U";
								break;
							case "83":
								temp="V";
								break;
							case "89":
								temp="W";
								break;
							case "97":
								temp="X";
								break;
							case "101":
								temp="Y";
								break;
							case "103":
								temp="Z";
								break;
							case "#":
								temp=" ";
								break;
							case "##":
								temp="\n";
								break;
							case "A":
								temp="1";
								break;
							case "C":
								temp="2";
								break;
							case "E":
								temp="3";
								break;
							case "G":
								temp="4";
								break;
							case "I":
								temp="5";
								break;
							case "K":
								temp="6";
								break;
							case "M":
								temp="7";
								break;
							case "O":
								temp="8";
								break;
							case "Q":
								temp="9";
								break;
							case "S":
								temp="0";
								break;
					}
					
					
					
					pw.print(temp);
					

					System.out.print(temp);
					

					
					str.append(temp);
					//System.out.println();
					
					
				}
				
				System.out.print("    ");

			}
			
			System.out.println("\n\n");


		filesc.close();
		pw.close();
		
		
		
                 
		
		
				// Get data from Team 
			        
			        FileReader file_team = new FileReader("team.txt");
			    	BufferedReader reader = new BufferedReader(file_team);
			    	String text_team = "";
			    	String line_team = reader.readLine();
			    	while(line_team != null)
			    	{
			    		text_team += line_team;
			    		line_team = reader.readLine();
			    		
			    	}
			    	
			    	// System.out.println(text_team);

			        int offset1 = 0;  
			       
			        
			         dec = decrypt(text_team, offset1);
			        //System.out.println("Decrypted text: " + dec);
			        reader.close();

			        File f2 = new File("des.txt");
					  f2.createNewFile();
					  FileWriter writer = new FileWriter(f2,true);
					  BufferedWriter buffer = new BufferedWriter(writer);  
					   buffer.write(dec); 
				        buffer.close(); 

			
				
			    
			       sc1 = new Scanner(System.in);

			        
                 

				// Select operations 
				
				while (value==0)
				{
					
				System.out.println("\n ##### Welcome To Main Menu #####");
			    System.out.println("\n (>) Press 1 To Create Team");
                System.out.println(" (>) Press 2 To Print Report 1");
                System.out.println(" (>) Press 3 To Print Report 3");
                System.out.println(" (>) Press 4 To Print Report 5");
                System.out.println("\n ##################################");
                
                value=sc1.nextInt();
                
					switch(value)
					{
					case 1 :
						
						createteam();						
						break;
					case 2:
						report1();
						break ;
					case 3:
						report3();
						break ;
					case 4  :
						report5();		
						break ;
					}
				
				
			
				}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();			
			System.out.println("Array is out of Bounds"+e);
		} 
	}
		
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
		 
		 public String replace(){
			 
			 
			return null;     
			        
			}
		 
		 public static void  createteam() throws IOException
		 {

				
				//CREATING TEAM
				
						team_agents = new String[10];
					
						agents = new String[10];
						agents[0]="HARPAL SIN";
						agents[1]="VARINDER S";
						agents[2]="DARSHIL SH";
						agents[3]="JASPAL SIN";
						agents[4]="ARSHDEEP S";
						agents[5]="JAMES BOND";
						agents[6]="MARCOS BIT";
						agents[7]="ETHAN HUNT";
						agents[8]="JOHN STATH";
						agents[9]="SHERLOCK H";
						
						System.out.print("\n==>* Enter Team ID [001 | 002 | 003] : ");
						Scanner sc1= new Scanner(System.in);	
						
						t_id = sc1.next();
						System.out.print("\n==> Working From [DD/MM/YY] : ");
						date_from=sc1.next();
						
						System.out.print("\n==> Working Till [DD/MM/YY] : ");
						date_to=sc1.next(); 
						
						System.out.println("\n==> Select The Agent's From Below :\n");
						for(int i=0;i<agents.length;i++)
						{
							System.out.print((i+1)+" : "+agents[i]+"\t\t\n");
						}
						System.out.println(">>> Enter 0 To Save Agents <<<");
						int count=0;
						for(int i=0;i<10;i++)
						{
							
							int n = sc.nextInt();
							if(n==0)
							{
								i=10;
							}
							else
							{
								count++;
								team_agents[i]=agents[n-1];
								//System.out.print(team_agents[i]);
								
								
							}
						}
						
						System.out.println("*** New Team Formed Successfully ***");
						System.out.print("ID : "+t_id+"\nFrom : "+date_from+"\nTo : "+date_to);
							System.out.print("\n\n<<<<Selected Team Agents>>>>\n\n");
							
							String  agentinfo = "";
							  String team_agency = "" ;

						for(int k=0;k<count;k++)
						{
							System.out.print("\n"+(k+1)+"."+team_agents[k]);
							
							agentinfo = (k+1)+"."+team_agents[k];
							
							if (team_agents[k] == "HARPAL SIN")
							{
							 team_agency = "AIC";	
							}
							else if (team_agents[k] == "VARINDER S") {
								 team_agency = "MSD";	

							}
							
							else if (team_agents[k] == "JASPAL SIN") {
								 team_agency = "AIC";	

							}
							else if (team_agents[k] == "ARSHDEEP S") {
								 team_agency = "MSD";	

							}
							else if (team_agents[k] == "  MARCOS BIT") {
								 team_agency = "AIC";	

							}
							else if (team_agents[k] == "JOHN  STAT") {
								 team_agency = "AIC";	

							}
							else if (team_agents[k] == "SHERLOCK H") {
								 team_agency = "MSD";	

							}
							else
							{
								team_agency = "BGK";
							}
						}
						
						
						  File f2 = new File("team.txt");
						  f2.createNewFile();
						  FileWriter fw = null;
						try {
							fw = new FileWriter(f2,true);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}				  
						  
						  BufferedWriter buffer = new BufferedWriter(fw);  
						  
						  					  
					        String text = "ID"+ "  "+t_id+ " "+agentinfo.toString()+" "+ " "+date_from +"  "+date_to + " "+ team_agency + "\n ";
					        int offset = 0;
					        
					        String enc = encrypt(text, offset);
					        //System.out.println("Encrypted text: " + enc);

					        
					        buffer.write(enc); 
					        buffer.close();  
					        System.out.println("\n\n### Team Successfully Added ###");  
					        
					        System.out.println("\n ==>> Press 0 for Main Menu");
							value=sc1.nextInt();
		 }
		 
		 
		 public static  void  report1()
		 {
			 System.out.println("\n#### Report 1 ####");
			 System.out.println("\n==>Total number of Agent's by Team\n");

				
				Pattern p = Pattern.compile("001");
				Matcher m = p.matcher(dec);
				int count1 = 0;
				while (m.find()){
				    count1 +=1;
				}
				
				Pattern p1 = Pattern.compile("002");
				Matcher m1 = p1.matcher(dec);
				int count2 = 0;
				while (m1.find()){
				    count2 +=1;
				}
				
				Pattern p2 = Pattern.compile("003");
				Matcher m2 = p2.matcher(dec);
				int count3 = 0;
				while (m2.find()){
				    count3 +=1;
				} 
				System.out.println("Team ID " + "|" + " Number of Agents\n" ); 
				System.out.println(" 001 " + count1 ); 
				System.out.println(" 002 " + count2 ); 
				System.out.println(" 003 " + count3 ); 
				
				System.out.println("\n==> Press 0 For Main Menu");
				value=sc1.nextInt();
		 }
		 
		 public static void report3()
		 {
			 System.out.println("\n#### Report 3 ####");
				
				Pattern P1 = Pattern.compile("AIC");
				Matcher M1 = P1.matcher(dec);
				int count11 = 0;
				while (M1.find()){
				    count11 +=1;
				}
				
				Pattern P2 = Pattern.compile("MSD");
				Matcher M2 = P2.matcher(dec);
				int count21 = 0;
				while (M2.find()){
				    count21 +=1;
				}
				
				Pattern P3 = Pattern.compile("BGK");
				Matcher M3 = P3.matcher(dec);
				int count31 = 0;
				while (M3.find()){
				    count31 +=1;
				}

				
				if (count11 > count21 && count11 > count31)
				{
					System.out.println("\n ==> Team AIC has more agents ") ;	
				}
				
				else if (count21 > count11 && count21 >count31)
				{
					System.out.println("\n ==> Team MSD has more agents ") ;	

				}
				else if (count11 == count21 && count11 > count31 )
				{
					System.out.println("\n ==> Team AIC has more agents ") ;	

				}
				else
				{
					System.out.println("\n ==> Team BGK has more agents ") ;	

				}
					
				System.out.println("\n==> Press 0 For Main Menu");
				value=sc1.nextInt();
				
		 }
		 
		 public static void report5()
		 {
			 
				Pattern P1 = Pattern.compile("AIC");
				Matcher M1 = P1.matcher(dec);
				int count11 = 0;
				while (M1.find()){
				    count11 +=1;
				}
				
				Pattern P2 = Pattern.compile("MSD");
				Matcher M2 = P2.matcher(dec);
				int count21 = 0;
				while (M2.find()){
				    count21 +=1;
				}
				
				Pattern P3 = Pattern.compile("BGK");
				Matcher M3 = P3.matcher(dec);
				int count31 = 0;
				while (M3.find()){
				    count31 +=1;
				}


				System.out.println("\n#### Report 5 ####\n");

				System.out.println(" AIC " + count11 ); 
				System.out.println(" MSD " + count21 ); 
				System.out.println(" BGK " + count31 ); 

				System.out.println("\n==> Press 0 For Main Menu");
				value=sc1.nextInt();
		 }
}


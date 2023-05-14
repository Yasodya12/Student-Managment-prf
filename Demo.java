import java.util.*;
class Demo{
	static Scanner scan=new Scanner(System.in);
	static int i=0;
	static String id_name[][]=new String[0][2];
	static int marks[][]=new int[0][2];
	
	public static void main(String args []){
		
		boolean big_choise=true;
		
		
		
		while(big_choise){
		System.out.println("			WELCOME TO STUDENT MANAGMENT SYSTEM...!				");
		System.out.println();
		System.out.println("[1]Add a student\t\t[2]Add new student with marks\n[3]Add marks\t\t\t[4]Update student details\n[5]Update marks\t\t\t[6]Delect student\n[7]Print studet details\t\t[8]Print student rank\n[9]Best in prf\t\t\t[10] Best in dbms");
		System.out.println();
		System.out.print("Enter you option to countinue ");
		int req=scan.nextInt();
		System.out.println();
		if(req==1){
			boolean choise1=true;
		
		while(choise1){
			clearConsole();
			System.out.println("+--------+----------------------+-------------+------------+------------+------------+------------+------------+");
			System.out.println("|					ADD NEW STUDENT..!		  	   	     		       |");                                    
			System.out.println("+--------+----------------------+-------------+------------+------------+------------+------------+------------+");
			System.out.println();
			new_id_name();//System.out.println(id_name.length);
				check_id();
					
			System.out.print("Enter Student Name: ");
			id_name[(id_name.length-1)][1]=scan.next();
			System.out.println();
			
			System.out.println("Student added Succesfully.. Do you want to add again y/n");
			char c = scan.next().charAt(0);
			if(c=='y'){
				i++;
			}else{
				choise1=false;
				i++;
			}
			clearConsole();
			
		}
	}
		if(req==2){
			boolean sub_choise=true;
			clearConsole();
			while(sub_choise){
			System.out.println("+--------+----------------------+-------------+------------+------------+------------+------------+------------+");
			System.out.println("|					ADD NEW STUDENT WITH MARKS...!		  	   	     	       |");                                    
			System.out.println("+--------+----------------------+-------------+------------+------------+------------+------------+------------+");
			System.out.println();
			new_id_name();
			check_id();
			System.out.print("Enter Student Name: ");
			id_name[(id_name.length-1)][1]=scan.next();
			System.out.println();
			
			boolean choise1=true;
			boolean choise2=true;
			while(choise1){
			System.out.print("Enter prf marks: ");
			marks[(marks.length-1)][0]=scan.nextInt();
				if(marks[(marks.length-1)][0]<0 || marks[i][0]>100){
					System.out.print("Invalid marks! ");
					System.out.println();
				}else{
					choise1=false;
				}
			}
			
			while(choise2){
			System.out.print("Enter dbms marks: ");
			marks[(marks.length-1)][1]=scan.nextInt();
			if(marks[(marks.length-1)][1]<0 || marks[i][1]>100){
				System.out.print("Invalid marks!");
				System.out.println();
			}else{
				choise2=false;
			}
		}
			System.out.println();
			System.out.println("Student added Succesfully.. Do you want to add again y/n");
			char c = scan.next().charAt(0);
			if(c=='y'){
				i++;
			}else{
				sub_choise=false;
				i++;
			}
			clearConsole();
		}
	}
	
	
		if(req==3){
			boolean choise=true;
			boolean choise1=true;
			boolean choise2=true;
			String id=null;
			clearConsole();
			while(choise){
			System.out.println("+--------+----------------------+-------------+------------+------------+------------+------------+------------+");
			System.out.println("|						ADD MARKS...!		  	   			       |");                                    
			System.out.println("+--------+----------------------+-------------+------------+------------+------------+------------+------------+");
			System.out.println();
			System.out.print("Enter student ID: ");
			id=scan.next();
			int count=0;
			int x=0;
				for (int i = 0; i <id_name.length; i++)
				{
					if(id.equals(id_name[i][0])){
						count++;
						i=x;
					}
				}
					
					if(count==1){
						System.out.print("Student name: "+id_name[x][1]);
						System.out.println();
						System.out.println();
						if(marks[x][0]==0 && marks[x][1]==0){
						System.out.print("Enter prf marks: ");
						while(choise1){
						marks[x][0]=scan.nextInt();
							if(marks[x][0]>100 || marks[x][0]<0){
								System.out.print("Invalid marks! Enter correct marks: ");
								choise1=true;
							}else{
								choise1=false;
							}
							}
							System.out.print("Enter dbms marks: ");
							while(choise2){
							marks[x][1]=scan.nextInt();
							if(marks[x][1]>100 || marks[x][1]<0){
								System.out.print("Invalid marks! Enter correct marks: ");

								choise2=true;
							}else{
								choise2=false;
							}
						}
						System.out.println();
						System.out.print("Do you want to add marks for another student (y/n)");
								char c=scan.next().charAt(0);
							if(c=='y'){
								choise=true;
								clearConsole();
							}else{
								clearConsole();
								choise=false;
							}
						}else{
							System.out.print("This student marks have been already added \nIf you want to update marks use opt [4]");
							System.out.println();
							System.out.print("Do you want to add marks again! (y/n)");
							char c=scan.next().charAt(0);
							if(c=='y'){
								choise=true;
								clearConsole();
							}else{
								clearConsole();
								choise=false;
							}
						}
					}else{
						System.out.println();
						System.out.print("Invalid student ID. \nDo you want to search again! (y/n)");
							char c=scan.next().charAt(0);
							if(c=='y'){
								choise=true;
								clearConsole();
							}else{
								clearConsole();
								choise=false;
							}
					}
					
				}
				
			
				
		}
			if(req==4){
				clearConsole();
				String id=null;
				boolean choise=true;
				while(choise){
				int x=0;
				int count=0;
				System.out.println("+--------+----------------------+-------------+------------+------------+------------+------------+------------+");
			System.out.println("|					UPDATE STUDENT DETAILS..!		  	   	     	       |");                                    
			System.out.println("+--------+----------------------+-------------+------------+------------+------------+------------+------------+");
			System.out.println();
				System.out.print("Enter student id: ");
				id=scan.next();
				for (int i = 0; i <id_name.length; i++)
				{
					if(id.equals(id_name[i][0])){
						count++;
						x=i;
					}
				}
				if(count==1){
					System.out.print("Student name: "+id_name[x][1]);
					System.out.println();
					System.out.println();
					System.out.print("Enter the new student name: ");
					id_name[x][1]=scan.next();
					System.out.println();
					System.out.print("Student details has been updated sucefully /nDO you want to update another student details (y/n)");
					char c=scan.next().charAt(0);
						if(c=='y'){
							choise=true;
							clearConsole();
						}else{
							choise=false;
							clearConsole();
						}
				}else{
					System.out.print("Invalid student ID. Do you want to try again (y/n)");
					char c=scan.next().charAt(0);
						if(c=='y'){
							choise=true;
							clearConsole();
						}else{
							choise=false;
							clearConsole();
						}
				}
			}
			}
			if(req==5){
				clearConsole();
				String id=null;
				boolean choise=true;
				while(choise){
				boolean choise1=true;
				boolean choise2=true;
				int x=0;
				int count=0;
				System.out.println("+--------+----------------------+-------------+------------+------------+------------+------------+------------+");
			System.out.println("|					UPDATE MARKS..!		  	   	     		   	       |");                                    
			System.out.println("+--------+----------------------+-------------+------------+------------+------------+------------+------------+");
			System.out.println();
				System.out.print("Enter student id: ");
				id=scan.next();
				for (int i = 0; i <id_name.length; i++)
				{
					if(id.equals(id_name[i][0])){
						count++;
						x=i;
					}
				}
				if(count==1){
					if(marks[x][0]==0 && marks[x][1]==0){
						System.out.println("Student name: "+id_name[x][1]);
						System.out.println();
						System.out.print("Marks yet to be added ");
						System.out.println();
						System.out.print("Do you want to search another student (y/n)");
						char c=scan.next().charAt(0);
							if(c=='y'){
							choise=true;
							clearConsole();
						}else{
							choise=false;
							clearConsole();
						}
						
					}
					
					
					else{
						System.out.print("Student name: "+id_name[x][1]);
					System.out.println();
					System.out.println();
					System.out.println("prf marks: "+marks[x][0]);
					System.out.println("dbms marks: "+marks[x][1]);
					System.out.println();
					System.out.println();
					System.out.print("Enter the new prf marks: ");
					while(choise1){
						marks[x][0]=scan.nextInt();
							if(marks[x][0]>100 || marks[x][0]<0){
								System.out.print("Invalid marks! Enter correct marks: ");
								choise1=true;
							}else{
								choise1=false;
							}
							}
					System.out.print("Enter the new dbms marks: ");
					while(choise2){
						marks[x][1]=scan.nextInt();
							if(marks[x][1]>100 || marks[x][1]<0){
								System.out.print("Invalid marks! Enter correct marks: ");
								choise1=true;
							}else{
								choise2=false;
							}
							}
					System.out.println();
					System.out.print("Student marks has been updated sucefully /nDO you want to update another student details (y/n)");
					char c=scan.next().charAt(0);
						if(c=='y'){
							choise=true;
							clearConsole();
						}else{
							choise=false;
							clearConsole();
						}
					}
				}else{
					System.out.print("Invalid student ID. Do you want to try again (y/n)");
					char c=scan.next().charAt(0);
						if(c=='y'){
							choise=true;
							clearConsole();
						}else{
							choise=false;
							clearConsole();
						}
				}
			}
			}
			if(req==6){
				boolean choise=true;
				clearConsole();
				String id=null;
				while(choise){
					int count=0;
					int x=0;
					System.out.println("+--------+----------------------+-------------+------------+------------+------------+------------+------------+");
			System.out.println("|					DELETE STUDENT..!		  	   	     		       |");                                    
			System.out.println("+--------+----------------------+-------------+------------+------------+------------+------------+------------+");
			System.out.println();
					System.out.print("Enter student id: ");
					id=scan.next();
					for (int i = 0; i <id_name.length; i++)
				{
					if(id.equals(id_name[i][0])){
						count++;
						x=i;
					}
				}
						if(count==1){
							id_name[x][0]=null;
							id_name[x][1]=null;
							marks[x][0]=0;
							marks[x][1]=0;
							System.out.print("Stuent has been delected sucefully \n do you want to delete another student (y/n)");
							char c=scan.next().charAt(0);
						if(c=='y'){
							choise=true;
							clearConsole();
						}else{
							choise=false;
							clearConsole();
						}
						}else{
					System.out.print("Invalid student ID. Do you want to try again (y/n)");
					char c=scan.next().charAt(0);
						if(c=='y'){
							choise=true;
							clearConsole();
						}else{
							choise=false;
							clearConsole();
						}
				}
				}
			}
			if(req==7){
				
				boolean choise=true;
				clearConsole();
				String id=null;
				int[] tot=new int[marks.length];
				while(choise){
					int count=0;
					int x=0;
					System.out.println("+--------+----------------------+-------------+------------+------------+------------+------------+------------+");
			System.out.println("|					PRINT STUDENT DETAILS..!		  	   	     	       |");                                    
			System.out.println("+--------+----------------------+-------------+------------+------------+------------+------------+------------+");
			System.out.println();
					System.out.print("Enter student id: ");
					id=scan.next();
					for (int i = 0; i <id_name.length; i++)
				{
					if(id.equals(id_name[i][0])){
						count++;
						x=i;
					}
				}
				
				for (int i = 0; i <marks.length; i++)
				{
					tot[i]=marks[i][0]+marks[i][1];
				}
				
				for (int i = 0; i <tot.length-1; i++)
				{
					for (int j = 0; j < tot.length-1; j++)
					{
						if (tot[j]<tot[j+1])
						{
							int temp=tot[j];
							tot[j]=tot[j+1];
							tot[j+1]=temp;
							
						}
					}
					
				}
				
				
				boolean sub_choise=true;
				int j=1;
				int w=0;
				
				int rank=0;

	
				
					if(count==1){
						
						
						
						if(marks[x][0]==0 && marks[x][1]==0){
						System.out.println("Student name: "+id_name[x][1]);
						System.out.println();
						System.out.print("Marks yet to be added ");
						System.out.println();
						System.out.print("Do you want to search another student (y/n)");
						char c=scan.next().charAt(0);
						if(c=='y'){
							choise=true;
							clearConsole();
						}else{
							choise=false;
							clearConsole();
						}
					}else{
						
						while(sub_choise){
				if(marks[x][0]+marks[x][1]==tot[w]){
				rank=j;
				}
				 if(w==tot.length-1){
					 w=0;
				 }
					 if(j==tot.length){
				sub_choise=false;
			}
					w++;
					j++;
					}
						
						
						
						System.out.println("Student name: "+id_name[x][1]);
						System.out.println("Progaming fundamentals Marks: "+marks[x][0]);
						System.out.println("Progaming fundamentals Marks: "+marks[x][1]);
						System.out.println("Total Marks: "+(marks[x][0]+marks[x][1]));
						System.out.println("Avg. Marks: "+((marks[x][0]+marks[x][1])/2));
						System.out.print("Rank: "+rank);
						System.out.println();
						System.out.print("Do you want to search again! (y/n)");
						char c=scan.next().charAt(0);
						if(c=='y'){
							choise=true;
							clearConsole();
						}else{
							choise=false;
							clearConsole();
						}
					}
						
					}else{
						System.out.print("Invalid student ID. Do you want to try again! (y/n)");
						char c=scan.next().charAt(0);
						if(c=='y'){
							choise=true;
							clearConsole();
						}else{
							choise=false;
							clearConsole();
						}
					}
					
			}
			}
			if(req==8){
				int rank=1;
				boolean choise=true;
				while(choise){
				clearConsole();
				String[] name1=new String[id_name.length];
				String[] id1=new String[id_name.length];
			System.out.println("+--------+----------------------+-------------+------------+------------+------------+------------+------------+");
			System.out.println("|					STUDENT RANK..!		  	   	     		               |");                                    
			System.out.println("+--------+----------------------+-------------+------------+------------+------------+------------+------------+");
			System.out.println();
			
			int[] tot=new int[marks.length];
			for (int i = 0; i < marks.length; i++)
			{
				tot[i]=marks[i][0]+marks[i][1];
			}
				for (int i = 0; i < id_name.length; i++)
			{
			name1[i]=id_name[i][1];
			id1[i]=id_name[i][0];
			}
				for (int i = 0; i <tot.length-1; i++)
				{
					for (int j = 0; j < tot.length-1; j++)
					{
						if (tot[j]<tot[j+1])
						{
							int temp=tot[j];
							tot[j]=tot[j+1];
							tot[j+1]=temp;
							
							String temp_id=id1[j];
							id1[j]=id1[j+1];
							id1[j+1]=temp_id;
							
							String temp_name=name1[j];
							name1[j]=name1[j+1];
							name1[j+1]=temp_name;
						}
					}
					
				}
				System.out.println();
				System.out.println("+--------+----------------------+-------------+------------+");
				System.out.printf("|%-8s|%-8s|%-22s|%-13s|%-12s|","Rank","ID","Name","TOT","Avg");
				System.out.println();
				System.out.println("+--------+----------------------+-------------+------------+");
				for (int i = 0; i <name1.length; i++)
				{
					System.out.printf("|%-8s",rank);
					System.out.printf("|%-8s",id1[i]);
					System.out.printf("|%-22s",name1[i]);
					System.out.printf("|%-13d",tot[i]);
					System.out.printf("|%-12d|",(tot[i]/2));
					System.out.println();
					rank++;
				}
				System.out.println("+--------+----------------------+-------------+------------+");
				System.out.println();
				
				System.out.print("Do you want to go back main menu (y/n)");
						char c=scan.next().charAt(0);
						if(c=='y'){
							choise=false;
							clearConsole();
						}else{
							choise=true;
							clearConsole();
						}
			
			}
			}
			if(req==9){
			System.out.println("+--------+----------------------+-------------+------------+------------+------------+------------+------------+");
			System.out.println("|					BEST IN PRF..!		  	   	     		     |");                                    
			System.out.println("+--------+----------------------+-------------+------------+------------+------------+------------+------------+");
			System.out.println();
				clearConsole();
				boolean choise=true;
				String[] name1=new String[id_name.length];
				String[] id1=new String[id_name.length];
				int[] prf=new int[marks.length];
				int[] dbms=new int[marks.length];
				for (int i = 0; i < id_name.length; i++)
		{
			name1[i]=id_name[i][1];
			id1[i]=id_name[i][0];
			prf[i]=marks[i][0];
			dbms[i]=marks[i][1];
	}
				while(choise){
				for (int i = 0; i < marks.length-1; i++)
				{
					for (int j = 0; j < marks.length-1; j++)
					{
						if (prf[j]<prf[j+1])
						{
							int temp=prf[j];
							String name=name1[j];
							String id=id1[j];
							prf[j]=prf[j+1];
							id1[j]=id1[j+1];
							name1[j]=name1[j+1];
							prf[j+1]=temp;
							name1[j+1]=name;
							id1[j+1]=id;
							
						}
					}
					
				}
				
		
			System.out.println("\t\tBEST IN PRF	\t\t");
				
				System.out.println();
				System.out.println("+--------+----------------------+-------------+------------+");
				System.out.printf("|%-8s|%-22s|%-13s|%-12s|","ID","Name","PF marks","DBMS Marks");
				System.out.println();
				System.out.println("+--------+----------------------+-------------+------------+");
				for (int i = 0; i <name1.length; i++)
				{
					System.out.printf("|%-8s",id1[i]);
					System.out.printf("|%-22s",name1[i]);
					System.out.printf("|%-13d",prf[i]);
					System.out.printf("|%-12d|",dbms[i]);
					System.out.println();
				}
				System.out.println("+--------+----------------------+-------------+------------+");
				System.out.println();
				
				
				System.out.print("Do you want to go back main menu (y/n)");
						char c=scan.next().charAt(0);
						if(c=='y'){
							choise=false;
							clearConsole();
						}else{
							choise=true;
							clearConsole();
						}
			
		}

		}
		if(req==10){
			System.out.println("+--------+----------------------+-------------+------------+------------+------------+------------+------------+");
			System.out.println("|					BEST IN DBMS..!		  	   	     		       |");                                    
			System.out.println("+--------+----------------------+-------------+------------+------------+------------+------------+------------+");
			System.out.println();
			clearConsole();
				boolean choise=true;
				String[] name1=new String[id_name.length];
				String[] id1=new String[id_name.length];
				int[] prf=new int[marks.length];
				int[] dbms=new int[marks.length];
				for (int i = 0; i < id_name.length; i++)
		{
			name1[i]=id_name[i][1];
			id1[i]=id_name[i][0];
			prf[i]=marks[i][0];
			dbms[i]=marks[i][1];
	}
				while(choise){
				for (int i = 0; i < marks.length-1; i++)
				{
					for (int j = 0; j < marks.length-1; j++)
					{
						if (dbms[j]<dbms[j+1])
						{
							int temp=dbms[j];
							String name=name1[j];
							String id=id1[j];
							dbms[j]=dbms[j+1];
							id1[j]=id1[j+1];
							name1[j]=name1[j+1];
							dbms[j+1]=temp;
							name1[j+1]=name;
							id1[j+1]=id;
							
						}
					}
					
				}
				
		
			System.out.println("\t\tBEST IN DBMS	\t\t");
				
				System.out.println();
				System.out.println("+--------+----------------------+-------------+------------+");
				System.out.printf("|%-8s|%-22s|%-13s|%-12s|","ID","Name","DBMS marks","PF Marks");
				System.out.println();
				System.out.println("+--------+----------------------+-------------+------------+");
				for (int i = 0; i <name1.length; i++)
				{
					System.out.printf("|%-8s",id1[i]);
					System.out.printf("|%-22s",name1[i]);
					System.out.printf("|%-13d",dbms[i]);
					System.out.printf("|%-12d|",prf[i]);
					System.out.println();
				}
				System.out.println("+--------+----------------------+-------------+------------+");
				System.out.println();
				
				System.out.print("Do you want to go main menu (y/n)");
						char c=scan.next().charAt(0);
						if(c=='y'){
							choise=false;
							clearConsole();
						}else{
							choise=true;
							clearConsole();
						}
			
		}
		}
	}
	}
	public static void check_id(){
		boolean sub_choise1=true;
		while(sub_choise1){
			
			System.out.print("Enter Student ID: ");
			id_name[(id_name.length-1)][0]=scan.next();
			
			int count=0;
			
			for (int j = 0; j <id_name.length-1 ; j++)
			{
				if(id_name[j][0].equals(id_name[i][0])){
					count++;
				}
			}
				if(count!=0){
					System.out.println("This student already exists!");
					System.out.println();
					sub_choise1=true;
				}else{
					sub_choise1=false;
				}
			}
	}
	public static void new_id_name(){
		String[][] name=new String[id_name.length+1][2];
		for (int i = 0; i <id_name.length; i++)
		{
			name[i][1]=id_name[i][1];
			name[i][0]=id_name[i][0];
		}
		id_name=name;
		int[][] temp_marks=new int[marks.length+1][2];
		for (int i = 0; i <marks.length; i++)
		{
			temp_marks[i][0]=marks[i][0];
			temp_marks[i][1]=marks[i][1];
		}
		marks=temp_marks;
	}
	public final static void clearConsole() { 
		try {
		final String os = System.getProperty("os.name"); 
		if (os.contains("Windows")) {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	} else {
		System.out.print("\033[H\033[2J"); 
		System.out.flush();
	}
	} catch (final Exception e) {
		e.printStackTrace();
 }
}
}

import java.util.*;
import java.io.*;
public class D extends createFile{
	public static void main(String[]args){
Scanner in = new Scanner(System.in);
System.out.println("1-init 2-insert 3-display 4-exit");
int x = in.nextInt();
File f = new File("sid.text");
do{
	switch(x){
case 1:{
try{
f= new File("sid.text");
		}
	catch(Exception e){
	System.out.println("you have an error");
		}
}
	break;
case 2:{
	String s = in.next();
    f.write(s);
	}
	break;
case 3:{
while(f.hasNext()){
	String d = x.next();
System.out.println(d);
	}
	}
	break;
case 4:{
	System.exit(0);
	}
	break;
default:{
	System.out.println("your choice isn't there choose again please!");
	}
		}//end switch
System.out.println("1-init 2-insert 3-display 4-exit");
x = in.nextInt();//user choice

}while(x!=4);

		}
	}
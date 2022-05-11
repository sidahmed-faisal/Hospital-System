import java.io.*;
import java.util.*;
public class createFile{
private Formatter x;
public void initFile(){
	try{
	x = new Formatter("sid.text");
		}
	catch(Exception e){
	System.out.println("you have an error");
		}
	}
public  void insert(String s){
	x.format(s);
	}

	}
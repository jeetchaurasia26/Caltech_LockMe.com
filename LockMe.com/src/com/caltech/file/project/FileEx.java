package com.caltech.file.project;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
//creating a file in directory
public class FileEx {
public static void main(String[] args) throws IOException {
while(true) {
System.out.println("Enter the choice" +"\n"+ "1.Retrieving the file names in an ascending order"+"\n"+"2.File Operations"+"\n"+"3.Exit");
Scanner sc=new Scanner(System.in);
int ch=sc.nextInt();
switch(ch) {
case 1://Display files
String path="E:\\LockMe.com\\";
File file=new File(path);
//display operation
File filename[]=file.listFiles();
//for-each
System.out.println("the list of files in asscending order in the "+ path +" is");
int dflag=0;
for(File ff:filename) {
System.out.println(ff.getName());
dflag=1;
}
if(dflag!=1) {
System.out.println("No Files Found");
}
break;
//display if no file found2
case 2://File Operations2
System.out.println("Please choose from submenu"+"\n\t" +"1. Add a file" +"\n\t"+"2. Delete a file"+"\n\t"+"3. Search a file"+"\n\t"+"4.exit a submenu");
int ch1=sc.nextInt();
switch (ch1){
case 1://Add a file
String Addpath="E:\\LockMe.com\\";
Scanner Add=new Scanner(System.in);
System.out.println("enter the file name");
String Insertfilename=Add.next();
String finalpath=Addpath+Insertfilename;
System.out.println(finalpath);
//create a file
File Insertfile=new File(finalpath);
boolean res=Insertfile.createNewFile();
if(res!=true) {
System.out.println("file is not created");
}
else {
System.out.println("file is created ");
}
break; 
case 2://Delete a file
String Delpath="E:\\LockMe.com\\";
Scanner Del=new Scanner(System.in);
System.out.println("enter the file name");
String Delfilename=Del.next();
String Delfinalpath=Delpath+Delfilename;
System.out.println(Delfinalpath);
File Delfile=new File(Delfinalpath);
//delete operation
Delfile.delete();
System.out.println("file gets deleted");
break;
case 3://Search a file 
String Searchpath="E:\\LockMe.com\\";
Scanner Search=new Scanner(System.in);
System.out.println("enter the file to search");
String filenamesearch=Search.next();
File Searchfile=new File(Searchpath);
//display operation
File Searchfilename[]=Searchfile.listFiles();
//for-each
int flag=0;
for(File ff:Searchfilename) {
if(ff.getName().equals(filenamesearch)) {
flag=1;
break;
}
else {
flag=0;
}
}
if(flag==1) {
System.out.println("file is found");
}
else {
System.out.println("file is not found");
}
break;
case 4://exit
System.out.println("You selected to Exit sub menu");
break;
default:System.out.println("Please check the input entered");
break;
}
break;
case 3://Exit of the program
System.out.println("You selected to Exit sub menu");
System.exit(0);
break;
default:System.out.println("Please check the input entered");
break;
}
}
}
}

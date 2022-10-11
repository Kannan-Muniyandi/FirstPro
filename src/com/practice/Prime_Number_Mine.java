package com.practice;

public class Prime_Number_Mine {
public static void main(String[] args) {
	

  int n =0;
  boolean flag=false;
  int i;
  for (int j = 0; j < n; j++) {
	

  for(i=1; i<j; i++){

     int c = j % i ;
     if(c==0){
        flag=true;
       
}
     
   
}
if(flag==true) {
System.out.println(j+" is not a Prime Number");
}else if(flag==false) {
System.out.println(j+" is a Prime Number");
}
}
}
}


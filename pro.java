import java.util.*;
class pro{
public static int roundno(int num){
if(num%1000==0){
return num;
}
else{
return ((num/1000)+1)*1000; 
}
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the amount: ");
int am=sc.nextInt();
int tot=0;
if(am>=1 && am<=5000){
tot+=25;
}
else if(am>=5001 && am<=10000){
tot+=50;
}
else if(am>=10001 && am<=12000){
tot+=60;
}
else if(am>=12001 && am<=100000){
tot+=(roundno(am)/1000)*5;
}
else if(am>=100001 && am<=150000){
tot+=600;
}
else if(am>=150001){
int t=(roundno(am)/1000)*4;
if(t>2000){
tot+=2000;
}
else{
tot+=t;
}
}
else{
tot+=0;
System.out.print("ERROR!");
}
System.out.print("The DD amount = ");
System.out.print(tot);

}
}
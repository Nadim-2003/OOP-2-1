/*import java.util.*;
class trantion{
     // int day;
  String type;
     int amount;

     trantion(String b,int c){
         // day=a;
         type=b;
         amount=c;
     }
 }
 class customer{
     int id;
     String name;
     int money;
     // int arr[];
     trantion tr[];

     customer(int a,String n,int m){
         id=a;
         name=n;
         money=m;
         tr=new trantion[7];
         // arr=new int[7];
     }
 }

 class system{
     customer c[];
       int count;
     void member(){
          c=new customer[100];
         count=0; 
       }
       void addmember(customer s){
            c[count]=s;
            count++;
       }

       void service(int id,int d,int typ,int amo){
             for(int i=0;i<count;i++){
                if(c[i].id==id){
                    if(typ==1){
                       c[i].tr[d]=new trantion("deposite",amo);
                    }
                    if(typ==2){
                     c[i].tr[d]=new trantion("withdraw",amo);
                     }
                  }
                 }
             }
      

       void display(int id){
         for(int i=0;i<count;i++){
             if(c[i].id==id){
                 int j=0;
                 int b=c[i].money;
                 while(j<7){
                     if(c[i].tr[j].type.equals("withdraw")){
                         b-=c[i].tr[j].amount;
                     }else if(c[i].tr[j].type.equals("deposite")){
                         b+=c[i].tr[j].amount;
                     }
                     System.out.println(c[i].name+" Day:"+j+" "+c[i].tr[j].type+" taka="+c[i].tr[j].amount+" balance="+b);
                     j++;
                 }
             }
         }
       }
 }

 public class b{
     public static void main(String args[])
     {
         system s=new system();
         s.member();
      customer ch[]=new customer[100];
      ch[0]=new customer(1,"Nadim", 1000);
      ch[1]=new customer(2,"N", 2000);
      ch[2]=new customer(3,"Na", 3000);
      ch[3]=new customer(4,"Nad", 4000);
      ch[4]=new customer(5,"Nadi", 5000);
       for(int i=0;i<5;i++){
         s.addmember(ch[i]);
       }
       s.service(4, 0, 1, 200);
       s.service(4, 1, 2, 300);
       s.service(4, 2, 1, 500);
       s.service(4, 3, 1, 50);
       s.service(4, 4, 2, 10);
      s.service(4, 5, 1, 5);
       s.service(4, 6, 2, 1000);
       s.display(4);
     }
 }*/

import java.util.*;
 interface Innerfirstcode {
  int n=10;
    void myname();
}
  class ok implements Innerfirstcode{
   
    static int a;
   public  void myname(){
    a=10;
        System.out.println("djk"+a);
    }
  
    
}
class B extends ok{
  
    int a=24;
//    void n(){
//         System.out.println(super.a);
//     }
}
public class Main{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ok o=new ok();
       o.myname();
        ok.a=40;
        System.out.println(ok.a);
        
      
        sc.close();
    }
}
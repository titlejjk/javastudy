package test.main;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import test.mypac.Member;

public class TestMain {
   public static void main(String[] args) {
      List<Member> members=new ArrayList<>();
      Scanner scan=new Scanner(System.in);
      
      for(int i=0; i<5; i++) {
         System.out.println("번호입력:");
         int num=scan.nextInt();
        
         System.out.println("이름입력:");
         String name=scan.next();
         
         Member mem=new Member();
         mem.num=num;
         mem.name=name;
         
         members.add(mem);
      }
   }
}

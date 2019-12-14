
package javaprojectstudent;

import java.util.Scanner;


class JavaProjectStudent {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name1="Amir",username1="amir1379",password1="1234512345";
        System.out.print("Enter your name : ");
        String name2= input.next();
        System.out.print("\nEnter your username : ");
        String username2= input.next();
        System.out.print("\nEnter your passwrod: ");
        String password2;
        password2= input.next();


        if(name1.equals(name2)==false )
            System.out.println("Your name is not correct");
        if(username1.equals(username2)==false )
            System.out.println("Your username is not correct");
        if(password1.equals(password2)==false )
            System.out.println("Your password is not correct");




    }

}

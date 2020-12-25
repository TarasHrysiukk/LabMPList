

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ListLogic extends ApplList{
    private Scanner sc = new Scanner(System.in); //we announce the scanner
    public List listPrimary = new ArrayList(); //initialize an empty main list
    private List listSecondary = new ArrayList();//initialize an empty Secondary  list in which we enter our data

    public void listWorker(){
        System.out.println("Enter your list using the <space> buttons, press <Enter> if you want to finish  ");
        listSecondary = Arrays.asList(sc.nextLine().split(" "));
        System.out.println("Yor List = " + listSecondary);
        System.out.println();
        listAdd();
        listDelet();

    }
    public void listAdd(){
        System.out.println("Which word you want to add in this list? ");
        System.out.println();
//initialize an empty list in which we enter the words that we will add
        List<String> word = Arrays.asList(sc.nextLine().split(" "));
//we include all elements in our main list
        listPrimary.addAll(listSecondary);
        listPrimary.addAll(word);
        System.out.println("Your list after added new word =  " + listPrimary);
        System.out.println();


    }

    public void listDelet(){
        System.out.println("Select what you want to delete:");
        System.out.println("1 - index ");
        System.out.println("2 - word ");
        int numberDelete = sc.nextInt();//read what the user enters
        switch (numberDelete) {
            case 1 :
                int maxIndex = listPrimary.size() -1; //-1 because it indexes from 0
                System.out.println("Input the index number you want to delete Min [0] - MAX ["+maxIndex+"]");
                int delIndex = sc.nextInt();
                listPrimary.remove(delIndex);
                System.out.println("Your list after deleted index [" + delIndex + "] " + listPrimary);
                break;

            case 2 :
                System.out.println("Input the word you want to delete  all possible[" + listPrimary + "]");
                String delWord = sc.next();
                listPrimary.remove(delWord);
                System.out.println("Your list after deleted word <" + delWord + ">" + listPrimary);
                break;

        }
    }
}

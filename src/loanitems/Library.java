package loanitems;

import java.util.Scanner;


public class Library {
    Scanner scanner = new Scanner(System.in);
    LoanItem[] arrayOfItems;
    public static void main(String[] args) {
        new Library().run();
    }

    private void run() {
        System.out.print("How many loan items do you want to register? ");
        int numberOfItems = scanner.nextInt();
        scanner.nextLine();//ScannerBug
        arrayOfItems = new LoanItem[numberOfItems];
        getInfo();
        printList();


    }
    public void getInfo(){
        for(int i=0; i<arrayOfItems.length; i++){
            System.out.println("ITEM no. " + (i+1));
            System.out.print("    Type (B or V): ");
            String type = scanner.nextLine();
            System.out.print("    Title: ");
            String title = scanner.nextLine();
            System.out.println();
            arrayOfItems[i] = initiateItem(type,title);
        }
    }

    public LoanItem initiateItem(String type, String title){
        switch (type.toUpperCase()){
            case "B":
                return new Book(title);
            case "V":
                 return new Video(title);
                        default:
                 return new LoanItem(title);
                             }
    }
    public void printList(){
        int idWidth = 3;
        int typeWidth = 6;
        System.out.println("LIST OF LOAN ITEMS:");
        System.out.println("-------------------");
        System.out.println("ID  TYPE   TITLE");
        for (int i = 0; i < arrayOfItems.length; i++) {
            System.out.printf("%-" + idWidth + "d %-" + typeWidth + "s %" + "s%n",
                    (i + 1),
                    arrayOfItems[i].getClass().getSimpleName(),
                    arrayOfItems[i].getTitle());
        }
    }

}

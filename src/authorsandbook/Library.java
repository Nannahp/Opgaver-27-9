package authorsandbook;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        new Library().run();
    }

    private void run() {
        Author Tolkien = new Author("J.R.R. Tolkien", 'm', "Tolkien@gmail.com");
        Author Gaiman = new Author("Neil Gaiman", 'm',"Gaiman@live.com");

        Book LOTR1 = new Book("LOTR: Fellowship of the Ring",Tolkien,423  );
        Book LOTR2 = new Book("LOTR: The Two Towers", Tolkien, 352);
        Book LOTR3 = new Book("LOTR: The Return of the King",Tolkien, 416);
        Book GO  = new Book("Good Omens", Gaiman,412);

        ArrayList<Author> athours = new ArrayList<Author>();
        athours.add(Tolkien);
        athours.add(Gaiman);
        Tolkien.addBooks(LOTR1);
        Tolkien.addBooks(LOTR2);
        Tolkien.addBooks(LOTR3);
        Gaiman.addBooks(GO);

        System.out.println("AUTHORS AND BOOKS");
        for (int i = 0; i < athours.size(); i++) {
            int nameWidth = 20;
            int genderWidth = 10;
            int emailWidth = 30;

            System.out.printf("%-" + nameWidth + "s%-" + genderWidth + "c%-" + emailWidth + "s%n",
                    athours.get(i).getName(),
                    athours.get(i).getGender(),
                    Tolkien.getEmail());

            for (int j = 0; j < athours.get(i).getBooks().size(); j++) {
                // Define column widths for book information
                int titleWidth = 40;
                int pagesWidth = 10;

                System.out.printf("%-" + titleWidth + "s%-" + pagesWidth + "d%n",
                        (athours.get(i).getBooks()).get(j).getTitle(),
                        (athours.get(i).getBooks()).get(j).getNumPages());
            }
            System.out.println();
        }
    }
}

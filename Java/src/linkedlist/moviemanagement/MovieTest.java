package linkedlist.moviemanagement;

import java.util.Scanner;

public class MovieTest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        MovieList list = new MovieList();

        int choice, year, rating, pos;
        String title, director;
        while (true) {
            System.out.println("\n1.Insert at Beginning");
            System.out.println("2.Insert at End");
            System.out.println("3.Insert at Position");
            System.out.println("4.Remove Movie by Title");
            System.out.println("5.Search by Director");
            System.out.println("6.Search by Rating");
            System.out.println("7.Update Rating");
            System.out.println("8.Display Movies");
            System.out.println("9.Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter title director year rating: ");
                    title = sc.next();
                    director = sc.next();
                    year = sc.nextInt();
                    rating = sc.nextInt();
                    list.insertAtBeginning(title, director, year, rating);
                    break;

                case 2:
                    System.out.print("Enter title director year rating: ");
                    title = sc.next();
                    director = sc.next();
                    year = sc.nextInt();
                    rating = sc.nextInt();
                    list.insertAtEnd(title, director, year, rating);
                    break;

                case 3:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    System.out.print("Enter title director year rating: ");
                    title = sc.next();
                    director = sc.next();
                    year = sc.nextInt();
                    rating = sc.nextInt();
                    list.insertAtPosition(title, director, year, rating, pos);
                    break;

                case 4:
                    System.out.print("Enter movie title to remove: ");
                    title = sc.next();
                    list.removeMovie(title);
                    break;

                case 5:
                    System.out.print("Enter director name: ");
                    director = sc.next();
                    list.searchByDirector(director);
                    break;

                case 6:
                    System.out.print("Enter rating: ");
                    rating = sc.nextInt();
                    list.searchByRating(rating);
                    break;

                case 7:
                    System.out.print("Enter movie title: ");
                    title = sc.next();
                    System.out.print("Enter new rating: ");
                    rating = sc.nextInt();
                    list.updateRating(title, rating);
                    break;

                case 8:
                    list.displayMovies();
                    break;

                case 9:
                    System.out.println("Program exited.");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

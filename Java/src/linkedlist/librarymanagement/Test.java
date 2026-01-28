package linkedlist.librarymanagement;

public class Test {
    static void main() {
        Library lib = new Library();

        lib.addAtEnd(101, "Java Basics", "James Gosling", "Programming", true);
        lib.addAtBeginning(102, "Data Structures", "Mark Weiss", "CS", true);
        lib.addAtEnd(103, "Operating Systems", "Silberschatz", "CS", false);

        System.out.println("Library (Forward):");
        lib.displayForward();

        System.out.println("\nLibrary (Reverse):");
        lib.displayReverse();

        lib.updateAvailability(103, true);
        lib.removeById(102);

        System.out.println("\nAfter Updates:");
        lib.displayForward();

        System.out.println("\nTotal Books: " + lib.countBooks());
    }
}

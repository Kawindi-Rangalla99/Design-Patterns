abstract class Book {
    abstract void ShowSpec();
}

//Extending Book
class FictionBook extends Book {
    @Override
    public void ShowSpec() {
        System.out.println("See the Specification of Fiction Book");
    }
}

class ScienceBook extends Book {
    @Override
    public void ShowSpec() {
        System.out.println("See the Specification of Science Book");
    }
}

class HistoryBook extends Book {
    @Override
    public void ShowSpec() {
        System.out.println("See the Specification of History Book");
    }
}

//factory class
class FactoryBook {
    public Book getBook(String typeOfBook) {
        if (typeOfBook.equalsIgnoreCase("Fiction")) {
            return new FictionBook();
        } else if (typeOfBook.equalsIgnoreCase("Science")) {
            return new ScienceBook();
        } else if (typeOfBook.equalsIgnoreCase("History")) {


            return new HistoryBook();
        }
        return null;
    }
}

//main class
public class FactoryMethodDesignPattern {
    public static void main(String[] args) {
        FactoryBook factoryBook = new FactoryBook();

        Book myBook = factoryBook.getBook("Science");
        if (myBook != null) {
            myBook.ShowSpec();
        } else {
            System.out.println("No such book found.");
        }
    }
}

abstract class RestaurantBooking {
    
    final void bookTable() {
        selectDateTime();
        selectTable();
        makePayment();
        confirmBooking();
    }

   
    abstract void selectDateTime();
    abstract void selectTable();
    abstract void makePayment();
    abstract void confirmBooking();

    
}

class OnlineBooking extends RestaurantBooking {
    @Override
    void selectDateTime() {
        System.out.println("Selecting date and time on website");
    }

    @Override
    void selectTable() {
        System.out.println("Selecting table on website");
    }

    @Override
    void makePayment() {
        System.out.println("Making payment online");
    }

    @Override
    void confirmBooking() {
        System.out.println("Booking confirmed via email");
    }
}

class PhoneBooking extends RestaurantBooking {
    @Override
    void selectDateTime() {
        System.out.println("Selecting date and time via phone call");
    }

    @Override
    void selectTable() {
        System.out.println("Selecting table via phone call");
    }

    @Override
    void makePayment() {
        System.out.println("Making payment at restaurant");
    }

    @Override
    void confirmBooking() {
        System.out.println("Booking confirmed via SMS");
    }
}

public class TemplateDesignPattern {
    public static void main(String[] args) {
        RestaurantBooking onlineBooking = new OnlineBooking();
        System.out.println("Online Booking Process:");
        onlineBooking.bookTable();

        System.out.println();

        RestaurantBooking phoneBooking = new PhoneBooking();
        System.out.println("Phone Booking Process:");
        phoneBooking.bookTable();
    }
}
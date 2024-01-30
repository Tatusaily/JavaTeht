public class Task3 {
    class Library3 extends Library2{
        // Library, jossa on saatavuustarkistus.
        public Boolean isBookAvailable(Book a){
            return getBooklist().contains(a);
        }
    }
}

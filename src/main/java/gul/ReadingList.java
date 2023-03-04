package gul;

import java.util.ArrayList;
import java.util.List;

public class ReadingList {

    class BookItem {
        Book book;
        String dateRead;
        int rating;
        public BookItem(Book book, String dateRead2, int rating) {
            this.book = book;
            this.dateRead = dateRead2;
            this.rating = rating;
        }
        
    }
    ArrayList<BookItem> myList = new ArrayList<>();

    public List<BookItem> getBooks(){
        return myList;
    }
    public void addBook(Book book, String dateRead, int rating){
        myList.add(new BookItem(book, dateRead, rating));
    }
    public int numberRead(){
        return myList.size();
    }
    public void removeBook(String title){
    if(myList.iterator().next().book.title.equals(title)){
        myList.remove(myList.iterator().next());
        }
    }
}

package gul;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    // User Story
    // As an avid reader
    // I want to have list of books I've read
    // So that I can keep track of everything I've read!

    // ********************Acceptance Criteria*********************************

    // Given that I visit the site, when I first start, I expect my list to be
    // empty.
    @Test
    public void myBookListShoulBeEmpty() {
        ReadingList bookList = new ReadingList();
        assertEquals(bookList.getBooks().size(), 0);
    }

    // Given that I have an empty list, when I add the first book to my list then I
    // expect numberRead to return 1.
    @Test
    public void canAddABookInBookList() {
        String dateRead = "January 1, 2020";
        int rating = 4;
        ReadingList bookList = new ReadingList();
        Book book = new Book("Code with Mohsen", "Mohsen Ali", 245, 2018);
        bookList.addBook(book, dateRead, rating);
        assertEquals(bookList.numberRead(), 1);
    }

    // Given that I have an empty list, when I add additional books to the list I
    // expect the numberRead to return the total number of books in my list.
    @Test
    public void canAddAdditionalBooksInBookList() {
        ReadingList bookList = new ReadingList();
        Book book1 = new Book("Code with Mohsen", "Mohsen Ali", 245, 2018);
        bookList.addBook(book1, "February 26, 2000", 8);
        Book book2 = new Book("Code with Mohsen", "Gul Buledai", 305, 2008);
        bookList.addBook(book2, "August 11, 2011", 7);
        assertEquals(bookList.numberRead(), bookList.getBooks().size());
    }

    // Given that I have a book in my list, when I call removeBook("<title>") with
    // "title" representing the title of my book that I want to delete, then when I
    // call getBooks() the book I deleted should no longer be there.
    @Test
    public void canRemoveABookByTitleInMybookList() {
        ReadingList bookList = new ReadingList();
        Book book1 = new Book("Code with Mohsen", "Mohsen Ali", 245, 2018);
        bookList.addBook(book1, "February 26, 2000", 8);
        Book book2 = new Book("Code with Baloch", "Gul Buledai", 305, 2008);
        bookList.addBook(book2, "August 11, 2011", 7);
        bookList.removeBook(book1.title);
        assertNotEquals(bookList.getBooks().iterator().next().book.title, book1.title);
        assertEquals(bookList.myList.size(), 1);
    }

}

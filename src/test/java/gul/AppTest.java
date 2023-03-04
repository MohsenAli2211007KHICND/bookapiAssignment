package gul;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    //     User Story
//     As an avid reader
//     I want to have list of books I've read
//     So that I can keep track of everything I've read!

// ********************Acceptance Criteria*********************************

//     Given that I visit the site, when I first start, I expect my list to be empty.
@Test
public void myBookListShoulBeEmpty (){
    ReadingList bookList = new ReadingList();
    assertEquals(bookList.getBooks().size(), 0);
}

// Given that I have an empty list, when I add the first book to my list then I expect numberRead to return 1. 
@Test
public void canAddABookInBookList (){
    String dateRead = "January 1, 2020";
    int rating = 4;
    ReadingList bookList = new ReadingList();
    Book book = new Book("Code with Mohsen","Mohsen Ali", 245, 2018 );
    bookList.addBook(book, dateRead, rating);
    assertEquals(bookList.numberRead(), 1);
}
}

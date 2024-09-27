public class Book {
    String bookName;
    String author;
    {
        bookName = "World Rally";
        author = "John Smith";
        System.out.println("bookName from IIB" +" "+ bookName);
        System.out.println("author from IIB" +" "+ author);
    }

    public Book(String bookName,String author) {
        this.bookName = bookName;
        this.author = author;
        System.out.println("bookName" +" "+ bookName);
        System.out.println("author" +" "+ author);
    }

    public String getBookName(){
        return bookName;
    }
    public String getAuthor(){
        return author;
    }
}

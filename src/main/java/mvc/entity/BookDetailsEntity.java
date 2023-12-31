package mvc.entity;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "bookDetails")
public class BookDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "isbn")
    private String isbn;


    @Column(name = "price")
    private int price;


    @Column(name = "numberOfPage")
    private int numberOfPage;


    @Column(name = "publishDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate publishDate;


//    @OneToOne(mappedBy = "bookDetails")
//    private BookDetailsEntity book;

    @OneToOne(mappedBy = "bookDetails")
    private mvc.entity.BookEntity book;

//    @OneToOne
//    @JoinColumn(name = "bookDetails") // Đổi tên column nếu cần
//    private BookEntity book;

    public BookDetailsEntity(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public mvc.entity.BookEntity getBook() {
        return book;
    }

    public void setBook(mvc.entity.BookEntity book) {
        this.book = book;
    }
}

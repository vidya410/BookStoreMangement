package com.bookStore.Bean;
import javax.persistence.*;
import java.util.Arrays;

@Entity
    @Table(name = "book")
    public class Book {

        @Id
        @Column(name = "Id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "Name")
        private String name;

        @Column(name = "Author")
        private String author;

        @Column(name="Quantity")
        private int quantity;

        @Column(name = "Price")
        private Double price;

        @Column(name = "PicByte", length = 1000)
        private byte[] picByte;
        @ManyToOne
        @JoinColumn(name = "book_detail_id")
        private BookDetail bookDetail;

    public BookDetail getBookDetail() {
        return bookDetail;
    }

    public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {

            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {

            return author;
        }

        public void setAuthor(String author) {

            this.author = author;
        }
        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;}

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public byte[] getPicByte() {
            return picByte;
        }

        public void setPicByte(byte[] picByte) {
            this.picByte = picByte;
        }


public Book(){

}


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", picByte=" + Arrays.toString(picByte) +
                ", bookDetail=" + bookDetail +
                '}';
    }

    }

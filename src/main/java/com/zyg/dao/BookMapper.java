package com.zyg.dao;

import com.zyg.pojo.Books;

import java.util.List;

public interface BookMapper {
    //zeng
     int addBook(Books books);

     //shan
    int deleteBook(Books books);

    //gai
    int update(Books books);

    //chayige
    Books queryById(int id);

    //chasuoyou
    List<Books> queryAllBook();



}

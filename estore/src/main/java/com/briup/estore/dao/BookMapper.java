package com.briup.estore.dao;

import java.util.List;

import com.briup.estore.bean.Book;

public interface BookMapper {
	public List<Book> selectBookByClick();
	public List<Book> selectAllBook();
	public Book selectBookById(Integer id);
	public void updateBook(Book book);
	public List<Book> selectBookByCateId(int cateId);
	public List<Book> selectBookByCateIdAndClick(int cateId);
}

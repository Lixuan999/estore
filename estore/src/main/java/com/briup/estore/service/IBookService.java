package com.briup.estore.service;

import java.util.List;

import com.briup.estore.bean.Book;

public interface IBookService {
	public List<Book> selectBookByClick();
	public List<Book> selectAllBook();
	public Book selectBookById(Integer id);
	public List<Book> selectBookByCateId(int cateId);
	public List<Book> selectBookByCateIdAndClick(int cateId);
}

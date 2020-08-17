package com.briup.estore.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.estore.bean.Book;
import com.briup.estore.dao.BookMapper;
import com.briup.estore.service.IBookService;
import com.briup.estore.utils.MyBatisSqlSessionFactory;

public class BookServiceImpl implements IBookService{

	@Override
	public List<Book> selectBookByClick() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		List<Book> books = mapper.selectBookByClick();
		return books;
	}

	@Override
	public List<Book> selectAllBook() {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		List<Book> books = mapper.selectAllBook();
		return books;
	}

	@Override
	public Book selectBookById(Integer id) {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		Book book = mapper.selectBookById(id);
		book.setClick(book.getClick()+1);
		mapper.updateBook(book);
		session.commit();
		return book;
	}

	@Override
	public List<Book> selectBookByCateId(int cateId) {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		List<Book> booklist = mapper.selectBookByCateId(cateId);
		
		return booklist;
	}

	@Override
	public List<Book> selectBookByCateIdAndClick(int cateId) {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		List<Book> booklist = mapper.selectBookByCateIdAndClick(cateId);
		
		return booklist;
	}

}

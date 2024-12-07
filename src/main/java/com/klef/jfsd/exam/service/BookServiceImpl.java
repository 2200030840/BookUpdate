package com.klef.jfsd.exam.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Book;
import com.klef.jfsd.exam.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService
{

	@Autowired
	public BookRepository bookRepository;
	
	@Override
	public String updatebook(Book b) 
	{
		Optional<Book> obj = bookRepository.findById(b.getBookid());
		String msg = null;
		if(obj.isPresent())
		{
			Book book = obj.get();
			
			book.setTitle(b.getTitle());
			book.setAuthor(b.getAuthor());
			book.setPrice(b.getPrice());
			book.setPublishyear(b.getPublishyear());
			
			bookRepository.save(book);
			msg = "Book Updated Successfully";
		}
		else
		{
			msg = "Studnet ID Not Found";
		}
		return msg;
	}
}

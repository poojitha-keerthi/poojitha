package com.spring.web.springCase.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.web.springCase.entity.Book;
public class BookDAO 
{
	SessionFactory sessionFactory;
    @Autowired
    public BookDAO(SessionFactory sessionFactory)
    {
   	 this.sessionFactory=sessionFactory;
    }
    public void insertBook(Book b)
    {
   	 Session session = sessionFactory.openSession();
   	 session.save(b);
   	 session.beginTransaction().commit();
    }
    public void deleteBook(int bookid)
    {
   	 Session session = sessionFactory.openSession();
   	 Book b = session.get(Book.class,bookid);
   	 session.delete(b);
   	 session.beginTransaction().commit();
    }
    public void modifyBook(Book b)
    {
   	 Session session = sessionFactory.openSession();
   	 Book b1 = session.get(Book.class,b.getBookid());
   	 b1.setBooktitle(b.getBooktitle());   b1.setPrice(b.getPrice());
   	 b1.setAuthour(b.getAuthour());
   	 session.beginTransaction().commit();
    }
    public Book getBook(int bookid)
    {
   	 Session session = sessionFactory.openSession();
   	 return session.get(Book.class, bookid);
    }
}

package com.sangi.dao;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sangi.model.BlogPost;
import com.sangi.model.BlogPostLikes;
import com.sangi.model.User;



@Repository
@Transactional
public class BlogPostLikesDaoImpl implements BlogPostLikesDao {
 @Autowired
 private SessionFactory sessionFactory;
 
	public BlogPostLikes hasUserLikedPost(int postId, String email) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from BlogPostLikes where blogPost.id=? and user.email=?");
		query.setInteger(0, postId);
		query.setString(1, email);
		BlogPostLikes blogPostLikes=(BlogPostLikes)query.uniqueResult();
		return blogPostLikes;
	}
  
	public BlogPost updateLikes(int postId, String email) {
			Session session = sessionFactory.getCurrentSession();
		BlogPostLikes blogPostLikes=hasUserLikedPost(postId, email);
		
		BlogPost blogPost=(BlogPost)session.get(BlogPost.class, postId);
		
		if(blogPostLikes==null){
			BlogPostLikes likes=new BlogPostLikes();
			User user=(User)session.get(User.class, email);
			likes.setBlogPost(blogPost);
			likes.setUser(user);
			session.save(likes);
			blogPost.setLikes(blogPost.getLikes() + 1); 
			session.update(blogPost);
		}
		else{
			session.delete(blogPostLikes);
			blogPost.setLikes(blogPost.getLikes() - 1);
			session.update(blogPost);
		}
		return blogPost;
	}

}

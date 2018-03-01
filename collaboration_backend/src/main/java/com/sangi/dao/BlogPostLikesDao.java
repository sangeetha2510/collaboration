package com.sangi.dao;

import com.sangi.model.BlogPost;
import com.sangi.model.BlogPostLikes;

public interface BlogPostLikesDao {
BlogPostLikes hasUserLikedPost(int postId,String email);
BlogPost updateLikes(int postId,String email);
}

package com.sangi.dao;

import java.util.List;

import com.sangi.model.Friend;
import com.sangi.model.User;

public interface FriendDao {

	List<User> listOfSuggestedUsers(String email);
	void addFriendRequest(Friend friend);
	List<Friend> getAllPendingRequests(String email);
	void updateFriendRequest(Friend friend);
	List<User> listOfFriends(String email);
}

package com.jyosu.friends.service;

import org.springframework.data.repository.CrudRepository;

import com.jyosu.friends.model.Friend;

public interface FriendService extends CrudRepository<Friend, Integer>{

	
	
}

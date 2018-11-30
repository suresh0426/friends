package com.jyosu.friends.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jyosu.friends.model.Friend;
import com.jyosu.friends.service.FriendService;

@RestController
public class FriendController {

	@Autowired
	private FriendService friendService;
	
	@PostMapping("/friends")
	public Friend create(@RequestBody Friend friend) {
		return friendService.save(friend);
	}
	
	@GetMapping("/friends")
	public Iterable<Friend> read() {
		return friendService.findAll();
	}
	
	
	@PostMapping("/friend")
	public Friend update(@RequestBody Friend friend) {
		return friendService.save(friend);
	}
	
	
	@DeleteMapping("/friends/{id}")
	public void delete(@PathVariable Integer id) {
		friendService.deleteById(id);
	}
	
	
}

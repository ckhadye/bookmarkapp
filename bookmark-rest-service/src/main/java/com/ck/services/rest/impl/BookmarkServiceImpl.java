package com.ck.services.rest.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ck.dto.Bookmark;
import com.ck.services.rest.BookmarkService;

@Service(value="bookMarkService")
public class BookmarkServiceImpl implements BookmarkService{

	public void saveBookmark(Bookmark bookMark) {
		// TODO Auto-generated method stub
		
	}

	public Bookmark getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Bookmark> getAllBookmarksForUserById(Long userID) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Bookmark> getAllBookmarksForUserByUsername(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}

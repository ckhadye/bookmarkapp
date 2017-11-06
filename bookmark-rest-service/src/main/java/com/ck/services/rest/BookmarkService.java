package com.ck.services.rest;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ck.dto.Bookmark;
import com.ck.dto.User;

@Service
public interface BookmarkService {
	public void saveBookmark(Bookmark bookMark);
	public Bookmark getById(Long id);
	public List<Bookmark> getAllBookmarksForUserById(Long userID);
	public List<Bookmark> getAllBookmarksForUserByUsername(String userName);
}

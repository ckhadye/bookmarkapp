package com.ck.controllers;

import java.util.Arrays;

import javax.servlet.annotation.WebInitParam;

import org.mockito.internal.invocation.realmethod.RealMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ck.dto.Bookmark;
import com.ck.services.rest.BookmarkService;

//@SpringBootApplication
@RestController
public class BookmarkRestController {

	@Autowired
	@Qualifier(value="bookMarkService")
	private BookmarkService bookMarkService;
	
	@RequestMapping("/hello")
	public String sayHello(@RequestParam String name){
	System.out.println("test for git conflict");
	return "helloWorld "+name;	
	}

	@RequestMapping(path="/bookmark/{id}",method=RequestMethod.GET,produces="application/json; charset=UTF-8")
	public Bookmark getBookmarkById(@PathVariable(value="id") Long id){
		Bookmark bookMark = new Bookmark();
		bookMark.setId(id);
		System.out.println("Received bookmark id :"+id);
		bookMark.setUrl("test.com");
		bookMark.setTags(Arrays.asList("tag1","tag2","tag3"));
		return bookMark;	
	}
	
}

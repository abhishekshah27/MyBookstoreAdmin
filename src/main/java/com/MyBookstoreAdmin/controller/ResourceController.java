package com.MyBookstoreAdmin.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MyBookstoreAdmin.service.BookService;

@RestController
public class ResourceController {

	@Autowired
	private BookService bookService;
	
	@PostMapping(value="/book/removeList")
	public String removeList(
			@RequestBody ArrayList<String> bookIdList, Model model
			){
		
		for (String id : bookIdList) {
			String bookId =id.substring(8);
			bookService.removeOne(Long.parseLong(bookId));
		}
		
		return "delete success";
	}
}

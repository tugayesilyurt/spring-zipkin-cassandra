package com.book.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.service.dto.BookDto;
import com.book.service.dto.BookMapper;
import com.book.service.entity.Book;
import com.book.service.response.BookListResponse;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/v1/book")
@RequiredArgsConstructor
public class BookController {
	
	private final static List<Book> books = new ArrayList<>();

	static {
		books.add(new Book(1l,"Seyir","Piraye"));
		books.add(new Book(1l,"Adı: Aylin","Ayşe Kulin"));
		books.add(new Book(1l,"Dört Anlaşma","Don Miguel Ruiz"));
	}
	
	@GetMapping()
	public ResponseEntity<?> getAllBooks()
	{
		List<BookDto> bookDtoList = new ArrayList<BookDto>();
		books.stream().forEach(item -> {
			BookDto bookDto = BookMapper.INSTANCE.bookEntityToDto(item);
			bookDtoList.add(bookDto);
		});
		
		BookListResponse response = BookListResponse.builder().bookDto(bookDtoList).build();
		
		return new ResponseEntity<BookListResponse>(response, HttpStatus.OK);
	}

}

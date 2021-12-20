package com.book.service.response;

import java.util.List;

import com.book.service.dto.BookDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BookListResponse {
	private List<BookDto> bookDto;
}

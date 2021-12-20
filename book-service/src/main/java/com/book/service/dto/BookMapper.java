package com.book.service.dto;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.book.service.entity.Book;

@Mapper
public interface BookMapper {
	
	BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
	
	@Mapping(source="id",target="id")
	@Mapping(source="bookName",target="bookName")
	@Mapping(source="writer",target="writer")
	BookDto bookEntityToDto(Book book);

}

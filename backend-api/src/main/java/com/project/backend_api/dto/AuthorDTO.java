package com.project.backend_api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record AuthorDTO(Long id, String firstName, String lastName, List<BookDTO> booksWritten) {
}
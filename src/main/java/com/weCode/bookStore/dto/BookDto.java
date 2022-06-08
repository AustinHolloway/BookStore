package com.weCode.bookStore.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder //makes getter and setters
@AllArgsConstructor //create constructure
@NoArgsConstructor
public class BookDto {

    private String title;

}

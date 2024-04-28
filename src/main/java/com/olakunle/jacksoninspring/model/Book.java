package com.olakunle.jacksoninspring.model;


import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
//@JsonIgnoreProperties(ignoreUnknown = true)
//Note: This annotation ignores these properties,
@JsonIgnoreProperties({"noOfPages", "noOfChapters"})
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(alphabetic = true)
public class Book implements Serializable {
    private String title;
    private String author;
    private String publisher;
    private String noOfPages;
    private String noOfChapters;
//    @JsonIgnore() Note: Check why this keeps throwing error
    private String isbnNumber;
    private Category category;
}

enum Category {

    @JsonEnumDefaultValue
    FICTION("fiction"),
    NON_FICTION("non-fiction"),
    SELF_HELP("self-help"),
    ROMANCE("romance"),
    HISTORY("history");

    private final String value;


    Category(String value) {
        this.value = value;
    }

    @JsonValue
    String getValue() {
        return value;
    }
}
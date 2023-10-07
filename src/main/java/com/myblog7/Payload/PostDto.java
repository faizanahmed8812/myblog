package com.myblog7.Payload;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Data

public class PostDto {

    private Long id;

    @NotEmpty
    @Size(min = 2, message = "Post title should be at least 2 character")
    private String title;

    @NotEmpty
    @Size(min = 4, message = "Post description should be at least 4 character")
    private String description;


    @NotEmpty
    @Size(min = 5, message = "Post content should be at least 5 character")
    private String content;


}

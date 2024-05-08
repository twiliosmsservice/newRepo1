package com.everthing.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private long id;
    @NotEmpty
    @Size(min = 2, message = "title should be at least 2 characters")
    private String name;

    @NotEmpty
    @Size(min = 4,message = "title should be at least 2 characters")
    private String city;
    @NotEmpty
    @Size(min = 4,message = "title should be at least 2 characters")
    private String mobile;
    private String message;
}

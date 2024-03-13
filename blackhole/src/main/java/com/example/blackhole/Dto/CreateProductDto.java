package com.example.blackhole.Dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor
public class CreateProductDto {
    private String ProductName;
    private String ImageUrl;
    private String Category;
    private String price;
}

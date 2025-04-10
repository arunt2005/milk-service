package com.apps.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Milk {

    @NotNull(message = "Milk ID cannot be null")
    private Integer mid;

    @NotBlank(message = "Milk name cannot be blank")
    private String mName;

    @NotBlank(message = "Place cannot be blank")
    private String place;
}

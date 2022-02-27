package com.supmti.employee.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
public class DepartmentDTO {


    private Long id;
    @NotNull(message = "name is not allowed to be empty!")
    @Size(max = 50)
    private String name;
    @NotNull(message = "name is not allowed to be empty!")
    @Size(max = 50)
    private String location;
}

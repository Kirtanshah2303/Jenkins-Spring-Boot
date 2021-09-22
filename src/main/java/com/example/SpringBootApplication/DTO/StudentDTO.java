package com.example.SpringBootApplication.DTO;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    @NotBlank(message = "ID Should not be blanked")
    private String id;
    @NotNull(message = "Name must be there")
    private String name;
    @NotNull(message = "email must be valid")
    private String email;
    @NotNull(message = "Semester should be given")
    private String semester;
}

package com.example.demo_department.models.dto.req;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record DepartmentDTO(
        @NotBlank(message = "Tên phòng ban không được để trống")
        @Size(min = 5, max = 50, message = "Tên phòng ban phải từ 5 đến 50 ký tự")
         String name,

        @Size(max = 100, message = "Mô tả không được vượt quá 100 ký tự")
         String description
) {
}

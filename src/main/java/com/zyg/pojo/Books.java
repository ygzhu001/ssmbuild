package com.zyg.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int BookID;
    private String BookName;
    private String BookCount;
    private String detail;
}

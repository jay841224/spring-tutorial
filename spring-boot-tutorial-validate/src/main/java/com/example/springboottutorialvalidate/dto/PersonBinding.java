package com.example.springboottutorialvalidate.dto;

import lombok.Data;

import java.util.List;

@Data
public class PersonBinding {
    private String name;

    private List<String> nickNameList;
}

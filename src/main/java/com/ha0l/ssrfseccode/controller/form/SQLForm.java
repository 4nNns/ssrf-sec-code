package com.ha0l.ssrfseccode.controller.form;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class SQLForm {

    @NotNull
    private String username;

    @NotNull
    private String url;

    @NotNull
    private String passwd;
}

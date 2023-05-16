package com.springcloudtutorial.springfeignclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TodoModel {
    private String userId;
    private int id;
    private String title;
    private boolean completed;
}
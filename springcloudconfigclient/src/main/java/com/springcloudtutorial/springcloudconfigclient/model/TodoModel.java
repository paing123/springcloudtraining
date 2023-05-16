package com.springcloudtutorial.springcloudconfigclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class TodoModel {

    private String userId;
    private int id;
    private String title;
    private boolean completed;
}
package com.example.recyclerview;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Data {
    public String title;
    public String description;
    public int number;

    public Data(String title, String description, int number) {
        this.title = title;
        this.description = description;
        this.number = number;
    }

    public static List<Data> getDataList(int size) {
        return IntStream.rangeClosed(1, size)
                .mapToObj(i -> new Data("title" + i, "desp" + i, i))
                .collect(Collectors.toList());
    }
}

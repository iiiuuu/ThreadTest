package com.example.recyclerview;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Data {
    public static final int TYPE_ITEM = 0;
    public static final int TYPE_HEADER = 1;
    public int type;
    public String title;
    public String description;
    public int number;


    public Data(int type, String title, String description, int number) {
        this.type = type;
        this.title = title;
        this.description = description;
        this.number = number;
    }

    public static List<Data> getDataList(int size) {
        return IntStream.rangeClosed(0, size)
                .mapToObj(i -> {
                    if (i == 0) {
                        return new Data(TYPE_HEADER, "This is Header", "desp" + i, i);
                    } else {
                        return new Data(TYPE_ITEM, "title" + i, "desp" + i, i);
                    }
                })
                .collect(Collectors.toList());
    }
}

package com.example.recyclerview;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Data {
    public static final int TYPE_ITEM = 0;
    public static final int TYPE_HEADER = 1;
    private static final String title_prefix = "title";
    private static final String desp_prefix = "desp";
    private static final String avatar_prefix = "https://loremflickr.com/180/180?lock=";
    public int type;
    public String title;
    public String description;
    public int number;
    public String avatar;


    public Data(int type, String title, String description, int number, String avatar) {
        this.type = type;
        this.title = title;
        this.description = description;
        this.number = number;
        this.avatar = avatar;
    }

    public static List<Data> getDataList(int size) {
        return IntStream.rangeClosed(0, size)
                .mapToObj(i -> {
                    if (i == 0) {
                        return new Data(TYPE_HEADER, "This is Header", null, i, null);
                    } else {
                        return new Data(TYPE_ITEM, title_prefix + i, desp_prefix + i, i, avatar_prefix + i);
                    }
                })
                .collect(Collectors.toList());
    }
}

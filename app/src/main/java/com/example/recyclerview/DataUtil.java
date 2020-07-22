package com.example.recyclerview;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {
    public static List<Data> getDataList() {
        List<Data> dataList = new ArrayList<>();
        dataList.add(new Data("title1", "desp1", 1));
        dataList.add(new Data("title2", "desp2", 2));
        dataList.add(new Data("title3", "desp3", 3));
        dataList.add(new Data("title4", "desp4", 4));
        dataList.add(new Data("title5", "desp5", 5));
        dataList.add(new Data("title6", "desp6", 6));
        dataList.add(new Data("title7", "desp7", 7));
        dataList.add(new Data("title8", "desp8", 8));
        dataList.add(new Data("title9", "desp9", 9));
        dataList.add(new Data("title10", "desp10", 10));
        dataList.add(new Data("title11", "desp11", 11));
        dataList.add(new Data("title12", "desp12", 12));
        dataList.add(new Data("title13", "desp13", 13));
        dataList.add(new Data("title14", "desp14", 14));
        dataList.add(new Data("title15", "desp15", 15));
        return dataList;
    }
}

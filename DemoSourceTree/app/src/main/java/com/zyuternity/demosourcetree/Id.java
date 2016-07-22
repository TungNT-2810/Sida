package com.zyuternity.demosourcetree;

/**
 * Created by ZYuTernity on 7/22/2016.
 */
public class Id {
    private static int Id;

    public Id(int Id) {
        this.Id = Id;
    }

    public static int getId() {
        return Id;
    }
}

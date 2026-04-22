package com.gla.CopyListElements;
import java.util.List;
public class Copy {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number num : src) {
            dest.add(num);
        }
    }
}

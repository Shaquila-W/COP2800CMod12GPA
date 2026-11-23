// DataWrapper.java
// Shaquila Washington
// 11/21/26
// Generic wrapper class for any data object

package edu.fscj.cop2800c.util;

import java.util.List;

public class DataWrapper<T> {
    private T value;

    public DataWrapper() {
        this.value = null;
    }

    public DataWrapper(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static <T> void displayList(List<DataWrapper<T>> list) {
        for (DataWrapper<T> element : list) {
            // getValue drills down to the object's toString
            System.out.println(element.getValue());
        }
    }
}

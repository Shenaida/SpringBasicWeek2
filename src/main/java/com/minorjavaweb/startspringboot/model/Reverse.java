package com.minorjavaweb.startspringboot.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Reverse {
    Long id;
    String name;

    public Reverse() {
    }

    public Reverse(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    private static Map<Long, String> names = new HashMap<Long, String>();
    private static Long idIndex = 3L;

    public static List<String> list() {
        return new ArrayList<String>(names.values());
    }

    public static void create(String name) {
        idIndex += idIndex;
        String reversed = "";
        for(int i = name.length() - 1; i >= 0; i--)
        {
            reversed = reversed + name.charAt(i);
        }
        names.put(idIndex, reversed);
    }

    public static String getById(Long id) {
        return names.get(id);
    }

}

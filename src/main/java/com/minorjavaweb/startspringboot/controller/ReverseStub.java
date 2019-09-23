package com.minorjavaweb.startspringboot.controller;


import com.minorjavaweb.startspringboot.model.Reverse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReverseStub {
    private static Map<Long, Reverse> names = new HashMap<Long, Reverse>();
    private static Long idIndex = 3L;

    public static List<Reverse> list() {
        return new ArrayList<Reverse>(names.values());
    }

    public static Reverse create(Reverse name) {
        idIndex += idIndex;
        names.put(idIndex, name);
        return name;
    }
    public static Reverse get(Long id) {
        return names.get(id);
    }
}

package com.collections.map;

import com.collections.CollectionsAPI;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LHM extends HM implements CollectionsAPI {

    private LinkedHashMap<String, Integer> linkedHashMap;

    public LHM() {
        this.linkedHashMap = new LinkedHashMap();
    }
}

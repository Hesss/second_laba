package ru.codeinside.generics;

import java.util.ArrayList;
import java.util.List;

public class ValuesSeparator {

    private List<Object> list;

    public void addVariables(List inputValues) {
        list = inputValues;
    }

    public List getSeparatedBy(Class type) {
        List<Object> newList = new ArrayList<>();
        for(int i = 0; i<list.size();i++){
            if(list.get(i).getClass() == type){
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}

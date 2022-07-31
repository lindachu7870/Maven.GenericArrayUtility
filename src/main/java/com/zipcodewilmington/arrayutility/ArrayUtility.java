package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T extends Object> {
    public T[] inputArray;

    public ArrayUtility(T[] inputArray) {
        this.inputArray = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        ArrayList<T> mergedList = new ArrayList<>(Arrays.asList(inputArray));
        mergedList.addAll(Arrays.asList(arrayToMerge));
        Integer count = 0;

        for ( T value: mergedList) {
            if(value.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }

    public T[] removeValue(T valueToRemove) {
        ArrayList<T> copiedList = new ArrayList<>();
        for( T value : inputArray) {
            if(!value.equals(valueToRemove)) {
                copiedList.add(value);
            }
        }

        T[] removedList = Arrays.copyOf(inputArray, copiedList.size());

        for(int i = 0; i < copiedList.size(); i++) {
            removedList[i] = copiedList.get(i);
        }
        return removedList;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        ArrayList<T> mergedList = new ArrayList<>(Arrays.asList(inputArray));
        mergedList.addAll(Arrays.asList(arrayToMerge));
        T mostCommon = null;
        int counter = 0;

        for(int i = 0; i < mergedList.size(); i++) {
            int tmpCounter = 0;
            T tmpMostCommon = mergedList.get(i);
            for(int j = 0; j < mergedList.size(); j++) {
                if(mergedList.get(i).equals(mergedList.get(j))) {
                    tmpCounter++;
                }
            }
            if (tmpCounter > counter) {
                counter = tmpCounter;
                mostCommon = tmpMostCommon;
            }
        }
        return mostCommon;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        Integer count = 0;

        for ( T value: inputArray) {
            if(value.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }
}

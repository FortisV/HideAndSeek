package org.example;

import java.util.ArrayList;

public class FuzzyFinder {
    private final static String searchColor = "gold";
    int linearSearch(ArrayList<Fuzzy> fuzzies) {
        for(int i = 0; i < fuzzies.size(); ++i) {
            if(fuzzies.get(i).color.equals(searchColor)) {
                return i;
            }
        }
        return -1;
    }
    int binarySearch(ArrayList<Fuzzy> fuzzies) {
        int low = 0;
        int hig = fuzzies.size();
        while(low <= hig) {
            int mid = (hig + low) / 2;
            int com = searchColor.compareTo(fuzzies.get(mid).color);
            if(com < 0) {
                hig = mid - 1;
            } else if(com > 0) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

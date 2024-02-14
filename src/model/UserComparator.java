package model;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultComparator = o1.getLastName().compareTo(o2.getLastName());
        if (resultComparator == 0) {
            resultComparator = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultComparator == 0) {
                return o1.getMiddleName().compareTo(o2.getMiddleName());
            } else {
                return resultComparator;
            }
        } else {
            return resultComparator;
        }
    }
}

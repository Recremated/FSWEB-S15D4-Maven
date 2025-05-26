package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList<Object> {

    @Override
    public boolean add(Object item) {
        if (!this.contains(item)) {
            return super.add(item);
        }
        return false;
    }

    @Override
    public boolean remove(Object item) {
        boolean result = super.remove(item);
        if (result) {
            sort();
        }
        return result;
    }

    public void sort() {
        if (this.isEmpty()) return;

        Object first = this.get(0);

        if (first instanceof String) {
            this.sort((a, b) -> ((String) a).compareTo((String) b));
        } else if (first instanceof Number) {
            this.sort((a, b) -> {
                Double val1 = ((Number) a).doubleValue();
                Double val2 = ((Number) b).doubleValue();
                return val1.compareTo(val2);
            });
        } else if (first instanceof Comparable) {
            this.sort((a, b) -> ((Comparable) a).compareTo(b));
        } else {
            throw new IllegalArgumentException("Sıralanabilir olmayan tip.");
        }
    }
}
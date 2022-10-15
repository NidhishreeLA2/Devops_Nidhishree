package que2;

import java.util.ArrayList;
import java.util.Comparator;

public class Min_max {
	public void listcretion() {
	ArrayList<Integer> l = new ArrayList<Integer>();
	l.add(1);
	l.add(4);
	l.add(78);
	l.add(13);
	l.add(64);
	l.add(7);
	l.add(19);
	l.add(43);
	l.add(58);
	l.add(5);
	}
	int min(ArrayList<Integer> list) {
		int min = list.stream().min(Comparator.comparing(i -> i)).get();
		return min;
	}
	int max(ArrayList<Integer> list) {
		int max = list.stream().max(Comparator.comparing(i -> i)).get();
		return max;
	}

}

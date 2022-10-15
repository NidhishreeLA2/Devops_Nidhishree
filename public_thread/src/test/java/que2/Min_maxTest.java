package que2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class Min_maxTest {
	@Test
	public void check() {
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
		Min_max m = new Min_max();
		int min = m.min(l);
		int max = m.max(l);
		assertEquals(1,min);
		assertEquals(78,max);
		
		}
		
		
	}



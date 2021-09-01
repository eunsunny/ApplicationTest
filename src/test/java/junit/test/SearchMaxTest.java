package junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.green.biz.CalcUtil;

public class SearchMaxTest {

	@Test
	public void testSearchMax() {
		
		 int[] int1 = {1, 3, 4, 2};
         int[] int2 = {-12, -1, -3, -4, -2};
         
         assertEquals("CalcUtil Max", 4, CalcUtil.searchMax(int1));
         assertEquals("CalcUtil Max", -1, CalcUtil.searchMax(int2));
         
	}

}

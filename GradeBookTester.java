import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	private GradeBook gb1, gb2;
	@BeforeEach
	void setUp() throws Exception {
		gb1=new GradeBook(5);
		gb1.addScore(86);
		gb1.addScore(98);
		gb1.addScore(99);
		gb2=new GradeBook(5);
		gb2.addScore(67);
		gb2.addScore(79);
		gb2.addScore(80);
	}
	@AfterEach
	void tearDown() throws Exception {
		gb1=null;
		gb2=null;
	}
	@Test
	 public void addScore() {
		assertTrue(gb1.toString().equals("86.0 98.0 99.0 "));
		assertEquals(3, gb1.getScoreSize());
		assertTrue(gb2.toString().equals("67.0 79.0 80.0 "));
		assertEquals(3, gb2.getScoreSize());
    }
	@Test
	public void sum() {
		assertEquals(283, gb1.sum(), 0.001);
        assertEquals(226, gb2.sum(), 0.001);
	}
	@Test
	 public void minimum() 
    {
            assertEquals(86, gb1.minimum(), 0.001);
            assertEquals(67, gb2.minimum(), 0.001);        
    }
	@Test
	public void finalScoreTest()
    {
            assertEquals(197, gb1.finalScore(), 0.001);
            assertEquals(159, gb2.finalScore(), 0.001);    
    }
}

package com.javieromar.agility;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DragonTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DragonTest
{
	public Dragon	dragon;
	public Epee		excalibur;
	public Epee		twinkle;
	public Epee		caliburnus;

	/**
	 * Default constructor for test class DragonTest
	 */
	public DragonTest() {
	}

	/**
	 * Sets up the test fixture.
	 *
	 * Called before every test case method.
	 */
	@Before
	public void setUp() {
		initializerVariables();
	}

	private void initializerVariables() {
		dragon = new Dragon("rouge", 666);
		excalibur = new Epee("Excalibur");
		caliburnus = new Epee("Caliburnus");
		twinkle = new Epee("Twinkle");
	}

	/**
	 * Tears down the test fixture.
	 *
	 * Called after every test case method.
	 */
	@After
	public void tearDown() {
	}

	@Test
	public void temperatureSouffleDragonTest() {
		assertEquals(305.05, dragon.temperatureSouffleDragon(), 0.1);
	}

	@Test
	public void testEpees() {
		dragon.addEpee(excalibur);
		dragon.addEpee(caliburnus);
		dragon.addEpee(twinkle);

		assertEquals("J'ai 3 epees", dragon.parlerDeMesEpees());
	}
}

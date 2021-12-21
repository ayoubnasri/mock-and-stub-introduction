package parrot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParrotTest {

	@Test
	public void getSpeedOfEuropeanParrot() throws Exception {
		EuropeanParrot europeanParrot = new EuropeanParrot(0, false);
        assertEquals(12.0, europeanParrot.getSpeed(), 0.0);
	}
	
	@Test
    public void getSpeedOfAfricanParrot_With_One_Coconut() {
        AfricanParrot africanParrot = new AfricanParrot(1, 0, false);
        assertEquals(3.0, africanParrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
        AfricanParrot africanParrot = new AfricanParrot(2, 0, false);
        assertEquals(0.0, africanParrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts() {
        AfricanParrot africanParrot = new AfricanParrot(0, 0, false);
        assertEquals(12.0, africanParrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_nailed() {
    	NorwegianParrot norwegianParrot = new NorwegianParrot(0, false);
        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 1.5, true);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed() {
        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 1.5, false);
        assertEquals(18.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
        Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 4, false);
        assertEquals(24.0, parrot.getSpeed(), 0.0);
    }
}

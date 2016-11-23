package edu.orangecoastcollege.cs273.mpaulding.ocmusicevents;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by nhoang53 on 11/22/2016.
 */
public class MusicEventTest {

    private MusicEvent mMusicEvent;

    @Before
    public void setUp() throws Exception {

        mMusicEvent = new MusicEvent();

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getTitle() throws Exception {
        //assertEquals("You done goofed.", "", mMusicEvent.getTitle());
        //assertNull("You done Goofed.", mMusicEvent.getTitle());
        mMusicEvent.setTitle("Test title");
        assertEquals("Test title", mMusicEvent.getTitle());
    }

    /*@Test
    public void setTitle() throws Exception { // don't need this because if getTitle test correct, so this correct

    }*/

    @Test
    public void getDate() throws Exception {
        mMusicEvent.setDate("October 7");
        assertEquals("October 7", mMusicEvent.getDate());
    }

    @Test
    public void setDate() throws Exception {
        mMusicEvent.setDate("October 7");
    }

    @Test
    public void getDay() throws Exception {
        mMusicEvent.setDay("Friday");
        assertEquals("Friday", mMusicEvent.getDay());
    }

    @Test
    public void setDay() throws Exception {
        mMusicEvent.setDay("Friday");
    }

    @Test
    public void getTime() throws Exception {
        mMusicEvent.setTime("7:00 PM");
        assertEquals("7:00 PM", mMusicEvent.getTime());
    }

    @Test
    public void setTime() throws Exception {
        mMusicEvent.setTime("7:00 PM");
    }

    @Test
    public void getLocation() throws Exception {
        mMusicEvent.setLocation("Irvine Meadows (formerly Verizon Wireless)");
        assertEquals("Irvine Meadows (formerly Verizon Wireless)", mMusicEvent.getLocation());
    }

    @Test
    public void setLocation() throws Exception {
        mMusicEvent.setLocation("Irvine Meadows (formerly Verizon Wireless)");
    }

    @Test
    public void getAddress1() throws Exception {
        mMusicEvent.setAddress1("8808 Irvine Center Drive");
        assertEquals("8808 Irvine Center Drive", mMusicEvent.getAddress1());
    }

    @Test
    public void setAddress1() throws Exception {
        mMusicEvent.setAddress1("8808 Irvine Center Drive");
    }

    @Test
    public void getAddress2() throws Exception {
        mMusicEvent.setAddress2("Irvine, California 92618");
        assertEquals("Irvine, California 92618", mMusicEvent.getAddress2());
    }

    @Test
    public void setAddress2() throws Exception {
        mMusicEvent.setAddress2("Irvine, California 92618");
    }

    @Test
    public void getImageName() throws Exception {
        mMusicEvent.setImageName("Blink182.jpeg");
        assertEquals("Blink182.jpeg", mMusicEvent.getImageName());
    }

    @Test
    public void setImageName() throws Exception {
        mMusicEvent.setImageName("Blink182.jpeg");
    }

}
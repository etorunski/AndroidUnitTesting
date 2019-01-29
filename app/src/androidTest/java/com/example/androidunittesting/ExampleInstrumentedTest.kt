package com.example.androidunittesting

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    lateinit var objectsToTest : ArrayList<String>

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.example.androidunittesting", appContext.packageName)

        assertNotNull(objectsToTest)
        assertEquals("The first object was not First", "First", objectsToTest.get(0))  //test that the first object is "First"
        assertNotEquals("Second", objectsToTest.get(0))
    }

    @Test
    fun secondTestCase()
    {
        assertTrue(objectsToTest.size > 0)
    }

    @Before
    fun setUpArray(){
        objectsToTest = ArrayList<String>();
        objectsToTest.add("First")
        objectsToTest.add("Second")
        objectsToTest.run{
            add("Third")
            add("Fourth")
            add("Fifth")
        }


    }
}

package com.test;

import static org.junit.Assert.*;
import org.junit.*;
import mockit.*;

public final class SomeClassTest {
    // @Tested SomeClass sut;
    SomeClass sut;
    // @NonStrict
    SomeOtherClass mock;

    public void testSomething() {
        new Expectations() {
            {
                mock.performSomeOperation(anyInt);
                result = "mocked";
            }
        };

        assertEquals("mocked", sut.doSomething(123));
    }

    @Test
    public void testSomethin_1() {
        int i = 1;
        sut = new SomeClass();
        assertEquals("data2", sut.doSomething(i));

    }

    @Test
    public void testSomethin_2() {
        int i = 3;
        sut = new SomeClass();
        assertEquals("data3", sut.doSomething(i));

    }
}

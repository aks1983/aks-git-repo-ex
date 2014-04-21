package com.test;

public final class SomeClass {
    public String doSomething(final int i) {
        SomeOtherClass other = new SomeOtherClass("data");
        return other.performSomeOperation(i);
    }
}

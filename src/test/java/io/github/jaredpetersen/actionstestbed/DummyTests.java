package io.github.jaredpetersen.actionstestbed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DummyTests {
  @Test
  public void doSomethingReturnsSomething() {
    Dummy dummy = new Dummy();

    assertEquals("something else", dummy.doSomething());
  }
}

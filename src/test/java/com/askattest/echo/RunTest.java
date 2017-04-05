package com.askattest.echo;

import static org.junit.Assert.*;

import org.junit.Test;

public class RunTest {
  @Test
  public void testEchoNull() throws Exception {
    assertNull(Run.echo(null));
  }

  @Test
  public void testEchoEmpty() throws Exception {
    assertEquals("", Run.echo(new String[]{}));
  }

  @Test
  public void testEchoOneElement() throws Exception {
    assertEquals("Hey", Run.echo(new String[]{"Hey"}));
  }

  @Test
  public void testEchoOneMultipleElements() throws Exception {
    assertEquals("Hey how are you?", Run.echo(new String[]{"Hey", "how", "are", "you?"}));
  }
}

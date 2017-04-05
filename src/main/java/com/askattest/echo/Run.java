package com.askattest.echo;

public final class Run {
  public static void main(String[] args) {
    System.out.println(echo(args));
  }

  public static String echo(String[] args) {
    if (args == null) {
      return null;
    }

    return String.join(" ", args);
  }
}

package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "World";

    assertThat(greeter.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

  @Test
  public void greetShouldIncludeGreetingMessage() {
    String someone = "Wordl is so cool";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

  @Test
  public void greetShouldIncludeGreetingMessage1() {
    String someone = "Wordl is so cool1";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

  @Test
  public void greetShouldIncludeGreetingMessage2() {
    String someone = "Wordl is so cool1 or not";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

  @Test
  public void greetShouldIncludeGreetingMessage3() {
    String someone = "Wordl is so cool1 or not adad";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

  @Test
  public void greetShouldIncludeGreetingMessage4() {
    String someone = "Wordl is so cool1 or not adad bla bla bla";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
}

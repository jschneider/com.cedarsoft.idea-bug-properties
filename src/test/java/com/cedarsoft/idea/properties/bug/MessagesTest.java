package com.cedarsoft.idea.properties.bug;

import org.junit.jupiter.api.*;

/**
 * @author Johannes Schneider (<a href="mailto:js@cedarsoft.com">js@cedarsoft.com</a>)
 */
class MessagesTest {
  @Test
  void testMessages() throws Exception {
    Messages.get("existing-prop"); //existing property
    Messages.get("non-existing-prop"); //existing property
  }
}
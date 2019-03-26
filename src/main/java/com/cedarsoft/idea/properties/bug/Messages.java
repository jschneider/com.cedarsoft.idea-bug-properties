package com.cedarsoft.idea.properties.bug;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.annotation.Nonnull;

import org.jetbrains.annotations.PropertyKey;

/**
 * @author Johannes Schneider (<a href="mailto:js@cedarsoft.com">js@cedarsoft.com</a>)
 */
public class Messages {
  private static final String BUNDLE_NAME = "com.cedarsoft.idea.properties.bug.messages"; //$NON-NLS-1$
  private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, Locale.getDefault(), Messages.class.getClassLoader());

  private Messages() {
  }

  @Nonnull
  public static String get(@PropertyKey(resourceBundle = BUNDLE_NAME) @Nonnull String key) {
    try {
      return RESOURCE_BUNDLE.getString(key);
    }
    catch (MissingResourceException ignore) {
      return key;
    }
  }

}

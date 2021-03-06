package com.welovecoding.app.firetv.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

  /**
   * An array of sample (dummy) items.
   */
  public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

  /**
   * A map of sample (dummy) items, by ID.
   */
  public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

  static {
    // Add 3 sample items.
    addItem(new DummyItem("1", "Android"));
    addItem(new DummyItem("2", "Java"));
    addItem(new DummyItem("22", "Giraffe"));
    addItem(new DummyItem("222", "Giraffee"));
    addItem(new DummyItem("3", "Python"));
    addItem(new DummyItem("4", "Zebra"));
  }

  private static void addItem(DummyItem item) {
    ITEMS.add(item);
    ITEM_MAP.put(item.id, item);
  }

}

package com.efor18.chartstest.dummy;

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
       
        addItem(new DummyItem("1", "Basic line", "charts1.html"));
        addItem(new DummyItem("2", "Spline with symbols", "charts2.html"));
        addItem(new DummyItem("3", "Time series, zoomable", "charts3.html"));
        addItem(new DummyItem("4", "Basic bar","charts4.html"));
        addItem(new DummyItem("5", "Pie with gradient fill","charts5.html"));
        addItem(new DummyItem("6", "Spline updating each second","charts6.html"));
        addItem(new DummyItem("7", "Click to add a point","charts7.html"));
        addItem(new DummyItem("8", "Master-detail chart","charts8.html"));
        addItem(new DummyItem("9", "Column, line and pie","charts9.html"));
        addItem(new DummyItem("10", "Dual axes, line and column","charts10.html"));
        addItem(new DummyItem("11", "Polar chart","charts11.html"));
        
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String content;
        public String fileName;

        public DummyItem(String id, String content, String fileName) {
            this.id = id;
            this.content = content;
            this.fileName = fileName;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}

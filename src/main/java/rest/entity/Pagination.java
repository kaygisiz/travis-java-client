package rest.entity;

import com.google.gson.annotations.SerializedName;

public class Pagination {
    private int limit;
    private int offset;
    private int count;
    @SerializedName("is_first")
    private boolean first;
    @SerializedName("is_last")
    private boolean last;
    // next null
    // prev null
    // first
    // last

    public int getLimit() {
        return limit;
    }

    public int getOffset() {
        return offset;
    }

    public int getCount() {
        return count;
    }

    public boolean isFirst() {
        return first;
    }

    public boolean isLast() {
        return last;
    }
}

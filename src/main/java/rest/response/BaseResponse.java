package rest.response;

import com.google.gson.annotations.SerializedName;
import rest.entity.Pagination;

public class BaseResponse {
    @SerializedName("@type")
    protected String type;
    @SerializedName("@href")
    protected String href;
    @SerializedName("@representation")
    protected String representation;
    @SerializedName("@pagination")
    protected Pagination pagination;
    @SerializedName("error_type")
    protected String errorType;
    @SerializedName("error_message")
    protected String errorMessage;

    public boolean isSuccess() {
        return !"error".equals(type);
    }

    public String getType() {
        return type;
    }

    public String getHref() {
        return href;
    }

    public String getRepresentation() {
        return representation;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public String getErrorType() {
        return errorType;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}

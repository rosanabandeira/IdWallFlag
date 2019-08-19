package android.studio.idwallflag.models;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Response {


    @Expose
    @SerializedName("category")
    public final String category;

    @Expose
    @SerializedName("images")
    public final List<String> images;



    public Response(String category, List<String> images) {
        this.category = category;
        this.images = images;
    }

    public String getCategory() {
        return category;
    }

    public List<String> getImages() {
        return images;
    }
}

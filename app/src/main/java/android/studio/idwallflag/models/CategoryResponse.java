package android.studio.idwallflag.models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverter;
import android.support.annotation.NonNull;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Entity(tableName = "Categories")
public class CategoryResponse {


    @Expose
    @PrimaryKey
    @NonNull
    @SerializedName("category")
    public String category;

    @Expose
    @SerializedName("list")
    public List<String> list;

    public String getCategory() {
        return category;
    }

    public List<String> getList() {
        return list;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public static class Builder {

        private String category;
        private List<String> list;

        public CategoryResponse.Builder withCategory(String category) {
            this.category = category;
            return this;
        }

        public CategoryResponse.Builder withList(List<String> list) {
            this.list = list;
            return this;
        }

        public CategoryResponse build() {
            CategoryResponse categoryResponse = new CategoryResponse();
            categoryResponse.category = category;
            categoryResponse.list = list;
            return categoryResponse;
        }

    }

}

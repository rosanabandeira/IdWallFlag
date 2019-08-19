package android.studio.idwallflag.data;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import android.studio.idwallflag.models.CategoryResponse;

import java.util.List;




//@Dao
public interface CategoryResponseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(CategoryResponse categoryResponse);


    @Update()
    void update(CategoryResponse categoryResponse);


    @Delete()
    void delete(CategoryResponse categoryResponse);


    @Query("Select * from Categories")
    LiveData<List<CategoryResponse>> getAll();


}

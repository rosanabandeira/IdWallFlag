package android.studio.idwallflag.activities;


import android.content.Intent;
import android.os.Bundle;
import android.studio.idwallflag.MainActivity;
import android.studio.idwallflag.R;
import android.studio.idwallflag.RecyclerAdapter;
import android.studio.idwallflag.models.CategoryResponse;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.facebook.stetho.Stetho;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

import static android.studio.idwallflag.api.RetrofitService.getApiService;

public class ActivityPug extends AppCompatActivity {

    private static final String TAG = "erroapi";
    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private List<String> listImages = new ArrayList<>();
    CategoryResponse categoryResponse = new CategoryResponse();
    private TextView textViewCategory;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener;


    {
        mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        Intent intent1 = new Intent(ActivityPug.this, MainActivity.class);
                        startActivity(intent1);
                        return true;
                    case R.id.navigation_husky:
                        Intent intent2 = new Intent(ActivityPug.this, ActivityHusky.class);
                        startActivity(intent2);
                        return true;
                    case R.id.navigation_hound:
                        Intent intent3 = new Intent(ActivityPug.this, ActivityHound.class);
                        startActivity(intent3);
                        return true;
                    case R.id.navigation_pug:

                    case R.id.navigation_labrador:
                        Intent intent4 = new Intent(ActivityPug.this, ActivityLabrador.class);
                        startActivity(intent4);
                        return true;
                }
                return false;
            }
        };
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pug);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);

        Stetho.initializeWithDefaults(this);


        final Call<CategoryResponse> responseCall = getApiService().categoryresponsepug("pug");
        responseCall.enqueue(new Callback<CategoryResponse>() {
            @Override
            public void onResponse(Call<CategoryResponse> call, retrofit2.Response<CategoryResponse> response) {
                if (!response.isSuccessful()) {
                    Log.i(TAG, "nao logou " + response.body());


                } else {

                    CategoryResponse categoryResponse1 = response.body();
                    textViewCategory.setText(categoryResponse1.getCategory());
                    listImages.add(String.valueOf(categoryResponse.getList()));
                    adapter.setList(response.body().getList());
                    adapter.notifyDataSetChanged();

                }
            }

            @Override
            public void onFailure(Call<CategoryResponse> call, Throwable t) {
                Log.e(TAG, "ERRO: " + t.getMessage());
            }
        });

        textViewCategory = findViewById(R.id.textViewCategory_pug);


        recyclerView = findViewById(R.id.recyclerViewPug);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);

        adapter = new RecyclerAdapter(listImages);
        recyclerView.setAdapter(adapter);
    }

}

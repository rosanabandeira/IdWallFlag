package android.studio.idwallflag;

import android.content.Intent;
import android.os.Bundle;
import android.studio.idwallflag.activities.ActivityHound;
import android.studio.idwallflag.activities.ActivityHusky;
import android.studio.idwallflag.activities.ActivityLabrador;
import android.studio.idwallflag.activities.ActivityPug;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener;

    {
        mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        return true;
                    case R.id.navigation_husky:
                        Intent intent1 = new Intent(MainActivity.this, ActivityHusky.class);
                        startActivity(intent1);
                        return true;
                    case R.id.navigation_hound:
                        Intent intent2 = new Intent(MainActivity.this, ActivityHound.class);
                        startActivity(intent2);
                        return true;
                    case R.id.navigation_pug:
                        Intent intent3 = new Intent(MainActivity.this, ActivityPug.class);
                        startActivity(intent3);
                        return true;
                    case R.id.navigation_labrador:
                        Intent intent4 = new Intent(MainActivity.this, ActivityLabrador.class);
                        startActivity(intent4);
                        return true;
                }
                return false;
}
        };
                }

                Button buttonHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);



    }

}

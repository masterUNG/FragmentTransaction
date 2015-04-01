package appewtc.masterung.fragmenttransaction;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;


public class MainActivity extends FragmentActivity{

    private Button btnFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //About Main Fragment
        MainFragment objMainFragment = new MainFragment();
        FragmentManager objFragmentManager = getSupportFragmentManager();
        FragmentTransaction objFragmentTransaction = objFragmentManager.beginTransaction();
        objFragmentTransaction.add(R.id.fragment_container, objMainFragment);
        objFragmentTransaction.commit();

        //Click MainButton
        Button btnMain = (Button) findViewById(R.id.btnMain);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainFragment callMainFragment = new MainFragment();
                FragmentManager callFragmentManager = getSupportFragmentManager();
                FragmentTransaction callFragmentTransaction = callFragmentManager.beginTransaction();
                callFragmentTransaction.add(R.id.fragment_container, callMainFragment);
                callFragmentTransaction.commit();
            }   // event
        });

        btnFirst = (Button) findViewById(R.id.btnFirst);
        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirstFragment objFirstFragment = new FirstFragment();
                FragmentManager objFragmentManager = getSupportFragmentManager();
                FragmentTransaction objFragmentTransaction = objFragmentManager.beginTransaction();
                objFragmentTransaction.add(R.id.fragment_container, objFirstFragment);
                objFragmentTransaction.commit();
            }   // event
        });

    }   // onCreate


}   // Main Class

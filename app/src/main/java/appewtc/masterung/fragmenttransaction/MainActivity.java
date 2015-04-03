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

        // เป็นการสร้าง Fragment แรกไปที่ Activity ก่อน
        MainFragment objMainFragment = new MainFragment();
        FragmentManager objFragmentManager = getSupportFragmentManager();
        FragmentTransaction objFragmentTransaction = objFragmentManager.beginTransaction();
        objFragmentTransaction.add(R.id.fragment_container, objMainFragment);   // add Fragment
        objFragmentTransaction.commit();

        //Click MainButton
        Button btnMain = (Button) findViewById(R.id.btnMain);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainFragment callMainFragment = new MainFragment(); // Create Instant MainFragment
                FragmentManager callFragmentManager = getSupportFragmentManager();
                FragmentTransaction callFragmentTransaction = callFragmentManager.beginTransaction();
//                callFragmentTransaction.add(R.id.fragment_container, callMainFragment);
                callFragmentTransaction.replace(R.id.fragment_container, callMainFragment);
                callFragmentTransaction.addToBackStack(null);
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
//                objFragmentTransaction.add(R.id.fragment_container, objFirstFragment);
                objFragmentTransaction.replace(R.id.fragment_container, objFirstFragment);
                objFragmentTransaction.addToBackStack(null);
                objFragmentTransaction.commit();
            }   // event
        });

    }   // onCreate

    public void clickSecond(View view) {
        SecondFragment objSecondFragment = new SecondFragment();                            // Create Instant
        FragmentManager objFragmentManager = getSupportFragmentManager();
        FragmentTransaction objFragmentTransaction = objFragmentManager.beginTransaction(); // Create Transaction
//        objFragmentTransaction.add(R.id.fragment_container, objSecondFragment);
        objFragmentTransaction.replace(R.id.fragment_container, objSecondFragment);
        objFragmentTransaction.addToBackStack(null);
        objFragmentTransaction.commit();
    }


}   // Main Class

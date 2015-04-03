package appewtc.masterung.fragmenttransaction;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by masterUNG on 4/2/15 AD.
 */
public class SecondFragment extends Fragment{

    private Button btnButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_second, container, false);
        btnButton = (Button) rootView.findViewById(R.id.button3);
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeSecondFragment();
            }
        });
        return rootView;
    }

    private void closeSecondFragment() {
        FragmentManager objFragmentManager = getFragmentManager();  // Create Fragment Manager
        FragmentTransaction objFragmentTransaction = objFragmentManager.beginTransaction(); // Create Transaction
        objFragmentTransaction.remove(SecondFragment.this);
        objFragmentTransaction.commit();
    }
}   // Main Class

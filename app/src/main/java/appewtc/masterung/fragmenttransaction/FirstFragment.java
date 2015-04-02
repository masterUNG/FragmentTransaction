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
public class FirstFragment extends Fragment {

    private Button btnClose;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_first, container, false);
        btnClose = (Button) rootView.findViewById(R.id.button2);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeFragment();
            }
        });
        return rootView;
    }   // onCreateView

    private void closeFragment() {
        FragmentManager objFragmentManager = getFragmentManager();
        FragmentTransaction objFragmentTransaction = objFragmentManager.beginTransaction();
        objFragmentTransaction.remove(FirstFragment.this);
        objFragmentTransaction.commit();
    }


}   // Main Class

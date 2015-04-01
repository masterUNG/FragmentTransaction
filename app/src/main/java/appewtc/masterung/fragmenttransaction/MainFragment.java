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
 * Created by masterUNG on 4/1/15 AD.
 */
public class MainFragment extends Fragment{

    private Button btnClose;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        btnClose = (Button) rootView.findViewById(R.id.button);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager objFragmentManager = getFragmentManager();
                FragmentTransaction objFragmentTransaction = objFragmentManager.beginTransaction();
                objFragmentTransaction.remove(MainFragment.this);
                objFragmentTransaction.commit();
            }
        });
        return rootView;
    }
}   // Main Class

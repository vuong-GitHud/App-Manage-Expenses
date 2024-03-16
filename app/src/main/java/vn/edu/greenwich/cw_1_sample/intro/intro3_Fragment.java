package vn.edu.greenwich.cw_1_sample.intro;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import vn.edu.greenwich.cw_1_sample.MainActivity;
import vn.edu.greenwich.cw_1_sample.R;


public class intro3_Fragment extends Fragment {
        private Button btn_start;
        private  View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView= inflater.inflate(R.layout.fragment_intro3, container, false);

        btn_start = mView.findViewById(R.id.btn_intro);
        btn_start.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), MainActivity.class);
            getActivity().startActivity(intent);
        });
        return mView;
    }
}
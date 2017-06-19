package loopeer.com.appbarlayout_spring_extension;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import loopeer.com.appbarlayout_spring_extension.dummy.DummyContent;


/**
 * A simple {@link Fragment} subclass.
 */
public class TwoFragment extends Fragment {


    public static TwoFragment newInstance() {
        TwoFragment twoFragment = new TwoFragment();
        Bundle args = new Bundle();
        twoFragment.setArguments(args);
        return twoFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new MyItemRecyclerViewAdapter(DummyContent.ITEMS));
        return view;
    }


}

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
public class OneFragment extends Fragment {


    public static OneFragment newInstance() {
        OneFragment oneFragment = new OneFragment();
        Bundle args = new Bundle();
        oneFragment.setArguments(args);
        return oneFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new MyItemRecyclerViewAdapter(DummyContent.ITEMS));
        return view;
    }

}

package cn.edu.gdmec.android.myapplication;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.TextView;

public class FgNewsListFragment extends Fragment  {
    private int type;
    private TextView tv_news;

    public static FgNewsListFragment newInstance(int type){
        Bundle args = new Bundle();
        FgNewsListFragment fragment = new FgNewsListFragment();
        args.putInt("type",type);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fg_news_list, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        type = getArguments().getInt("type");
        tv_news = (TextView) view.findViewById(R.id.tv_news);
        switch (type){
            case FgNewsFragment.NEW_TYPE_TOP:
                tv_news.setText("TOP");
                break;
            case FgNewsFragment.NEW_TYPE_NBA:
                tv_news.setText("NBA");
                break;
            case FgNewsFragment.NEW_TYPE_JOKES:
                tv_news.setText("笑话");
                break;
        }
    }

}

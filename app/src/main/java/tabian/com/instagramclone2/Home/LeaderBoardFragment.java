package tabian.com.instagramclone2.Home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import tabian.com.instagramclone2.R;

/**
 * Created by User on 5/28/2017.
 */

public class LeaderBoardFragment extends Fragment {
    private static final String TAG = "LeaderBoard Fragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_camera, container, false);

        return view;
    }

    private static ArrayList<String>[] Leaderboard = new ArrayList[2];




    public static void displayLeaderBoard(ArrayList<String> LeaderBoard){

    }
}

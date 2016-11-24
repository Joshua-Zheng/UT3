package com.sunclub.ut3;

import android.app.Fragment;
import android.os.Bundle;

public class GameFragment extends Fragment{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setRetainInstance(true);
        //initGame();
    }
    public void putState(String gameData) {
    }
}

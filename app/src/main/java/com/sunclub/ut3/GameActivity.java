package com.sunclub.ut3;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class GameActivity extends Activity{
    public static final String KEY_RESTORE ="key_restore";
    public static final String PREF_RESTORE ="pref_restore";
    private GameFragment mGameFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mGameFragment = (GameFragment)getFragmentManager().findFragmentById(R.id.fragment_game);
        boolean restore = getIntent().getBooleanExtra(KEY_RESTORE, false);
        if (restore){
            String gameData = getPreferences(MODE_PRIVATE).getString(PREF_RESTORE, null);
            if (gameData != null){
                mGameFragment.putState(gameData);
            }
        }
        Log.d("UT3", "restore="+restore);
    }


}

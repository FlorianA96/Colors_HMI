package example.colors;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by Florian Anders on 04.01.2018.
 */

public class Game extends SurfaceView implements SurfaceHolder.Callback {
    private Thread thread;
    public Game(Context context){
        super(context);
        getHolder().addCallback(this);
    }
}

package buttley.nyc.esteban.magicbeans.model.boards.widgets;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import java.util.List;

/**
 * Created by Spoooon on 1/18/2015.
 */
public abstract class BoardWidget {

    protected List<Bitmap> mBitmaps;
    protected int mXCoordinate;
    protected int mYCoordinate;

    public BoardWidget() {
        setmBitmaps();
    }
    //TODO fix bitmaps


    public List<Bitmap> getmBitmaps() {
        return mBitmaps;
    }

    public void setmBitmaps() {

    }

    //TODO change placeWidget to setStartingCoordinates
    public abstract void placeWidget(Bitmap bitmap);

    public abstract void draw(Canvas canvas);

    public abstract void setStartingCoordinates();
    public abstract void setStartingCoordinates(int X, int Y);
}

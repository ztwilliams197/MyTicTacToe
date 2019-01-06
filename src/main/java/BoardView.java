import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.graphics.*;

public class BoardView extends View {

    private float mWidth;
    private float mHeight;
    private Paint mTextPaint;
    private Paint mBoardPaint;

    private void init()
    {
        mTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mTextPaint.setColor(Color.BLACK);
        mTextPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mTextPaint.setTextAlign(Paint.Align.CENTER);
        mTextPaint.setTextSize(40f);
        mBoardPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mBoardPaint.setColor(Color.GRAY);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh)
    {
        mWidth = w;
        mHeight = h;
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);

        //Draw the Board
        canvas.drawLine(0,mHeight/3, mWidth, mHeight/3, mBoardPaint);
        canvas.drawLine(0,mHeight*2/3,mWidth,mHeight*2/3, mBoardPaint);
        canvas.drawLine(mWidth/3,0,mWidth/3,mHeight,mBoardPaint);
        canvas.drawLine(mWidth*2/3,0,mWidth*2/3,mHeight,mBoardPaint);
    }

    public BoardView(Context context) {
        super(context);
        init();
    }

    public BoardView(Context context, @androidx.annotation.Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BoardView(Context context, @androidx.annotation.Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
}

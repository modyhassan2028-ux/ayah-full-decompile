package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import s1.c;
import s1.p;

/* JADX INFO: loaded from: classes.dex */
public class Placeholder extends View {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12284r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f12285s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12286t;

    public Placeholder(Context context) {
        super(context);
        this.f12284r = -1;
        this.f12285s = null;
        this.f12286t = 4;
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        super.setVisibility(this.f12286t);
        this.f12284r = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f22039c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f12284r = typedArrayObtainStyledAttributes.getResourceId(index, this.f12284r);
                } else if (index == 1) {
                    this.f12286t = typedArrayObtainStyledAttributes.getInt(index, this.f12286t);
                }
            }
        }
    }

    public View getContent() {
        return this.f12285s;
    }

    public int getEmptyVisibility() {
        return this.f12286t;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View viewFindViewById;
        if (this.f12284r == i10) {
            return;
        }
        View view = this.f12285s;
        if (view != null) {
            view.setVisibility(0);
            ((c) this.f12285s.getLayoutParams()).f21882a0 = false;
            this.f12285s = null;
        }
        this.f12284r = i10;
        if (i10 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f12286t = i10;
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12284r = -1;
        this.f12285s = null;
        this.f12286t = 4;
        a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12284r = -1;
        this.f12285s = null;
        this.f12286t = 4;
        a(attributeSet);
    }
}

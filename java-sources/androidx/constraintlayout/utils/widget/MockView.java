package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import s1.p;

/* JADX INFO: loaded from: classes.dex */
public class MockView extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12239A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f12240B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Paint f12241r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Paint f12242s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Paint f12243t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12244u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12245v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f12246w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f12247x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12248y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12249z;

    public MockView(Context context) {
        super(context);
        this.f12241r = new Paint();
        this.f12242s = new Paint();
        this.f12243t = new Paint();
        this.f12244u = true;
        this.f12245v = true;
        this.f12246w = null;
        this.f12247x = new Rect();
        this.f12248y = Color.argb(255, 0, 0, 0);
        this.f12249z = Color.argb(255, 200, 200, 200);
        this.f12239A = Color.argb(255, 50, 50, 50);
        this.f12240B = 4;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f22043h);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f12246w = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 4) {
                    this.f12244u = typedArrayObtainStyledAttributes.getBoolean(index, this.f12244u);
                } else if (index == 0) {
                    this.f12248y = typedArrayObtainStyledAttributes.getColor(index, this.f12248y);
                } else if (index == 2) {
                    this.f12239A = typedArrayObtainStyledAttributes.getColor(index, this.f12239A);
                } else if (index == 3) {
                    this.f12249z = typedArrayObtainStyledAttributes.getColor(index, this.f12249z);
                } else if (index == 5) {
                    this.f12245v = typedArrayObtainStyledAttributes.getBoolean(index, this.f12245v);
                }
            }
        }
        if (this.f12246w == null) {
            try {
                this.f12246w = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        int i11 = this.f12248y;
        Paint paint = this.f12241r;
        paint.setColor(i11);
        paint.setAntiAlias(true);
        int i12 = this.f12249z;
        Paint paint2 = this.f12242s;
        paint2.setColor(i12);
        paint2.setAntiAlias(true);
        this.f12243t.setColor(this.f12239A);
        this.f12240B = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.f12240B);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f12244u) {
            width--;
            height--;
            float f3 = width;
            float f7 = height;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, 0.0f, f3, f7, this.f12241r);
            canvas2.drawLine(0.0f, f7, f3, 0.0f, this.f12241r);
            canvas2.drawLine(0.0f, 0.0f, f3, 0.0f, this.f12241r);
            canvas2.drawLine(f3, 0.0f, f3, f7, this.f12241r);
            canvas2.drawLine(f3, f7, 0.0f, f7, this.f12241r);
            canvas2.drawLine(0.0f, f7, 0.0f, 0.0f, this.f12241r);
        } else {
            canvas2 = canvas;
        }
        String str = this.f12246w;
        if (str == null || !this.f12245v) {
            return;
        }
        int length = str.length();
        Paint paint = this.f12242s;
        Rect rect = this.f12247x;
        paint.getTextBounds(str, 0, length, rect);
        float fWidth = (width - rect.width()) / 2.0f;
        float fHeight = ((height - rect.height()) / 2.0f) + rect.height();
        rect.offset((int) fWidth, (int) fHeight);
        int i10 = rect.left;
        int i11 = this.f12240B;
        rect.set(i10 - i11, rect.top - i11, rect.right + i11, rect.bottom + i11);
        canvas2.drawRect(rect, this.f12243t);
        canvas2.drawText(this.f12246w, fWidth, fHeight, paint);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12241r = new Paint();
        this.f12242s = new Paint();
        this.f12243t = new Paint();
        this.f12244u = true;
        this.f12245v = true;
        this.f12246w = null;
        this.f12247x = new Rect();
        this.f12248y = Color.argb(255, 0, 0, 0);
        this.f12249z = Color.argb(255, 200, 200, 200);
        this.f12239A = Color.argb(255, 50, 50, 50);
        this.f12240B = 4;
        a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12241r = new Paint();
        this.f12242s = new Paint();
        this.f12243t = new Paint();
        this.f12244u = true;
        this.f12245v = true;
        this.f12246w = null;
        this.f12247x = new Rect();
        this.f12248y = Color.argb(255, 0, 0, 0);
        this.f12249z = Color.argb(255, 200, 200, 200);
        this.f12239A = Color.argb(255, 50, 50, 50);
        this.f12240B = 4;
        a(context, attributeSet);
    }
}

package com.google.android.material.timepicker;

import H7.H;
import I1.S;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ayah.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f15358A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public double f15359B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f15360C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f15361D;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ValueAnimator f15362r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f15363s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f15364t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f15365u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f15366v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Paint f15367w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final RectF f15368x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f15369y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f15370z;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f15362r = new ValueAnimator();
        this.f15364t = new ArrayList();
        Paint paint = new Paint();
        this.f15367w = paint;
        this.f15368x = new RectF();
        this.f15361D = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p128m7.a.f19674n, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        p050e8.b.S(context, R.attr.motionDurationLong2, 200);
        p050e8.b.T(context, R.attr.motionEasingEmphasizedInterpolator, p137n7.a.f20016b);
        this.f15360C = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f15365u = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f15369y = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f15366v = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = S.f3689a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a(int i10) {
        return i10 == 2 ? Math.round(this.f15360C * 0.66f) : this.f15360C;
    }

    public final void b(float f3) {
        ValueAnimator valueAnimator = this.f15362r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = f3 % 360.0f;
        this.f15370z = f7;
        this.f15359B = Math.toRadians(f7 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.f15361D);
        float fCos = (((float) Math.cos(this.f15359B)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.f15359B))) + height;
        float f10 = this.f15365u;
        this.f15368x.set(fCos - f10, fSin - f10, fCos + f10, fSin + f10);
        ArrayList arrayList = this.f15364t;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ClockFaceView clockFaceView = (ClockFaceView) ((d) obj);
            if (Math.abs(clockFaceView.f15356a0 - f7) > 0.001f) {
                clockFaceView.f15356a0 = f7;
                clockFaceView.p();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iA = a(this.f15361D);
        float f3 = width;
        float f7 = iA;
        float fCos = (((float) Math.cos(this.f15359B)) * f7) + f3;
        float f10 = height;
        float fSin = (f7 * ((float) Math.sin(this.f15359B))) + f10;
        Paint paint = this.f15367w;
        paint.setStrokeWidth(0.0f);
        int i10 = this.f15365u;
        canvas.drawCircle(fCos, fSin, i10, paint);
        double dSin = Math.sin(this.f15359B);
        double d5 = iA - i10;
        paint.setStrokeWidth(this.f15369y);
        canvas.drawLine(f3, f10, width + ((int) (Math.cos(this.f15359B) * d5)), height + ((int) (d5 * dSin)), paint);
        canvas.drawCircle(f3, f10, this.f15366v, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f15362r.isRunning()) {
            return;
        }
        b(this.f15370z);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        float x9 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z12 = false;
        if (actionMasked == 0) {
            this.f15358A = false;
            z10 = true;
            z11 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z11 = this.f15358A;
            if (this.f15363s) {
                this.f15361D = p000a.a.A((float) (getWidth() / 2), (float) (getHeight() / 2), x9, y10) <= ((float) a(2)) + H.g(getContext(), 12) ? 2 : 1;
            }
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
        }
        boolean z13 = this.f15358A;
        int degrees = (int) Math.toDegrees(Math.atan2(y10 - (getHeight() / 2), x9 - (getWidth() / 2)));
        int i10 = degrees + 90;
        if (i10 < 0) {
            i10 = degrees + 450;
        }
        float f3 = i10;
        boolean z14 = this.f15370z != f3;
        if (z10 && z14) {
            z12 = true;
        } else if (z14 || z11) {
            b(f3);
            z12 = true;
        }
        this.f15358A = z13 | z12;
        return true;
    }
}

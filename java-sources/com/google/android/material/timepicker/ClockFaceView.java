package com.google.android.material.timepicker;

import I1.S;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.ayah.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p181s2.s;
import s1.l;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends e implements d {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final ClockHandView f15348K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Rect f15349L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final RectF f15350M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final Rect f15351N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final SparseArray f15352O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final c f15353P;
    public final int[] Q;
    public final float[] R;
    public final int S;
    public final int T;
    public final int U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final int f15354V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final String[] f15355W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f15356a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ColorStateList f15357b0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15349L = new Rect();
        this.f15350M = new RectF();
        this.f15351N = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f15352O = sparseArray;
        this.R = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p128m7.a.f19673m, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListW = va.g.w(context, typedArrayObtainStyledAttributes, 1);
        this.f15357b0 = colorStateListW;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f15348K = clockHandView;
        this.S = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListW.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListW.getDefaultColor());
        this.Q = new int[]{colorForState, colorForState, colorStateListW.getDefaultColor()};
        clockHandView.f15364t.add(this);
        int defaultColor = s.e(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListW2 = va.g.w(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListW2 != null ? colorStateListW2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f15353P = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f15355W = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < Math.max(this.f15355W.length, size); i10++) {
            TextView textView = (TextView) sparseArray.get(i10);
            if (i10 >= this.f15355W.length) {
                removeView(textView);
                sparseArray.remove(i10);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i10, textView);
                    addView(textView);
                }
                textView.setText(this.f15355W[i10]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i10));
                int i11 = (i10 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i11));
                z10 = i11 > 1 ? true : z10;
                S.o(textView, this.f15353P);
                textView.setTextColor(this.f15357b0);
            }
        }
        ClockHandView clockHandView2 = this.f15348K;
        if (clockHandView2.f15363s && !z10) {
            clockHandView2.f15361D = 1;
        }
        clockHandView2.f15363s = z10;
        clockHandView2.invalidate();
        this.T = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.U = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f15354V = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.e
    public final void o() {
        l lVar = new l();
        lVar.d(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i11 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f15377I * 0.66f) : this.f15377I;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                s1.h hVar = lVar.g(((View) it.next()).getId()).f21936d;
                hVar.f21992x = R.id.circle_center;
                hVar.f21993y = iRound;
                hVar.f21994z = size;
                size += 360.0f / list.size();
            }
        }
        lVar.b(this);
        int i12 = 0;
        while (true) {
            SparseArray sparseArray = this.f15352O;
            if (i12 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i12)).setVisibility(0);
            i12++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) J1.e.a(1, this.f15355W.length, 1).f4215a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        p();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f15354V / Math.max(Math.max(this.T / displayMetrics.heightPixels, this.U / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public final void p() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.f15348K.f15368x;
        float f3 = Float.MAX_VALUE;
        TextView textView = null;
        int i10 = 0;
        while (true) {
            sparseArray = this.f15352O;
            int size = sparseArray.size();
            rect = this.f15349L;
            rectF = this.f15350M;
            if (i10 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f3) {
                    textView = textView2;
                    f3 = fHeight;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            TextView textView3 = (TextView) sparseArray.get(i11);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.f15351N;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(RectF.intersects(rectF2, rectF) ? new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.Q, this.R, Shader.TileMode.CLAMP) : null);
                textView3.invalidate();
            }
        }
    }
}

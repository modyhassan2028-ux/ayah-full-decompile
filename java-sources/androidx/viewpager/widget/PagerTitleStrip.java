package androidx.viewpager.widget;

import Z2.c;
import Z2.d;
import Z2.e;
import Z2.i;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@e
public class PagerTitleStrip extends ViewGroup {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f12988E = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int[] f12989F = {R.attr.textAllCaps};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f12990A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final c f12991B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f12992C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f12993D;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewPager f12994r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f12995s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f12996t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f12997u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12998v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f12999w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13000x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13001y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f13002z;

    public PagerTitleStrip(Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        Context context = textView.getContext();
        d dVar = new d();
        dVar.f10970r = context.getResources().getConfiguration().locale;
        textView.setTransformationMethod(dVar);
    }

    public final void a() {
        ViewPager viewPager = this.f12994r;
        if (viewPager != null) {
            this.f12998v = -1;
            this.f12999w = -1.0f;
            b(viewPager.getCurrentItem());
            requestLayout();
        }
    }

    public final void b(int i10) {
        this.f13002z = true;
        TextView textView = this.f12995s;
        textView.setText((CharSequence) null);
        TextView textView2 = this.f12996t;
        textView2.setText((CharSequence) null);
        TextView textView3 = this.f12997u;
        textView3.setText((CharSequence) null);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView3.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f12998v = i10;
        if (!this.f12990A) {
            c(i10, this.f12999w, false);
        }
        this.f13002z = false;
    }

    public void c(int i10, float f3, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (i10 != this.f12998v) {
            this.f12994r.getAdapter();
            b(i10);
        } else if (!z10 && f3 == this.f12999w) {
            return;
        }
        this.f12990A = true;
        TextView textView = this.f12995s;
        int measuredWidth = textView.getMeasuredWidth();
        TextView textView2 = this.f12996t;
        int measuredWidth2 = textView2.getMeasuredWidth();
        TextView textView3 = this.f12997u;
        int measuredWidth3 = textView3.getMeasuredWidth();
        int i15 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i16 = paddingRight + i15;
        int i17 = (width - (paddingLeft + i15)) - i16;
        float f7 = f3 + 0.5f;
        if (f7 > 1.0f) {
            f7 -= 1.0f;
        }
        int i18 = ((width - i16) - ((int) (i17 * f7))) - i15;
        int i19 = measuredWidth2 + i18;
        int baseline = textView.getBaseline();
        int baseline2 = textView2.getBaseline();
        int baseline3 = textView3.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i20 = iMax - baseline;
        int i21 = iMax - baseline2;
        int i22 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(textView.getMeasuredHeight() + i20, textView2.getMeasuredHeight() + i21), textView3.getMeasuredHeight() + i22);
        int i23 = this.f13001y & 112;
        if (i23 != 16) {
            if (i23 != 80) {
                i12 = i20 + paddingTop;
                i13 = paddingTop + i21;
                i14 = paddingTop + i22;
            } else {
                i11 = (height - paddingBottom) - iMax2;
            }
            textView2.layout(i18, i13, i19, textView2.getMeasuredHeight() + i13);
            int iMin = Math.min(paddingLeft, (i18 - this.f13000x) - measuredWidth);
            textView.layout(iMin, i12, iMin + measuredWidth, textView.getMeasuredHeight() + i12);
            int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i19 + this.f13000x);
            textView3.layout(iMax3, i14, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i14);
            this.f12999w = f3;
            this.f12990A = false;
        }
        i11 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        i12 = i20 + i11;
        i13 = i11 + i21;
        i14 = i11 + i22;
        textView2.layout(i18, i13, i19, textView2.getMeasuredHeight() + i13);
        int iMin2 = Math.min(paddingLeft, (i18 - this.f13000x) - measuredWidth);
        textView.layout(iMin2, i12, iMin2 + measuredWidth, textView.getMeasuredHeight() + i12);
        int iMax4 = Math.max((width - paddingRight) - measuredWidth3, i19 + this.f13000x);
        textView3.layout(iMax4, i14, iMax4 + measuredWidth3, textView3.getMeasuredHeight() + i14);
        this.f12999w = f3;
        this.f12990A = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f13000x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        viewPager.getAdapter();
        c cVar = this.f12991B;
        viewPager.f13023W = cVar;
        if (viewPager.f13024a0 == null) {
            viewPager.f13024a0 = new ArrayList();
        }
        viewPager.f13024a0.add(cVar);
        this.f12994r = viewPager;
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f12994r;
        if (viewPager != null) {
            viewPager.getAdapter();
            a();
            ViewPager viewPager2 = this.f12994r;
            i iVar = viewPager2.f13023W;
            viewPager2.f13023W = null;
            ArrayList arrayList = viewPager2.f13024a0;
            if (arrayList != null) {
                arrayList.remove(this.f12991B);
            }
            this.f12994r = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f12994r != null) {
            float f3 = this.f12999w;
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            c(this.f12998v, f3, true);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMax;
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int size = View.MeasureSpec.getSize(i10);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, (int) (size * 0.2f), -2);
        this.f12995s.measure(childMeasureSpec2, childMeasureSpec);
        TextView textView = this.f12996t;
        textView.measure(childMeasureSpec2, childMeasureSpec);
        this.f12997u.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i11);
        } else {
            iMax = Math.max(getMinHeight(), textView.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i11, textView.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f13002z) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i10) {
        this.f13001y = i10;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f3) {
        int i10 = ((int) (f3 * 255.0f)) & 255;
        this.f12992C = i10;
        int i11 = (i10 << 24) | (this.f12993D & 16777215);
        this.f12995s.setTextColor(i11);
        this.f12997u.setTextColor(i11);
    }

    public void setTextColor(int i10) {
        this.f12993D = i10;
        this.f12996t.setTextColor(i10);
        int i11 = (this.f12992C << 24) | (this.f12993D & 16777215);
        this.f12995s.setTextColor(i11);
        this.f12997u.setTextColor(i11);
    }

    public void setTextSize(int i10, float f3) {
        this.f12995s.setTextSize(i10, f3);
        this.f12996t.setTextSize(i10, f3);
        this.f12997u.setTextSize(i10, f3);
    }

    public void setTextSpacing(int i10) {
        this.f13000x = i10;
        requestLayout();
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12998v = -1;
        this.f12999w = -1.0f;
        this.f12991B = new c(this);
        TextView textView = new TextView(context);
        this.f12995s = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f12996t = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f12997u = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12988E);
        boolean z10 = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            textView.setTextAppearance(resourceId);
            textView2.setTextAppearance(resourceId);
            textView3.setTextAppearance(resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            textView.setTextColor(color);
            textView2.setTextColor(color);
            textView3.setTextColor(color);
        }
        this.f13001y = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.f12993D = textView2.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView2.setEllipsize(truncateAt);
        textView3.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f12989F);
            z10 = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z10) {
            setSingleLineAllCaps(textView);
            setSingleLineAllCaps(textView2);
            setSingleLineAllCaps(textView3);
        } else {
            textView.setSingleLine();
            textView2.setSingleLine();
            textView3.setSingleLine();
        }
        this.f13000x = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}

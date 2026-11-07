package T7;

import E2.C0150y;
import H7.AbstractC0231e;
import H7.E;
import H7.H;
import I1.S;
import K0.ViewTreeObserverOnScrollChangedListenerC0350j;
import R7.C0479a;
import R7.f;
import R7.i;
import R7.m;
import R7.o;
import W.AbstractC0607v1;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.p;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.ayah.R;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p181s2.s;
import p185s8.u0;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public F1.a f7865A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public ColorStateList f7866A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f7867B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public ColorStateList f7868B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ArrayList f7869C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final Path f7870C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ArrayList f7871D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final RectF f7872D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ArrayList f7873E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final RectF f7874E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f7875F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final i f7876F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ValueAnimator f7877G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public Drawable f7878G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ValueAnimator f7879H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public List f7880H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f7881I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public float f7882I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f7883J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f7884J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f7885K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final ViewTreeObserverOnScrollChangedListenerC0350j f7886K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f7887L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f7888M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f7889N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f7890O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f7891P;
    public final int Q;
    public int R;
    public int S;
    public int T;
    public int U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f7892V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f7893W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f7894a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f7895b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f7896c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f7897d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f7898e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f7899f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final int f7900g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f7901h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public MotionEvent f7902i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f7903j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f7904k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f7905l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public ArrayList f7906m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f7907n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f7908o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f7909p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float[] f7910q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Paint f7911r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f7912r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Paint f7913s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f7914s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Paint f7915t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f7916t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Paint f7917u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f7918u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Paint f7919v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f7920v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Paint f7921w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f7922w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Paint f7923x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ColorStateList f7924x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f7925y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ColorStateList f7926y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AccessibilityManager f7927z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ColorStateList f7928z0;

    public c(Context context, AttributeSet attributeSet, int i10) {
        super(Y7.a.a(context, attributeSet, i10, R.style.Widget_MaterialComponents_Slider), attributeSet, i10);
        this.f7869C = new ArrayList();
        this.f7871D = new ArrayList();
        this.f7873E = new ArrayList();
        this.f7875F = false;
        this.f7896c0 = -1;
        this.f7897d0 = -1;
        this.f7903j0 = false;
        this.f7906m0 = new ArrayList();
        this.f7907n0 = -1;
        this.f7908o0 = -1;
        this.f7909p0 = 0.0f;
        this.f7912r0 = true;
        this.f7920v0 = false;
        this.f7870C0 = new Path();
        this.f7872D0 = new RectF();
        this.f7874E0 = new RectF();
        i iVar = new i();
        this.f7876F0 = iVar;
        this.f7880H0 = Collections.EMPTY_LIST;
        this.f7884J0 = 0;
        this.f7886K0 = new ViewTreeObserverOnScrollChangedListenerC0350j(1, this);
        Context context2 = getContext();
        this.f7911r = new Paint();
        this.f7913s = new Paint();
        Paint paint = new Paint(1);
        this.f7915t = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f7917u = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f7919v = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f7921w = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f7923x = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.Q = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f7883J = dimensionPixelOffset;
        this.U = dimensionPixelOffset;
        this.f7885K = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.f7887L = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.f7888M = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f7889N = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f7890O = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.f7900g0 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        H.c(context2, attributeSet, i10, R.style.Widget_MaterialComponents_Slider);
        int[] iArr = p128m7.a.f19653Z;
        H.d(context2, attributeSet, iArr, i10, R.style.Widget_MaterialComponents_Slider, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i10, R.style.Widget_MaterialComponents_Slider);
        this.f7867B = typedArrayObtainStyledAttributes.getResourceId(8, R.style.Widget_MaterialComponents_Tooltip);
        this.f7904k0 = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
        this.f7905l0 = typedArrayObtainStyledAttributes.getFloat(4, 1.0f);
        setValues(Float.valueOf(this.f7904k0));
        this.f7909p0 = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        this.f7891P = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(9, (float) Math.ceil(H.g(getContext(), 48))));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(24);
        int i11 = zHasValue ? 24 : 26;
        int i12 = zHasValue ? 24 : 25;
        ColorStateList colorStateListW = g.w(context2, typedArrayObtainStyledAttributes, i11);
        setTrackInactiveTintList(colorStateListW == null ? s.e(context2, R.color.material_slider_inactive_track_color) : colorStateListW);
        ColorStateList colorStateListW2 = g.w(context2, typedArrayObtainStyledAttributes, i12);
        setTrackActiveTintList(colorStateListW2 == null ? s.e(context2, R.color.material_slider_active_track_color) : colorStateListW2);
        iVar.m(g.w(context2, typedArrayObtainStyledAttributes, 10));
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            setThumbStrokeColor(g.w(context2, typedArrayObtainStyledAttributes, 14));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(15, 0.0f));
        ColorStateList colorStateListW3 = g.w(context2, typedArrayObtainStyledAttributes, 5);
        setHaloTintList(colorStateListW3 == null ? s.e(context2, R.color.material_slider_halo_color) : colorStateListW3);
        this.f7912r0 = typedArrayObtainStyledAttributes.getBoolean(23, true);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(18);
        int i13 = zHasValue2 ? 18 : 20;
        int i14 = zHasValue2 ? 18 : 19;
        ColorStateList colorStateListW4 = g.w(context2, typedArrayObtainStyledAttributes, i13);
        setTickInactiveTintList(colorStateListW4 == null ? s.e(context2, R.color.material_slider_inactive_tick_marks_color) : colorStateListW4);
        ColorStateList colorStateListW5 = g.w(context2, typedArrayObtainStyledAttributes, i14);
        setTickActiveTintList(colorStateListW5 == null ? s.e(context2, R.color.material_slider_active_tick_marks_color) : colorStateListW5);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(16, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(29, 0));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(28, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(11, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(27, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(21, this.f7898e0 / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(22, this.f7898e0 / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(7, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(0, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        iVar.q(2);
        this.f7881I = ViewConfiguration.get(context2).getScaledTouchSlop();
        a aVar = new a(this);
        this.f7925y = aVar;
        S.o(this, aVar);
        this.f7927z = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public final void A() {
        if (this.f7922w0) {
            float f3 = this.f7904k0;
            float f7 = this.f7905l0;
            if (f3 >= f7) {
                throw new IllegalStateException("valueFrom(" + this.f7904k0 + ") must be smaller than valueTo(" + this.f7905l0 + ")");
            }
            if (f7 <= f3) {
                throw new IllegalStateException("valueTo(" + this.f7905l0 + ") must be greater than valueFrom(" + this.f7904k0 + ")");
            }
            if (this.f7909p0 > 0.0f && !B(f7)) {
                throw new IllegalStateException("The stepSize(" + this.f7909p0 + ") must be 0, or a factor of the valueFrom(" + this.f7904k0 + ")-valueTo(" + this.f7905l0 + ") range");
            }
            ArrayList arrayList = this.f7906m0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                Float f10 = (Float) obj;
                if (f10.floatValue() < this.f7904k0 || f10.floatValue() > this.f7905l0) {
                    throw new IllegalStateException("Slider value(" + f10 + ") must be greater or equal to valueFrom(" + this.f7904k0 + "), and lower or equal to valueTo(" + this.f7905l0 + ")");
                }
                if (this.f7909p0 > 0.0f && !B(f10.floatValue())) {
                    float f11 = this.f7904k0;
                    float f12 = this.f7909p0;
                    throw new IllegalStateException("Value(" + f10 + ") must be equal to valueFrom(" + f11 + ") plus a multiple of stepSize(" + f12 + ") when using stepSize(" + f12 + ")");
                }
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f13 = this.f7909p0;
            if (f13 > 0.0f && minSeparation > 0.0f) {
                if (this.f7884J0 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.f7909p0 + ")");
                }
                if (minSeparation < f13 || !i(minSeparation)) {
                    float f14 = this.f7909p0;
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + f14 + ") when using stepSize(" + f14 + ")");
                }
            }
            float f15 = this.f7909p0;
            if (f15 != 0.0f) {
                if (((int) f15) != f15) {
                    Log.w("c", "Floating point value used for stepSize(" + f15 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f16 = this.f7904k0;
                if (((int) f16) != f16) {
                    Log.w("c", "Floating point value used for valueFrom(" + f16 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f17 = this.f7905l0;
                if (((int) f17) != f17) {
                    Log.w("c", "Floating point value used for valueTo(" + f17 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
            }
            this.f7922w0 = false;
        }
    }

    public final boolean B(float f3) {
        return i(new BigDecimal(Float.toString(f3)).subtract(new BigDecimal(Float.toString(this.f7904k0)), MathContext.DECIMAL64).doubleValue());
    }

    public final float C(float f3) {
        return (o(f3) * this.f7918u0) + this.U;
    }

    public final void a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.f7892V, this.f7893W);
        } else {
            float fMax = Math.max(this.f7892V, this.f7893W) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    public final int b() {
        int i10 = this.R / 2;
        int i11 = this.S;
        return i10 + ((i11 == 1 || i11 == 3) ? ((Z7.a) this.f7869C.get(0)).getIntrinsicHeight() : 0);
    }

    public final ValueAnimator c(boolean z10) {
        int iS;
        TimeInterpolator timeInterpolatorT;
        float fFloatValue = z10 ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z10 ? this.f7879H : this.f7877G;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z10 ? 1.0f : 0.0f);
        if (z10) {
            iS = p050e8.b.S(getContext(), R.attr.motionDurationMedium4, 83);
            timeInterpolatorT = p050e8.b.T(getContext(), R.attr.motionEasingEmphasizedInterpolator, p137n7.a.f20019e);
        } else {
            iS = p050e8.b.S(getContext(), R.attr.motionDurationShort3, 117);
            timeInterpolatorT = p050e8.b.T(getContext(), R.attr.motionEasingEmphasizedAccelerateInterpolator, p137n7.a.f20017c);
        }
        valueAnimatorOfFloat.setDuration(iS);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorT);
        valueAnimatorOfFloat.addUpdateListener(new C0150y(4, this));
        return valueAnimatorOfFloat;
    }

    public final void d(Canvas canvas, int i10, int i11, float f3, Drawable drawable) {
        canvas.save();
        canvas.translate((this.U + ((int) (o(f3) * i10))) - (drawable.getBounds().width() / 2.0f), i11 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f7925y.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f7911r.setColor(h(this.f7868B0));
        this.f7913s.setColor(h(this.f7866A0));
        this.f7919v.setColor(h(this.f7928z0));
        this.f7921w.setColor(h(this.f7926y0));
        this.f7923x.setColor(h(this.f7866A0));
        ArrayList arrayList = this.f7869C;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Z7.a aVar = (Z7.a) obj;
            if (aVar.isStateful()) {
                aVar.setState(getDrawableState());
            }
        }
        i iVar = this.f7876F0;
        if (iVar.isStateful()) {
            iVar.setState(getDrawableState());
        }
        int iH = h(this.f7924x0);
        Paint paint = this.f7917u;
        paint.setColor(iH);
        paint.setAlpha(63);
    }

    public final void e() {
        if (!this.f7875F) {
            this.f7875F = true;
            ValueAnimator valueAnimatorC = c(true);
            this.f7877G = valueAnimatorC;
            this.f7879H = null;
            valueAnimatorC.start();
        }
        ArrayList arrayList = this.f7869C;
        Iterator it = arrayList.iterator();
        for (int i10 = 0; i10 < this.f7906m0.size() && it.hasNext(); i10++) {
            if (i10 != this.f7908o0) {
                r((Z7.a) it.next(), ((Float) this.f7906m0.get(i10)).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.f7906m0.size())));
        }
        r((Z7.a) it.next(), ((Float) this.f7906m0.get(this.f7908o0)).floatValue());
    }

    public final void f() {
        if (this.f7875F) {
            this.f7875F = false;
            ValueAnimator valueAnimatorC = c(false);
            this.f7879H = valueAnimatorC;
            this.f7877G = null;
            valueAnimatorC.addListener(new F7.e(7, this));
            this.f7879H.start();
        }
    }

    public final float[] g() {
        float fFloatValue = ((Float) this.f7906m0.get(0)).floatValue();
        float fFloatValue2 = ((Float) p123m2.c.q(1, this.f7906m0)).floatValue();
        if (this.f7906m0.size() == 1) {
            fFloatValue = this.f7904k0;
        }
        float fO = o(fFloatValue);
        float fO2 = o(fFloatValue2);
        return k() ? new float[]{fO2, fO} : new float[]{fO, fO2};
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f7925y.f7193k;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public abstract int getThumbRadius();

    public abstract float getValueFrom();

    public abstract float getValueTo();

    public List<Float> getValues() {
        return new ArrayList(this.f7906m0);
    }

    public final int h(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean i(double d5) {
        double dDoubleValue = new BigDecimal(Double.toString(d5)).divide(new BigDecimal(Float.toString(this.f7909p0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    public final boolean j(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k() {
        WeakHashMap weakHashMap = S.f3689a;
        return getLayoutDirection() == 1;
    }

    public final void l() {
        if (this.f7909p0 <= 0.0f) {
            return;
        }
        A();
        int iMin = Math.min((int) (((this.f7905l0 - this.f7904k0) / this.f7909p0) + 1.0f), (this.f7918u0 / this.f7890O) + 1);
        float[] fArr = this.f7910q0;
        if (fArr == null || fArr.length != iMin * 2) {
            this.f7910q0 = new float[iMin * 2];
        }
        float f3 = this.f7918u0 / (iMin - 1);
        for (int i10 = 0; i10 < iMin * 2; i10 += 2) {
            float[] fArr2 = this.f7910q0;
            fArr2[i10] = ((i10 / 2.0f) * f3) + this.U;
            fArr2[i10 + 1] = b();
        }
    }

    public final boolean m(int i10) {
        int i11 = this.f7908o0;
        long j = ((long) i11) + ((long) i10);
        long size = this.f7906m0.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i12 = (int) j;
        this.f7908o0 = i12;
        if (i12 == i11) {
            return false;
        }
        if (this.f7907n0 != -1) {
            this.f7907n0 = i12;
        }
        w();
        postInvalidate();
        return true;
    }

    public final void n(int i10) {
        if (k()) {
            i10 = i10 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i10;
        }
        m(i10);
    }

    public final float o(float f3) {
        float f7 = this.f7904k0;
        float f10 = (f3 - f7) / (this.f7905l0 - f7);
        return k() ? 1.0f - f10 : f10;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f7886K0);
        ArrayList arrayList = this.f7869C;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Z7.a aVar = (Z7.a) obj;
            ViewGroup viewGroupI = H.i(this);
            if (viewGroupI == null) {
                aVar.getClass();
            } else {
                aVar.getClass();
                int[] iArr = new int[2];
                viewGroupI.getLocationOnScreen(iArr);
                aVar.f11034b0 = iArr[0];
                viewGroupI.getWindowVisibleDisplayFrame(aVar.U);
                viewGroupI.addOnLayoutChangeListener(aVar.T);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        F1.a aVar = this.f7865A;
        if (aVar != null) {
            removeCallbacks(aVar);
        }
        int i10 = 0;
        this.f7875F = false;
        ArrayList arrayList = this.f7869C;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Z7.a aVar2 = (Z7.a) obj;
            ViewGroup viewGroupI = H.i(this);
            O8.c cVar = viewGroupI == null ? null : new O8.c(viewGroupI);
            if (cVar != null) {
                ((ViewOverlay) cVar.f6511r).remove(aVar2);
                ViewGroup viewGroupI2 = H.i(this);
                if (viewGroupI2 == null) {
                    aVar2.getClass();
                } else {
                    viewGroupI2.removeOnLayoutChangeListener(aVar2.T);
                }
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.f7886K0);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0176  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f6  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f3;
        int i10;
        int i11;
        float f7;
        c cVar = this;
        Canvas canvas2 = canvas;
        if (cVar.f7922w0) {
            cVar.A();
            cVar.l();
        }
        super.onDraw(canvas);
        int iB = cVar.b();
        int i12 = 0;
        float fFloatValue = ((Float) cVar.f7906m0.get(0)).floatValue();
        float fFloatValue2 = ((Float) p123m2.c.q(1, cVar.f7906m0)).floatValue();
        float f10 = cVar.f7905l0;
        RectF rectF = cVar.f7872D0;
        if (fFloatValue2 < f10 || (cVar.f7906m0.size() > 1 && fFloatValue > cVar.f7904k0)) {
            int i13 = cVar.f7918u0;
            float[] fArrG = cVar.g();
            int i14 = cVar.U;
            float f11 = i13;
            float f12 = (fArrG[1] * f11) + i14;
            float f13 = i14 + i13;
            Paint paint = cVar.f7911r;
            if (f12 < f13) {
                int i15 = cVar.f7895b0;
                if (i15 > 0) {
                    float f14 = f12 + i15;
                    float f15 = iB;
                    f3 = 2.0f;
                    float f16 = cVar.T / 2.0f;
                    rectF.set(f14, f15 - f16, i14 + i13 + f16, f16 + f15);
                    cVar.y(canvas2, paint, rectF, 3);
                } else {
                    f3 = 2.0f;
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    float f17 = iB;
                    canvas2.drawLine(f12, f17, cVar.U + i13, f17, paint);
                }
            } else {
                f3 = 2.0f;
            }
            int i16 = cVar.U;
            float f18 = i16;
            float f19 = (fArrG[i12] * f11) + f18;
            if (f19 > f18) {
                int i17 = cVar.f7895b0;
                if (i17 > 0) {
                    float f20 = cVar.T / f3;
                    float f21 = iB;
                    rectF.set(i16 - f20, f21 - f20, f19 - i17, f20 + f21);
                    cVar.y(canvas2, paint, rectF, 2);
                } else {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    float f22 = iB;
                    canvas2.drawLine(cVar.U, f22, f19, f22, paint);
                }
            }
        } else {
            i12 = 0;
            f3 = 2.0f;
        }
        if (fFloatValue2 > cVar.f7904k0) {
            int i18 = cVar.f7918u0;
            float[] fArrG2 = cVar.g();
            float f23 = cVar.U;
            float f24 = i18;
            float fC = (fArrG2[1] * f24) + f23;
            float fC2 = (fArrG2[i12] * f24) + f23;
            int i19 = cVar.f7895b0;
            Paint paint2 = cVar.f7913s;
            if (i19 > 0) {
                int i20 = cVar.f7906m0.size() == 1 ? cVar.k() ? 3 : 2 : 4;
                for (int i21 = i12; i21 < cVar.f7906m0.size(); i21++) {
                    if (cVar.f7906m0.size() > 1) {
                        if (i21 > 0) {
                            fC2 = cVar.C(((Float) cVar.f7906m0.get(i21 - 1)).floatValue());
                        }
                        fC = cVar.C(((Float) cVar.f7906m0.get(i21)).floatValue());
                        if (cVar.k()) {
                            fC = fC2;
                            fC2 = fC;
                        }
                    }
                    int iB2 = AbstractC0607v1.b(i20);
                    if (iB2 != 1) {
                        if (iB2 == 2) {
                            fC2 += cVar.f7895b0;
                            fC = (cVar.T / f3) + fC;
                        } else if (iB2 == 3) {
                            f7 = cVar.f7895b0;
                            fC2 += f7;
                        }
                        if (fC2 >= fC) {
                            float f25 = iB;
                            float f26 = cVar.T / f3;
                            rectF.set(fC2, f25 - f26, fC, f26 + f25);
                            cVar.y(canvas2, paint2, rectF, i20);
                        }
                    } else {
                        fC2 -= cVar.T / f3;
                        f7 = cVar.f7895b0;
                    }
                    fC -= f7;
                    if (fC2 >= fC) {
                        float f27 = iB;
                        float f28 = cVar.T / f3;
                        rectF.set(fC2, f27 - f28, fC, f28 + f27);
                        cVar.y(canvas2, paint2, rectF, i20);
                    }
                }
            } else {
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setStrokeCap(Paint.Cap.ROUND);
                float f29 = iB;
                canvas2.drawLine(fC2, f29, fC, f29, paint2);
            }
        }
        if (cVar.f7912r0 && cVar.f7909p0 > 0.0f) {
            float[] fArrG3 = cVar.g();
            int iCeil = (int) Math.ceil(((cVar.f7910q0.length / f3) - 1.0f) * fArrG3[i12]);
            int iFloor = (int) Math.floor(((cVar.f7910q0.length / f3) - 1.0f) * fArrG3[1]);
            Paint paint3 = cVar.f7919v;
            if (iCeil > 0) {
                canvas2.drawPoints(cVar.f7910q0, i12, iCeil * 2, paint3);
            }
            if (iCeil <= iFloor) {
                canvas2.drawPoints(cVar.f7910q0, iCeil * 2, ((iFloor - iCeil) + 1) * 2, cVar.f7921w);
            }
            int i22 = (iFloor + 1) * 2;
            float[] fArr = cVar.f7910q0;
            if (i22 < fArr.length) {
                canvas2.drawPoints(fArr, i22, fArr.length - i22, paint3);
            }
        }
        if (cVar.f7898e0 <= 0) {
            i10 = 0;
        } else {
            int size = cVar.f7906m0.size();
            Paint paint4 = cVar.f7923x;
            if (size >= 1) {
                float fFloatValue3 = ((Float) p123m2.c.q(1, cVar.f7906m0)).floatValue();
                float f30 = cVar.f7905l0;
                if (fFloatValue3 < f30) {
                    canvas2.drawPoint(cVar.C(f30), iB, paint4);
                }
            }
            if (cVar.f7906m0.size() > 1) {
                i10 = 0;
                float fFloatValue4 = ((Float) cVar.f7906m0.get(0)).floatValue();
                float f31 = cVar.f7904k0;
                if (fFloatValue4 > f31) {
                    canvas2.drawPoint(cVar.C(f31), iB, paint4);
                }
            } else {
                i10 = 0;
            }
        }
        if ((cVar.f7903j0 || cVar.isFocused()) && cVar.isEnabled()) {
            int i23 = cVar.f7918u0;
            if (!(cVar.getBackground() instanceof RippleDrawable)) {
                int iO = (int) ((cVar.o(((Float) cVar.f7906m0.get(cVar.f7908o0)).floatValue()) * i23) + cVar.U);
                if (Build.VERSION.SDK_INT < 28) {
                    int i24 = cVar.f7894a0;
                    canvas2.clipRect(iO - i24, iB - i24, iO + i24, i24 + iB, Region.Op.UNION);
                }
                canvas2.drawCircle(iO, iB, cVar.f7894a0, cVar.f7917u);
            }
        }
        cVar.x();
        int i25 = cVar.f7918u0;
        while (i10 < cVar.f7906m0.size()) {
            float fFloatValue5 = ((Float) cVar.f7906m0.get(i10)).floatValue();
            Drawable drawable = cVar.f7878G0;
            if (drawable != null) {
                i11 = iB;
                cVar.d(canvas2, i25, i11, fFloatValue5, drawable);
            } else {
                i11 = iB;
                if (i10 < cVar.f7880H0.size()) {
                    cVar.d(canvas, i25, i11, fFloatValue5, (Drawable) cVar.f7880H0.get(i10));
                } else {
                    if (!cVar.isEnabled()) {
                        canvas.drawCircle((cVar.o(fFloatValue5) * i25) + cVar.U, i11, cVar.getThumbRadius(), cVar.f7915t);
                    }
                    cVar.d(canvas, i25, i11, fFloatValue5, cVar.f7876F0);
                }
            }
            i10++;
            cVar = this;
            canvas2 = canvas;
            iB = i11;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        a aVar = this.f7925y;
        if (!z10) {
            this.f7907n0 = -1;
            aVar.j(this.f7908o0);
            return;
        }
        if (i10 == 1) {
            m(Integer.MAX_VALUE);
        } else if (i10 == 2) {
            m(Integer.MIN_VALUE);
        } else if (i10 == 17) {
            n(Integer.MAX_VALUE);
        } else if (i10 == 66) {
            n(Integer.MIN_VALUE);
        }
        aVar.w(this.f7908o0);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (this.f7906m0.size() == 1) {
            this.f7907n0 = 0;
        }
        Float fValueOf = null;
        Boolean boolValueOf = null;
        if (this.f7907n0 == -1) {
            if (i10 != 61) {
                if (i10 == 66) {
                    this.f7907n0 = this.f7908o0;
                    postInvalidate();
                    boolValueOf = Boolean.TRUE;
                } else if (i10 == 81) {
                    m(1);
                    boolValueOf = Boolean.TRUE;
                } else if (i10 == 69) {
                    m(-1);
                    boolValueOf = Boolean.TRUE;
                } else if (i10 != 70) {
                    switch (i10) {
                        case 21:
                            n(-1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case 22:
                            n(1);
                            boolValueOf = Boolean.TRUE;
                            break;
                        case 23:
                            this.f7907n0 = this.f7908o0;
                            postInvalidate();
                            boolValueOf = Boolean.TRUE;
                            break;
                    }
                } else {
                    m(1);
                    boolValueOf = Boolean.TRUE;
                }
            } else if (keyEvent.hasNoModifiers()) {
                boolValueOf = Boolean.valueOf(m(1));
            } else {
                boolValueOf = keyEvent.isShiftPressed() ? Boolean.valueOf(m(-1)) : Boolean.FALSE;
            }
            return boolValueOf != null ? boolValueOf.booleanValue() : super.onKeyDown(i10, keyEvent);
        }
        boolean zIsLongPress = this.f7920v0 | keyEvent.isLongPress();
        this.f7920v0 = zIsLongPress;
        float fRound = 1.0f;
        if (zIsLongPress) {
            float f3 = this.f7909p0;
            fRound = f3 != 0.0f ? f3 : 1.0f;
            float f7 = (this.f7905l0 - this.f7904k0) / fRound;
            float f10 = 20;
            if (f7 > f10) {
                fRound *= Math.round(f7 / f10);
            }
        } else {
            float f11 = this.f7909p0;
            if (f11 != 0.0f) {
                fRound = f11;
            }
        }
        if (i10 == 21) {
            if (!k()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i10 == 22) {
            if (k()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i10 == 69) {
            fValueOf = Float.valueOf(-fRound);
        } else if (i10 == 70 || i10 == 81) {
            fValueOf = Float.valueOf(fRound);
        }
        if (fValueOf != null) {
            if (t(this.f7907n0, fValueOf.floatValue() + ((Float) this.f7906m0.get(this.f7907n0)).floatValue())) {
                w();
                postInvalidate();
            }
            return true;
        }
        if (i10 != 23) {
            if (i10 == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return m(-1);
                }
                return false;
            }
            if (i10 != 66) {
                return super.onKeyDown(i10, keyEvent);
            }
        }
        this.f7907n0 = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        this.f7920v0 = false;
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.R;
        int i13 = this.S;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12 + ((i13 == 1 || i13 == 3) ? ((Z7.a) this.f7869C.get(0)).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.f7904k0 = bVar.f7860r;
        this.f7905l0 = bVar.f7861s;
        s(bVar.f7862t);
        this.f7909p0 = bVar.f7863u;
        if (bVar.f7864v) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f7860r = this.f7904k0;
        bVar.f7861s = this.f7905l0;
        bVar.f7862t = new ArrayList(this.f7906m0);
        bVar.f7863u = this.f7909p0;
        bVar.f7864v = hasFocus();
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.f7918u0 = Math.max(i10 - (this.U * 2), 0);
        l();
        w();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        Iterator it;
        int i10;
        float f3;
        if (isEnabled()) {
            float x9 = motionEvent.getX();
            float f7 = (x9 - this.U) / this.f7918u0;
            this.f7882I0 = f7;
            float fMax = Math.max(0.0f, f7);
            this.f7882I0 = fMax;
            this.f7882I0 = Math.min(1.0f, fMax);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                int i11 = this.f7881I;
                if (actionMasked == 1) {
                    this.f7903j0 = false;
                    motionEvent2 = this.f7902i0;
                    if (motionEvent2 != null && motionEvent2.getActionMasked() == 0) {
                        f3 = i11;
                        if (Math.abs(this.f7902i0.getX() - motionEvent.getX()) <= f3 && Math.abs(this.f7902i0.getY() - motionEvent.getY()) <= f3 && q()) {
                            p();
                        }
                    }
                    if (this.f7907n0 != -1) {
                        u();
                        w();
                        if (this.f7895b0 > 0 && (i10 = this.f7896c0) != -1 && this.f7897d0 != -1) {
                            setThumbWidth(i10);
                            setThumbTrackGapSize(this.f7897d0);
                        }
                        this.f7907n0 = -1;
                        it = this.f7873E.iterator();
                        if (it.hasNext()) {
                            throw p245z2.a.z(it);
                        }
                    }
                    invalidate();
                } else if (actionMasked == 2) {
                    if (!this.f7903j0) {
                        if (!j(motionEvent) || Math.abs(x9 - this.f7901h0) >= i11) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            p();
                        }
                    }
                    if (q()) {
                        this.f7903j0 = true;
                        u();
                        w();
                        invalidate();
                    }
                } else if (actionMasked == 3) {
                    this.f7903j0 = false;
                    motionEvent2 = this.f7902i0;
                    if (motionEvent2 != null) {
                        f3 = i11;
                        if (Math.abs(this.f7902i0.getX() - motionEvent.getX()) <= f3) {
                            p();
                        }
                    }
                    if (this.f7907n0 != -1) {
                        u();
                        w();
                        if (this.f7895b0 > 0) {
                            setThumbWidth(i10);
                            setThumbTrackGapSize(this.f7897d0);
                        }
                        this.f7907n0 = -1;
                        it = this.f7873E.iterator();
                        if (it.hasNext()) {
                            throw p245z2.a.z(it);
                        }
                    }
                    invalidate();
                }
            } else {
                this.f7901h0 = x9;
                if (!j(motionEvent)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    if (q()) {
                        requestFocus();
                        this.f7903j0 = true;
                        u();
                        w();
                        int i12 = this.f7895b0;
                        if (i12 > 0) {
                            int i13 = this.f7892V;
                            this.f7896c0 = i13;
                            this.f7897d0 = i12;
                            int iRound = Math.round(i13 * 0.5f);
                            int i14 = this.f7892V - iRound;
                            setThumbWidth(iRound);
                            setThumbTrackGapSize(this.f7895b0 - (i14 / 2));
                        }
                        invalidate();
                        p();
                    }
                }
            }
            setPressed(this.f7903j0);
            this.f7902i0 = MotionEvent.obtain(motionEvent);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            ViewGroup viewGroupI = H.i(this);
            O8.c cVar = viewGroupI == null ? null : new O8.c(viewGroupI);
            if (cVar == null) {
                return;
            }
            ArrayList arrayList = this.f7869C;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((ViewOverlay) cVar.f6511r).remove((Z7.a) obj);
            }
        }
    }

    public final void p() {
        Iterator it = this.f7873E.iterator();
        if (it.hasNext()) {
            throw p245z2.a.z(it);
        }
    }

    public boolean q() {
        if (this.f7907n0 != -1) {
            return true;
        }
        float f3 = this.f7882I0;
        if (k()) {
            f3 = 1.0f - f3;
        }
        float f7 = this.f7905l0;
        float f10 = this.f7904k0;
        float fN = p.n(f7, f10, f3, f10);
        float fC = C(fN);
        this.f7907n0 = 0;
        float fAbs = Math.abs(((Float) this.f7906m0.get(0)).floatValue() - fN);
        for (int i10 = 1; i10 < this.f7906m0.size(); i10++) {
            float fAbs2 = Math.abs(((Float) this.f7906m0.get(i10)).floatValue() - fN);
            float fC2 = C(((Float) this.f7906m0.get(i10)).floatValue());
            if (Float.compare(fAbs2, fAbs) > 0) {
                break;
            }
            boolean z10 = !k() ? fC2 - fC >= 0.0f : fC2 - fC <= 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.f7907n0 = i10;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fC2 - fC) < this.f7881I) {
                        this.f7907n0 = -1;
                        return false;
                    }
                    if (z10) {
                        this.f7907n0 = i10;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.f7907n0 != -1;
    }

    public final void r(Z7.a aVar, float f3) {
        String str = String.format(((float) ((int) f3)) == f3 ? "%.0f" : "%.2f", Float.valueOf(f3));
        if (!TextUtils.equals(aVar.f11027P, str)) {
            aVar.f11027P = str;
            aVar.S.f3445e = true;
            aVar.invalidateSelf();
        }
        int iO = (this.U + ((int) (o(f3) * this.f7918u0))) - (aVar.getIntrinsicWidth() / 2);
        int iB = b() - ((this.f7893W / 2) + this.f7900g0);
        aVar.setBounds(iO, iB - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + iO, iB);
        Rect rect = new Rect(aVar.getBounds());
        AbstractC0231e.c(H.i(this), this, rect);
        aVar.setBounds(rect);
        ViewGroup viewGroupI = H.i(this);
        ((ViewOverlay) (viewGroupI == null ? null : new O8.c(viewGroupI)).f6511r).add(aVar);
    }

    public final void s(ArrayList arrayList) {
        ViewGroup viewGroupI;
        int resourceId;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f7906m0.size() == arrayList.size() && this.f7906m0.equals(arrayList)) {
            return;
        }
        this.f7906m0 = arrayList;
        this.f7922w0 = true;
        int i10 = 0;
        this.f7908o0 = 0;
        w();
        ArrayList arrayList2 = this.f7869C;
        if (arrayList2.size() > this.f7906m0.size()) {
            List<Z7.a> listSubList = arrayList2.subList(this.f7906m0.size(), arrayList2.size());
            for (Z7.a aVar : listSubList) {
                WeakHashMap weakHashMap = S.f3689a;
                if (isAttachedToWindow()) {
                    ViewGroup viewGroupI2 = H.i(this);
                    O8.c cVar = viewGroupI2 == null ? null : new O8.c(viewGroupI2);
                    if (cVar != null) {
                        ((ViewOverlay) cVar.f6511r).remove(aVar);
                        ViewGroup viewGroupI3 = H.i(this);
                        if (viewGroupI3 == null) {
                            aVar.getClass();
                        } else {
                            viewGroupI3.removeOnLayoutChangeListener(aVar.T);
                        }
                    }
                }
            }
            listSubList.clear();
        }
        while (arrayList2.size() < this.f7906m0.size()) {
            Context context = getContext();
            int i11 = this.f7867B;
            Z7.a aVar2 = new Z7.a(context, i11);
            TypedArray typedArrayM = H.m(aVar2.Q, null, p128m7.a.f19670i0, 0, i11, new int[0]);
            Context context2 = aVar2.Q;
            aVar2.f11033a0 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
            boolean z10 = typedArrayM.getBoolean(8, true);
            aVar2.f11032Z = z10;
            if (z10) {
                m mVarG = aVar2.f7325r.f7294a.g();
                mVarG.f7345k = aVar2.x();
                aVar2.setShapeAppearanceModel(mVarG.a());
            } else {
                aVar2.f11033a0 = 0;
            }
            CharSequence text = typedArrayM.getText(6);
            boolean zEquals = TextUtils.equals(aVar2.f11027P, text);
            E e10 = aVar2.S;
            if (!zEquals) {
                aVar2.f11027P = text;
                e10.f3445e = true;
                aVar2.invalidateSelf();
            }
            N7.e eVar = (!typedArrayM.hasValue(0) || (resourceId = typedArrayM.getResourceId(0, 0)) == 0) ? null : new N7.e(context2, resourceId);
            if (eVar != null && typedArrayM.hasValue(1)) {
                eVar.j = g.w(context2, typedArrayM, 1);
            }
            e10.c(eVar, context2);
            TypedValue typedValueA = u0.A(R.attr.colorOnBackground, context2, Z7.a.class.getCanonicalName());
            int i12 = typedValueA.resourceId;
            int color = i12 != 0 ? context2.getColor(i12) : typedValueA.data;
            TypedValue typedValueA2 = u0.A(android.R.attr.colorBackground, context2, Z7.a.class.getCanonicalName());
            int i13 = typedValueA2.resourceId;
            aVar2.m(ColorStateList.valueOf(typedArrayM.getColor(7, A1.a.c(A1.a.e(color, 153), A1.a.e(i13 != 0 ? context2.getColor(i13) : typedValueA2.data, 229)))));
            TypedValue typedValueA3 = u0.A(R.attr.colorSurface, context2, Z7.a.class.getCanonicalName());
            int i14 = typedValueA3.resourceId;
            aVar2.r(ColorStateList.valueOf(i14 != 0 ? context2.getColor(i14) : typedValueA3.data));
            aVar2.f11028V = typedArrayM.getDimensionPixelSize(2, 0);
            aVar2.f11029W = typedArrayM.getDimensionPixelSize(4, 0);
            aVar2.f11030X = typedArrayM.getDimensionPixelSize(5, 0);
            aVar2.f11031Y = typedArrayM.getDimensionPixelSize(3, 0);
            typedArrayM.recycle();
            arrayList2.add(aVar2);
            WeakHashMap weakHashMap2 = S.f3689a;
            if (isAttachedToWindow() && (viewGroupI = H.i(this)) != null) {
                int[] iArr = new int[2];
                viewGroupI.getLocationOnScreen(iArr);
                aVar2.f11034b0 = iArr[0];
                viewGroupI.getWindowVisibleDisplayFrame(aVar2.U);
                viewGroupI.addOnLayoutChangeListener(aVar2.T);
            }
        }
        int i15 = arrayList2.size() == 1 ? 0 : 1;
        int size = arrayList2.size();
        int i16 = 0;
        while (i16 < size) {
            Object obj = arrayList2.get(i16);
            i16++;
            ((Z7.a) obj).s(i15);
        }
        ArrayList arrayList3 = this.f7871D;
        int size2 = arrayList3.size();
        while (i10 < size2) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            if (obj2 != null) {
                throw new ClassCastException();
            }
            Iterator it = this.f7906m0.iterator();
            if (it.hasNext()) {
                ((Float) it.next()).getClass();
                throw null;
            }
        }
        postInvalidate();
    }

    public void setActiveThumbIndex(int i10) {
        this.f7907n0 = i10;
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            drawableArr[i10] = getResources().getDrawable(iArr[i10]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        setLayerType(z10 ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i10) {
        if (i10 < 0 || i10 >= this.f7906m0.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f7908o0 = i10;
        this.f7925y.w(i10);
        postInvalidate();
    }

    public void setHaloRadius(int i10) {
        if (i10 == this.f7894a0) {
            return;
        }
        this.f7894a0 = i10;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.f7894a0);
        } else {
            postInvalidate();
        }
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f7924x0)) {
            return;
        }
        this.f7924x0 = colorStateList;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        int iH = h(colorStateList);
        Paint paint = this.f7917u;
        paint.setColor(iH);
        paint.setAlpha(63);
        invalidate();
    }

    public abstract void setLabelBehavior(int i10);

    public void setSeparationUnit(int i10) {
        this.f7884J0 = i10;
        this.f7922w0 = true;
        postInvalidate();
    }

    public void setStepSize(float f3) {
        if (f3 >= 0.0f) {
            if (this.f7909p0 != f3) {
                this.f7909p0 = f3;
                this.f7922w0 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The stepSize(" + f3 + ") must be 0, or a factor of the valueFrom(" + this.f7904k0 + ")-valueTo(" + this.f7905l0 + ") range");
    }

    public abstract void setThumbElevation(float f3);

    public void setThumbHeight(int i10) {
        if (i10 == this.f7893W) {
            return;
        }
        this.f7893W = i10;
        this.f7876F0.setBounds(0, 0, this.f7892V, i10);
        Drawable drawable = this.f7878G0;
        if (drawable != null) {
            a(drawable);
        }
        Iterator it = this.f7880H0.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        z();
    }

    public abstract void setThumbStrokeColor(ColorStateList colorStateList);

    public abstract void setThumbStrokeWidth(float f3);

    public abstract void setThumbTrackGapSize(int i10);

    public void setThumbWidth(int i10) {
        if (i10 == this.f7892V) {
            return;
        }
        this.f7892V = i10;
        f fVar = new f(0);
        f fVar2 = new f(0);
        f fVar3 = new f(0);
        f fVar4 = new f(0);
        float f3 = this.f7892V / 2.0f;
        p050e8.b bVarL = u0.l(0);
        C0479a c0479a = new C0479a(f3);
        C0479a c0479a2 = new C0479a(f3);
        C0479a c0479a3 = new C0479a(f3);
        C0479a c0479a4 = new C0479a(f3);
        o oVar = new o();
        oVar.f7348a = bVarL;
        oVar.f7349b = bVarL;
        oVar.f7350c = bVarL;
        oVar.f7351d = bVarL;
        oVar.f7352e = c0479a;
        oVar.f7353f = c0479a2;
        oVar.g = c0479a3;
        oVar.f7354h = c0479a4;
        oVar.f7355i = fVar;
        oVar.j = fVar2;
        oVar.f7356k = fVar3;
        oVar.f7357l = fVar4;
        i iVar = this.f7876F0;
        iVar.setShapeAppearanceModel(oVar);
        iVar.setBounds(0, 0, this.f7892V, this.f7893W);
        Drawable drawable = this.f7878G0;
        if (drawable != null) {
            a(drawable);
        }
        Iterator it = this.f7880H0.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        z();
    }

    public abstract void setTickActiveRadius(int i10);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveRadius(int i10);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f7866A0)) {
            return;
        }
        this.f7866A0 = colorStateList;
        this.f7913s.setColor(h(colorStateList));
        this.f7923x.setColor(h(this.f7866A0));
        invalidate();
    }

    public abstract void setTrackHeight(int i10);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackInsideCornerSize(int i10);

    public abstract void setTrackStopIndicatorSize(int i10);

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        s(arrayList);
    }

    public final boolean t(int i10, float f3) {
        this.f7908o0 = i10;
        if (Math.abs(f3 - ((Float) this.f7906m0.get(i10)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f7884J0 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f7 = (minSeparation - this.U) / this.f7918u0;
                float f10 = this.f7904k0;
                minSeparation = p.n(f10, this.f7905l0, f7, f10);
            }
        }
        if (k()) {
            minSeparation = -minSeparation;
        }
        int i11 = i10 + 1;
        int i12 = i10 - 1;
        this.f7906m0.set(i10, Float.valueOf(B9.a.h(f3, i12 < 0 ? this.f7904k0 : minSeparation + ((Float) this.f7906m0.get(i12)).floatValue(), i11 >= this.f7906m0.size() ? this.f7905l0 : ((Float) this.f7906m0.get(i11)).floatValue() - minSeparation)));
        Iterator it = this.f7871D.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            ((Float) this.f7906m0.get(i10)).getClass();
            throw null;
        }
        AccessibilityManager accessibilityManager = this.f7927z;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            Runnable runnable = this.f7865A;
            if (runnable == null) {
                this.f7865A = new F1.a(this);
            } else {
                removeCallbacks(runnable);
            }
            F1.a aVar = this.f7865A;
            aVar.f2150s = i10;
            postDelayed(aVar, 200L);
        }
        return true;
    }

    public final void u() {
        double dRound;
        float f3 = this.f7882I0;
        float f7 = this.f7909p0;
        if (f7 > 0.0f) {
            int i10 = (int) ((this.f7905l0 - this.f7904k0) / f7);
            dRound = ((double) Math.round(f3 * i10)) / ((double) i10);
        } else {
            dRound = f3;
        }
        if (k()) {
            dRound = 1.0d - dRound;
        }
        float f10 = this.f7905l0;
        float f11 = this.f7904k0;
        t(this.f7907n0, (float) ((dRound * ((double) (f10 - f11))) + ((double) f11)));
    }

    public final void v(int i10, Rect rect) {
        int iO = this.U + ((int) (o(getValues().get(i10).floatValue()) * this.f7918u0));
        int iB = b();
        int iMax = Math.max(this.f7892V / 2, this.f7891P / 2);
        int iMax2 = Math.max(this.f7893W / 2, this.f7891P / 2);
        rect.set(iO - iMax, iB - iMax2, iO + iMax, iB + iMax2);
    }

    public final void w() {
        if (!(getBackground() instanceof RippleDrawable) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iO = (int) ((o(((Float) this.f7906m0.get(this.f7908o0)).floatValue()) * this.f7918u0) + this.U);
            int iB = b();
            int i10 = this.f7894a0;
            background.setHotspotBounds(iO - i10, iB - i10, iO + i10, iB + i10);
        }
    }

    public final void x() {
        int i10 = this.S;
        if (i10 == 0 || i10 == 1) {
            if (this.f7907n0 == -1 || !isEnabled()) {
                f();
                return;
            } else {
                e();
                return;
            }
        }
        if (i10 == 2) {
            f();
            return;
        }
        if (i10 != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.S);
        }
        if (isEnabled()) {
            Rect rect = new Rect();
            H.i(this).getHitRect(rect);
            if (getLocalVisibleRect(rect)) {
                e();
                return;
            }
        }
        f();
    }

    public final void y(Canvas canvas, Paint paint, RectF rectF, int i10) {
        float f3;
        float f7 = this.T / 2.0f;
        int iB = AbstractC0607v1.b(i10);
        if (iB == 1) {
            f3 = this.f7899f0;
        } else if (iB != 2) {
            if (iB == 3) {
                f7 = this.f7899f0;
            }
            f3 = f7;
        } else {
            f3 = f7;
            f7 = this.f7899f0;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        Path path = this.f7870C0;
        path.reset();
        if (rectF.width() >= f7 + f3) {
            path.addRoundRect(rectF, new float[]{f7, f7, f3, f3, f3, f3, f7, f7}, Path.Direction.CW);
            canvas.drawPath(path, paint);
            return;
        }
        float fMin = Math.min(f7, f3);
        float fMax = Math.max(f7, f3);
        canvas.save();
        path.addRoundRect(rectF, fMin, fMin, Path.Direction.CW);
        canvas.clipPath(path);
        int iB2 = AbstractC0607v1.b(i10);
        RectF rectF2 = this.f7874E0;
        if (iB2 == 1) {
            float f10 = rectF.left;
            rectF2.set(f10, rectF.top, (2.0f * fMax) + f10, rectF.bottom);
        } else if (iB2 != 2) {
            rectF2.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
        } else {
            float f11 = rectF.right;
            rectF2.set(f11 - (2.0f * fMax), rectF.top, f11, rectF.bottom);
        }
        canvas.drawRoundRect(rectF2, fMax, fMax, paint);
        canvas.restore();
    }

    public final void z() {
        boolean z10;
        int iMax = Math.max(this.Q, Math.max(this.T + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + this.f7893W));
        boolean z11 = true;
        if (iMax == this.R) {
            z10 = false;
        } else {
            this.R = iMax;
            z10 = true;
        }
        int iMax2 = Math.max(Math.max(Math.max((this.f7892V / 2) - this.f7885K, 0), Math.max((this.T - this.f7887L) / 2, 0)), Math.max(Math.max(this.f7914s0 - this.f7888M, 0), Math.max(this.f7916t0 - this.f7889N, 0))) + this.f7883J;
        if (this.U == iMax2) {
            z11 = false;
        } else {
            this.U = iMax2;
            WeakHashMap weakHashMap = S.f3689a;
            if (isLaidOut()) {
                this.f7918u0 = Math.max(getWidth() - (this.U * 2), 0);
                l();
            }
        }
        if (z10) {
            requestLayout();
        } else if (z11) {
            postInvalidate();
        }
    }

    public void setValues(List<Float> list) {
        s(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.f7878G0 = null;
        this.f7880H0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.f7880H0;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            a(drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }
}

package androidx.recyclerview.widget;

import A.o1;
import E2.A;
import E2.A0;
import E2.AbstractC0115c0;
import E2.AbstractC0125h0;
import E2.AbstractC0129j0;
import E2.AbstractC0131k0;
import E2.AbstractC0135m0;
import E2.AbstractC0141p0;
import E2.B0;
import E2.C;
import E2.C0;
import E2.C0110a;
import E2.C0111a0;
import E2.C0112b;
import E2.C0113b0;
import E2.C0124h;
import E2.C0127i0;
import E2.C0137n0;
import E2.C0138o;
import E2.C0151z;
import E2.D0;
import E2.E0;
import E2.F0;
import E2.G;
import E2.H0;
import E2.InterfaceC0123g0;
import E2.InterfaceC0139o0;
import E2.InterfaceC0143q0;
import E2.Q;
import E2.Q0;
import E2.W;
import E2.X;
import E2.Y;
import E2.Z;
import E2.r0;
import E2.s0;
import E2.t0;
import E2.u0;
import E2.v0;
import E2.w0;
import E2.y0;
import I1.C0257j;
import I1.C0262o;
import I1.I;
import I1.InterfaceC0261n;
import I1.L;
import I1.S;
import I1.T;
import K0.a1;
import M.k;
import W.AbstractC0607v1;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000a.a;
import p017b7.g;
import p123m2.c;
import u.C1360o;
import u.O;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0261n {

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public static boolean f12846T0 = false;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public static boolean f12847U0 = false;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public static final int[] f12848V0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public static final float f12849W0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public static final boolean f12850X0 = true;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public static final boolean f12851Y0 = true;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public static final Class[] f12852Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final G f12853a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final C0 f12854b1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Rect f12855A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public ArrayList f12856A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Rect f12857B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public boolean f12858B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final RectF f12859C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f12860C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public AbstractC0115c0 f12861D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final C0111a0 f12862D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public AbstractC0135m0 f12863E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public boolean f12864E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final ArrayList f12865F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public H0 f12866F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final ArrayList f12867G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final int[] f12868G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ArrayList f12869H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public C0262o f12870H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public InterfaceC0143q0 f12871I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final int[] f12872I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f12873J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final int[] f12874J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f12875K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final int[] f12876K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f12877L;
    public final ArrayList L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f12878M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final Z f12879M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f12880N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public boolean f12881N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f12882O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public int f12883O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f12884P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public int f12885P0;
    public int Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public final boolean f12886Q0;
    public boolean R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public final C0111a0 f12887R0;
    public final AccessibilityManager S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public final C0257j f12888S0;
    public ArrayList T;
    public boolean U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f12889V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f12890W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f12891a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public AbstractC0125h0 f12892b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public EdgeEffect f12893c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public EdgeEffect f12894d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public EdgeEffect f12895e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public EdgeEffect f12896f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public AbstractC0129j0 f12897g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f12898h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f12899i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public VelocityTracker f12900j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f12901k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f12902l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f12903m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f12904n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f12905o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AbstractC0141p0 f12906p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f12907q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f12908r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f12909r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w0 f12910s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final float f12911s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u0 f12912t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final float f12913t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public y0 f12914u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f12915u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0112b f12916v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final E0 f12917v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0124h f12918w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public C f12919w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k f12920x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final A f12921x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12922y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final B0 f12923y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Z f12924z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public r0 f12925z0;

    static {
        Class cls = Integer.TYPE;
        f12852Z0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f12853a1 = new G(2);
        f12854b1 = new C0();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public static RecyclerView I(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewI = I(viewGroup.getChildAt(i10));
            if (recyclerViewI != null) {
                return recyclerViewI;
            }
        }
        return null;
    }

    public static int N(View view) {
        F0 f0P = P(view);
        if (f0P != null) {
            return f0P.b();
        }
        return -1;
    }

    public static F0 P(View view) {
        if (view == null) {
            return null;
        }
        return ((C0137n0) view.getLayoutParams()).f1733a;
    }

    private C0262o getScrollingChildHelper() {
        if (this.f12870H0 == null) {
            this.f12870H0 = new C0262o(this);
        }
        return this.f12870H0;
    }

    public static void l(F0 f3) {
        WeakReference weakReference = f3.f1487b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == f3.f1486a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            f3.f1487b = null;
        }
    }

    public static int o(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && a.I(edgeEffect) != 0.0f) {
            int iRound = Math.round(a.W(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f) * ((-i11) / 4.0f));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || a.I(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f3 = i11;
        int iRound2 = Math.round(a.W(edgeEffect2, (i10 * 4.0f) / f3, 0.5f) * (f3 / 4.0f));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        f12846T0 = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        f12847U0 = z10;
    }

    public final void A() {
        if (this.f12895e0 != null) {
            return;
        }
        ((C0) this.f12892b0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f12895e0 = edgeEffect;
        if (this.f12922y) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.f12894d0 != null) {
            return;
        }
        ((C0) this.f12892b0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f12894d0 = edgeEffect;
        if (this.f12922y) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String C() {
        return " " + super.toString() + ", adapter:" + this.f12861D + ", layout:" + this.f12863E + ", context:" + getContext();
    }

    public final void D(B0 b5) {
        if (getScrollState() != 2) {
            b5.getClass();
            return;
        }
        OverScroller overScroller = this.f12917v0.f1466t;
        overScroller.getFinalX();
        overScroller.getCurrX();
        b5.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View E(float f3, float f7) {
        for (int iW = this.f12918w.w() - 1; iW >= 0; iW--) {
            View viewV = this.f12918w.v(iW);
            float translationX = viewV.getTranslationX();
            float translationY = viewV.getTranslationY();
            if (f3 >= viewV.getLeft() + translationX && f3 <= viewV.getRight() + translationX && f7 >= viewV.getTop() + translationY && f7 <= viewV.getBottom() + translationY) {
                return viewV;
            }
        }
        return null;
    }

    public final View F(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean G(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f12869H;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC0143q0 interfaceC0143q0 = (InterfaceC0143q0) arrayList.get(i10);
            if (interfaceC0143q0.a(this, motionEvent) && action != 3) {
                this.f12871I = interfaceC0143q0;
                return true;
            }
        }
        return false;
    }

    public final void H(int[] iArr) {
        int iW = this.f12918w.w();
        if (iW == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iW; i12++) {
            F0 f0P = P(this.f12918w.v(i12));
            if (!f0P.p()) {
                int iC = f0P.c();
                if (iC < i10) {
                    i10 = iC;
                }
                if (iC > i11) {
                    i11 = iC;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final F0 J(int i10) {
        F0 f3 = null;
        if (this.U) {
            return null;
        }
        int iZ = this.f12918w.z();
        for (int i11 = 0; i11 < iZ; i11++) {
            F0 f0P = P(this.f12918w.y(i11));
            if (f0P != null && !f0P.i() && L(f0P) == i10) {
                if (!((ArrayList) this.f12918w.f1676e).contains(f0P.f1486a)) {
                    return f0P;
                }
                f3 = f0P;
            }
        }
        return f3;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0152  */
    /* JADX WARN: Code duplicated, block: B:165:0x021e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c9  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean K(int i10, int i11, int i12, int i13) {
        int iMax;
        int i14;
        boolean z10;
        boolean z11;
        boolean z12;
        int minFlingVelocity;
        boolean z13;
        W wF;
        int iH;
        PointF pointFA;
        int i15;
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.f12882O) {
            boolean zE = abstractC0135m0.e();
            boolean zF = this.f12863E.f();
            int i16 = (!zE || Math.abs(i10) < i12) ? 0 : i10;
            int iMax2 = (!zF || Math.abs(i11) < i12) ? 0 : i11;
            if (i16 != 0 || iMax2 != 0) {
                if (i16 == 0) {
                    iMax = 0;
                } else {
                    EdgeEffect edgeEffect = this.f12893c0;
                    if (edgeEffect == null || a.I(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.f12895e0;
                        if (edgeEffect2 == null || a.I(edgeEffect2) == 0.0f) {
                            iMax = 0;
                        } else if (m0(this.f12895e0, i16, getWidth())) {
                            this.f12895e0.onAbsorb(i16);
                            i16 = 0;
                        }
                    } else {
                        int i17 = -i16;
                        if (m0(this.f12893c0, i17, getWidth())) {
                            this.f12893c0.onAbsorb(i17);
                            i16 = 0;
                        }
                    }
                    iMax = i16;
                    i16 = 0;
                }
                if (iMax2 == 0) {
                    i14 = iMax2;
                    iMax2 = 0;
                } else {
                    EdgeEffect edgeEffect3 = this.f12894d0;
                    if (edgeEffect3 == null || a.I(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.f12896f0;
                        if (edgeEffect4 == null || a.I(edgeEffect4) == 0.0f) {
                            i14 = iMax2;
                            iMax2 = 0;
                        } else if (m0(this.f12896f0, iMax2, getHeight())) {
                            this.f12896f0.onAbsorb(iMax2);
                            iMax2 = 0;
                        }
                    } else {
                        int i18 = -iMax2;
                        if (m0(this.f12894d0, i18, getHeight())) {
                            this.f12894d0.onAbsorb(i18);
                            iMax2 = 0;
                        }
                    }
                    i14 = 0;
                }
                E0 e10 = this.f12917v0;
                if (iMax != 0 || iMax2 != 0) {
                    int i19 = -i13;
                    iMax = Math.max(i19, Math.min(iMax, i13));
                    iMax2 = Math.max(i19, Math.min(iMax2, i13));
                    q0(1);
                    e10.a(iMax, iMax2);
                }
                if (i16 != 0 || i14 != 0) {
                    float f3 = i16;
                    float f7 = i14;
                    if (!dispatchNestedPreFling(f3, f7)) {
                        boolean z14 = zE || zF;
                        dispatchNestedFling(f3, f7, z14);
                        AbstractC0141p0 abstractC0141p0 = this.f12906p0;
                        if (abstractC0141p0 != null) {
                            Y y10 = (Y) abstractC0141p0;
                            AbstractC0135m0 layoutManager = y10.f1630a.getLayoutManager();
                            if (layoutManager == 0 || y10.f1630a.getAdapter() == null || ((Math.abs(i14) <= (minFlingVelocity = y10.f1630a.getMinFlingVelocity()) && Math.abs(i16) <= minFlingVelocity) || !((z13 = layoutManager instanceof A0)))) {
                                z10 = z14;
                                z11 = false;
                                z12 = true;
                            } else {
                                View view = null;
                                X x9 = !z13 ? null : new X(y10, y10.f1630a.getContext(), 0);
                                if (x9 == null) {
                                    z10 = z14;
                                    z11 = false;
                                    z12 = true;
                                } else {
                                    int iC = layoutManager.C();
                                    if (iC != 0) {
                                        if (layoutManager.f()) {
                                            wF = y10.g(layoutManager);
                                        } else {
                                            wF = layoutManager.e() ? y10.f(layoutManager) : null;
                                        }
                                        if (wF == null) {
                                            z10 = z14;
                                            z11 = false;
                                            z12 = true;
                                        } else {
                                            z11 = false;
                                            int iW = layoutManager.w();
                                            z12 = true;
                                            int i20 = 0;
                                            int i21 = Integer.MIN_VALUE;
                                            int i22 = Integer.MAX_VALUE;
                                            View view2 = null;
                                            while (i20 < iW) {
                                                boolean z15 = z14;
                                                View viewV = layoutManager.v(i20);
                                                if (viewV == null) {
                                                    i15 = iW;
                                                } else {
                                                    i15 = iW;
                                                    int iC2 = Y.c(viewV, wF);
                                                    if (iC2 <= 0 && iC2 > i21) {
                                                        view2 = viewV;
                                                        i21 = iC2;
                                                    }
                                                    if (iC2 >= 0 && iC2 < i22) {
                                                        view = viewV;
                                                        i22 = iC2;
                                                    }
                                                }
                                                i20++;
                                                z14 = z15;
                                                iW = i15;
                                            }
                                            z10 = z14;
                                            Object[] objArr = !layoutManager.e() ? i14 <= 0 : i16 <= 0;
                                            if (objArr == true && view != null) {
                                                iH = AbstractC0135m0.H(view);
                                            } else if (objArr == true || view2 == null) {
                                                if (objArr != false) {
                                                    view = view2;
                                                }
                                                if (view != null) {
                                                    iH = ((z13 && (pointFA = ((A0) layoutManager).a(layoutManager.C() + (-1))) != null && ((pointFA.x > 0.0f ? 1 : (pointFA.x == 0.0f ? 0 : -1)) < 0 || (pointFA.y > 0.0f ? 1 : (pointFA.y == 0.0f ? 0 : -1)) < 0)) == objArr ? -1 : 1) + AbstractC0135m0.H(view);
                                                    if (iH < 0 || iH >= iC) {
                                                    }
                                                }
                                            } else {
                                                iH = AbstractC0135m0.H(view2);
                                            }
                                        }
                                        iH = -1;
                                    } else {
                                        z10 = z14;
                                        z11 = false;
                                        z12 = true;
                                        iH = -1;
                                    }
                                    if (iH != -1) {
                                        x9.f1604a = iH;
                                        layoutManager.D0(x9);
                                        return z12;
                                    }
                                }
                            }
                        } else {
                            z10 = z14;
                            z11 = false;
                            z12 = true;
                        }
                        if (!z10) {
                            return z11;
                        }
                        boolean z16 = z12;
                        q0(z16 ? 1 : 0);
                        int i23 = -i13;
                        e10.a(Math.max(i23, Math.min(i16, i13)), Math.max(i23, Math.min(i14, i13)));
                        return z16;
                    }
                } else if (iMax != 0 || iMax2 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int L(F0 f3) {
        if ((f3.j & 524) == 0 && f3.f()) {
            int i10 = f3.f1488c;
            ArrayList arrayList = (ArrayList) this.f12916v.f1642b;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0110a c0110a = (C0110a) arrayList.get(i11);
                int i12 = c0110a.f1636a;
                if (i12 != 1) {
                    if (i12 == 2) {
                        int i13 = c0110a.f1637b;
                        if (i13 <= i10) {
                            int i14 = c0110a.f1639d;
                            if (i13 + i14 <= i10) {
                                i10 -= i14;
                            }
                        } else {
                            continue;
                        }
                    } else if (i12 == 8) {
                        int i15 = c0110a.f1637b;
                        if (i15 == i10) {
                            i10 = c0110a.f1639d;
                        } else {
                            if (i15 < i10) {
                                i10--;
                            }
                            if (c0110a.f1639d <= i10) {
                                i10++;
                            }
                        }
                    }
                } else if (c0110a.f1637b <= i10) {
                    i10 += c0110a.f1639d;
                }
            }
            return i10;
        }
        return -1;
    }

    public final long M(F0 f3) {
        return this.f12861D.f1652s ? f3.f1490e : f3.f1488c;
    }

    public final F0 O(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return P(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect Q(View view) {
        C0137n0 c0137n0 = (C0137n0) view.getLayoutParams();
        boolean z10 = c0137n0.f1735c;
        Rect rect = c0137n0.f1734b;
        if (z10) {
            B0 b5 = this.f12923y0;
            if (!b5.g || (!c0137n0.f1733a.l() && !c0137n0.f1733a.g())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.f12867G;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Rect rect2 = this.f12855A;
                    rect2.set(0, 0, 0, 0);
                    ((AbstractC0131k0) arrayList.get(i10)).f(rect2, view, this, b5);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                c0137n0.f1735c = false;
                return rect;
            }
        }
        return rect;
    }

    public final boolean R() {
        return !this.f12877L || this.U || this.f12916v.k();
    }

    public final void S() {
        if (this.f12867G.size() == 0) {
            return;
        }
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 != null) {
            abstractC0135m0.c("Cannot invalidate item decorations during a scroll or layout");
        }
        V();
        requestLayout();
    }

    public final boolean T() {
        return this.f12890W > 0;
    }

    public final void U(int i10) {
        if (this.f12863E == null) {
            return;
        }
        setScrollState(2);
        this.f12863E.s0(i10);
        awakenScrollBars();
    }

    public final void V() {
        int iZ = this.f12918w.z();
        for (int i10 = 0; i10 < iZ; i10++) {
            ((C0137n0) this.f12918w.y(i10).getLayoutParams()).f1735c = true;
        }
        ArrayList arrayList = this.f12912t.f1780c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0137n0 c0137n0 = (C0137n0) ((F0) arrayList.get(i11)).f1486a.getLayoutParams();
            if (c0137n0 != null) {
                c0137n0.f1735c = true;
            }
        }
    }

    public final void W(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iZ = this.f12918w.z();
        for (int i13 = 0; i13 < iZ; i13++) {
            F0 f0P = P(this.f12918w.y(i13));
            if (f0P != null && !f0P.p()) {
                int i14 = f0P.f1488c;
                B0 b5 = this.f12923y0;
                if (i14 >= i12) {
                    if (f12847U0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + f0P + " now at position " + (f0P.f1488c - i11));
                    }
                    f0P.m(-i11, z10);
                    b5.f1448f = true;
                } else if (i14 >= i10) {
                    if (f12847U0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + f0P + " now REMOVED");
                    }
                    f0P.a(8);
                    f0P.m(-i11, z10);
                    f0P.f1488c = i10 - 1;
                    b5.f1448f = true;
                }
            }
        }
        u0 u0Var = this.f12912t;
        ArrayList arrayList = u0Var.f1780c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            F0 f3 = (F0) arrayList.get(size);
            if (f3 != null) {
                int i15 = f3.f1488c;
                if (i15 >= i12) {
                    if (f12847U0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + f3 + " now at position " + (f3.f1488c - i11));
                    }
                    f3.m(-i11, z10);
                } else if (i15 >= i10) {
                    f3.a(8);
                    u0Var.g(size);
                }
            }
        }
        requestLayout();
    }

    public final void X() {
        this.f12890W++;
    }

    public final void Y(boolean z10) {
        int i10;
        AccessibilityManager accessibilityManager;
        int i11 = this.f12890W - 1;
        this.f12890W = i11;
        if (i11 < 1) {
            if (f12846T0 && i11 < 0) {
                throw new IllegalStateException(p245z2.a.C(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f12890W = 0;
            if (z10) {
                int i12 = this.Q;
                this.Q = 0;
                if (i12 != 0 && (accessibilityManager = this.S) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i12);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.L0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    F0 f3 = (F0) arrayList.get(size);
                    if (f3.f1486a.getParent() == this && !f3.p() && (i10 = f3.f1500q) != -1) {
                        f3.f1486a.setImportantForAccessibility(i10);
                        f3.f1500q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void Z(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f12899i0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f12899i0 = motionEvent.getPointerId(i10);
            int x9 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f12903m0 = x9;
            this.f12901k0 = x9;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f12904n0 = y10;
            this.f12902l0 = y10;
        }
    }

    public final void a0() {
        if (this.f12864E0 || !this.f12873J) {
            return;
        }
        WeakHashMap weakHashMap = S.f3689a;
        postOnAnimation(this.f12879M0);
        this.f12864E0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 != null) {
            abstractC0135m0.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final void b0() {
        boolean z10;
        boolean z11 = false;
        if (this.U) {
            C0112b c0112b = this.f12916v;
            c0112b.s((ArrayList) c0112b.f1642b);
            c0112b.s((ArrayList) c0112b.f1644d);
            c0112b.f1641a = 0;
            if (this.f12889V) {
                this.f12863E.a0();
            }
        }
        if (this.f12897g0 == null || !this.f12863E.E0()) {
            this.f12916v.e();
        } else {
            this.f12916v.r();
        }
        boolean z12 = this.f12858B0 || this.f12860C0;
        boolean z13 = this.f12877L && this.f12897g0 != null && ((z10 = this.U) || z12 || this.f12863E.f1720f) && (!z10 || this.f12861D.f1652s);
        B0 b5 = this.f12923y0;
        b5.j = z13;
        if (z13 && z12 && !this.U && this.f12897g0 != null && this.f12863E.E0()) {
            z11 = true;
        }
        b5.f1451k = z11;
    }

    public final void c0(boolean z10) {
        this.f12889V = z10 | this.f12889V;
        this.U = true;
        int iZ = this.f12918w.z();
        for (int i10 = 0; i10 < iZ; i10++) {
            F0 f0P = P(this.f12918w.y(i10));
            if (f0P != null && !f0P.p()) {
                f0P.a(6);
            }
        }
        V();
        u0 u0Var = this.f12912t;
        ArrayList arrayList = u0Var.f1780c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            F0 f3 = (F0) arrayList.get(i11);
            if (f3 != null) {
                f3.a(6);
                f3.a(1024);
            }
        }
        AbstractC0115c0 abstractC0115c0 = u0Var.f1784h.f12861D;
        if (abstractC0115c0 == null || !abstractC0115c0.f1652s) {
            u0Var.f();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0137n0) && this.f12863E.g((C0137n0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 != null && abstractC0135m0.e()) {
            return this.f12863E.k(this.f12923y0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 != null && abstractC0135m0.e()) {
            return this.f12863E.l(this.f12923y0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 != null && abstractC0135m0.e()) {
            return this.f12863E.m(this.f12923y0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 != null && abstractC0135m0.f()) {
            return this.f12863E.n(this.f12923y0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 != null && abstractC0135m0.f()) {
            return this.f12863E.o(this.f12923y0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 != null && abstractC0135m0.f()) {
            return this.f12863E.p(this.f12923y0);
        }
        return 0;
    }

    public final void d0(F0 f3, C0127i0 c0127i0) {
        f3.j &= -8193;
        boolean z10 = this.f12923y0.f1449h;
        k kVar = this.f12920x;
        if (z10 && f3.l() && !f3.i() && !f3.p()) {
            ((C1360o) kVar.f5619t).h(M(f3), f3);
        }
        O o10 = (O) kVar.f5618s;
        Q0 q0A = (Q0) o10.get(f3);
        if (q0A == null) {
            q0A = Q0.a();
            o10.put(f3, q0A);
        }
        q0A.f1620b = c0127i0;
        q0A.f1619a |= 4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        AbstractC0135m0 layoutManager = getLayoutManager();
        int iA = 0;
        if (layoutManager != null) {
            if (layoutManager.f()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        n0(0, measuredHeight, false);
                        return true;
                    }
                    n0(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zM = layoutManager.M();
                    if (keyCode == 122) {
                        if (zM) {
                            iA = getAdapter().a();
                        }
                    } else if (!zM) {
                        iA = getAdapter().a();
                    }
                    o0(iA);
                    return true;
                }
            } else if (layoutManager.e()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        n0(measuredWidth, 0, false);
                        return true;
                    }
                    n0(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zM2 = layoutManager.M();
                    if (keyCode2 == 122) {
                        if (zM2) {
                            iA = getAdapter().a();
                        }
                    } else if (!zM2) {
                        iA = getAdapter().a();
                    }
                    o0(iA);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f7, boolean z10) {
        return getScrollingChildHelper().a(f3, f7, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f7) {
        return getScrollingChildHelper().b(f3, f7);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().d(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        ArrayList arrayList = this.f12867G;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC0131k0) arrayList.get(i10)).h(canvas, this, this.f12923y0);
        }
        EdgeEffect edgeEffect = this.f12893c0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f12922y ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f12893c0;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f12894d0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f12922y) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f12894d0;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f12895e0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f12922y ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f12895e0;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f12896f0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f12922y) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f12896f0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.f12897g0 == null || arrayList.size() <= 0 || !this.f12897g0.f()) ? z10 : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f12893c0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f12893c0.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f12894d0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f12894d0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f12895e0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f12895e0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f12896f0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f12896f0.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final int f0(int i10, float f3) {
        float height = f3 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.f12893c0;
        float f7 = 0.0f;
        if (edgeEffect == null || a.I(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f12895e0;
            if (edgeEffect2 != null && a.I(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f12895e0.onRelease();
                } else {
                    float fW = a.W(this.f12895e0, width, height);
                    if (a.I(this.f12895e0) == 0.0f) {
                        this.f12895e0.onRelease();
                    }
                    f7 = fW;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f12893c0.onRelease();
            } else {
                float f10 = -a.W(this.f12893c0, -width, 1.0f - height);
                if (a.I(this.f12893c0) == 0.0f) {
                    this.f12893c0.onRelease();
                }
                f7 = f10;
            }
            invalidate();
        }
        return Math.round(f7 * getWidth());
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0167  */
    /* JADX WARN: Code duplicated, block: B:137:0x0197 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:138:0x0198  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i10) {
        View viewU;
        int i11;
        byte b5;
        boolean z10;
        this.f12863E.getClass();
        boolean z11 = true;
        boolean z12 = (this.f12861D == null || this.f12863E == null || T() || this.f12882O) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        B0 b10 = this.f12923y0;
        u0 u0Var = this.f12912t;
        if (z12 && (i10 == 2 || i10 == 1)) {
            if (this.f12863E.f()) {
                if (focusFinder.findNextFocus(this, view, i10 == 2 ? 130 : 33) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.f12863E.e()) {
                z10 = focusFinder.findNextFocus(this, view, (this.f12863E.f1716b.getLayoutDirection() == 1) ^ (i10 == 2) ? 66 : 17) == null;
            }
            if (z10) {
                p();
                if (F(view) != null) {
                    p0();
                    this.f12863E.U(view, i10, u0Var, b10);
                    r0(false);
                }
                return null;
            }
            viewU = focusFinder.findNextFocus(this, view, i10);
            if (viewU == null) {
            }
            if (viewU != null) {
                z11 = false;
            } else {
                z11 = false;
            }
            if (z11) {
                return viewU;
            }
            return super.focusSearch(view, i10);
        }
        View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
        if (viewFindNextFocus == null && z12) {
            p();
            if (F(view) != null) {
                p0();
                viewU = this.f12863E.U(view, i10, u0Var, b10);
                r0(false);
            }
            return null;
        }
        viewU = viewFindNextFocus;
        if (viewU == null && !viewU.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i10);
            }
            i0(viewU, null);
            return view;
        }
        if (viewU != null || viewU == this || viewU == view) {
            z11 = false;
        } else if (F(viewU) == null) {
            z11 = false;
        } else if (view != null && F(view) != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f12855A;
            rect.set(0, 0, width, height);
            int width2 = viewU.getWidth();
            int height2 = viewU.getHeight();
            Rect rect2 = this.f12857B;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewU, rect2);
            int i12 = this.f12863E.f1716b.getLayoutDirection() == 1 ? -1 : 1;
            int i13 = rect.left;
            int i14 = rect2.left;
            if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
                i11 = 1;
            } else {
                int i15 = rect.right;
                int i16 = rect2.right;
                i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
            }
            int i17 = rect.top;
            int i18 = rect2.top;
            if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
                b5 = 1;
            } else {
                int i19 = rect.bottom;
                int i20 = rect2.bottom;
                b5 = ((i19 > i20 || i17 >= i20) && i17 > i18) ? (byte) -1 : (byte) 0;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 17) {
                        if (i10 != 33) {
                            if (i10 != 66) {
                                if (i10 != 130) {
                                    StringBuilder sb = new StringBuilder("Invalid direction: ");
                                    sb.append(i10);
                                    throw new IllegalArgumentException(p245z2.a.C(this, sb));
                                }
                                if (b5 <= 0) {
                                    z11 = false;
                                }
                            } else if (i11 <= 0) {
                                z11 = false;
                            }
                        } else if (b5 >= 0) {
                            z11 = false;
                        }
                    } else if (i11 >= 0) {
                        z11 = false;
                    }
                } else if (b5 <= 0 && (b5 != 0 || i11 * i12 <= 0)) {
                    z11 = false;
                }
            } else if (b5 >= 0 && (b5 != 0 || i11 * i12 >= 0)) {
                z11 = false;
            }
        }
        if (z11) {
            return viewU;
        }
        return super.focusSearch(view, i10);
    }

    public final int g0(int i10, float f3) {
        float width = f3 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.f12894d0;
        float f7 = 0.0f;
        if (edgeEffect == null || a.I(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f12896f0;
            if (edgeEffect2 != null && a.I(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f12896f0.onRelease();
                } else {
                    float fW = a.W(this.f12896f0, height, 1.0f - width);
                    if (a.I(this.f12896f0) == 0.0f) {
                        this.f12896f0.onRelease();
                    }
                    f7 = fW;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f12894d0.onRelease();
            } else {
                float f10 = -a.W(this.f12894d0, -height, width);
                if (a.I(this.f12894d0) == 0.0f) {
                    this.f12894d0.onRelease();
                }
                f7 = f10;
            }
            invalidate();
        }
        return Math.round(f7 * getHeight());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 != null) {
            return abstractC0135m0.s();
        }
        throw new IllegalStateException(p245z2.a.C(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 != null) {
            return abstractC0135m0.t(getContext(), attributeSet);
        }
        throw new IllegalStateException(p245z2.a.C(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0115c0 getAdapter() {
        return this.f12861D;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 == null) {
            return super.getBaseline();
        }
        abstractC0135m0.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f12922y;
    }

    public H0 getCompatAccessibilityDelegate() {
        return this.f12866F0;
    }

    public AbstractC0125h0 getEdgeEffectFactory() {
        return this.f12892b0;
    }

    public AbstractC0129j0 getItemAnimator() {
        return this.f12897g0;
    }

    public int getItemDecorationCount() {
        return this.f12867G.size();
    }

    public AbstractC0135m0 getLayoutManager() {
        return this.f12863E;
    }

    public int getMaxFlingVelocity() {
        return this.f12909r0;
    }

    public int getMinFlingVelocity() {
        return this.f12907q0;
    }

    public long getNanoTime() {
        if (f12851Y0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC0141p0 getOnFlingListener() {
        return this.f12906p0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f12915u0;
    }

    public t0 getRecycledViewPool() {
        return this.f12912t.c();
    }

    public int getScrollState() {
        return this.f12898h0;
    }

    public final void h(F0 f3) {
        View view = f3.f1486a;
        boolean z10 = view.getParent() == this;
        this.f12912t.l(O(view));
        if (f3.k()) {
            this.f12918w.c(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.f12918w.a(view, -1, true);
            return;
        }
        C0124h c0124h = this.f12918w;
        int iIndexOfChild = ((C0111a0) c0124h.f1674c).f1640a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((o1) c0124h.f1675d).l(iIndexOfChild);
            c0124h.A(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void h0(AbstractC0131k0 abstractC0131k0) {
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 != null) {
            abstractC0135m0.c("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f12867G;
        arrayList.remove(abstractC0131k0);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        V();
        requestLayout();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(AbstractC0131k0 abstractC0131k0) {
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 != null) {
            abstractC0135m0.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f12867G;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC0131k0);
        V();
        requestLayout();
    }

    public final void i0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f12855A;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0137n0) {
            C0137n0 c0137n0 = (C0137n0) layoutParams;
            if (!c0137n0.f1735c) {
                Rect rect2 = c0137n0.f1734b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f12863E.p0(this, view, this.f12855A, !this.f12877L, view2 == null);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f12873J;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f12882O;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f3768d;
    }

    public final void j(r0 r0Var) {
        if (this.f12856A0 == null) {
            this.f12856A0 = new ArrayList();
        }
        this.f12856A0.add(r0Var);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fe A[DONT_INVERT, PHI: r7
      0x00fe: PHI (r7v9 boolean) = (r7v7 boolean), (r7v10 boolean) binds: [B:33:0x00e5, B:31:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0100  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x0111  */
    public final boolean j0(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        boolean z11;
        boolean z12;
        p();
        AbstractC0115c0 abstractC0115c0 = this.f12861D;
        int[] iArr = this.f12876K0;
        if (abstractC0115c0 != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            k0(i10, i11, iArr);
            i13 = iArr[0];
            i14 = iArr[1];
            i15 = i10 - i13;
            i16 = i11 - i14;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f12867G.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        w(i13, i14, i15, i16, this.f12872I0, i12, iArr);
        int i17 = iArr[0];
        int i18 = i15 - i17;
        int i19 = iArr[1];
        int i20 = i16 - i19;
        boolean z13 = (i17 == 0 && i19 == 0) ? false : true;
        int i21 = this.f12903m0;
        int[] iArr2 = this.f12872I0;
        int i22 = iArr2[0];
        this.f12903m0 = i21 - i22;
        int i23 = this.f12904n0;
        int i24 = iArr2[1];
        this.f12904n0 = i23 - i24;
        int[] iArr3 = this.f12874J0;
        iArr3[0] = iArr3[0] + i22;
        iArr3[1] = iArr3[1] + i24;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || p185s8.u0.t(motionEvent, 8194)) {
                z10 = true;
                z11 = false;
            } else {
                float x9 = motionEvent.getX();
                float f3 = i18;
                float y10 = motionEvent.getY();
                float f7 = i20;
                if (f3 < 0.0f) {
                    z();
                    z10 = true;
                    z11 = false;
                    a.W(this.f12893c0, (-f3) / getWidth(), 1.0f - (y10 / getHeight()));
                } else {
                    z10 = true;
                    z11 = false;
                    if (f3 > 0.0f) {
                        A();
                        a.W(this.f12895e0, f3 / getWidth(), y10 / getHeight());
                    } else {
                        z12 = false;
                    }
                    if (f7 < 0.0f) {
                        B();
                        a.W(this.f12894d0, (-f7) / getHeight(), x9 / getWidth());
                    } else if (f7 > 0.0f) {
                        y();
                        a.W(this.f12896f0, f7 / getHeight(), 1.0f - (x9 / getWidth()));
                    } else {
                        if (z12 || f3 != 0.0f || f7 != 0.0f) {
                            postInvalidateOnAnimation();
                        }
                        if (Build.VERSION.SDK_INT >= 31 && p185s8.u0.t(motionEvent, 4194304)) {
                            e0();
                        }
                    }
                    z12 = z10;
                    if (z12) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        e0();
                    }
                }
                z12 = z10;
                if (f7 < 0.0f) {
                    B();
                    a.W(this.f12894d0, (-f7) / getHeight(), x9 / getWidth());
                } else if (f7 > 0.0f) {
                    y();
                    a.W(this.f12896f0, f7 / getHeight(), 1.0f - (x9 / getWidth()));
                } else {
                    if (z12) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        e0();
                    }
                }
                z12 = z10;
                if (z12) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidateOnAnimation();
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    e0();
                }
            }
            n(i10, i11);
        } else {
            z10 = true;
            z11 = false;
        }
        if (i13 != 0 || i14 != 0) {
            x(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z13 && i13 == 0 && i14 == 0) ? z11 : z10;
    }

    public final void k(String str) {
        if (T()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(p245z2.a.C(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f12891a0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(p245z2.a.C(this, new StringBuilder(""))));
        }
    }

    public final void k0(int i10, int i11, int[] iArr) {
        F0 f3;
        p0();
        X();
        Trace.beginSection("RV Scroll");
        B0 b5 = this.f12923y0;
        D(b5);
        u0 u0Var = this.f12912t;
        int iR0 = i10 != 0 ? this.f12863E.r0(i10, u0Var, b5) : 0;
        int iT0 = i11 != 0 ? this.f12863E.t0(i11, u0Var, b5) : 0;
        Trace.endSection();
        int iW = this.f12918w.w();
        for (int i12 = 0; i12 < iW; i12++) {
            View viewV = this.f12918w.v(i12);
            F0 f0O = O(viewV);
            if (f0O != null && (f3 = f0O.f1493i) != null) {
                View view = f3.f1486a;
                int left = viewV.getLeft();
                int top = viewV.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Y(true);
        r0(false);
        if (iArr != null) {
            iArr[0] = iR0;
            iArr[1] = iT0;
        }
    }

    public final void l0(int i10) {
        if (this.f12882O) {
            return;
        }
        t0();
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0135m0.s0(i10);
            awakenScrollBars();
        }
    }

    public final void m() {
        int iZ = this.f12918w.z();
        for (int i10 = 0; i10 < iZ; i10++) {
            F0 f0P = P(this.f12918w.y(i10));
            if (!f0P.p()) {
                f0P.f1489d = -1;
                f0P.g = -1;
            }
        }
        u0 u0Var = this.f12912t;
        ArrayList arrayList = u0Var.f1778a;
        ArrayList arrayList2 = u0Var.f1780c;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            F0 f3 = (F0) arrayList2.get(i11);
            f3.f1489d = -1;
            f3.g = -1;
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            F0 f7 = (F0) arrayList.get(i12);
            f7.f1489d = -1;
            f7.g = -1;
        }
        ArrayList arrayList3 = u0Var.f1779b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                F0 f10 = (F0) u0Var.f1779b.get(i13);
                f10.f1489d = -1;
                f10.g = -1;
            }
        }
    }

    public final boolean m0(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        float fI = a.I(edgeEffect) * i11;
        float fAbs = Math.abs(-i10) * 0.35f;
        float f3 = this.f12908r * 0.015f;
        double dLog = Math.log(fAbs / f3);
        double d5 = f12849W0;
        return ((float) (Math.exp((d5 / (d5 - 1.0d)) * dLog) * ((double) f3))) < fI;
    }

    public final void n(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f12893c0;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.f12893c0.onRelease();
            zIsFinished = this.f12893c0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f12895e0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f12895e0.onRelease();
            zIsFinished |= this.f12895e0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f12894d0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f12894d0.onRelease();
            zIsFinished |= this.f12894d0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f12896f0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f12896f0.onRelease();
            zIsFinished |= this.f12896f0.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void n0(int i10, int i11, boolean z10) {
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f12882O) {
            return;
        }
        if (!abstractC0135m0.e()) {
            i10 = 0;
        }
        if (!this.f12863E.f()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (z10) {
            int i12 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i12 |= 2;
            }
            getScrollingChildHelper().g(i12, 1);
        }
        this.f12917v0.c(i10, i11, Integer.MIN_VALUE, null);
    }

    public final void o0(int i10) {
        if (this.f12882O) {
            return;
        }
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0135m0.C0(this, this.f12923y0, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f12890W = 0;
        this.f12873J = true;
        this.f12877L = this.f12877L && !isLayoutRequested();
        this.f12912t.d();
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 != null) {
            abstractC0135m0.g = true;
            abstractC0135m0.S(this);
        }
        this.f12864E0 = false;
        if (f12851Y0) {
            ThreadLocal threadLocal = C.f1455v;
            C c10 = (C) threadLocal.get();
            this.f12919w0 = c10;
            if (c10 == null) {
                this.f12919w0 = new C();
                WeakHashMap weakHashMap = S.f3689a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                C c11 = this.f12919w0;
                c11.f1459t = (long) (1.0E9f / refreshRate);
                threadLocal.set(c11);
            }
            ArrayList arrayList = this.f12919w0.f1457r;
            if (f12846T0 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C c10;
        super.onDetachedFromWindow();
        AbstractC0129j0 abstractC0129j0 = this.f12897g0;
        if (abstractC0129j0 != null) {
            abstractC0129j0.e();
        }
        t0();
        int i10 = 0;
        this.f12873J = false;
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 != null) {
            abstractC0135m0.g = false;
            abstractC0135m0.T(this);
        }
        this.L0.clear();
        removeCallbacks(this.f12879M0);
        this.f12920x.getClass();
        while (Q0.f1618d.a() != null) {
        }
        u0 u0Var = this.f12912t;
        ArrayList arrayList = u0Var.f1780c;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            g.N(((F0) arrayList.get(i11)).f1486a);
        }
        u0Var.e(u0Var.f1784h.f12861D, false);
        while (i10 < getChildCount()) {
            int i12 = i10 + 1;
            View childAt = getChildAt(i10);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = g.e0(childAt).f6580a;
            for (int iE = AbstractC0813f2.E(arrayList2); -1 < iE; iE--) {
                ((a1) arrayList2.get(iE)).f5057a.c();
            }
            i10 = i12;
        }
        if (!f12851Y0 || (c10 = this.f12919w0) == null) {
            return;
        }
        boolean zRemove = c10.f1457r.remove(this);
        if (f12846T0 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f12919w0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f12867G;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC0131k0) arrayList.get(i10)).g(canvas, this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i10;
        boolean z10;
        if (this.f12863E != null && !this.f12882O && motionEvent.getAction() == 8) {
            float f3 = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                float f7 = this.f12863E.f() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f12863E.e() ? motionEvent.getAxisValue(10) : 0.0f;
                i10 = 0;
                z10 = false;
                f3 = f7;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.f12863E.f()) {
                    float f10 = -axisValue;
                    axisValue = 0.0f;
                    f3 = f10;
                } else if (!this.f12863E.e()) {
                    axisValue = 0.0f;
                }
                i10 = 26;
                z10 = this.f12886Q0;
            } else {
                axisValue = 0.0f;
                i10 = 0;
                z10 = false;
            }
            int i11 = (int) (f3 * this.f12913t0);
            int i12 = (int) (axisValue * this.f12911s0);
            if (z10) {
                OverScroller overScroller = this.f12917v0.f1466t;
                n0((overScroller.getFinalX() - overScroller.getCurrX()) + i12, (overScroller.getFinalY() - overScroller.getCurrY()) + i11, true);
            } else {
                AbstractC0135m0 abstractC0135m0 = this.f12863E;
                if (abstractC0135m0 == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.f12882O) {
                    int[] iArr = this.f12876K0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zE = abstractC0135m0.e();
                    boolean zF = this.f12863E.f();
                    int i13 = zF ? (zE ? 1 : 0) | 2 : zE ? 1 : 0;
                    float y10 = motionEvent.getY();
                    float x9 = motionEvent.getX();
                    int iF0 = i12 - f0(i12, y10);
                    int iG0 = i11 - g0(i11, x9);
                    getScrollingChildHelper().g(i13, 1);
                    if (v(zE ? iF0 : 0, zF ? iG0 : 0, 1, this.f12876K0, this.f12872I0)) {
                        iF0 -= iArr[0];
                        iG0 -= iArr[1];
                    }
                    j0(zE ? iF0 : 0, zF ? iG0 : 0, motionEvent, 1);
                    C c10 = this.f12919w0;
                    if (c10 != null && (iF0 != 0 || iG0 != 0)) {
                        c10.a(this, iF0, iG0);
                    }
                    s0(1);
                }
            }
            if (i10 != 0 && !z10) {
                this.f12888S0.a(motionEvent, i10);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (!this.f12882O) {
            this.f12871I = null;
            if (G(motionEvent)) {
                VelocityTracker velocityTracker = this.f12900j0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                s0(0);
                e0();
                setScrollState(0);
                return true;
            }
            AbstractC0135m0 abstractC0135m0 = this.f12863E;
            if (abstractC0135m0 != null) {
                boolean zE = abstractC0135m0.e();
                boolean zF = this.f12863E.f();
                if (this.f12900j0 == null) {
                    this.f12900j0 = VelocityTracker.obtain();
                }
                this.f12900j0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f12884P) {
                        this.f12884P = false;
                    }
                    this.f12899i0 = motionEvent.getPointerId(0);
                    int x9 = (int) (motionEvent.getX() + 0.5f);
                    this.f12903m0 = x9;
                    this.f12901k0 = x9;
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.f12904n0 = y10;
                    this.f12902l0 = y10;
                    EdgeEffect edgeEffect = this.f12893c0;
                    if (edgeEffect == null || a.I(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z10 = false;
                    } else {
                        a.W(this.f12893c0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z10 = true;
                    }
                    EdgeEffect edgeEffect2 = this.f12895e0;
                    if (edgeEffect2 != null && a.I(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        a.W(this.f12895e0, 0.0f, motionEvent.getY() / getHeight());
                        z10 = true;
                    }
                    EdgeEffect edgeEffect3 = this.f12894d0;
                    if (edgeEffect3 != null && a.I(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        a.W(this.f12894d0, 0.0f, motionEvent.getX() / getWidth());
                        z10 = true;
                    }
                    EdgeEffect edgeEffect4 = this.f12896f0;
                    if (edgeEffect4 != null && a.I(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        a.W(this.f12896f0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z10 = true;
                    }
                    if (z10 || this.f12898h0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        s0(1);
                    }
                    int[] iArr = this.f12874J0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    q0(0);
                } else if (actionMasked == 1) {
                    this.f12900j0.clear();
                    s0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f12899i0);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f12899i0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f12898h0 != 1) {
                        int i10 = x10 - this.f12901k0;
                        int i11 = y11 - this.f12902l0;
                        if (!zE || Math.abs(i10) <= this.f12905o0) {
                            z11 = false;
                        } else {
                            this.f12903m0 = x10;
                            z11 = true;
                        }
                        if (zF && Math.abs(i11) > this.f12905o0) {
                            this.f12904n0 = y11;
                            z11 = true;
                        }
                        if (z11) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.f12900j0;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    s0(0);
                    e0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f12899i0 = motionEvent.getPointerId(actionIndex);
                    int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f12903m0 = x11;
                    this.f12901k0 = x11;
                    int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f12904n0 = y12;
                    this.f12902l0 = y12;
                } else if (actionMasked == 6) {
                    Z(motionEvent);
                }
                if (this.f12898h0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Trace.beginSection("RV OnLayout");
        s();
        Trace.endSection();
        this.f12877L = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 == null) {
            q(i10, i11);
            return;
        }
        boolean zL = abstractC0135m0.L();
        boolean z10 = false;
        B0 b5 = this.f12923y0;
        if (zL) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f12863E.f1716b.q(i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.f12881N0 = z10;
            if (z10 || this.f12861D == null) {
                return;
            }
            if (b5.f1446d == 1) {
                t();
            }
            this.f12863E.v0(i10, i11);
            b5.f1450i = true;
            u();
            this.f12863E.x0(i10, i11);
            if (this.f12863E.A0()) {
                this.f12863E.v0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                b5.f1450i = true;
                u();
                this.f12863E.x0(i10, i11);
            }
            this.f12883O0 = getMeasuredWidth();
            this.f12885P0 = getMeasuredHeight();
            return;
        }
        if (this.f12875K) {
            this.f12863E.f1716b.q(i10, i11);
            return;
        }
        if (this.R) {
            p0();
            X();
            b0();
            Y(true);
            if (b5.f1451k) {
                b5.g = true;
            } else {
                this.f12916v.e();
                b5.g = false;
            }
            this.R = false;
            r0(false);
        } else if (b5.f1451k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0115c0 abstractC0115c0 = this.f12861D;
        if (abstractC0115c0 != null) {
            b5.f1447e = abstractC0115c0.a();
        } else {
            b5.f1447e = 0;
        }
        p0();
        this.f12863E.f1716b.q(i10, i11);
        r0(false);
        b5.g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (T()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y0 y0Var = (y0) parcelable;
        this.f12914u = y0Var;
        super.onRestoreInstanceState(y0Var.f6852r);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        y0 y0Var = new y0(super.onSaveInstanceState());
        y0 y0Var2 = this.f12914u;
        if (y0Var2 != null) {
            y0Var.f1796t = y0Var2.f1796t;
            return y0Var;
        }
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 != null) {
            y0Var.f1796t = abstractC0135m0.h0();
            return y0Var;
        }
        y0Var.f1796t = null;
        return y0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        this.f12896f0 = null;
        this.f12894d0 = null;
        this.f12895e0 = null;
        this.f12893c0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0111 A[PHI: r1
      0x0111: PHI (r1v47 int) = (r1v31 int), (r1v51 int) binds: [B:56:0x00fa, B:60:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zG;
        boolean z10;
        if (!this.f12882O && !this.f12884P) {
            InterfaceC0143q0 interfaceC0143q0 = this.f12871I;
            if (interfaceC0143q0 == null) {
                zG = motionEvent.getAction() == 0 ? false : G(motionEvent);
            } else {
                interfaceC0143q0.c(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.f12871I = null;
                }
                zG = true;
            }
            if (zG) {
                VelocityTracker velocityTracker = this.f12900j0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                s0(0);
                e0();
                setScrollState(0);
                return true;
            }
            AbstractC0135m0 abstractC0135m0 = this.f12863E;
            if (abstractC0135m0 != null) {
                boolean zE = abstractC0135m0.e();
                boolean zF = this.f12863E.f();
                if (this.f12900j0 == null) {
                    this.f12900j0 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.f12874J0;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.f12900j0.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker2 = this.f12900j0;
                        int i10 = this.f12909r0;
                        velocityTracker2.computeCurrentVelocity(1000, i10);
                        float f3 = zE ? -this.f12900j0.getXVelocity(this.f12899i0) : 0.0f;
                        float f7 = zF ? -this.f12900j0.getYVelocity(this.f12899i0) : 0.0f;
                        if ((f3 == 0.0f && f7 == 0.0f) || !K((int) f3, (int) f7, this.f12907q0, i10)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker3 = this.f12900j0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        s0(0);
                        e0();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.f12899i0);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f12899i0 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x9 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y10 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.f12903m0 - x9;
                        int iMax2 = this.f12904n0 - y10;
                        if (this.f12898h0 != 1) {
                            if (zE) {
                                iMax = iMax > 0 ? Math.max(0, iMax - this.f12905o0) : Math.min(0, iMax + this.f12905o0);
                                if (iMax != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            } else {
                                z10 = false;
                            }
                            if (zF) {
                                iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.f12905o0) : Math.min(0, iMax2 + this.f12905o0);
                                if (iMax2 != 0) {
                                    z10 = true;
                                }
                            }
                            if (z10) {
                                setScrollState(1);
                            }
                        }
                        if (this.f12898h0 == 1) {
                            int[] iArr2 = this.f12876K0;
                            iArr2[0] = 0;
                            iArr2[1] = 0;
                            int iF0 = iMax - f0(iMax, motionEvent.getY());
                            int iG0 = iMax2 - g0(iMax2, motionEvent.getX());
                            boolean zV = v(zE ? iF0 : 0, zF ? iG0 : 0, 0, this.f12876K0, this.f12872I0);
                            int[] iArr3 = this.f12872I0;
                            if (zV) {
                                iF0 -= iArr2[0];
                                iG0 -= iArr2[1];
                                iArr[0] = iArr[0] + iArr3[0];
                                iArr[1] = iArr[1] + iArr3[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i11 = iF0;
                            int i12 = iG0;
                            this.f12903m0 = x9 - iArr3[0];
                            this.f12904n0 = y10 - iArr3[1];
                            if (j0(zE ? i11 : 0, zF ? i12 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            C c10 = this.f12919w0;
                            if (c10 != null && (i11 != 0 || i12 != 0)) {
                                c10.a(this, i11, i12);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker4 = this.f12900j0;
                        if (velocityTracker4 != null) {
                            velocityTracker4.clear();
                        }
                        s0(0);
                        e0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f12899i0 = motionEvent.getPointerId(actionIndex);
                        int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f12903m0 = x10;
                        this.f12901k0 = x10;
                        int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f12904n0 = y11;
                        this.f12902l0 = y11;
                    } else if (actionMasked == 6) {
                        Z(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.f12899i0 = motionEvent.getPointerId(0);
                int x11 = (int) (motionEvent.getX() + 0.5f);
                this.f12903m0 = x11;
                this.f12901k0 = x11;
                int y12 = (int) (motionEvent.getY() + 0.5f);
                this.f12904n0 = y12;
                this.f12902l0 = y12;
                q0(0);
                this.f12900j0.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (!this.f12877L || this.U) {
            Trace.beginSection("RV FullInvalidate");
            s();
            Trace.endSection();
            return;
        }
        if (this.f12916v.k()) {
            C0112b c0112b = this.f12916v;
            int i10 = c0112b.f1641a;
            if ((i10 & 4) == 0 || (i10 & 11) != 0) {
                if (c0112b.k()) {
                    Trace.beginSection("RV FullInvalidate");
                    s();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            p0();
            X();
            this.f12916v.r();
            if (!this.f12880N) {
                int iW = this.f12918w.w();
                for (int i11 = 0; i11 < iW; i11++) {
                    F0 f0P = P(this.f12918w.v(i11));
                    if (f0P != null && !f0P.p() && f0P.l()) {
                        s();
                    }
                }
                this.f12916v.d();
            }
            r0(true);
            Y(true);
            Trace.endSection();
        }
    }

    public final void p0() {
        int i10 = this.f12878M + 1;
        this.f12878M = i10;
        if (i10 != 1 || this.f12882O) {
            return;
        }
        this.f12880N = false;
    }

    public final void q(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = S.f3689a;
        setMeasuredDimension(AbstractC0135m0.h(i10, paddingRight, getMinimumWidth()), AbstractC0135m0.h(i11, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q0(int i10) {
        boolean zE = this.f12863E.e();
        int i11 = zE;
        if (this.f12863E.f()) {
            i11 = (zE ? 1 : 0) | 2;
        }
        getScrollingChildHelper().g(i11, i10);
    }

    public final void r(View view) {
        P(view);
        ArrayList arrayList = this.T;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC0139o0) this.T.get(size)).d(view);
            }
        }
    }

    public final void r0(boolean z10) {
        if (this.f12878M < 1) {
            if (f12846T0) {
                throw new IllegalStateException(p245z2.a.C(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f12878M = 1;
        }
        if (!z10 && !this.f12882O) {
            this.f12880N = false;
        }
        if (this.f12878M == 1) {
            if (z10 && this.f12880N && !this.f12882O && this.f12863E != null && this.f12861D != null) {
                s();
            }
            if (!this.f12882O) {
                this.f12880N = false;
            }
        }
        this.f12878M--;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        F0 f0P = P(view);
        if (f0P != null) {
            if (f0P.k()) {
                f0P.j &= -257;
            } else if (!f0P.p()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(f0P);
                throw new IllegalArgumentException(p245z2.a.C(this, sb));
            }
        } else if (f12846T0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(p245z2.a.C(this, sb2));
        }
        view.clearAnimation();
        r(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        Q q10 = this.f12863E.f1719e;
        if ((q10 == null || !q10.f1608e) && !T() && view2 != null) {
            i0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f12863E.p0(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ArrayList arrayList = this.f12869H;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((InterfaceC0143q0) arrayList.get(i10)).e(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f12878M != 0 || this.f12882O) {
            this.f12880N = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:166:0x034a  */
    /* JADX WARN: Code duplicated, block: B:185:0x0390  */
    /* JADX WARN: Code duplicated, block: B:187:0x0393  */
    /* JADX WARN: Code duplicated, block: B:193:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:195:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:197:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:200:0x03be  */
    /* JADX WARN: Code duplicated, block: B:203:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:206:0x03cf A[LOOP:4: B:199:0x03bc->B:206:0x03cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:212:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:215:0x03ed A[LOOP:5: B:208:0x03da->B:215:0x03ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:217:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:247:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x03cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x03f0 A[EDGE_INSN: B:251:0x03f0->B:216:0x03f0 BREAK  A[LOOP:5: B:208:0x03da->B:215:0x03ed], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x03eb A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void s() {
        boolean z10;
        long j;
        F0 f3;
        int i10;
        int iB;
        int i11;
        int iMin;
        F0 f0J;
        View view;
        F0 f0J2;
        View view2;
        int i12;
        View viewFindViewById;
        View view3;
        boolean z11;
        C0127i0 c0127i0;
        ?? r10;
        boolean zG;
        boolean z12;
        if (this.f12861D == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f12863E == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        B0 b5 = this.f12923y0;
        boolean z13 = false;
        b5.f1450i = false;
        boolean z14 = true;
        boolean z15 = this.f12881N0 && !(this.f12883O0 == getWidth() && this.f12885P0 == getHeight());
        this.f12883O0 = 0;
        this.f12885P0 = 0;
        this.f12881N0 = false;
        if (b5.f1446d == 1) {
            t();
            this.f12863E.u0(this);
            u();
        } else {
            C0112b c0112b = this.f12916v;
            if ((((ArrayList) c0112b.f1644d).isEmpty() || ((ArrayList) c0112b.f1642b).isEmpty()) && !z15 && this.f12863E.f1726n == getWidth() && this.f12863E.f1727o == getHeight()) {
                this.f12863E.u0(this);
            } else {
                this.f12863E.u0(this);
                u();
            }
        }
        b5.a(4);
        p0();
        X();
        b5.f1446d = 1;
        boolean z16 = b5.j;
        u0 u0Var = this.f12912t;
        k kVar = this.f12920x;
        if (z16) {
            int iW = this.f12918w.w() - 1;
            while (iW >= 0) {
                F0 f0P = P(this.f12918w.v(iW));
                if (f0P.p()) {
                    z12 = z14;
                } else {
                    long jM = M(f0P);
                    this.f12897g0.getClass();
                    C0127i0 c0127i1 = new C0127i0();
                    c0127i1.c(f0P);
                    C1360o c1360o = (C1360o) kVar.f5619t;
                    O o10 = (O) kVar.f5618s;
                    F0 f7 = (F0) c1360o.d(jM);
                    if (f7 == null || f7.p()) {
                        z12 = z14;
                        kVar.g(f0P, c0127i1);
                    } else {
                        z12 = z14;
                        Q0 q10 = (Q0) o10.get(f7);
                        boolean z17 = (q10 == null || (q10.f1619a & 1) == 0) ? false : z12;
                        Q0 q11 = (Q0) o10.get(f0P);
                        boolean z18 = (q11 == null || (q11.f1619a & 1) == 0) ? false : z12;
                        if (z17 && f7 == f0P) {
                            kVar.g(f0P, c0127i1);
                        } else {
                            C0127i0 c0127i0E = kVar.E(f7, 4);
                            kVar.g(f0P, c0127i1);
                            C0127i0 c0127i0E2 = kVar.E(f0P, 8);
                            if (c0127i0E == null) {
                                int iW2 = this.f12918w.w();
                                for (int i13 = 0; i13 < iW2; i13++) {
                                    F0 f0P2 = P(this.f12918w.v(i13));
                                    if (f0P2 != f0P && M(f0P2) == jM) {
                                        AbstractC0115c0 abstractC0115c0 = this.f12861D;
                                        if (abstractC0115c0 == null || !abstractC0115c0.f1652s) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(f0P2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(f0P);
                                            throw new IllegalStateException(p245z2.a.C(this, sb));
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(f0P2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(f0P);
                                        throw new IllegalStateException(p245z2.a.C(this, sb2));
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f7 + " cannot be found but it is necessary for " + f0P + C());
                            } else {
                                f7.o(false);
                                if (z17) {
                                    h(f7);
                                }
                                if (f7 != f0P) {
                                    if (z18) {
                                        h(f0P);
                                    }
                                    f7.f1492h = f0P;
                                    h(f7);
                                    u0Var.l(f7);
                                    f0P.o(false);
                                    f0P.f1493i = f7;
                                }
                                if (this.f12897g0.a(f7, f0P, c0127i0E, c0127i0E2)) {
                                    a0();
                                }
                            }
                        }
                    }
                }
                iW--;
                z14 = z12;
            }
            z10 = z14;
            O o11 = (O) kVar.f5618s;
            int i14 = o11.f22703t - 1;
            while (i14 >= 0) {
                F0 f10 = (F0) o11.f(i14);
                Q0 q12 = (Q0) o11.g(i14);
                int i15 = q12.f1619a;
                int i16 = i15 & 3;
                C0111a0 c0111a0 = this.f12887R0;
                if (i16 == 3) {
                    RecyclerView recyclerView = c0111a0.f1640a;
                    recyclerView.f12863E.n0(f10.f1486a, recyclerView.f12912t);
                    r10 = z13;
                } else if ((i15 & 1) != 0) {
                    C0127i0 c0127i2 = q12.f1620b;
                    if (c0127i2 == null) {
                        RecyclerView recyclerView2 = c0111a0.f1640a;
                        recyclerView2.f12863E.n0(f10.f1486a, recyclerView2.f12912t);
                        r10 = z13;
                    } else {
                        c0111a0.b(f10, c0127i2, q12.f1621c);
                        r10 = z13;
                    }
                } else if ((i15 & 14) == 14) {
                    c0111a0.a(f10, q12.f1620b, q12.f1621c);
                    r10 = z13;
                } else {
                    if ((i15 & 12) == 12) {
                        C0127i0 c0127i3 = q12.f1620b;
                        C0127i0 c0127i4 = q12.f1621c;
                        c0111a0.getClass();
                        f10.o(z13);
                        RecyclerView recyclerView3 = c0111a0.f1640a;
                        if (!recyclerView3.U) {
                            C0138o c0138o = (C0138o) recyclerView3.f12897g0;
                            c0138o.getClass();
                            int i17 = c0127i3.f1681a;
                            int i18 = c0127i4.f1681a;
                            if (i17 == i18 && c0127i3.f1682b == c0127i4.f1682b) {
                                c0138o.c(f10);
                                zG = false;
                            } else {
                                zG = c0138o.g(f10, i17, c0127i3.f1682b, i18, c0127i4.f1682b);
                            }
                            if (zG) {
                                recyclerView3.a0();
                            }
                        } else if (recyclerView3.f12897g0.a(f10, f10, c0127i3, c0127i4)) {
                            recyclerView3.a0();
                        }
                        r10 = 0;
                    } else {
                        if ((i15 & 4) != 0) {
                            c0127i0 = null;
                            c0111a0.b(f10, q12.f1620b, null);
                        } else {
                            c0127i0 = null;
                            if ((i15 & 8) != 0) {
                                c0111a0.a(f10, q12.f1620b, q12.f1621c);
                            }
                        }
                        r10 = 0;
                    }
                    q12.f1619a = r10;
                    q12.f1620b = c0127i0;
                    q12.f1621c = c0127i0;
                    Q0.f1618d.c(q12);
                    i14--;
                    z13 = false;
                }
                c0127i0 = null;
                q12.f1619a = r10;
                q12.f1620b = c0127i0;
                q12.f1621c = c0127i0;
                Q0.f1618d.c(q12);
                i14--;
                z13 = false;
            }
        } else {
            z10 = true;
        }
        View view4 = null;
        this.f12863E.m0(u0Var);
        b5.f1444b = b5.f1447e;
        this.U = false;
        this.f12889V = false;
        b5.j = false;
        b5.f1451k = false;
        this.f12863E.f1720f = false;
        ArrayList arrayList = u0Var.f1779b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0.f1723k) {
            abstractC0135m0.j = 0;
            abstractC0135m0.f1723k = false;
            u0Var.m();
        }
        this.f12863E.f0(b5);
        boolean z19 = z10;
        Y(z19);
        r0(false);
        ((O) kVar.f5618s).clear();
        ((C1360o) kVar.f5619t).b();
        int[] iArr = this.f12868G0;
        int i19 = iArr[0];
        int i20 = iArr[z19 ? 1 : 0];
        H(iArr);
        if ((iArr[0] == i19 && iArr[z19 ? 1 : 0] == i20) ? false : true) {
            x(0, 0);
        }
        if (this.f12915u0 && this.f12861D != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = b5.f1453m;
                if (j == -1) {
                    f3 = null;
                } else {
                    f3 = null;
                }
                if (f3 != null) {
                    view3 = f3.f1486a;
                    if (!((ArrayList) this.f12918w.f1676e).contains(view3)) {
                        if (this.f12918w.w() > 0) {
                            int i21 = b5.f1452l;
                            if (i21 != -1) {
                            }
                            iB = b5.b();
                            i11 = i10;
                            while (true) {
                                if (i11 < iB) {
                                    f0J2 = J(i11);
                                    if (f0J2 != null) {
                                        view2 = f0J2.f1486a;
                                        if (view2.hasFocusable()) {
                                            view4 = view2;
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iB, i10) - 1; iMin >= 0; iMin--) {
                                    f0J = J(iMin);
                                    if (f0J == null) {
                                        break;
                                        break;
                                    }
                                    view = f0J.f1486a;
                                    if (view.hasFocusable()) {
                                        view4 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.f12918w.w() > 0) {
                        int i22 = b5.f1452l;
                        if (i22 != -1) {
                        }
                        iB = b5.b();
                        i11 = i10;
                        while (true) {
                            if (i11 < iB) {
                                f0J2 = J(i11);
                                if (f0J2 != null) {
                                    view2 = f0J2.f1486a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                f0J = J(iMin);
                                if (f0J == null) {
                                    break;
                                    break;
                                }
                                view = f0J.f1486a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.f12918w.w() > 0) {
                    int i23 = b5.f1452l;
                    if (i23 != -1) {
                    }
                    iB = b5.b();
                    i11 = i10;
                    while (true) {
                        if (i11 < iB) {
                            f0J2 = J(i11);
                            if (f0J2 != null) {
                                view2 = f0J2.f1486a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i11++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            f0J = J(iMin);
                            if (f0J == null) {
                                break;
                                break;
                            }
                            view = f0J.f1486a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i12 = b5.f1454n;
                    if (i12 != -1) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            } else if (((ArrayList) this.f12918w.f1676e).contains(getFocusedChild())) {
                j = b5.f1453m;
                if (j == -1 && (z11 = this.f12861D.f1652s) && z11) {
                    int iZ = this.f12918w.z();
                    f3 = null;
                    for (int i24 = 0; i24 < iZ; i24++) {
                        F0 f0P3 = P(this.f12918w.y(i24));
                        if (f0P3 != null && !f0P3.i() && f0P3.f1490e == j) {
                            if (!((ArrayList) this.f12918w.f1676e).contains(f0P3.f1486a)) {
                                f3 = f0P3;
                                break;
                            }
                            f3 = f0P3;
                        }
                    }
                } else {
                    f3 = null;
                }
                if (f3 != null) {
                    view3 = f3.f1486a;
                    if (!((ArrayList) this.f12918w.f1676e).contains(view3) && view3.hasFocusable()) {
                        view4 = view3;
                    } else if (this.f12918w.w() > 0) {
                        int i25 = b5.f1452l;
                        i10 = i25 != -1 ? i25 : 0;
                        iB = b5.b();
                        i11 = i10;
                        while (true) {
                            if (i11 < iB) {
                                f0J2 = J(i11);
                                if (f0J2 != null) {
                                    view2 = f0J2.f1486a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                f0J = J(iMin);
                                if (f0J == null) {
                                    break;
                                }
                                view = f0J.f1486a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.f12918w.w() > 0) {
                    int i26 = b5.f1452l;
                    if (i26 != -1) {
                    }
                    iB = b5.b();
                    i11 = i10;
                    while (true) {
                        if (i11 < iB) {
                            f0J2 = J(i11);
                            if (f0J2 != null) {
                                view2 = f0J2.f1486a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i11++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            f0J = J(iMin);
                            if (f0J == null) {
                                break;
                                break;
                            }
                            view = f0J.f1486a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i12 = b5.f1454n;
                    if (i12 != -1 && (viewFindViewById = view4.findViewById(i12)) != null && viewFindViewById.isFocusable()) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            }
        }
        b5.f1453m = -1L;
        b5.f1452l = -1;
        b5.f1454n = -1;
    }

    public final void s0(int i10) {
        getScrollingChildHelper().h(i10);
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f12882O) {
            return;
        }
        boolean zE = abstractC0135m0.e();
        boolean zF = this.f12863E.f();
        if (zE || zF) {
            if (!zE) {
                i10 = 0;
            }
            if (!zF) {
                i11 = 0;
            }
            j0(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!T()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.Q |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(H0 h7) {
        this.f12866F0 = h7;
        S.o(this, h7);
    }

    public void setAdapter(AbstractC0115c0 abstractC0115c0) {
        setLayoutFrozen(false);
        AbstractC0115c0 abstractC0115c1 = this.f12861D;
        w0 w0Var = this.f12910s;
        if (abstractC0115c1 != null) {
            abstractC0115c1.f1651r.unregisterObserver(w0Var);
            this.f12861D.getClass();
        }
        AbstractC0129j0 abstractC0129j0 = this.f12897g0;
        if (abstractC0129j0 != null) {
            abstractC0129j0.e();
        }
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        u0 u0Var = this.f12912t;
        if (abstractC0135m0 != null) {
            abstractC0135m0.l0(u0Var);
            this.f12863E.m0(u0Var);
        }
        u0Var.f1778a.clear();
        u0Var.f();
        C0112b c0112b = this.f12916v;
        c0112b.s((ArrayList) c0112b.f1642b);
        c0112b.s((ArrayList) c0112b.f1644d);
        c0112b.f1641a = 0;
        AbstractC0115c0 abstractC0115c2 = this.f12861D;
        this.f12861D = abstractC0115c0;
        if (abstractC0115c0 != null) {
            abstractC0115c0.f1651r.registerObserver(w0Var);
        }
        AbstractC0135m0 abstractC0135m1 = this.f12863E;
        if (abstractC0135m1 != null) {
            abstractC0135m1.R();
        }
        AbstractC0115c0 abstractC0115c3 = this.f12861D;
        u0Var.f1778a.clear();
        u0Var.f();
        u0Var.e(abstractC0115c2, true);
        t0 t0VarC = u0Var.c();
        if (abstractC0115c2 != null) {
            t0VarC.f1771b--;
        }
        if (t0VarC.f1771b == 0) {
            SparseArray sparseArray = t0VarC.f1770a;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                s0 s0Var = (s0) sparseArray.valueAt(i10);
                ArrayList arrayList = s0Var.f1762a;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    g.N(((F0) obj).f1486a);
                }
                s0Var.f1762a.clear();
            }
        }
        if (abstractC0115c3 != null) {
            t0VarC.f1771b++;
        }
        u0Var.d();
        this.f12923y0.f1448f = true;
        c0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0123g0 interfaceC0123g0) {
        if (interfaceC0123g0 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(interfaceC0123g0 != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f12922y) {
            this.f12896f0 = null;
            this.f12894d0 = null;
            this.f12895e0 = null;
            this.f12893c0 = null;
        }
        this.f12922y = z10;
        super.setClipToPadding(z10);
        if (this.f12877L) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(AbstractC0125h0 abstractC0125h0) {
        abstractC0125h0.getClass();
        this.f12892b0 = abstractC0125h0;
        this.f12896f0 = null;
        this.f12894d0 = null;
        this.f12895e0 = null;
        this.f12893c0 = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.f12875K = z10;
    }

    public void setItemAnimator(AbstractC0129j0 abstractC0129j0) {
        AbstractC0129j0 abstractC0129j1 = this.f12897g0;
        if (abstractC0129j1 != null) {
            abstractC0129j1.e();
            this.f12897g0.f1688a = null;
        }
        this.f12897g0 = abstractC0129j0;
        if (abstractC0129j0 != null) {
            abstractC0129j0.f1688a = this.f12862D0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        u0 u0Var = this.f12912t;
        u0Var.f1782e = i10;
        u0Var.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(AbstractC0135m0 abstractC0135m0) {
        if (abstractC0135m0 == this.f12863E) {
            return;
        }
        t0();
        AbstractC0135m0 abstractC0135m1 = this.f12863E;
        u0 u0Var = this.f12912t;
        if (abstractC0135m1 != null) {
            AbstractC0129j0 abstractC0129j0 = this.f12897g0;
            if (abstractC0129j0 != null) {
                abstractC0129j0.e();
            }
            this.f12863E.l0(u0Var);
            this.f12863E.m0(u0Var);
            u0Var.f1778a.clear();
            u0Var.f();
            if (this.f12873J) {
                AbstractC0135m0 abstractC0135m2 = this.f12863E;
                abstractC0135m2.g = false;
                abstractC0135m2.T(this);
            }
            this.f12863E.y0(null);
            this.f12863E = null;
        } else {
            u0Var.f1778a.clear();
            u0Var.f();
        }
        C0124h c0124h = this.f12918w;
        RecyclerView recyclerView = ((C0111a0) c0124h.f1674c).f1640a;
        ((o1) c0124h.f1675d).k();
        ArrayList arrayList = (ArrayList) c0124h.f1676e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            F0 f0P = P((View) arrayList.get(size));
            if (f0P != null) {
                int i10 = f0P.f1499p;
                if (recyclerView.T()) {
                    f0P.f1500q = i10;
                    recyclerView.L0.add(f0P);
                } else {
                    f0P.f1486a.setImportantForAccessibility(i10);
                }
                f0P.f1499p = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f12863E = abstractC0135m0;
        if (abstractC0135m0 != null) {
            if (abstractC0135m0.f1716b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(abstractC0135m0);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(p245z2.a.C(abstractC0135m0.f1716b, sb));
            }
            abstractC0135m0.y0(this);
            if (this.f12873J) {
                AbstractC0135m0 abstractC0135m3 = this.f12863E;
                abstractC0135m3.g = true;
                abstractC0135m3.S(this);
            }
        }
        u0Var.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        C0262o scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f3768d) {
            View view = scrollingChildHelper.f3767c;
            WeakHashMap weakHashMap = S.f3689a;
            I.n(view);
        }
        scrollingChildHelper.f3768d = z10;
    }

    public void setOnFlingListener(AbstractC0141p0 abstractC0141p0) {
        this.f12906p0 = abstractC0141p0;
    }

    @Deprecated
    public void setOnScrollListener(r0 r0Var) {
        this.f12925z0 = r0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f12915u0 = z10;
    }

    public void setRecycledViewPool(t0 t0Var) {
        u0 u0Var = this.f12912t;
        RecyclerView recyclerView = u0Var.f1784h;
        u0Var.e(recyclerView.f12861D, false);
        t0 t0Var2 = u0Var.g;
        if (t0Var2 != null) {
            t0Var2.f1771b--;
        }
        u0Var.g = t0Var;
        if (t0Var != null && recyclerView.getAdapter() != null) {
            u0Var.g.f1771b++;
        }
        u0Var.d();
    }

    public void setScrollState(int i10) {
        Q q10;
        if (i10 == this.f12898h0) {
            return;
        }
        if (f12847U0) {
            StringBuilder sbW = c.w(i10, "setting scroll state to ", " from ");
            sbW.append(this.f12898h0);
            Log.d("RecyclerView", sbW.toString(), new Exception());
        }
        this.f12898h0 = i10;
        if (i10 != 2) {
            E0 e10 = this.f12917v0;
            e10.f1470x.removeCallbacks(e10);
            e10.f1466t.abortAnimation();
            AbstractC0135m0 abstractC0135m0 = this.f12863E;
            if (abstractC0135m0 != null && (q10 = abstractC0135m0.f1719e) != null) {
                q10.j();
            }
        }
        AbstractC0135m0 abstractC0135m1 = this.f12863E;
        if (abstractC0135m1 != null) {
            abstractC0135m1.i0(i10);
        }
        r0 r0Var = this.f12925z0;
        if (r0Var != null) {
            r0Var.a(this, i10);
        }
        ArrayList arrayList = this.f12856A0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((r0) this.f12856A0.get(size)).a(this, i10);
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.f12905o0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.f12905o0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(D0 d1) {
        this.f12912t.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f12882O) {
            k("Do not suppressLayout in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f12882O = true;
                this.f12884P = true;
                t0();
                return;
            }
            this.f12882O = false;
            if (this.f12880N && this.f12863E != null && this.f12861D != null) {
                requestLayout();
            }
            this.f12880N = false;
        }
    }

    public final void t() {
        Q0 q10;
        View viewF;
        B0 b5 = this.f12923y0;
        b5.a(1);
        D(b5);
        b5.f1450i = false;
        p0();
        k kVar = this.f12920x;
        O o10 = (O) kVar.f5618s;
        O o11 = (O) kVar.f5618s;
        o10.clear();
        C1360o c1360o = (C1360o) kVar.f5619t;
        c1360o.b();
        X();
        b0();
        F0 f0O = null;
        View focusedChild = (this.f12915u0 && hasFocus() && this.f12861D != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewF = F(focusedChild)) != null) {
            f0O = O(viewF);
        }
        if (f0O == null) {
            b5.f1453m = -1L;
            b5.f1452l = -1;
            b5.f1454n = -1;
        } else {
            b5.f1453m = this.f12861D.f1652s ? f0O.f1490e : -1L;
            b5.f1452l = this.U ? -1 : f0O.i() ? f0O.f1489d : f0O.b();
            View focusedChild2 = f0O.f1486a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            b5.f1454n = id;
        }
        b5.f1449h = b5.j && this.f12860C0;
        this.f12860C0 = false;
        this.f12858B0 = false;
        b5.g = b5.f1451k;
        b5.f1447e = this.f12861D.a();
        H(this.f12868G0);
        if (b5.j) {
            int iW = this.f12918w.w();
            for (int i10 = 0; i10 < iW; i10++) {
                F0 f0P = P(this.f12918w.v(i10));
                if (!f0P.p() && (!f0P.g() || this.f12861D.f1652s)) {
                    AbstractC0129j0 abstractC0129j0 = this.f12897g0;
                    AbstractC0129j0.b(f0P);
                    f0P.d();
                    abstractC0129j0.getClass();
                    C0127i0 c0127i0 = new C0127i0();
                    c0127i0.c(f0P);
                    Q0 q0A = (Q0) o11.get(f0P);
                    if (q0A == null) {
                        q0A = Q0.a();
                        o11.put(f0P, q0A);
                    }
                    q0A.f1620b = c0127i0;
                    q0A.f1619a |= 4;
                    if (b5.f1449h && f0P.l() && !f0P.i() && !f0P.p() && !f0P.g()) {
                        c1360o.h(M(f0P), f0P);
                    }
                }
            }
        }
        if (b5.f1451k) {
            int iZ = this.f12918w.z();
            for (int i11 = 0; i11 < iZ; i11++) {
                F0 f0P2 = P(this.f12918w.y(i11));
                if (f12846T0 && f0P2.f1488c == -1 && !f0P2.i()) {
                    throw new IllegalStateException(p245z2.a.C(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!f0P2.p() && f0P2.f1489d == -1) {
                    f0P2.f1489d = f0P2.f1488c;
                }
            }
            boolean z10 = b5.f1448f;
            b5.f1448f = false;
            this.f12863E.e0(this.f12912t, b5);
            b5.f1448f = z10;
            for (int i12 = 0; i12 < this.f12918w.w(); i12++) {
                F0 f0P3 = P(this.f12918w.v(i12));
                if (!f0P3.p() && ((q10 = (Q0) o11.get(f0P3)) == null || (q10.f1619a & 4) == 0)) {
                    AbstractC0129j0.b(f0P3);
                    boolean z11 = (f0P3.j & 8192) != 0;
                    AbstractC0129j0 abstractC0129j1 = this.f12897g0;
                    f0P3.d();
                    abstractC0129j1.getClass();
                    C0127i0 c0127i1 = new C0127i0();
                    c0127i1.c(f0P3);
                    if (z11) {
                        d0(f0P3, c0127i1);
                    } else {
                        Q0 q0A2 = (Q0) o11.get(f0P3);
                        if (q0A2 == null) {
                            q0A2 = Q0.a();
                            o11.put(f0P3, q0A2);
                        }
                        q0A2.f1619a |= 2;
                        q0A2.f1620b = c0127i1;
                    }
                }
            }
            m();
        } else {
            m();
        }
        Y(true);
        r0(false);
        b5.f1446d = 2;
    }

    public final void t0() {
        Q q10;
        setScrollState(0);
        E0 e10 = this.f12917v0;
        e10.f1470x.removeCallbacks(e10);
        e10.f1466t.abortAnimation();
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 == null || (q10 = abstractC0135m0.f1719e) == null) {
            return;
        }
        q10.j();
    }

    public final void u() {
        p0();
        X();
        B0 b5 = this.f12923y0;
        b5.a(6);
        this.f12916v.e();
        b5.f1447e = this.f12861D.a();
        b5.f1445c = 0;
        if (this.f12914u != null) {
            AbstractC0115c0 abstractC0115c0 = this.f12861D;
            int iB = AbstractC0607v1.b(abstractC0115c0.f1653t);
            if (iB == 1 ? abstractC0115c0.a() > 0 : iB != 2) {
                Parcelable parcelable = this.f12914u.f1796t;
                if (parcelable != null) {
                    this.f12863E.g0(parcelable);
                }
                this.f12914u = null;
            }
        }
        b5.g = false;
        this.f12863E.e0(this.f12912t, b5);
        b5.f1448f = false;
        b5.j = b5.j && this.f12897g0 != null;
        b5.f1446d = 4;
        Y(true);
        r0(false);
    }

    public final boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, i12, iArr, iArr2);
    }

    public final void w(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().d(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public final void x(int i10, int i11) {
        this.f12891a0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        r0 r0Var = this.f12925z0;
        if (r0Var != null) {
            r0Var.b(this, i10, i11);
        }
        ArrayList arrayList = this.f12856A0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((r0) this.f12856A0.get(size)).b(this, i10, i11);
            }
        }
        this.f12891a0--;
    }

    public final void y() {
        if (this.f12896f0 != null) {
            return;
        }
        ((C0) this.f12892b0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f12896f0 = edgeEffect;
        if (this.f12922y) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void z() {
        if (this.f12893c0 != null) {
            return;
        }
        ((C0) this.f12892b0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f12893c0 = edgeEffect;
        if (this.f12922y) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ayah.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        float fA;
        float fA2;
        char c10;
        int i11;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i10);
        this.f12910s = new w0(this);
        this.f12912t = new u0(this);
        this.f12920x = new k(10);
        int i12 = 0;
        this.f12924z = new Z(this, i12);
        this.f12855A = new Rect();
        this.f12857B = new Rect();
        this.f12859C = new RectF();
        this.f12865F = new ArrayList();
        this.f12867G = new ArrayList();
        this.f12869H = new ArrayList();
        this.f12878M = 0;
        this.U = false;
        this.f12889V = false;
        this.f12890W = 0;
        this.f12891a0 = 0;
        this.f12892b0 = f12854b1;
        this.f12897g0 = new C0138o();
        this.f12898h0 = 0;
        this.f12899i0 = -1;
        this.f12911s0 = Float.MIN_VALUE;
        this.f12913t0 = Float.MIN_VALUE;
        int i13 = 1;
        this.f12915u0 = true;
        this.f12917v0 = new E0(this);
        this.f12921x0 = f12851Y0 ? new A(i12) : null;
        B0 b5 = new B0();
        b5.f1443a = -1;
        b5.f1444b = 0;
        b5.f1445c = 0;
        b5.f1446d = 1;
        b5.f1447e = 0;
        b5.f1448f = false;
        b5.g = false;
        b5.f1449h = false;
        b5.f1450i = false;
        b5.j = false;
        b5.f1451k = false;
        this.f12923y0 = b5;
        this.f12858B0 = false;
        this.f12860C0 = false;
        C0111a0 c0111a0 = new C0111a0(this);
        this.f12862D0 = c0111a0;
        this.f12864E0 = false;
        this.f12868G0 = new int[2];
        this.f12872I0 = new int[2];
        this.f12874J0 = new int[2];
        this.f12876K0 = new int[2];
        this.L0 = new ArrayList();
        this.f12879M0 = new Z(this, i13);
        this.f12883O0 = 0;
        this.f12885P0 = 0;
        this.f12887R0 = new C0111a0(this);
        this.f12888S0 = new C0257j(getContext(), new C0113b0(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f12905o0 = viewConfiguration.getScaledTouchSlop();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 26) {
            Method method = T.f3695a;
            fA = Z6.a.d(viewConfiguration);
        } else {
            fA = T.a(viewConfiguration, context);
        }
        this.f12911s0 = fA;
        if (i14 >= 26) {
            fA2 = Z6.a.e(viewConfiguration);
        } else {
            fA2 = T.a(viewConfiguration, context);
        }
        this.f12913t0 = fA2;
        this.f12907q0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f12909r0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f12908r = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f12897g0.f1688a = c0111a0;
        this.f12916v = new C0112b(new C0113b0(this));
        this.f12918w = new C0124h(new C0111a0(this));
        WeakHashMap weakHashMap = S.f3689a;
        if ((i14 >= 26 ? L.a(this) : 0) == 0 && i14 >= 26) {
            L.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.S = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new H0(this));
        int[] iArr = D2.a.f1162a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        S.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f12922y = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                c10 = 3;
                i11 = 4;
                new C0151z(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.ayah.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.ayah.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.ayah.R.dimen.fastscroll_margin));
            } else {
                throw new IllegalArgumentException(p245z2.a.C(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
        } else {
            c10 = 3;
            i11 = 4;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f12886Q0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, classLoader).asSubclass(AbstractC0135m0.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f12852Z0);
                        Object[] objArr2 = new Object[i11];
                        objArr2[0] = context;
                        objArr2[i13] = attributeSet;
                        objArr2[2] = Integer.valueOf(i10);
                        objArr2[c10] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e10) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e11) {
                            e11.initCause(e10);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e11);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC0135m0) constructor.newInstance(objArr));
                } catch (ClassCastException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e12);
                } catch (ClassNotFoundException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e13);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e14);
                } catch (InstantiationException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e16);
                }
            }
        }
        int[] iArr2 = f12848V0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        S.n(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i10);
        boolean z10 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
        setTag(com.ayah.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0135m0 abstractC0135m0 = this.f12863E;
        if (abstractC0135m0 != null) {
            return abstractC0135m0.u(layoutParams);
        }
        throw new IllegalStateException(p245z2.a.C(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Deprecated
    public void setRecyclerListener(v0 v0Var) {
    }
}

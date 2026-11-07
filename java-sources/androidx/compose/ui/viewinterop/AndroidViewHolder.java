package androidx.compose.ui.viewinterop;

import A.C0023i;
import C0.d;
import C0.g;
import D0.C;
import D0.D;
import D0.F;
import E2.C0127i0;
import H0.a0;
import I1.B0;
import I1.InterfaceC0264q;
import I1.S;
import I1.r;
import I1.y0;
import J0.AbstractC0283f;
import J0.C0298v;
import J0.I;
import J0.r0;
import J0.s0;
import J0.t0;
import K.x0;
import K0.P;
import K0.RunnableC0373v;
import K0.o1;
import K9.AbstractC0405x;
import M2.e;
import R0.m;
import X.L;
import Z.C0694m;
import Z.InterfaceC0686i;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.InterfaceC0771u;
import androidx.lifecycle.K;
import com.ayah.R;
import java.util.LinkedHashMap;
import l0.o;
import p050e8.b;
import p063g1.c;
import p094j1.f;
import p094j1.h;

/* JADX INFO: loaded from: classes.dex */
public class AndroidViewHolder extends ViewGroup implements InterfaceC0264q, InterfaceC0686i, s0, r {
    public static final /* synthetic */ int Q = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public c f12097A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public p241y9.c f12098B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public InterfaceC0771u f12099C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public e f12100D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int[] f12101E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f12102F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public B0 f12103G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final f f12104H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final f f12105I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public p241y9.c f12106J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int[] f12107K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f12108L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f12109M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final C0127i0 f12110N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f12111O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final I f12112P;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f12113r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f12114s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r0 f12115t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p241y9.a f12116u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12117v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p241y9.a f12118w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p241y9.a f12119x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public l0.r f12120y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p241y9.c f12121z;

    public AndroidViewHolder(Context context, C0694m c0694m, int i10, d dVar, View view, r0 r0Var) {
        super(context);
        this.f12113r = dVar;
        this.f12114s = view;
        this.f12115t = r0Var;
        LinkedHashMap linkedHashMap = o1.f5142a;
        setTag(R.id.androidx_compose_ui_view_composition_context, c0694m);
        int i11 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) this;
        S.r(this, new p094j1.a(viewFactoryHolder, i11));
        I1.I.m(this, this);
        this.f12116u = p094j1.e.f18720u;
        this.f12118w = p094j1.e.f18719t;
        this.f12119x = p094j1.e.f18718s;
        o oVar = o.f19333a;
        this.f12120y = oVar;
        this.f12097A = b.a();
        int i12 = 2;
        this.f12101E = new int[2];
        this.f12102F = 0L;
        int i13 = 1;
        this.f12104H = new f(viewFactoryHolder, i13);
        this.f12105I = new f(viewFactoryHolder, i11);
        this.f12107K = new int[2];
        this.f12108L = Integer.MIN_VALUE;
        this.f12109M = Integer.MIN_VALUE;
        this.f12110N = new C0127i0();
        I i14 = new I(3);
        i14.f3931x = true;
        i14.f3902F = viewFactoryHolder;
        l0.r rVarA = m.a(androidx.compose.ui.input.nestedscroll.a.a(oVar, h.f18724a, dVar), true, p094j1.b.f18708u);
        C c10 = new C();
        c10.f1045a = new D(viewFactoryHolder, 0);
        F f3 = new F();
        F f7 = c10.f1046b;
        if (f7 != null) {
            f7.f1053s = null;
        }
        c10.f1046b = f3;
        f3.f1053s = c10;
        setOnRequestDisallowInterceptTouchEvent$ui_release(f3);
        l0.r rVarD = androidx.compose.ui.layout.a.d(androidx.compose.ui.draw.a.a(androidx.compose.ui.graphics.a.b(rVarA.b(c10), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071), new C0023i(viewFactoryHolder, i14, viewFactoryHolder, 17)), new p094j1.c(viewFactoryHolder, i14, i12));
        i14.c0(this.f12120y.b(rVarD));
        this.f12121z = new L(10, i14, rVarD);
        i14.Z(this.f12097A);
        this.f12098B = new p085i0.f(i12, i14);
        i14.f3921d0 = new p094j1.c(viewFactoryHolder, i14, i11);
        i14.f3922e0 = new D(viewFactoryHolder, 1);
        i14.b0(new x0(i13, viewFactoryHolder, i14));
        this.f12112P = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t0 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            G0.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.f12115t.getSnapshotObserver();
    }

    public static final int k(ViewFactoryHolder viewFactoryHolder, int i10, int i11, int i12) {
        if (i12 >= 0 || i10 == i11) {
            return View.MeasureSpec.makeMeasureSpec(B0.c.l(i12, i10, i11), 1073741824);
        }
        if (i12 != -2 || i11 == Integer.MAX_VALUE) {
            return (i12 != -1 || i11 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    public static A1.c l(A1.c cVar, int i10, int i11, int i12, int i13) {
        int i14 = cVar.f462a - i10;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = cVar.f463b - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = cVar.f464c - i12;
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = cVar.f465d - i13;
        return A1.c.c(i14, i15, i16, i17 >= 0 ? i17 : 0);
    }

    @Override // I1.InterfaceC0263p
    public final void a(View view, View view2, int i10, int i11) {
        C0127i0 c0127i0 = this.f12110N;
        if (i11 == 1) {
            c0127i0.f1682b = i10;
        } else {
            c0127i0.f1681a = i10;
        }
    }

    @Override // I1.InterfaceC0263p
    public final void b(View view, int i10, int i11, int[] iArr, int i12) {
        if (this.f12114s.isNestedScrollingEnabled()) {
            float f3 = i10;
            float f7 = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3 * f7)) << 32) | (((long) Float.floatToRawIntBits(i11 * f7)) & 4294967295L);
            int i13 = i12 == 0 ? 1 : 2;
            g gVar = this.f12113r.f667a;
            g gVar2 = null;
            if (gVar != null && gVar.f19338E) {
                gVar2 = (g) AbstractC0283f.j(gVar);
            }
            long jM = gVar2 != null ? gVar2.m(jFloatToRawIntBits, i13) : 0L;
            iArr[0] = P.e(Float.intBitsToFloat((int) (jM >> 32)));
            iArr[1] = P.e(Float.intBitsToFloat((int) (jM & 4294967295L)));
        }
    }

    @Override // Z.InterfaceC0686i
    public final void c() {
        View view = this.f12114s;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f12118w.invoke();
        }
    }

    @Override // Z.InterfaceC0686i
    public final void d() {
        this.f12119x.invoke();
    }

    @Override // Z.InterfaceC0686i
    public final void e() {
        this.f12118w.invoke();
        removeAllViewsInLayout();
    }

    @Override // I1.InterfaceC0263p
    public final void f(int i10, View view) {
        C0127i0 c0127i0 = this.f12110N;
        if (i10 == 1) {
            c0127i0.f1682b = 0;
        } else {
            c0127i0.f1681a = 0;
        }
    }

    @Override // I1.InterfaceC0264q
    public final void g(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.f12114s.isNestedScrollingEnabled()) {
            float f3 = i10;
            float f7 = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3 * f7)) << 32) | (((long) Float.floatToRawIntBits(i11 * f7)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i12 * f7)) << 32) | (((long) Float.floatToRawIntBits(i13 * f7)) & 4294967295L);
            int i15 = i14 == 0 ? 1 : 2;
            g gVar = this.f12113r.f667a;
            g gVar2 = null;
            if (gVar != null && gVar.f19338E) {
                gVar2 = (g) AbstractC0283f.j(gVar);
            }
            g gVar3 = gVar2;
            long jB = gVar3 != null ? gVar3.B(i15, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
            iArr[0] = P.e(Float.intBitsToFloat((int) (jB >> 32)));
            iArr[1] = P.e(Float.intBitsToFloat((int) (jB & 4294967295L)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f12107K;
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        region.op(i10, iArr[1], getWidth() + i10, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final c getDensity() {
        return this.f12097A;
    }

    public final View getInteropView() {
        return this.f12114s;
    }

    public final I getLayoutNode() {
        return this.f12112P;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f12114s.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC0771u getLifecycleOwner() {
        return this.f12099C;
    }

    public final l0.r getModifier() {
        return this.f12120y;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0127i0 c0127i0 = this.f12110N;
        return c0127i0.f1682b | c0127i0.f1681a;
    }

    public final p241y9.c getOnDensityChanged$ui_release() {
        return this.f12098B;
    }

    public final p241y9.c getOnModifierChanged$ui_release() {
        return this.f12121z;
    }

    public final p241y9.c getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f12106J;
    }

    public final p241y9.a getRelease() {
        return this.f12119x;
    }

    public final p241y9.a getReset() {
        return this.f12118w;
    }

    public final e getSavedStateRegistryOwner() {
        return this.f12100D;
    }

    public final p241y9.a getUpdate() {
        return this.f12116u;
    }

    public final View getView() {
        return this.f12114s;
    }

    @Override // I1.InterfaceC0263p
    public final void i(View view, int i10, int i11, int i12, int i13, int i14) {
        if (this.f12114s.isNestedScrollingEnabled()) {
            float f3 = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i10 * f3)) << 32) | (((long) Float.floatToRawIntBits(i11 * f3)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i12 * f3)) << 32) | (((long) Float.floatToRawIntBits(i13 * f3)) & 4294967295L);
            int i15 = i14 == 0 ? 1 : 2;
            g gVar = this.f12113r.f667a;
            g gVar2 = null;
            if (gVar != null && gVar.f19338E) {
                gVar2 = (g) AbstractC0283f.j(gVar);
            }
            if (gVar2 != null) {
                gVar2.B(i15, jFloatToRawIntBits, jFloatToRawIntBits2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f12111O) {
            this.f12112P.C();
            return null;
        }
        this.f12114s.postOnAnimation(new RunnableC0373v(1, this.f12105I));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f12114s.isNestedScrollingEnabled();
    }

    @Override // I1.InterfaceC0263p
    public final boolean j(View view, View view2, int i10, int i11) {
        return ((i10 & 2) == 0 && (i10 & 1) == 0) ? false : true;
    }

    public final B0 m(B0 b5) {
        y0 y0Var = b5.f3671a;
        A1.c cVarG = y0Var.g(-1);
        A1.c cVar = A1.c.f461e;
        if (!cVarG.equals(cVar) || !y0Var.h(-9).equals(cVar) || y0Var.f() != null) {
            C0298v c0298v = (C0298v) this.f12112P.f3914W.f4064c;
            if (c0298v.f4178d0.f19338E) {
                long jL = va.g.L(c0298v.G(0L));
                int i10 = (int) (jL >> 32);
                if (i10 < 0) {
                    i10 = 0;
                }
                int i11 = (int) (jL & 4294967295L);
                if (i11 < 0) {
                    i11 = 0;
                }
                long jF = a0.d(c0298v).F();
                int i12 = (int) (jF >> 32);
                int i13 = (int) (jF & 4294967295L);
                long j = c0298v.f3170t;
                long jL2 = va.g.L(c0298v.G((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i14 = i12 - ((int) (jL2 >> 32));
                if (i14 < 0) {
                    i14 = 0;
                }
                int i15 = i13 - ((int) (4294967295L & jL2));
                int i16 = i15 >= 0 ? i15 : 0;
                if (i10 != 0 || i11 != 0 || i14 != 0 || i16 != 0) {
                    return b5.f3671a.n(i10, i11, i14, i16);
                }
            }
        }
        return b5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12104H.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f12111O) {
            this.f12112P.C();
        } else {
            this.f12114s.postOnAnimation(new RunnableC0373v(1, this.f12105I));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f4170a.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f12114s.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View view = this.f12114s;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f12108L = i10;
        this.f12109M = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f7, boolean z10) {
        if (!this.f12114s.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC0405x.x(this.f12113r.c(), null, new p094j1.d(z10, this, Y2.a.e(f3 * (-1.0f), f7 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f7) {
        if (!this.f12114s.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC0405x.x(this.f12113r.c(), null, new D0.L(this, Y2.a.e(f3 * (-1.0f), f7 * (-1.0f)), null, 3), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // I1.r
    public final B0 p(View view, B0 b5) {
        this.f12103G = new B0(b5);
        return m(b5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        p241y9.c cVar = this.f12106J;
        if (cVar != null) {
            cVar.e(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setDensity(c cVar) {
        if (cVar != this.f12097A) {
            this.f12097A = cVar;
            p241y9.c cVar2 = this.f12098B;
            if (cVar2 != null) {
                cVar2.e(cVar);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC0771u interfaceC0771u) {
        if (interfaceC0771u != this.f12099C) {
            this.f12099C = interfaceC0771u;
            K.g(this, interfaceC0771u);
        }
    }

    public final void setModifier(l0.r rVar) {
        if (rVar != this.f12120y) {
            this.f12120y = rVar;
            p241y9.c cVar = this.f12121z;
            if (cVar != null) {
                cVar.e(rVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(p241y9.c cVar) {
        this.f12098B = cVar;
    }

    public final void setOnModifierChanged$ui_release(p241y9.c cVar) {
        this.f12121z = cVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(p241y9.c cVar) {
        this.f12106J = cVar;
    }

    public final void setRelease(p241y9.a aVar) {
        this.f12119x = aVar;
    }

    public final void setReset(p241y9.a aVar) {
        this.f12118w = aVar;
    }

    public final void setSavedStateRegistryOwner(e eVar) {
        if (eVar != this.f12100D) {
            this.f12100D = eVar;
            p000a.a.j0(this, eVar);
        }
    }

    public final void setUpdate(p241y9.a aVar) {
        this.f12116u = aVar;
        this.f12117v = true;
        this.f12104H.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // J0.s0
    public final boolean x() {
        return isAttachedToWindow();
    }
}

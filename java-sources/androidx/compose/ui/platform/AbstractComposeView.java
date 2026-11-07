package androidx.compose.ui.platform;

import A.C0025j;
import A.C0030l0;
import A.R0;
import G0.a;
import J0.r0;
import K0.C0333a0;
import K0.D0;
import K0.P;
import K0.ViewOnAttachStateChangeListenerC0381z;
import K0.Y;
import K0.a1;
import K0.b1;
import K0.h1;
import K0.i1;
import K0.j1;
import K0.l1;
import K0.o1;
import K0.r1;
import K0.t1;
import K9.AbstractC0405x;
import K9.V;
import L9.e;
import Z.C0698o;
import Z.S;
import Z.T;
import Z.p0;
import Z.r;
import Z.s0;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.InterfaceC0771u;
import androidx.lifecycle.K;
import androidx.lifecycle.w;
import com.ayah.R;
import java.lang.ref.WeakReference;
import l0.c;
import l0.s;
import p017b7.g;
import p074h0.d;
import p110k9.o;
import p150o9.h;
import p150o9.i;
import p251z9.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComposeView extends ViewGroup {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public WeakReference f11979r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public IBinder f11980s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r1 f11981t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public r f11982u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0025j f11983v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f11984w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11985x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f11986y;

    public AbstractComposeView(Context context) {
        this(context, null, 6, 0);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(r rVar) {
        if (this.f11982u != rVar) {
            this.f11982u = rVar;
            if (rVar != null) {
                this.f11979r = null;
            }
            r1 r1Var = this.f11981t;
            if (r1Var != null) {
                r1Var.a();
                this.f11981t = null;
                if (isAttachedToWindow()) {
                    d();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f11980s != iBinder) {
            this.f11980s = iBinder;
            this.f11979r = null;
        }
    }

    public abstract void a(C0698o c0698o);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    public final void b() {
        if (this.f11985x) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        r1 r1Var = this.f11981t;
        if (r1Var != null) {
            r1Var.a();
        }
        this.f11981t = null;
        requestLayout();
    }

    public final void d() {
        if (this.f11981t == null) {
            try {
                this.f11985x = true;
                this.f11981t = t1.a(this, g(), new d(-656146368, new R0(10, this), true));
            } finally {
                this.f11985x = false;
            }
        }
    }

    public void e(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public void f(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final r g() {
        s0 s0Var;
        h hVar;
        C0333a0 c0333a0;
        r rVarB = this.f11982u;
        if (rVarB == null) {
            rVarB = o1.b(this);
            if (rVarB == null) {
                for (ViewParent parent = getParent(); rVarB == null && (parent instanceof View); parent = parent.getParent()) {
                    rVarB = o1.b((View) parent);
                }
            }
            boolean z10 = false;
            if (rVarB != null) {
                r rVar = (!(rVarB instanceof s0) || ((p0) ((s0) rVarB).f10805t.getValue()).compareTo(p0.f10759s) > 0) ? rVarB : null;
                if (rVar != null) {
                    this.f11979r = new WeakReference(rVar);
                }
            } else {
                rVarB = null;
            }
            if (rVarB == null) {
                WeakReference weakReference = this.f11979r;
                if (weakReference == null || (rVarB = (r) weakReference.get()) == null || ((rVarB instanceof s0) && ((p0) ((s0) rVarB).f10805t.getValue()).compareTo(p0.f10759s) <= 0)) {
                    rVarB = null;
                }
                if (rVarB == null) {
                    if (!isAttachedToWindow()) {
                        a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    View view = this;
                    Object parent2 = getParent();
                    while (parent2 instanceof View) {
                        View view2 = (View) parent2;
                        if (view2.getId() == 16908290) {
                            break;
                        }
                        view = view2;
                        parent2 = view2.getParent();
                    }
                    r rVarB2 = o1.b(view);
                    if (rVarB2 == null) {
                        ((h1) i1.f5081a.get()).getClass();
                        h hVar2 = i.f20380r;
                        o oVar = Y.f5035D;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            hVar = (h) Y.f5035D.getValue();
                        } else {
                            hVar = (h) Y.f5036E.get();
                            if (hVar == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        h hVarL = hVar.L(hVar2);
                        T t2 = (T) hVarL.i(S.f10639s);
                        if (t2 != null) {
                            c0333a0 = new C0333a0(t2);
                            Ca.r rVar2 = (Ca.r) c0333a0.f5056t;
                            synchronized (rVar2.f851e) {
                                rVar2.f848b = false;
                            }
                        } else {
                            c0333a0 = null;
                        }
                        v vVar = new v();
                        h d1 = (s) hVarL.i(c.f19312G);
                        if (d1 == null) {
                            d1 = new D0();
                            vVar.f24886r = d1;
                        }
                        if (c0333a0 != null) {
                            hVar2 = c0333a0;
                        }
                        h hVarL2 = hVarL.L(hVar2).L(d1);
                        s0Var = new s0(hVarL2);
                        s0Var.C();
                        P9.d dVarB = AbstractC0405x.b(hVarL2);
                        InterfaceC0771u interfaceC0771uD = K.d(view);
                        w wVarH = interfaceC0771uD != null ? interfaceC0771uD.h() : null;
                        if (wVarH == null) {
                            a.c("ViewTreeLifecycleOwner not found from " + view);
                            throw new A6.a();
                        }
                        view.addOnAttachStateChangeListener(new j1(view, s0Var));
                        wVarH.a(new l1(dVarB, c0333a0, s0Var, vVar, view));
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, s0Var);
                        V v10 = V.f5341r;
                        Handler handler = view.getHandler();
                        int i10 = e.f5586a;
                        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0381z(2, AbstractC0405x.x(v10, new L9.d(handler, "windowRecomposer cleanup", false).f5585w, new C0030l0(s0Var, view, z10 ? 1 : 0, 19), 2)));
                    } else {
                        if (!(rVarB2 instanceof s0)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        s0Var = (s0) rVarB2;
                    }
                    s0 s0Var2 = ((p0) s0Var.f10805t.getValue()).compareTo(p0.f10759s) > 0 ? s0Var : null;
                    if (s0Var2 != null) {
                        this.f11979r = new WeakReference(s0Var2);
                    }
                    return s0Var;
                }
            }
        }
        return rVarB;
    }

    public final boolean getHasComposition() {
        return this.f11981t != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f11984w;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f11986y || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        e(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        d();
        f(i10, i11);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i10);
    }

    public final void setParentCompositionContext(r rVar) {
        setParentContext(rVar);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.f11984w = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((r0) childAt).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.f11986y = true;
    }

    public final void setViewCompositionStrategy(b1 b1Var) {
        C0025j c0025j = this.f11983v;
        if (c0025j != null) {
            c0025j.invoke();
        }
        ((P) b1Var).getClass();
        ViewOnAttachStateChangeListenerC0381z viewOnAttachStateChangeListenerC0381z = new ViewOnAttachStateChangeListenerC0381z(1, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0381z);
        a1 a1Var = new a1(this);
        g.e0(this).f6580a.add(a1Var);
        this.f11983v = new C0025j(this, viewOnAttachStateChangeListenerC0381z, a1Var, 4);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        b();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        b();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        ViewOnAttachStateChangeListenerC0381z viewOnAttachStateChangeListenerC0381z = new ViewOnAttachStateChangeListenerC0381z(1, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0381z);
        a1 a1Var = new a1(this);
        g.e0(this).f6580a.add(a1Var);
        this.f11983v = new C0025j(this, viewOnAttachStateChangeListenerC0381z, a1Var, 4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        b();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i10, layoutParams);
    }
}

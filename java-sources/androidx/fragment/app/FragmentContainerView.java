package androidx.fragment.app;

import I1.B0;
import I1.S;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.ayah.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import p044e2.a;
import p056f2.AbstractComponentCallbacksC0947u;
import p056f2.C0928a;
import p056f2.C0949w;
import p056f2.D;
import p056f2.K;
import p056f2.Q;
import p056f2.T;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f12596r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f12597s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f12598t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12599u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        j.e(context, "context");
        this.f12596r = new ArrayList();
        this.f12597s = new ArrayList();
        this.f12599u = true;
    }

    public final void a(View view) {
        if (this.f12597s.contains(view)) {
            this.f12596r.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        j.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0947u ? (AbstractComponentCallbacksC0947u) tag : null) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        B0 b0J;
        j.e(windowInsets, "insets");
        B0 b0H = B0.h(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f12598t;
        if (onApplyWindowInsetsListener != null) {
            j.b(onApplyWindowInsetsListener);
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            j.d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            b0J = B0.h(null, windowInsetsOnApplyWindowInsets);
        } else {
            b0J = S.j(this, b0H);
        }
        j.d(b0J, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!b0J.f3671a.o()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                S.b(getChildAt(i10), b0J);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        j.e(canvas, "canvas");
        if (this.f12599u) {
            ArrayList arrayList = this.f12596r;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        j.e(canvas, "canvas");
        j.e(view, "child");
        if (this.f12599u) {
            ArrayList arrayList = this.f12596r;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        j.e(view, "view");
        this.f12597s.remove(view);
        if (this.f12596r.remove(view)) {
            this.f12599u = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0947u> F getFragment() {
        FragmentActivity fragmentActivity;
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u;
        K k7;
        View view = this;
        while (true) {
            fragmentActivity = null;
            if (view == null) {
                abstractComponentCallbacksC0947u = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0947u = tag instanceof AbstractComponentCallbacksC0947u ? (AbstractComponentCallbacksC0947u) tag : null;
            if (abstractComponentCallbacksC0947u != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0947u == null) {
            for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                }
            }
            if (fragmentActivity == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            k7 = ((C0949w) fragmentActivity.f12591L.f9953r).f16175u;
        } else {
            if (abstractComponentCallbacksC0947u.f16138L == null || !abstractComponentCallbacksC0947u.f16128B) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0947u + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            k7 = abstractComponentCallbacksC0947u.k();
        }
        return (F) k7.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                j.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        j.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        j.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        j.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            j.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            j.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f12599u = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f12598t = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        j.e(view, "view");
        if (view.getParent() == this) {
            this.f12597s.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.e(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i10) {
        String str;
        super(context, attributeSet, i10);
        j.e(context, "context");
        this.f12596r = new ArrayList();
        this.f12597s = new ArrayList();
        this.f12599u = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f15755b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, K k7) {
        View view;
        super(context, attributeSet);
        j.e(context, "context");
        j.e(attributeSet, "attrs");
        this.f12596r = new ArrayList();
        this.f12597s = new ArrayList();
        this.f12599u = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i10 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f15755b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947uC = k7.C(id);
        if (classAttribute != null && abstractComponentCallbacksC0947uC == null) {
            if (id == -1) {
                throw new IllegalStateException(p245z2.a.D("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            D dH = k7.H();
            context.getClassLoader();
            AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947uA = dH.a(classAttribute);
            j.d(abstractComponentCallbacksC0947uA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            abstractComponentCallbacksC0947uA.f16141O = id;
            abstractComponentCallbacksC0947uA.f16142P = id;
            abstractComponentCallbacksC0947uA.Q = string;
            abstractComponentCallbacksC0947uA.f16137K = k7;
            C0949w c0949w = k7.f15982w;
            abstractComponentCallbacksC0947uA.f16138L = c0949w;
            abstractComponentCallbacksC0947uA.f16143V = true;
            if ((c0949w == null ? null : c0949w.f16172r) != null) {
                abstractComponentCallbacksC0947uA.f16143V = true;
            }
            C0928a c0928a = new C0928a(k7);
            c0928a.f16063p = true;
            abstractComponentCallbacksC0947uA.f16144W = this;
            abstractComponentCallbacksC0947uA.f16133G = true;
            c0928a.f(getId(), abstractComponentCallbacksC0947uA, string, 1);
            if (!c0928a.g) {
                c0928a.f16056h = false;
                K k10 = c0928a.f16065r;
                if (k10.f15982w != null && !k10.f15955J) {
                    k10.z(true);
                    C0928a c0928a2 = k10.f15968h;
                    if (c0928a2 != null) {
                        c0928a2.f16066s = false;
                        c0928a2.d();
                        if (K.K(3)) {
                            Log.d("FragmentManager", "Reversing mTransitioningOp " + k10.f15968h + " as part of execSingleAction for action " + c0928a);
                        }
                        k10.f15968h.e(false, false);
                        k10.f15968h.a(k10.f15957L, k10.f15958M);
                        ArrayList arrayList = k10.f15968h.f16050a;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = ((T) obj).f16022b;
                            if (abstractComponentCallbacksC0947u != null) {
                                abstractComponentCallbacksC0947u.f16130D = false;
                            }
                        }
                        k10.f15968h = null;
                    }
                    c0928a.a(k10.f15957L, k10.f15958M);
                    k10.f15963b = true;
                    try {
                        k10.V(k10.f15957L, k10.f15958M);
                        k10.d();
                        k10.g0();
                        k10.v();
                        ((HashMap) k10.f15964c.f554r).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        k10.d();
                        throw th;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        ArrayList arrayListQ = k7.f15964c.q();
        int size2 = arrayListQ.size();
        while (i10 < size2) {
            Object obj2 = arrayListQ.get(i10);
            i10++;
            Q q10 = (Q) obj2;
            AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = q10.f16017c;
            if (abstractComponentCallbacksC0947u2.f16142P == getId() && (view = abstractComponentCallbacksC0947u2.f16145X) != null && view.getParent() == null) {
                abstractComponentCallbacksC0947u2.f16144W = this;
                q10.b();
                q10.k();
            }
        }
    }
}

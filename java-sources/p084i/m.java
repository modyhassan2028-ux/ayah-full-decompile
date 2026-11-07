package p084i;

import I1.B0;
import I1.J;
import I1.S;
import I1.r;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.ayah.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p140o.k;
import p140o.v;
import p151p.p1;
import p151p.q1;

/* JADX INFO: loaded from: classes.dex */
public final class m implements r, v {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x f16619r;

    public /* synthetic */ m(x xVar) {
        this.f16619r = xVar;
    }

    @Override // p140o.v
    public void b(k kVar, boolean z10) {
        this.f16619r.r(kVar);
    }

    @Override // p140o.v
    public boolean h(k kVar) {
        Window.Callback callback = this.f16619r.f16653C.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // I1.r
    public B0 p(View view, B0 b5) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iD = b5.d();
        x xVar = this.f16619r;
        Context context = xVar.f16652B;
        int iD2 = b5.d();
        ActionBarContextView actionBarContextView = xVar.f16663M;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i10 = 0;
            i11 = 0;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xVar.f16663M.getLayoutParams();
            int i14 = 1;
            if (xVar.f16663M.isShown()) {
                if (xVar.f16691t0 == null) {
                    xVar.f16691t0 = new Rect();
                    xVar.f16692u0 = new Rect();
                }
                Rect rect = xVar.f16691t0;
                Rect rect2 = xVar.f16692u0;
                rect.set(b5.b(), b5.d(), b5.c(), b5.a());
                ViewGroup viewGroup = xVar.R;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z10 = q1.f20766a;
                    p1.a(viewGroup, rect, rect2);
                    i12 = 0;
                } else {
                    if (q1.f20766a) {
                        i12 = 0;
                    } else {
                        q1.f20766a = true;
                        i12 = 0;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            q1.f20767b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                q1.f20767b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = q1.f20767b;
                    if (method != null) {
                        try {
                            Object[] objArr = new Object[2];
                            objArr[i12] = rect;
                            objArr[1] = rect2;
                            method.invoke(viewGroup, objArr);
                        } catch (Exception e10) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
                        }
                    }
                }
                int i15 = rect.top;
                int i16 = rect.left;
                int i17 = rect.right;
                ViewGroup viewGroup2 = xVar.R;
                WeakHashMap weakHashMap = S.f3689a;
                B0 b0A = J.a(viewGroup2);
                int iB = b0A == null ? i12 : b0A.b();
                int iC = b0A == null ? i12 : b0A.c();
                if (marginLayoutParams.topMargin == i15 && marginLayoutParams.leftMargin == i16 && marginLayoutParams.rightMargin == i17) {
                    i13 = i12;
                } else {
                    marginLayoutParams.topMargin = i15;
                    marginLayoutParams.leftMargin = i16;
                    marginLayoutParams.rightMargin = i17;
                    i13 = 1;
                }
                if (i15 <= 0 || xVar.T != null) {
                    View view2 = xVar.T;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i18 = marginLayoutParams2.height;
                        int i19 = marginLayoutParams.topMargin;
                        if (i18 != i19 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i19;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            xVar.T.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    xVar.T = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    xVar.R.addView(xVar.T, -1, layoutParams);
                }
                View view4 = xVar.T;
                i14 = view4 == null ? i12 : 1;
                if (i14 != 0 && view4.getVisibility() != 0) {
                    View view5 = xVar.T;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!xVar.f16670Y && i14 != 0) {
                    iD2 = i12;
                }
                i11 = i14;
                i10 = i12;
                i14 = i13;
            } else {
                i10 = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    i11 = 0;
                } else {
                    i11 = 0;
                    i14 = 0;
                }
            }
            if (i14 != 0) {
                xVar.f16663M.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = xVar.T;
        if (view6 != null) {
            view6.setVisibility(i11 != 0 ? i10 : 8);
        }
        return S.j(view, iD != iD2 ? b5.f(b5.b(), iD2, b5.c(), b5.a()) : b5);
    }
}

package W2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: renamed from: W2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0624e extends p {
    public static final String[] T = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final F7.f U = new F7.f(PointF.class, "topLeft", 9);

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final F7.f f9536V = new F7.f(PointF.class, "bottomRight", 10);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final F7.f f9537W = new F7.f(PointF.class, "bottomRight", 11);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final F7.f f9538X = new F7.f(PointF.class, "topLeft", 12);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final F7.f f9539Y = new F7.f(PointF.class, "position", 13);

    public static void L(x xVar) {
        View view = xVar.f9590b;
        HashMap map = xVar.f9589a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // W2.p
    public final void d(x xVar) {
        L(xVar);
    }

    @Override // W2.p
    public final void g(x xVar) {
        L(xVar);
    }

    @Override // W2.p
    public final Animator k(ViewGroup viewGroup, x xVar, x xVar2) {
        int i10;
        C0624e c0624e;
        Animator animatorA;
        if (xVar != null) {
            HashMap map = xVar.f9589a;
            if (xVar2 != null) {
                HashMap map2 = xVar2.f9589a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = xVar2.f9590b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i11 = rect.left;
                    int i12 = rect2.left;
                    int i13 = rect.top;
                    int i14 = rect2.top;
                    int i15 = rect.right;
                    int i16 = rect2.right;
                    int i17 = rect.bottom;
                    int i18 = rect2.bottom;
                    int i19 = i15 - i11;
                    int i20 = i17 - i13;
                    int i21 = i16 - i12;
                    int i22 = i18 - i14;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i19 == 0 || i20 == 0) && (i21 == 0 || i22 == 0)) {
                        i10 = 0;
                    } else {
                        i10 = (i11 == i12 && i13 == i14) ? 0 : 1;
                        if (i15 != i16 || i17 != i18) {
                            i10++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i10++;
                    }
                    int i23 = i10;
                    if (i23 > 0) {
                        z.a(view, i11, i13, i15, i17);
                        if (i23 != 2) {
                            c0624e = this;
                            if (i11 == i12 && i13 == i14) {
                                c0624e.f9567M.getClass();
                                animatorA = AbstractC0627h.a(view, f9537W, H8.e.p(i15, i17, i16, i18));
                            } else {
                                c0624e.f9567M.getClass();
                                animatorA = AbstractC0627h.a(view, f9538X, H8.e.p(i11, i13, i12, i14));
                            }
                        } else if (i19 == i21 && i20 == i22) {
                            c0624e = this;
                            c0624e.f9567M.getClass();
                            animatorA = AbstractC0627h.a(view, f9539Y, H8.e.p(i11, i13, i12, i14));
                        } else {
                            c0624e = this;
                            C0623d c0623d = new C0623d(view);
                            c0624e.f9567M.getClass();
                            ObjectAnimator objectAnimatorA = AbstractC0627h.a(c0623d, U, H8.e.p(i11, i13, i12, i14));
                            c0624e.f9567M.getClass();
                            ObjectAnimator objectAnimatorA2 = AbstractC0627h.a(c0623d, f9536V, H8.e.p(i15, i17, i16, i18));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorA, objectAnimatorA2);
                            animatorSet.addListener(new C0621b(c0623d));
                            animatorA = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            B0.c.h0(viewGroup4, true);
                            c0624e.o().a(new C0622c(viewGroup4));
                        }
                        return animatorA;
                    }
                }
            }
        }
        return null;
    }

    @Override // W2.p
    public final String[] q() {
        return T;
    }
}

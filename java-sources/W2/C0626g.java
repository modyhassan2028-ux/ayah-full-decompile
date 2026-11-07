package W2;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.ayah.R;
import java.util.HashMap;

/* JADX INFO: renamed from: W2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0626g extends p {
    public static final String[] U = {"android:visibility:visibility", "android:visibility:parent"};
    public final int T;

    public C0626g(int i10) {
        this();
        this.T = i10;
    }

    public static void L(x xVar) {
        View view = xVar.f9590b;
        int visibility = view.getVisibility();
        HashMap map = xVar.f9589a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float N(x xVar, float f3) {
        Float f7;
        return (xVar == null || (f7 = (Float) xVar.f9589a.get("android:fade:transitionAlpha")) == null) ? f3 : f7.floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static I O(x xVar, x xVar2) {
        I i10 = new I();
        i10.f9519a = false;
        i10.f9520b = false;
        if (xVar != null) {
            HashMap map = xVar.f9589a;
            if (map.containsKey("android:visibility:visibility")) {
                i10.f9521c = ((Integer) map.get("android:visibility:visibility")).intValue();
                i10.f9523e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                i10.f9521c = -1;
                i10.f9523e = null;
            }
        } else {
            i10.f9521c = -1;
            i10.f9523e = null;
        }
        if (xVar2 != null) {
            HashMap map2 = xVar2.f9589a;
            if (map2.containsKey("android:visibility:visibility")) {
                i10.f9522d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                i10.f9524f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                i10.f9522d = -1;
                i10.f9524f = null;
            }
        } else {
            i10.f9522d = -1;
            i10.f9524f = null;
        }
        if (xVar != null && xVar2 != null) {
            int i11 = i10.f9521c;
            int i12 = i10.f9522d;
            if (i11 != i12 || i10.f9523e != i10.f9524f) {
                if (i11 != i12) {
                    if (i11 == 0) {
                        i10.f9520b = false;
                        i10.f9519a = true;
                        return i10;
                    }
                    if (i12 == 0) {
                        i10.f9520b = true;
                        i10.f9519a = true;
                        return i10;
                    }
                } else {
                    if (i10.f9524f == null) {
                        i10.f9520b = false;
                        i10.f9519a = true;
                        return i10;
                    }
                    if (i10.f9523e == null) {
                        i10.f9520b = true;
                        i10.f9519a = true;
                        return i10;
                    }
                }
            }
        } else {
            if (xVar == null && i10.f9522d == 0) {
                i10.f9520b = true;
                i10.f9519a = true;
                return i10;
            }
            if (xVar2 == null && i10.f9521c == 0) {
                i10.f9520b = false;
                i10.f9519a = true;
            }
        }
        return i10;
    }

    public final ObjectAnimator M(View view, float f3, float f7) {
        if (f3 == f7) {
            return null;
        }
        z.f9592a.X(view, f3);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, z.f9593b, f7);
        C0625f c0625f = new C0625f(view);
        objectAnimatorOfFloat.addListener(c0625f);
        o().a(c0625f);
        return objectAnimatorOfFloat;
    }

    @Override // W2.p
    public final void d(x xVar) {
        L(xVar);
    }

    @Override // W2.p
    public final void g(x xVar) {
        L(xVar);
        View view = xVar.f9590b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(z.f9592a.H(view)) : Float.valueOf(0.0f);
        }
        xVar.f9589a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:58:0x0131  */
    /* JADX WARN: Code duplicated, block: B:61:0x013a  */
    /* JADX WARN: Code duplicated, block: B:63:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0140  */
    /* JADX WARN: Code duplicated, block: B:65:0x0148  */
    /* JADX WARN: Code duplicated, block: B:66:0x0160  */
    /* JADX WARN: Code duplicated, block: B:69:0x017c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:83:0x020d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0214  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (O(n(r3, false), r(r3, false)).f9519a != false) goto L9;
     */
    @Override // W2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator k(android.view.ViewGroup r24, W2.x r25, W2.x r26) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.C0626g.k(android.view.ViewGroup, W2.x, W2.x):android.animation.Animator");
    }

    @Override // W2.p
    public final String[] q() {
        return U;
    }

    @Override // W2.p
    public final boolean t(x xVar, x xVar2) {
        if (xVar == null && xVar2 == null) {
            return false;
        }
        if (xVar != null && xVar2 != null && xVar2.f9589a.containsKey("android:visibility:visibility") != xVar.f9589a.containsKey("android:visibility:visibility")) {
            return false;
        }
        I iO = O(xVar, xVar2);
        if (iO.f9519a) {
            return iO.f9521c == 0 || iO.f9522d == 0;
        }
        return false;
    }

    public C0626g() {
        this.T = 3;
    }
}

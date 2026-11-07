package E2;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1604a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f1605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC0135m0 f1606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f1609f;
    public final z0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f1611i;
    public final DecelerateInterpolator j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PointF f1612k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f1613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1614m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f1615n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1616o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1617p;

    public Q(Context context) {
        z0 z0Var = new z0();
        z0Var.f1828d = -1;
        z0Var.f1830f = false;
        z0Var.g = 0;
        z0Var.f1825a = 0;
        z0Var.f1826b = 0;
        z0Var.f1827c = Integer.MIN_VALUE;
        z0Var.f1829e = null;
        this.g = z0Var;
        this.f1611i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.f1614m = false;
        this.f1616o = 0;
        this.f1617p = 0;
        this.f1613l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    public int b(View view, int i10) {
        AbstractC0135m0 abstractC0135m0 = this.f1606c;
        if (abstractC0135m0 == null || !abstractC0135m0.e()) {
            return 0;
        }
        C0137n0 c0137n0 = (C0137n0) view.getLayoutParams();
        return a((view.getLeft() - ((C0137n0) view.getLayoutParams()).f1734b.left) - ((ViewGroup.MarginLayoutParams) c0137n0).leftMargin, view.getRight() + ((C0137n0) view.getLayoutParams()).f1734b.right + ((ViewGroup.MarginLayoutParams) c0137n0).rightMargin, abstractC0135m0.E(), abstractC0135m0.f1726n - abstractC0135m0.F(), i10);
    }

    public int c(View view, int i10) {
        AbstractC0135m0 abstractC0135m0 = this.f1606c;
        if (abstractC0135m0 == null || !abstractC0135m0.f()) {
            return 0;
        }
        C0137n0 c0137n0 = (C0137n0) view.getLayoutParams();
        return a((view.getTop() - ((C0137n0) view.getLayoutParams()).f1734b.top) - ((ViewGroup.MarginLayoutParams) c0137n0).topMargin, view.getBottom() + ((C0137n0) view.getLayoutParams()).f1734b.bottom + ((ViewGroup.MarginLayoutParams) c0137n0).bottomMargin, abstractC0135m0.G(), abstractC0135m0.f1727o - abstractC0135m0.D(), i10);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i10) {
        float fAbs = Math.abs(i10);
        if (!this.f1614m) {
            this.f1615n = d(this.f1613l);
            this.f1614m = true;
        }
        return (int) Math.ceil(fAbs * this.f1615n);
    }

    public PointF f(int i10) {
        Object obj = this.f1606c;
        if (obj instanceof A0) {
            return ((A0) obj).a(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + A0.class.getCanonicalName());
        return null;
    }

    public int g() {
        PointF pointF = this.f1612k;
        if (pointF == null) {
            return 0;
        }
        float f3 = pointF.y;
        if (f3 == 0.0f) {
            return 0;
        }
        return f3 > 0.0f ? 1 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    public final void h(int i10, int i11) {
        PointF pointFF;
        RecyclerView recyclerView = this.f1605b;
        if (this.f1604a == -1 || recyclerView == null) {
            j();
        }
        if (this.f1607d && this.f1609f == null && this.f1606c != null && (pointFF = f(this.f1604a)) != null) {
            float f3 = pointFF.x;
            if (f3 != 0.0f || pointFF.y != 0.0f) {
                recyclerView.k0((int) Math.signum(f3), (int) Math.signum(pointFF.y), null);
            }
        }
        this.f1607d = false;
        View view = this.f1609f;
        z0 z0Var = this.g;
        if (view != null) {
            this.f1605b.getClass();
            F0 f0P = RecyclerView.P(view);
            if ((f0P != null ? f0P.c() : -1) == this.f1604a) {
                View view2 = this.f1609f;
                B0 b5 = recyclerView.f12923y0;
                i(view2, z0Var);
                z0Var.a(recyclerView);
                j();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f1609f = null;
            }
        }
        if (this.f1608e) {
            B0 b10 = recyclerView.f12923y0;
            if (this.f1605b.f12863E.w() == 0) {
                j();
            } else {
                int i12 = this.f1616o;
                int i13 = i12 - i10;
                if (i12 * i13 <= 0) {
                    i13 = 0;
                }
                this.f1616o = i13;
                int i14 = this.f1617p;
                int i15 = i14 - i11;
                if (i14 * i15 <= 0) {
                    i15 = 0;
                }
                this.f1617p = i15;
                if (i13 == 0 && i15 == 0) {
                    PointF pointFF2 = f(this.f1604a);
                    if (pointFF2 != null) {
                        float f7 = pointFF2.x;
                        if (f7 == 0.0f && pointFF2.y == 0.0f) {
                            z0Var.f1828d = this.f1604a;
                            j();
                        } else {
                            float f10 = pointFF2.y;
                            float fSqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
                            float f11 = pointFF2.x / fSqrt;
                            pointFF2.x = f11;
                            float f12 = pointFF2.y / fSqrt;
                            pointFF2.y = f12;
                            this.f1612k = pointFF2;
                            this.f1616o = (int) (f11 * 10000.0f);
                            this.f1617p = (int) (f12 * 10000.0f);
                            int iE = e(10000);
                            int i16 = (int) (this.f1616o * 1.2f);
                            int i17 = (int) (this.f1617p * 1.2f);
                            z0Var.f1825a = i16;
                            z0Var.f1826b = i17;
                            z0Var.f1827c = (int) (iE * 1.2f);
                            z0Var.f1829e = this.f1611i;
                            z0Var.f1830f = true;
                        }
                    } else {
                        z0Var.f1828d = this.f1604a;
                        j();
                    }
                }
            }
            boolean z10 = z0Var.f1828d >= 0;
            z0Var.a(recyclerView);
            if (z10 && this.f1608e) {
                this.f1607d = true;
                recyclerView.f12917v0.b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    public void i(View view, z0 z0Var) {
        int i10;
        PointF pointF = this.f1612k;
        if (pointF != null) {
            float f3 = pointF.x;
            if (f3 == 0.0f) {
                i10 = 0;
            } else {
                i10 = f3 > 0.0f ? 1 : -1;
            }
        } else {
            i10 = 0;
        }
        int iB = b(view, i10);
        int iC = c(view, g());
        int iCeil = (int) Math.ceil(((double) e((int) Math.sqrt((iC * iC) + (iB * iB)))) / 0.3356d);
        if (iCeil > 0) {
            z0Var.f1825a = -iB;
            z0Var.f1826b = -iC;
            z0Var.f1827c = iCeil;
            z0Var.f1829e = this.j;
            z0Var.f1830f = true;
        }
    }

    public final void j() {
        if (this.f1608e) {
            this.f1608e = false;
            this.f1617p = 0;
            this.f1616o = 0;
            this.f1612k = null;
            this.f1605b.f12923y0.f1443a = -1;
            this.f1609f = null;
            this.f1604a = -1;
            this.f1607d = false;
            AbstractC0135m0 abstractC0135m0 = this.f1606c;
            if (abstractC0135m0.f1719e == this) {
                abstractC0135m0.f1719e = null;
            }
            this.f1606c = null;
            this.f1605b = null;
        }
    }
}

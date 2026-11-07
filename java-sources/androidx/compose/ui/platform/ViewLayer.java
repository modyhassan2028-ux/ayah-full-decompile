package androidx.compose.ui.platform;

import D0.C0087e;
import J0.q0;
import K0.AbstractC0341e0;
import K0.G;
import K0.H0;
import K0.O0;
import K0.P;
import K0.d1;
import K0.e1;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import i7.B;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p180s0.A;
import p180s0.C1294c;
import p180s0.E;
import p180s0.F;
import p180s0.M;
import p180s0.o;
import p180s0.p;
import p205v0.b;
import p241y9.a;
import p241y9.e;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class ViewLayer extends View implements q0 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final d1 f12073G = new d1(0);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static Method f12074H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static Field f12075I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static boolean f12076J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static boolean f12077K;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p f12078A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0087e f12079B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f12080C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f12081D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final long f12082E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f12083F;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AndroidComposeView f12084r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final DrawChildContainer f12085s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public e f12086t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f12087u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final H0 f12088v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12089w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Rect f12090x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12091y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f12092z;

    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, e eVar, a aVar) {
        super(androidComposeView.getContext());
        this.f12084r = androidComposeView;
        this.f12085s = drawChildContainer;
        this.f12086t = eVar;
        this.f12087u = aVar;
        this.f12088v = new H0();
        this.f12078A = new p();
        this.f12079B = new C0087e(G.f4931v);
        this.f12080C = M.f21814b;
        this.f12081D = true;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.f12082E = View.generateViewId();
    }

    private final E getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        H0 h7 = this.f12088v;
        if (!h7.g) {
            return null;
        }
        h7.e();
        return h7.f4939e;
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.f12091y) {
            this.f12091y = z10;
            this.f12084r.B(this, z10);
        }
    }

    @Override // J0.q0
    public final long a(long j, boolean z10) {
        C0087e c0087e = this.f12079B;
        if (!z10) {
            return !c0087e.f1096d ? A.b(j, c0087e.c(this)) : j;
        }
        float[] fArrB = c0087e.b(this);
        if (fArrB == null) {
            return 9187343241974906880L;
        }
        return !c0087e.f1096d ? A.b(j, fArrB) : j;
    }

    @Override // J0.q0
    public final void b(o oVar, b bVar) {
        boolean z10 = getElevation() > 0.0f;
        this.f12092z = z10;
        if (z10) {
            oVar.t();
        }
        this.f12085s.a(oVar, this, getDrawingTime());
        if (this.f12092z) {
            oVar.r();
        }
    }

    @Override // J0.q0
    public final void c(e eVar, a aVar) {
        this.f12085s.addView(this);
        C0087e c0087e = this.f12079B;
        c0087e.f1093a = false;
        c0087e.f1094b = false;
        c0087e.f1096d = true;
        c0087e.f1095c = true;
        A.d((float[]) c0087e.g);
        A.d((float[]) c0087e.f1099h);
        this.f12089w = false;
        this.f12092z = false;
        this.f12080C = M.f21814b;
        this.f12086t = eVar;
        this.f12087u = aVar;
        setInvalidated(false);
    }

    @Override // J0.q0
    public final void d(long j) {
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        if (i10 == getWidth() && i11 == getHeight()) {
            return;
        }
        setPivotX(M.b(this.f12080C) * i10);
        setPivotY(M.c(this.f12080C) * i11);
        setOutlineProvider(this.f12088v.b() != null ? f12073G : null);
        layout(getLeft(), getTop(), getLeft() + i10, getTop() + i11);
        l();
        this.f12079B.e();
    }

    @Override // J0.q0
    public final void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.f12084r;
        androidComposeView.U = true;
        this.f12086t = null;
        this.f12087u = null;
        androidComposeView.K(this);
        this.f12085s.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        p pVar = this.f12078A;
        C1294c c1294c = pVar.f21838a;
        Canvas canvas2 = c1294c.f21818a;
        c1294c.f21818a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z10 = false;
        } else {
            c1294c.q();
            this.f12088v.a(c1294c);
            z10 = true;
        }
        e eVar = this.f12086t;
        if (eVar != null) {
            eVar.invoke(c1294c, null);
        }
        if (z10) {
            c1294c.n();
        }
        pVar.f21838a.f21818a = canvas2;
        setInvalidated(false);
    }

    @Override // J0.q0
    public final void e(float[] fArr) {
        A.e(fArr, this.f12079B.c(this));
    }

    @Override // J0.q0
    public final void f(float[] fArr) {
        float[] fArrB = this.f12079B.b(this);
        if (fArrB != null) {
            A.e(fArr, fArrB);
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // J0.q0
    public final void g(long j) {
        int i10 = (int) (j >> 32);
        int left = getLeft();
        C0087e c0087e = this.f12079B;
        if (i10 != left) {
            offsetLeftAndRight(i10 - getLeft());
            c0087e.e();
        }
        int i11 = (int) (j & 4294967295L);
        if (i11 != getTop()) {
            offsetTopAndBottom(i11 - getTop());
            c0087e.e();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final DrawChildContainer getContainer() {
        return this.f12085s;
    }

    public long getLayerId() {
        return this.f12082E;
    }

    public final AndroidComposeView getOwnerView() {
        return this.f12084r;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return e1.a(this.f12084r);
        }
        return -1L;
    }

    @Override // J0.q0
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo0getUnderlyingMatrixsQKQjiQ() {
        return this.f12079B.c(this);
    }

    @Override // J0.q0
    public final void h() {
        if (!this.f12091y || f12077K) {
            return;
        }
        P.u(this);
        setInvalidated(false);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f12081D;
    }

    @Override // J0.q0
    public final void i(p171r0.b bVar, boolean z10) {
        C0087e c0087e = this.f12079B;
        if (!z10) {
            float[] fArrC = c0087e.c(this);
            if (c0087e.f1096d) {
                return;
            }
            A.c(fArrC, bVar);
            return;
        }
        float[] fArrB = c0087e.b(this);
        if (fArrB != null) {
            if (c0087e.f1096d) {
                return;
            }
            A.c(fArrB, bVar);
        } else {
            bVar.f21383a = 0.0f;
            bVar.f21384b = 0.0f;
            bVar.f21385c = 0.0f;
            bVar.f21386d = 0.0f;
        }
    }

    @Override // android.view.View, J0.q0
    public final void invalidate() {
        if (this.f12091y) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f12084r.invalidate();
    }

    @Override // J0.q0
    public final boolean j(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        if (this.f12089w) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f12088v.c(j);
        }
        return true;
    }

    @Override // J0.q0
    public final void k(p180s0.G g) {
        a aVar;
        int i10 = g.f21787r | this.f12083F;
        if ((i10 & 4096) != 0) {
            long j = g.f21780C;
            this.f12080C = j;
            setPivotX(M.b(j) * getWidth());
            setPivotY(M.c(this.f12080C) * getHeight());
        }
        if ((i10 & 1) != 0) {
            setScaleX(g.f21788s);
        }
        if ((i10 & 2) != 0) {
            setScaleY(g.f21789t);
        }
        if ((i10 & 4) != 0) {
            setAlpha(g.f21790u);
        }
        if ((i10 & 8) != 0) {
            setTranslationX(g.f21791v);
        }
        if ((i10 & 16) != 0) {
            setTranslationY(g.f21792w);
        }
        if ((i10 & 32) != 0) {
            setElevation(g.f21793x);
        }
        if ((i10 & 1024) != 0) {
            setRotation(g.f21778A);
        }
        if ((i10 & 256) != 0) {
            setRotationX(0.0f);
        }
        if ((i10 & 512) != 0) {
            setRotationY(0.0f);
        }
        if ((i10 & 2048) != 0) {
            setCameraDistancePx(g.f21779B);
        }
        boolean z10 = getManualClipPath() != null;
        boolean z11 = g.f21782E;
        B b5 = F.f21774a;
        boolean z12 = z11 && g.f21781D != b5;
        if ((i10 & 24576) != 0) {
            this.f12089w = z11 && g.f21781D == b5;
            l();
            setClipToOutline(z12);
        }
        boolean zD = this.f12088v.d(g.f21786I, g.f21790u, z12, g.f21793x, g.f21783F);
        H0 h7 = this.f12088v;
        if (h7.f4940f) {
            setOutlineProvider(h7.b() != null ? f12073G : null);
        }
        boolean z13 = getManualClipPath() != null;
        if (z10 != z13 || (z13 && zD)) {
            invalidate();
        }
        if (!this.f12092z && getElevation() > 0.0f && (aVar = this.f12087u) != null) {
            aVar.invoke();
        }
        if ((i10 & 7963) != 0) {
            this.f12079B.e();
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            if ((i10 & 64) != 0) {
                AbstractC0341e0.b(this, F.u(g.f21794y));
            }
            if ((i10 & 128) != 0) {
                AbstractC0341e0.c(this, F.u(g.f21795z));
            }
        }
        if (i11 >= 31 && (131072 & i10) != 0) {
            O0.b(this);
        }
        if ((i10 & 32768) != 0) {
            setLayerType(0, null);
            this.f12081D = true;
        }
        this.f12083F = g.f21787r;
    }

    public final void l() {
        Rect rect;
        if (this.f12089w) {
            Rect rect2 = this.f12090x;
            if (rect2 == null) {
                this.f12090x = new Rect(0, 0, getWidth(), getHeight());
            } else {
                j.b(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f12090x;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setCameraDistancePx(float f3) {
        setCameraDistance(f3 * getResources().getDisplayMetrics().densityDpi);
    }
}

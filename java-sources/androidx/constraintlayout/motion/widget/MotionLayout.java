package androidx.constraintlayout.motion.widget;

import G.c0;
import I1.InterfaceC0264q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import i7.D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import m1.b;
import m1.e;
import m1.g;
import p071g9.a;
import p132n1.A;
import p132n1.AbstractC1222h;
import p132n1.C1215a;
import p132n1.F;
import p132n1.L;
import p132n1.m;
import p132n1.n;
import p132n1.o;
import p132n1.p;
import p132n1.q;
import p132n1.r;
import p132n1.s;
import p132n1.t;
import p132n1.u;
import p132n1.v;
import p132n1.w;
import p132n1.y;
import p132n1.z;
import p153p1.f;
import s1.c;
import s1.h;
import s1.j;
import s1.k;
import s1.l;

/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements InterfaceC0264q {

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public static final /* synthetic */ int f12166Q0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f12167A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f12168B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public int f12169C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f12170D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f12171E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f12172F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public float f12173G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public A f12174H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final s f12175H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Interpolator f12176I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f12177I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f12178J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public t f12179J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f12180K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public v f12181K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f12182L;
    public final a L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f12183M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f12184M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f12185N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final RectF f12186N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f12187O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public View f12188O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f12189P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final ArrayList f12190P0;
    public final HashMap Q;
    public long R;
    public float S;
    public float T;
    public float U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public long f12191V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public float f12192W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f12193a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f12194b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public u f12195c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f12196d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public r f12197e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f12198f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final g f12199g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final q f12200h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public C1215a f12201i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f12202j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f12203k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f12204l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f12205m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public float f12206n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public long f12207o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f12208p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f12209q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ArrayList f12210r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ArrayList f12211s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ArrayList f12212t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f12213u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public long f12214v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f12215w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f12216x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public float f12217y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f12218z0;

    public MotionLayout(Context context) {
        super(context);
        this.f12178J = 0.0f;
        this.f12180K = -1;
        this.f12182L = -1;
        this.f12183M = -1;
        this.f12185N = 0;
        this.f12187O = 0;
        this.f12189P = true;
        this.Q = new HashMap();
        this.R = 0L;
        this.S = 1.0f;
        this.T = 0.0f;
        this.U = 0.0f;
        this.f12192W = 0.0f;
        this.f12194b0 = false;
        this.f12196d0 = 0;
        this.f12198f0 = false;
        this.f12199g0 = new g();
        this.f12200h0 = new q(this);
        this.f12204l0 = false;
        this.f12209q0 = false;
        this.f12210r0 = null;
        this.f12211s0 = null;
        this.f12212t0 = null;
        this.f12213u0 = 0;
        this.f12214v0 = -1L;
        this.f12215w0 = 0.0f;
        this.f12216x0 = 0;
        this.f12217y0 = 0.0f;
        this.f12218z0 = false;
        this.f12175H0 = new s();
        this.f12177I0 = false;
        this.f12181K0 = v.f19942r;
        this.L0 = new a(this);
        this.f12184M0 = false;
        this.f12186N0 = new RectF();
        this.f12188O0 = null;
        this.f12190P0 = new ArrayList();
        u(null);
    }

    @Override // I1.InterfaceC0263p
    public final void a(View view, View view2, int i10, int i11) {
    }

    @Override // I1.InterfaceC0263p
    public final void b(View view, int i10, int i11, int[] iArr, int i12) {
        z zVar;
        boolean z10;
        L l10;
        float f3;
        L l11;
        L l12;
        int i13;
        A a9 = this.f12174H;
        if (a9 == null || (zVar = a9.f19820c) == null || (z10 = zVar.f19977o)) {
            return;
        }
        if (z10 || (l12 = zVar.f19974l) == null || (i13 = l12.f19855e) == -1 || view.getId() == i13) {
            A a10 = this.f12174H;
            if (a10 != null) {
                z zVar2 = a10.f19820c;
                if ((zVar2 == null || (l11 = zVar2.f19974l) == null) ? false : l11.f19866r) {
                    float f7 = this.T;
                    if ((f7 == 1.0f || f7 == 0.0f) && view.canScrollVertically(-1)) {
                        return;
                    }
                }
            }
            if (zVar.f19974l != null) {
                L l13 = this.f12174H.f19820c.f19974l;
                int i14 = l13.f19868t;
                float[] fArr = l13.f19860l;
                if ((i14 & 1) != 0) {
                    float f10 = i10;
                    float f11 = i11;
                    l13.f19863o.s(l13.f19854d, l13.f19863o.getProgress(), l13.f19857h, l13.g, fArr);
                    float f12 = l13.f19858i;
                    if (f12 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f3 = (f10 * f12) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f3 = (f11 * l13.j) / fArr[1];
                    }
                    float f13 = this.U;
                    if ((f13 <= 0.0f && f3 < 0.0f) || (f13 >= 1.0f && f3 > 0.0f)) {
                        view.setNestedScrollingEnabled(false);
                        view.post(new p(view));
                        return;
                    }
                }
            }
            float f14 = this.T;
            long nanoTime = getNanoTime();
            float f15 = i10;
            this.f12205m0 = f15;
            float f16 = i11;
            this.f12206n0 = f16;
            this.f12208p0 = (float) ((nanoTime - this.f12207o0) * 1.0E-9d);
            this.f12207o0 = nanoTime;
            z zVar3 = this.f12174H.f19820c;
            if (zVar3 != null && (l10 = zVar3.f19974l) != null) {
                float[] fArr2 = l10.f19860l;
                MotionLayout motionLayout = l10.f19863o;
                float progress = motionLayout.getProgress();
                if (!l10.f19859k) {
                    l10.f19859k = true;
                    motionLayout.setProgress(progress);
                }
                l10.f19863o.s(l10.f19854d, progress, l10.f19857h, l10.g, fArr2);
                if (Math.abs((l10.j * fArr2[1]) + (l10.f19858i * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f17 = l10.f19858i;
                float fMax = Math.max(Math.min(progress + (f17 != 0.0f ? (f15 * f17) / fArr2[0] : (f16 * l10.j) / fArr2[1]), 1.0f), 0.0f);
                if (fMax != motionLayout.getProgress()) {
                    motionLayout.setProgress(fMax);
                }
            }
            if (f14 != this.T) {
                iArr[0] = i10;
                iArr[1] = i11;
            }
            p(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f12204l0 = true;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i10;
        Paint paint;
        Paint paint2;
        int i11;
        Paint paint3;
        Paint paint4;
        n nVar;
        Paint paint5;
        int i12;
        float f3;
        double dA;
        Paint paint6;
        p(false);
        super.dispatchDraw(canvas);
        if (this.f12174H == null) {
            return;
        }
        if ((this.f12196d0 & 1) == 1 && !isInEditMode()) {
            this.f12213u0++;
            long nanoTime = getNanoTime();
            long j = this.f12214v0;
            if (j != -1) {
                long j10 = nanoTime - j;
                if (j10 > 200000000) {
                    this.f12215w0 = ((int) ((this.f12213u0 / (j10 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f12213u0 = 0;
                    this.f12214v0 = nanoTime;
                }
            } else {
                this.f12214v0 = nanoTime;
            }
            Paint paint7 = new Paint();
            paint7.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f12215w0);
            sb.append(" fps ");
            int i13 = this.f12180K;
            StringBuilder sbC = android.support.v4.media.session.p.C(android.support.v4.media.session.p.B(sb, i13 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i13), " -> "));
            int i14 = this.f12183M;
            sbC.append(i14 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i14));
            sbC.append(" (progress: ");
            sbC.append(progress);
            sbC.append(" ) state=");
            int i15 = this.f12182L;
            sbC.append(i15 == -1 ? "undefined" : i15 != -1 ? getContext().getResources().getResourceEntryName(i15) : "UNDEFINED");
            String string = sbC.toString();
            paint7.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint7);
            paint7.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint7);
        }
        if (this.f12196d0 > 1) {
            if (this.f12197e0 == null) {
                this.f12197e0 = new r(this);
            }
            r rVar = this.f12197e0;
            A a9 = this.f12174H;
            z zVar = a9.f19820c;
            int i16 = zVar != null ? zVar.f19971h : a9.j;
            int i17 = this.f12196d0;
            Paint paint8 = rVar.g;
            Paint paint9 = rVar.f19928f;
            Paint paint10 = rVar.f19930i;
            int i18 = rVar.f19933m;
            Paint paint11 = rVar.f19927e;
            MotionLayout motionLayout = rVar.f19934n;
            HashMap map = this.Q;
            if (map == null || map.size() == 0) {
                return;
            }
            canvas.save();
            if (!motionLayout.isInEditMode() && (i17 & 1) == 2) {
                String str = motionLayout.getContext().getResources().getResourceName(motionLayout.f12183M) + ":" + motionLayout.getProgress();
                canvas.drawText(str, 10.0f, motionLayout.getHeight() - 30, rVar.f19929h);
                canvas.drawText(str, 11.0f, motionLayout.getHeight() - 29, paint11);
            }
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                n nVar2 = (n) it.next();
                w wVar = nVar2.f19898d;
                ArrayList arrayList2 = nVar2.f19911s;
                int iMax = wVar.f19953s;
                int size = arrayList2.size();
                for (int i19 = 0; i19 < size; i19++) {
                    iMax = Math.max(iMax, ((w) arrayList2.get(i19)).f19953s);
                }
                int iMax2 = Math.max(iMax, nVar2.f19899e.f19953s);
                if (i17 > 0 && iMax2 == 0) {
                    iMax2 = 1;
                }
                if (iMax2 != 0) {
                    float[] fArr = rVar.f19925c;
                    int[] iArr = rVar.f19924b;
                    if (fArr != null) {
                        if (iArr != null) {
                            int size2 = arrayList2.size();
                            int i20 = 0;
                            int i21 = 0;
                            while (i20 < size2) {
                                Object obj = arrayList2.get(i20);
                                i20++;
                                ((w) obj).getClass();
                                iArr[i21] = 0;
                                i21++;
                            }
                        }
                        int i22 = 0;
                        int i23 = 0;
                        for (double[] dArrR = nVar2.f19901h[0].R(); i22 < dArrR.length; dArrR = dArrR) {
                            int i24 = i22;
                            nVar2.f19901h[0].J(dArrR[i24], nVar2.f19906n);
                            wVar.c(nVar2.f19905m, nVar2.f19906n, fArr, i23);
                            i23 += 2;
                            i22 = i24 + 1;
                            arrayList2 = arrayList2;
                        }
                        arrayList = arrayList2;
                        i10 = i23 / 2;
                    } else {
                        arrayList = arrayList2;
                        i17 = i17;
                        i10 = 0;
                    }
                    rVar.f19931k = i10;
                    if (iMax2 >= 1) {
                        int i25 = i16 / 16;
                        float[] fArr2 = rVar.f19923a;
                        if (fArr2 == null || fArr2.length != i25 * 2) {
                            rVar.f19923a = new float[i25 * 2];
                            rVar.f19926d = new Path();
                        }
                        float f7 = i18;
                        canvas.translate(f7, f7);
                        paint11.setColor(1996488704);
                        paint10.setColor(1996488704);
                        paint9.setColor(1996488704);
                        paint8.setColor(1996488704);
                        float[] fArr3 = rVar.f19923a;
                        float f10 = 1.0f / (i25 - 1);
                        HashMap map2 = nVar2.f19915w;
                        F f11 = map2 == null ? null : (F) map2.get("translationX");
                        HashMap map3 = nVar2.f19915w;
                        F f12 = map3 == null ? null : (F) map3.get("translationY");
                        int i26 = i18;
                        HashMap map4 = nVar2.f19916x;
                        AbstractC1222h abstractC1222h = map4 == null ? null : (AbstractC1222h) map4.get("translationX");
                        HashMap map5 = nVar2.f19916x;
                        AbstractC1222h abstractC1222h2 = map5 == null ? null : (AbstractC1222h) map5.get("translationY");
                        int i27 = 0;
                        while (true) {
                            float f13 = Float.NaN;
                            float f14 = 0.0f;
                            if (i27 >= i25) {
                                break;
                            }
                            int i28 = i25;
                            float f15 = i27 * f10;
                            float f16 = nVar2.f19904l;
                            if (f16 != 1.0f) {
                                float f17 = nVar2.f19903k;
                                f3 = f15 < f17 ? 0.0f : f15;
                                paint5 = paint10;
                                i12 = i27;
                                if (f3 > f17 && f3 < 1.0d) {
                                    f3 = (f3 - f17) * f16;
                                }
                            } else {
                                paint5 = paint10;
                                i12 = i27;
                                f3 = f15;
                            }
                            double d5 = f3;
                            e eVar = wVar.f19952r;
                            int size3 = arrayList.size();
                            Paint paint12 = paint8;
                            int i29 = 0;
                            while (i29 < size3) {
                                int i30 = size3;
                                ArrayList arrayList3 = arrayList;
                                Object obj2 = arrayList3.get(i29);
                                int i31 = i29 + 1;
                                w wVar2 = (w) obj2;
                                arrayList = arrayList3;
                                e eVar2 = wVar2.f19952r;
                                if (eVar2 != null) {
                                    float f18 = wVar2.f19954t;
                                    if (f18 < f3) {
                                        f14 = f18;
                                        eVar = eVar2;
                                    } else if (Float.isNaN(f13)) {
                                        f13 = wVar2.f19954t;
                                    }
                                }
                                size3 = i30;
                                i29 = i31;
                            }
                            if (eVar != null) {
                                if (Float.isNaN(f13)) {
                                    f13 = 1.0f;
                                }
                                float f19 = f13 - f14;
                                dA = (((float) eVar.a((f3 - f14) / f19)) * f19) + f14;
                            } else {
                                dA = d5;
                            }
                            Paint paint13 = paint9;
                            nVar2.f19901h[0].J(dA, nVar2.f19906n);
                            b bVar = nVar2.f19902i;
                            if (bVar != null) {
                                double[] dArr = nVar2.f19906n;
                                paint6 = paint11;
                                if (dArr.length > 0) {
                                    bVar.J(dA, dArr);
                                }
                            } else {
                                paint6 = paint11;
                            }
                            int i32 = i12 * 2;
                            wVar.c(nVar2.f19905m, nVar2.f19906n, fArr3, i32);
                            if (abstractC1222h != null) {
                                fArr3[i32] = abstractC1222h.a(f3) + fArr3[i32];
                            } else if (f11 != null) {
                                fArr3[i32] = f11.a(f3) + fArr3[i32];
                            }
                            if (abstractC1222h2 != null) {
                                int i33 = i32 + 1;
                                fArr3[i33] = abstractC1222h2.a(f3) + fArr3[i33];
                            } else if (f12 != null) {
                                int i34 = i32 + 1;
                                fArr3[i34] = f12.a(f3) + fArr3[i34];
                            }
                            i27 = i12 + 1;
                            i25 = i28;
                            paint9 = paint13;
                            paint11 = paint6;
                            paint8 = paint12;
                            paint10 = paint5;
                        }
                        rVar.a(canvas, iMax2, rVar.f19931k, nVar2);
                        paint3 = paint11;
                        paint3.setColor(-21965);
                        paint4 = paint9;
                        paint4.setColor(-2067046);
                        paint2 = paint10;
                        paint2.setColor(-2067046);
                        paint = paint8;
                        paint.setColor(-13391360);
                        int i35 = i26;
                        float f20 = -i35;
                        canvas.translate(f20, f20);
                        rVar.a(canvas, iMax2, rVar.f19931k, nVar2);
                        char c10 = 5;
                        if (iMax2 == 5) {
                            float[] fArr4 = rVar.j;
                            rVar.f19926d.reset();
                            int i36 = 0;
                            while (i36 <= 50) {
                                char c11 = c10;
                                int i37 = i36;
                                nVar2.f19901h[0].J(nVar2.a(i36 / 50, null), nVar2.f19906n);
                                int[] iArr2 = nVar2.f19905m;
                                double[] dArr2 = nVar2.f19906n;
                                float f21 = wVar.f19956v;
                                float f22 = wVar.f19957w;
                                float f23 = wVar.f19958x;
                                float f24 = wVar.f19959y;
                                float[] fArr5 = fArr4;
                                int i38 = i35;
                                int i39 = 0;
                                while (true) {
                                    nVar = nVar2;
                                    if (i39 < iArr2.length) {
                                        w wVar3 = wVar;
                                        float f25 = (float) dArr2[i39];
                                        int i40 = iArr2[i39];
                                        int i41 = i39;
                                        if (i40 == 1) {
                                            f21 = f25;
                                        } else if (i40 == 2) {
                                            f22 = f25;
                                        } else if (i40 == 3) {
                                            f23 = f25;
                                        } else if (i40 == 4) {
                                            f24 = f25;
                                        }
                                        i39 = i41 + 1;
                                        wVar = wVar3;
                                        nVar2 = nVar;
                                    }
                                }
                                float f26 = f23 + f21;
                                float f27 = f24 + f22;
                                Float.isNaN(Float.NaN);
                                Float.isNaN(Float.NaN);
                                float f28 = f21 + 0.0f;
                                float f29 = f22 + 0.0f;
                                float f30 = f26 + 0.0f;
                                float f31 = f27 + 0.0f;
                                fArr5[0] = f28;
                                fArr5[1] = f29;
                                fArr5[2] = f30;
                                fArr5[3] = f29;
                                fArr5[4] = f30;
                                fArr5[c11] = f31;
                                fArr5[6] = f28;
                                fArr5[7] = f31;
                                rVar.f19926d.moveTo(f28, f29);
                                rVar.f19926d.lineTo(fArr5[2], fArr5[3]);
                                rVar.f19926d.lineTo(fArr5[4], fArr5[c11]);
                                rVar.f19926d.lineTo(fArr5[6], fArr5[7]);
                                rVar.f19926d.close();
                                i36 = i37 + 1;
                                wVar = wVar;
                                c10 = c11;
                                fArr4 = fArr5;
                                i35 = i38;
                                nVar2 = nVar;
                            }
                            i11 = i35;
                            paint3.setColor(1140850688);
                            canvas.translate(2.0f, 2.0f);
                            canvas.drawPath(rVar.f19926d, paint3);
                            canvas.translate(-2.0f, -2.0f);
                            paint3.setColor(-65536);
                            canvas.drawPath(rVar.f19926d, paint3);
                        } else {
                            i11 = i35;
                        }
                    } else {
                        paint = paint8;
                        paint2 = paint10;
                        i11 = i18;
                        paint3 = paint11;
                        paint4 = paint9;
                    }
                    paint11 = paint3;
                    paint10 = paint2;
                    paint8 = paint;
                    paint9 = paint4;
                    it = it;
                    i16 = i16;
                    i17 = i17;
                    i18 = i11;
                }
            }
            canvas.restore();
        }
    }

    @Override // I1.InterfaceC0263p
    public final void f(int i10, View view) {
        L l10;
        A a9 = this.f12174H;
        if (a9 == null) {
            return;
        }
        float f3 = this.f12205m0;
        float f7 = this.f12208p0;
        float f10 = f3 / f7;
        float f11 = this.f12206n0 / f7;
        z zVar = a9.f19820c;
        if (zVar == null || (l10 = zVar.f19974l) == null) {
            return;
        }
        float[] fArr = l10.f19860l;
        l10.f19859k = false;
        MotionLayout motionLayout = l10.f19863o;
        float progress = motionLayout.getProgress();
        l10.f19863o.s(l10.f19854d, progress, l10.f19857h, l10.g, fArr);
        float f12 = l10.f19858i;
        float f13 = f12 != 0.0f ? (f10 * f12) / fArr[0] : (f11 * l10.j) / fArr[1];
        if (!Float.isNaN(f13)) {
            progress += f13 / 3.0f;
        }
        if (progress != 0.0f) {
            boolean z10 = progress != 1.0f;
            int i11 = l10.f19853c;
            if ((i11 != 3) && z10) {
                motionLayout.y(((double) progress) >= 0.5d ? 1.0f : 0.0f, f13, i11);
            }
        }
    }

    @Override // I1.InterfaceC0264q
    public final void g(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.f12204l0 || i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.f12204l0 = false;
    }

    public int[] getConstraintSetIds() {
        A a9 = this.f12174H;
        if (a9 == null) {
            return null;
        }
        SparseArray sparseArray = a9.g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = sparseArray.keyAt(i10);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.f12182L;
    }

    public ArrayList<z> getDefinedTransitions() {
        A a9 = this.f12174H;
        if (a9 == null) {
            return null;
        }
        return a9.f19821d;
    }

    public C1215a getDesignTool() {
        if (this.f12201i0 == null) {
            this.f12201i0 = new C1215a();
        }
        return this.f12201i0;
    }

    public int getEndState() {
        return this.f12183M;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.U;
    }

    public int getStartState() {
        return this.f12180K;
    }

    public float getTargetPosition() {
        return this.f12192W;
    }

    public Bundle getTransitionState() {
        if (this.f12179J0 == null) {
            this.f12179J0 = new t(this);
        }
        t tVar = this.f12179J0;
        MotionLayout motionLayout = tVar.f19941e;
        tVar.f19940d = motionLayout.f12183M;
        tVar.f19939c = motionLayout.f12180K;
        tVar.f19938b = motionLayout.getVelocity();
        tVar.f19937a = motionLayout.getProgress();
        t tVar2 = this.f12179J0;
        tVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", tVar2.f19937a);
        bundle.putFloat("motion.velocity", tVar2.f19938b);
        bundle.putInt("motion.StartState", tVar2.f19939c);
        bundle.putInt("motion.EndState", tVar2.f19940d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        A a9 = this.f12174H;
        if (a9 != null) {
            z zVar = a9.f19820c;
            this.S = (zVar != null ? zVar.f19971h : a9.j) / 1000.0f;
        }
        return (long) (this.S * 1000.0f);
    }

    public float getVelocity() {
        return this.f12178J;
    }

    @Override // I1.InterfaceC0263p
    public final void i(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    @Override // I1.InterfaceC0263p
    public final boolean j(View view, View view2, int i10, int i11) {
        z zVar;
        L l10;
        A a9 = this.f12174H;
        return (a9 == null || (zVar = a9.f19820c) == null || (l10 = zVar.f19974l) == null || (l10.f19868t & 2) != 0) ? false : true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void l(int i10) {
        this.f12269B = null;
    }

    public final void o(float f3) {
        A a9 = this.f12174H;
        if (a9 == null) {
            return;
        }
        float f7 = this.U;
        float f10 = this.T;
        if (f7 != f10 && this.f12193a0) {
            this.U = f10;
        }
        float f11 = this.U;
        if (f11 == f3) {
            return;
        }
        this.f12198f0 = false;
        this.f12192W = f3;
        z zVar = a9.f19820c;
        this.S = (zVar != null ? zVar.f19971h : a9.j) / 1000.0f;
        setProgress(f3);
        this.f12176I = this.f12174H.d();
        this.f12193a0 = false;
        this.R = getNanoTime();
        this.f12194b0 = true;
        this.T = f11;
        this.U = f11;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A a9 = this.f12174H;
        if (a9 != null) {
            int i10 = this.f12182L;
            int i11 = -1;
            if (i10 != -1) {
                l lVarB = a9.b(i10);
                A a10 = this.f12174H;
                SparseArray sparseArray = a10.g;
                int i12 = 0;
                loop0: while (true) {
                    if (i12 >= sparseArray.size()) {
                        int i13 = 0;
                        while (i13 < sparseArray.size()) {
                            l lVar = (l) sparseArray.valueAt(i13);
                            HashMap map = lVar.f22023c;
                            int childCount = getChildCount();
                            int i14 = 0;
                            while (i14 < childCount) {
                                View childAt = getChildAt(i14);
                                c cVar = (c) childAt.getLayoutParams();
                                int id = childAt.getId();
                                if (lVar.f22022b && id == i11) {
                                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                                }
                                if (!map.containsKey(Integer.valueOf(id))) {
                                    map.put(Integer.valueOf(id), new s1.g());
                                }
                                s1.g gVar = (s1.g) map.get(Integer.valueOf(id));
                                h hVar = gVar.f21936d;
                                j jVar = gVar.f21934b;
                                k kVar = gVar.f21937e;
                                int i15 = i13;
                                if (!hVar.f21963b) {
                                    gVar.b(id, cVar);
                                    if (childAt instanceof ConstraintHelper) {
                                        hVar.f21970e0 = ((ConstraintHelper) childAt).getReferencedIds();
                                        if (childAt instanceof Barrier) {
                                            Barrier barrier = (Barrier) childAt;
                                            hVar.f21978j0 = barrier.f12257A.f20823j0;
                                            hVar.f21964b0 = barrier.getType();
                                            hVar.f21966c0 = barrier.getMargin();
                                        }
                                    }
                                    hVar.f21963b = true;
                                }
                                if (!jVar.f22002a) {
                                    jVar.f22003b = childAt.getVisibility();
                                    jVar.f22005d = childAt.getAlpha();
                                    jVar.f22002a = true;
                                }
                                if (!kVar.f22008a) {
                                    kVar.f22008a = true;
                                    kVar.f22009b = childAt.getRotation();
                                    kVar.f22010c = childAt.getRotationX();
                                    kVar.f22011d = childAt.getRotationY();
                                    kVar.f22012e = childAt.getScaleX();
                                    kVar.f22013f = childAt.getScaleY();
                                    float pivotX = childAt.getPivotX();
                                    float pivotY = childAt.getPivotY();
                                    if (pivotX != 0.0d || pivotY != 0.0d) {
                                        kVar.g = pivotX;
                                        kVar.f22014h = pivotY;
                                    }
                                    kVar.f22015i = childAt.getTranslationX();
                                    kVar.j = childAt.getTranslationY();
                                    kVar.f22016k = childAt.getTranslationZ();
                                    if (kVar.f22017l) {
                                        kVar.f22018m = childAt.getElevation();
                                    }
                                }
                                i14++;
                                i13 = i15;
                                i11 = -1;
                            }
                            i13++;
                            i11 = -1;
                        }
                        break;
                    }
                    int iKeyAt = sparseArray.keyAt(i12);
                    SparseIntArray sparseIntArray = a10.f19825i;
                    int i16 = sparseIntArray.get(iKeyAt);
                    int size = sparseIntArray.size();
                    while (true) {
                        if (i16 > 0) {
                            if (i16 != iKeyAt) {
                                int i17 = size - 1;
                                if (size >= 0) {
                                    i16 = sparseIntArray.get(i16);
                                    size = i17;
                                }
                            }
                            Log.e("MotionScene", "Cannot be derived from yourself");
                            break loop0;
                        }
                        a10.j(iKeyAt);
                        i12++;
                    }
                }
                if (lVarB != null) {
                    lVarB.b(this);
                }
                this.f12180K = this.f12182L;
            }
        }
        v();
        t tVar = this.f12179J0;
        if (tVar != null) {
            tVar.a();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        z zVar;
        L l10;
        int i10;
        RectF rectFA;
        A a9 = this.f12174H;
        if (a9 == null || !this.f12189P || (zVar = a9.f19820c) == null || zVar.f19977o || (l10 = zVar.f19974l) == null) {
            return false;
        }
        if ((motionEvent.getAction() == 0 && (rectFA = l10.a(this, new RectF())) != null && !rectFA.contains(motionEvent.getX(), motionEvent.getY())) || (i10 = l10.f19855e) == -1) {
            return false;
        }
        View view = this.f12188O0;
        if (view == null || view.getId() != i10) {
            this.f12188O0 = findViewById(i10);
        }
        View view2 = this.f12188O0;
        if (view2 == null) {
            return false;
        }
        float left = view2.getLeft();
        float top = this.f12188O0.getTop();
        float right = this.f12188O0.getRight();
        float bottom = this.f12188O0.getBottom();
        RectF rectF = this.f12186N0;
        rectF.set(left, top, right, bottom);
        if (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || t(0.0f, 0.0f, this.f12188O0, motionEvent)) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) throws Throwable {
        MotionLayout motionLayout;
        this.f12177I0 = true;
        try {
            if (this.f12174H == null) {
                super.onLayout(z10, i10, i11, i12, i13);
                this.f12177I0 = false;
                return;
            }
            motionLayout = this;
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            try {
                if (motionLayout.f12202j0 != i14 || motionLayout.f12203k0 != i15) {
                    x();
                    p(true);
                }
                motionLayout.f12202j0 = i14;
                motionLayout.f12203k0 = i15;
                motionLayout.f12177I0 = false;
                return;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            motionLayout = this;
        }
        Throwable th3 = th;
        motionLayout.f12177I0 = false;
        throw th3;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        if (this.f12174H == null) {
            super.onMeasure(i10, i11);
            return;
        }
        boolean z11 = true;
        boolean z12 = (this.f12185N == i10 && this.f12187O == i11) ? false : true;
        if (this.f12184M0) {
            this.f12184M0 = false;
            v();
            w();
            z12 = true;
        }
        if (this.f12281y) {
            z12 = true;
        }
        this.f12185N = i10;
        this.f12187O = i11;
        int iG = this.f12174H.g();
        z zVar = this.f12174H.f19820c;
        int i12 = zVar == null ? -1 : zVar.f19967c;
        a aVar = this.L0;
        if ((!z12 && iG == aVar.f16335a && i12 == aVar.f16336b) || this.f12180K == -1) {
            z10 = true;
        } else {
            super.onMeasure(i10, i11);
            aVar.g(this.f12174H.b(iG), this.f12174H.b(i12));
            aVar.h();
            aVar.f16335a = iG;
            aVar.f16336b = i12;
            z10 = false;
        }
        if (this.f12218z0 || z10) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingRight = getPaddingRight() + getPaddingLeft();
            f fVar = this.f12276t;
            int iM = fVar.m() + paddingRight;
            int iJ = fVar.j() + paddingBottom;
            int i13 = this.f12171E0;
            if (i13 == Integer.MIN_VALUE || i13 == 0) {
                int i14 = this.f12167A0;
                iM = (int) ((this.f12173G0 * (this.f12169C0 - i14)) + i14);
                requestLayout();
            }
            int i15 = this.f12172F0;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                int i16 = this.f12168B0;
                iJ = (int) ((this.f12173G0 * (this.f12170D0 - i16)) + i16);
                requestLayout();
            }
            setMeasuredDimension(iM, iJ);
        }
        float fSignum = Math.signum(this.f12192W - this.U);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f12176I;
        float interpolation = this.U + (!(interpolator instanceof g) ? (((nanoTime - this.f12191V) * fSignum) * 1.0E-9f) / this.S : 0.0f);
        if (this.f12193a0) {
            interpolation = this.f12192W;
        }
        if ((fSignum <= 0.0f || interpolation < this.f12192W) && (fSignum > 0.0f || interpolation > this.f12192W)) {
            z11 = false;
        } else {
            interpolation = this.f12192W;
        }
        if (interpolator != null && !z11) {
            interpolation = this.f12198f0 ? interpolator.getInterpolation((nanoTime - this.R) * 1.0E-9f) : interpolator.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.f12192W) || (fSignum <= 0.0f && interpolation <= this.f12192W)) {
            interpolation = this.f12192W;
        }
        float f3 = interpolation;
        this.f12173G0 = f3;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            n nVar = (n) this.Q.get(childAt);
            if (nVar != null) {
                nVar.c(f3, nanoTime2, childAt, this.f12175H0);
            }
        }
        if (this.f12218z0) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f7, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f7) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        L l10;
        A a9 = this.f12174H;
        if (a9 != null) {
            boolean zK = k();
            a9.f19830o = zK;
            z zVar = a9.f19820c;
            if (zVar == null || (l10 = zVar.f19974l) == null) {
                return;
            }
            l10.b(zK);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f3;
        s sVar;
        L l10;
        char c10;
        char c11;
        int i10;
        char c12;
        char c13;
        char c14;
        char c15;
        View viewFindViewById;
        RectF rectF;
        MotionEvent motionEvent2;
        boolean z10;
        z zVar;
        int iQ;
        int i11;
        float f7;
        A a9 = this.f12174H;
        if (a9 == null || !this.f12189P || !a9.l()) {
            return super.onTouchEvent(motionEvent);
        }
        A a10 = this.f12174H;
        z zVar2 = a10.f19820c;
        if (zVar2 != null && zVar2.f19977o) {
            return super.onTouchEvent(motionEvent);
        }
        int currentState = getCurrentState();
        MotionLayout motionLayout = a10.f19818a;
        RectF rectF2 = new RectF();
        if (a10.f19829n == null) {
            motionLayout.getClass();
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            s sVar2 = s.f19935b;
            sVar2.f19936a = velocityTrackerObtain;
            a10.f19829n = sVar2;
        }
        VelocityTracker velocityTracker = (VelocityTracker) a10.f19829n.f19936a;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (currentState != -1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                a10.f19831p = motionEvent.getRawX();
                a10.f19832q = motionEvent.getRawY();
                a10.f19827l = motionEvent;
                L l11 = a10.f19820c.f19974l;
                if (l11 != null) {
                    int i12 = l11.f19856f;
                    if (i12 == -1 || (viewFindViewById = motionLayout.findViewById(i12)) == null) {
                        rectF = null;
                    } else {
                        rectF2.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
                        rectF = rectF2;
                    }
                    if (rectF != null && !rectF.contains(a10.f19827l.getX(), a10.f19827l.getY())) {
                        a10.f19827l = null;
                        return true;
                    }
                    RectF rectFA = a10.f19820c.f19974l.a(motionLayout, rectF2);
                    if (rectFA == null || rectFA.contains(a10.f19827l.getX(), a10.f19827l.getY())) {
                        a10.f19828m = false;
                    } else {
                        a10.f19828m = true;
                    }
                    L l12 = a10.f19820c.f19974l;
                    float f10 = a10.f19831p;
                    float f11 = a10.f19832q;
                    l12.f19861m = f10;
                    l12.f19862n = f11;
                    return true;
                }
            } else if (action != 2) {
                f3 = 0.0f;
            } else {
                float rawY = motionEvent.getRawY() - a10.f19832q;
                float rawX = motionEvent.getRawX() - a10.f19831p;
                if ((rawX != 0.0d || rawY != 0.0d) && (motionEvent2 = a10.f19827l) != null) {
                    if (currentState != -1) {
                        Da.r rVar = a10.f19819b;
                        if (rVar == null || (iQ = rVar.q(currentState)) == -1) {
                            iQ = currentState;
                        }
                        f3 = 0.0f;
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = a10.f19821d;
                        z10 = true;
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            z zVar3 = (z) obj;
                            if (zVar3.f19968d == iQ || zVar3.f19967c == iQ) {
                                arrayList.add(zVar3);
                            }
                        }
                        RectF rectF3 = new RectF();
                        int size2 = arrayList.size();
                        float f12 = 0.0f;
                        zVar = null;
                        int i14 = 0;
                        while (i14 < size2) {
                            Object obj2 = arrayList.get(i14);
                            i14++;
                            z zVar4 = (z) obj2;
                            arrayList = arrayList;
                            if (zVar4.f19977o) {
                                i11 = size2;
                                f7 = f12;
                            } else {
                                L l13 = zVar4.f19974l;
                                i11 = size2;
                                if (l13 != null) {
                                    l13.b(a10.f19830o);
                                    RectF rectFA2 = zVar4.f19974l.a(motionLayout, rectF3);
                                    if (rectFA2 != null) {
                                        f7 = f12;
                                        if (!rectFA2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        }
                                    } else {
                                        f7 = f12;
                                    }
                                    RectF rectFA3 = zVar4.f19974l.a(motionLayout, rectF3);
                                    if (rectFA3 == null || rectFA3.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        L l14 = zVar4.f19974l;
                                        float f13 = ((l14.j * rawY) + (l14.f19858i * rawX)) * (zVar4.f19967c == currentState ? -1.0f : 1.1f);
                                        if (f13 > f7) {
                                            f12 = f13;
                                            zVar = zVar4;
                                        }
                                        size2 = i11;
                                    }
                                } else {
                                    f7 = f12;
                                }
                                f12 = f7;
                                size2 = i11;
                            }
                            size2 = i11;
                            f12 = f7;
                        }
                    } else {
                        f3 = 0.0f;
                        z10 = true;
                        zVar = a10.f19820c;
                    }
                    if (zVar != null) {
                        setTransition(zVar);
                        RectF rectFA4 = a10.f19820c.f19974l.a(motionLayout, rectF2);
                        a10.f19828m = (rectFA4 == null || rectFA4.contains(a10.f19827l.getX(), a10.f19827l.getY())) ? false : z10;
                        L l15 = a10.f19820c.f19974l;
                        float f14 = a10.f19831p;
                        float f15 = a10.f19832q;
                        l15.f19861m = f14;
                        l15.f19862n = f15;
                        l15.f19859k = false;
                    }
                }
            }
            return true;
        }
        f3 = 0.0f;
        z zVar5 = a10.f19820c;
        if (zVar5 != null && (l10 = zVar5.f19974l) != null) {
            float[] fArr = l10.f19860l;
            if (!a10.f19828m) {
                s sVar3 = a10.f19829n;
                MotionLayout motionLayout2 = l10.f19863o;
                VelocityTracker velocityTracker2 = (VelocityTracker) sVar3.f19936a;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                int action2 = motionEvent.getAction();
                if (action2 == 0) {
                    l10.f19861m = motionEvent.getRawX();
                    l10.f19862n = motionEvent.getRawY();
                    l10.f19859k = false;
                } else if (action2 == 1) {
                    l10.f19859k = false;
                    ((VelocityTracker) sVar3.f19936a).computeCurrentVelocity(1000);
                    float xVelocity = ((VelocityTracker) sVar3.f19936a).getXVelocity();
                    float yVelocity = ((VelocityTracker) sVar3.f19936a).getYVelocity();
                    float progress = motionLayout2.getProgress();
                    int i15 = l10.f19854d;
                    if (i15 != -1) {
                        l10.f19863o.s(i15, progress, l10.f19857h, l10.g, fArr);
                        c10 = 1;
                        c11 = 0;
                    } else {
                        float fMin = Math.min(motionLayout2.getWidth(), motionLayout2.getHeight());
                        c10 = 1;
                        fArr[1] = l10.j * fMin;
                        c11 = 0;
                        fArr[0] = fMin * l10.f19858i;
                    }
                    float f16 = l10.f19858i != 0.0f ? xVelocity / fArr[c11] : yVelocity / fArr[c10];
                    float f17 = !Float.isNaN(f16) ? (f16 / 3.0f) + progress : progress;
                    v vVar = v.f19945u;
                    if (f17 != 0.0f && f17 != 1.0f && (i10 = l10.f19853c) != 3) {
                        motionLayout2.y(((double) f17) < 0.5d ? 0.0f : 1.0f, f16, i10);
                        if (0.0f >= progress || 1.0f <= progress) {
                            motionLayout2.setState(vVar);
                        }
                    } else if (0.0f >= f17 || 1.0f <= f17) {
                        motionLayout2.setState(vVar);
                    }
                } else if (action2 == 2) {
                    float rawY2 = motionEvent.getRawY() - l10.f19862n;
                    float rawX2 = motionEvent.getRawX() - l10.f19861m;
                    if (Math.abs((l10.j * rawY2) + (l10.f19858i * rawX2)) > l10.f19869u || l10.f19859k) {
                        float progress2 = motionLayout2.getProgress();
                        if (!l10.f19859k) {
                            l10.f19859k = true;
                            motionLayout2.setProgress(progress2);
                        }
                        int i16 = l10.f19854d;
                        if (i16 != -1) {
                            l10.f19863o.s(i16, progress2, l10.f19857h, l10.g, fArr);
                            c12 = 1;
                            c13 = 0;
                        } else {
                            float fMin2 = Math.min(motionLayout2.getWidth(), motionLayout2.getHeight());
                            c12 = 1;
                            fArr[1] = l10.j * fMin2;
                            c13 = 0;
                            fArr[0] = fMin2 * l10.f19858i;
                        }
                        if (Math.abs(((l10.j * fArr[c12]) + (l10.f19858i * fArr[c13])) * l10.f19867s) < 0.01d) {
                            c15 = 0;
                            fArr[0] = 0.01f;
                            c14 = 1;
                            fArr[1] = 0.01f;
                        } else {
                            c14 = 1;
                            c15 = 0;
                        }
                        float fMax = Math.max(Math.min(progress2 + (l10.f19858i != f3 ? rawX2 / fArr[c15] : rawY2 / fArr[c14]), 1.0f), f3);
                        if (fMax != motionLayout2.getProgress()) {
                            motionLayout2.setProgress(fMax);
                            ((VelocityTracker) sVar3.f19936a).computeCurrentVelocity(1000);
                            motionLayout2.f12178J = l10.f19858i != 0.0f ? ((VelocityTracker) sVar3.f19936a).getXVelocity() / fArr[0] : ((VelocityTracker) sVar3.f19936a).getYVelocity() / fArr[1];
                        } else {
                            motionLayout2.f12178J = 0.0f;
                        }
                        l10.f19861m = motionEvent.getRawX();
                        l10.f19862n = motionEvent.getRawY();
                    }
                }
            }
        }
        a10.f19831p = motionEvent.getRawX();
        a10.f19832q = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (sVar = a10.f19829n) == null) {
            return true;
        }
        ((VelocityTracker) sVar.f19936a).recycle();
        sVar.f19936a = null;
        a10.f19829n = null;
        int i17 = this.f12182L;
        if (i17 == -1) {
            return true;
        }
        a10.a(this, i17);
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f12212t0 == null) {
                this.f12212t0 = new ArrayList();
            }
            this.f12212t0.add(motionHelper);
            if (motionHelper.f12164y) {
                if (this.f12210r0 == null) {
                    this.f12210r0 = new ArrayList();
                }
                this.f12210r0.add(motionHelper);
            }
            if (motionHelper.f12165z) {
                if (this.f12211s0 == null) {
                    this.f12211s0 = new ArrayList();
                }
                this.f12211s0.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.f12210r0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.f12211s0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void p(boolean z10) {
        float f3;
        boolean z11;
        float f7;
        int i10;
        float interpolation;
        boolean z12;
        if (this.f12191V == -1) {
            this.f12191V = getNanoTime();
        }
        float f10 = this.U;
        float f11 = 0.0f;
        if (f10 > 0.0f && f10 < 1.0f) {
            this.f12182L = -1;
        }
        boolean z13 = false;
        if (this.f12209q0 || (this.f12194b0 && (z10 || this.f12192W != f10))) {
            float fSignum = Math.signum(this.f12192W - f10);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.f12176I;
            if (interpolator instanceof o) {
                f3 = 0.0f;
            } else {
                f3 = (((nanoTime - this.f12191V) * fSignum) * 1.0E-9f) / this.S;
                this.f12178J = f3;
            }
            float f12 = this.U + f3;
            if (this.f12193a0) {
                f12 = this.f12192W;
            }
            if ((fSignum <= 0.0f || f12 < this.f12192W) && (fSignum > 0.0f || f12 > this.f12192W)) {
                z11 = false;
            } else {
                f12 = this.f12192W;
                this.f12194b0 = false;
                z11 = true;
            }
            this.U = f12;
            this.T = f12;
            this.f12191V = nanoTime;
            if (interpolator != null && !z11) {
                if (this.f12198f0) {
                    interpolation = interpolator.getInterpolation((nanoTime - this.R) * 1.0E-9f);
                    this.U = interpolation;
                    this.f12191V = nanoTime;
                    Interpolator interpolator2 = this.f12176I;
                    if (interpolator2 instanceof o) {
                        float fA = ((o) interpolator2).a();
                        this.f12178J = fA;
                        if (Math.abs(fA) * this.S <= 1.0E-5f) {
                            this.f12194b0 = false;
                        }
                        if (fA > 0.0f && interpolation >= 1.0f) {
                            this.U = 1.0f;
                            this.f12194b0 = false;
                            interpolation = 1.0f;
                        }
                        if (fA < 0.0f && interpolation <= 0.0f) {
                            this.U = 0.0f;
                            this.f12194b0 = false;
                            f12 = 0.0f;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f12);
                    Interpolator interpolator3 = this.f12176I;
                    if (interpolator3 instanceof o) {
                        this.f12178J = ((o) interpolator3).a();
                    } else {
                        this.f12178J = ((interpolator3.getInterpolation(f12 + f3) - interpolation) * fSignum) / f3;
                    }
                }
                f12 = interpolation;
            }
            if (Math.abs(this.f12178J) > 1.0E-5f) {
                setState(v.f19944t);
            }
            if ((fSignum > 0.0f && f12 >= this.f12192W) || (fSignum <= 0.0f && f12 <= this.f12192W)) {
                f12 = this.f12192W;
                this.f12194b0 = false;
            }
            float f13 = f12;
            v vVar = v.f19945u;
            if (f13 >= 1.0f || f13 <= 0.0f) {
                this.f12194b0 = false;
                setState(vVar);
            }
            int childCount = getChildCount();
            this.f12209q0 = false;
            long nanoTime2 = getNanoTime();
            this.f12173G0 = f13;
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = getChildAt(i11);
                n nVar = (n) this.Q.get(childAt);
                if (nVar != null) {
                    this.f12209q0 = nVar.c(f13, nanoTime2, childAt, this.f12175H0) | this.f12209q0;
                }
                i11++;
                f11 = f11;
            }
            f7 = f11;
            boolean z14 = (fSignum > 0.0f && f13 >= this.f12192W) || (fSignum <= f7 && f13 <= this.f12192W);
            if (!this.f12209q0 && !this.f12194b0 && z14) {
                setState(vVar);
            }
            if (this.f12218z0) {
                requestLayout();
            }
            this.f12209q0 = (!z14) | this.f12209q0;
            if (f13 <= f7 && (i10 = this.f12180K) != -1 && this.f12182L != i10) {
                this.f12182L = i10;
                this.f12174H.b(i10).a(this);
                setState(vVar);
                z13 = true;
            }
            if (f13 >= 1.0d) {
                int i12 = this.f12182L;
                int i13 = this.f12183M;
                if (i12 != i13) {
                    this.f12182L = i13;
                    this.f12174H.b(i13).a(this);
                    setState(vVar);
                    z13 = true;
                }
            }
            if (this.f12209q0 || this.f12194b0) {
                invalidate();
            } else if ((fSignum > 0.0f && f13 == 1.0f) || (fSignum < f7 && f13 == f7)) {
                setState(vVar);
            }
            if ((!this.f12209q0 && this.f12194b0 && fSignum > 0.0f && f13 == 1.0f) || (fSignum < f7 && f13 == f7)) {
                v();
            }
        } else {
            f7 = 0.0f;
        }
        float f14 = this.U;
        if (f14 < 1.0f) {
            if (f14 <= f7) {
                int i14 = this.f12182L;
                int i15 = this.f12180K;
                z12 = i14 == i15 ? z13 : true;
                this.f12182L = i15;
            }
            this.f12184M0 |= z13;
            if (z13 && !this.f12177I0) {
                requestLayout();
            }
            this.T = this.U;
        }
        int i16 = this.f12182L;
        int i17 = this.f12183M;
        z12 = i16 == i17 ? z13 : true;
        this.f12182L = i17;
        z13 = z12;
        this.f12184M0 |= z13;
        if (z13) {
            requestLayout();
        }
        this.T = this.U;
    }

    public final void q() {
        ArrayList arrayList;
        if ((this.f12195c0 == null && ((arrayList = this.f12212t0) == null || arrayList.isEmpty())) || this.f12217y0 == this.T) {
            return;
        }
        int i10 = 0;
        if (this.f12216x0 != -1) {
            u uVar = this.f12195c0;
            if (uVar != null) {
                uVar.getClass();
            }
            ArrayList arrayList2 = this.f12212t0;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    ((u) obj).getClass();
                }
            }
        }
        this.f12216x0 = -1;
        this.f12217y0 = this.T;
        u uVar2 = this.f12195c0;
        if (uVar2 != null) {
            uVar2.getClass();
        }
        ArrayList arrayList3 = this.f12212t0;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                ((u) obj2).getClass();
            }
        }
    }

    public final void r() {
        ArrayList arrayList;
        if ((this.f12195c0 != null || ((arrayList = this.f12212t0) != null && !arrayList.isEmpty())) && this.f12216x0 == -1) {
            this.f12216x0 = this.f12182L;
            ArrayList arrayList2 = this.f12190P0;
            int iIntValue = !arrayList2.isEmpty() ? ((Integer) p123m2.c.q(1, arrayList2)).intValue() : -1;
            int i10 = this.f12182L;
            if (iIntValue != i10 && i10 != -1) {
                arrayList2.add(Integer.valueOf(i10));
            }
        }
        w();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        A a9;
        z zVar;
        if (this.f12218z0 || this.f12182L != -1 || (a9 = this.f12174H) == null || (zVar = a9.f19820c) == null || zVar.f19979q != 0) {
            super.requestLayout();
        }
    }

    public final void s(int i10, float f3, float f7, float f10, float[] fArr) {
        View viewD = d(i10);
        n nVar = (n) this.Q.get(viewD);
        if (nVar != null) {
            nVar.b(f3, f7, f10, fArr);
            viewD.getY();
        } else {
            Log.w("MotionLayout", "WARNING could not find view id " + (viewD == null ? p123m2.c.r(i10, "") : viewD.getContext().getResources().getResourceName(i10)));
        }
    }

    public void setDebugMode(int i10) {
        this.f12196d0 = i10;
        invalidate();
    }

    public void setInteractionEnabled(boolean z10) {
        this.f12189P = z10;
    }

    public void setInterpolatedProgress(float f3) {
        if (this.f12174H != null) {
            setState(v.f19944t);
            Interpolator interpolatorD = this.f12174H.d();
            if (interpolatorD != null) {
                setProgress(interpolatorD.getInterpolation(f3));
                return;
            }
        }
        setProgress(f3);
    }

    public void setOnHide(float f3) {
        ArrayList arrayList = this.f12211s0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((MotionHelper) this.f12211s0.get(i10)).setProgress(f3);
            }
        }
    }

    public void setOnShow(float f3) {
        ArrayList arrayList = this.f12210r0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((MotionHelper) this.f12210r0.get(i10)).setProgress(f3);
            }
        }
    }

    public void setProgress(float f3) {
        if (!super.isAttachedToWindow()) {
            if (this.f12179J0 == null) {
                this.f12179J0 = new t(this);
            }
            this.f12179J0.f19937a = f3;
            return;
        }
        v vVar = v.f19945u;
        if (f3 <= 0.0f) {
            this.f12182L = this.f12180K;
            if (this.U == 0.0f) {
                setState(vVar);
            }
        } else if (f3 >= 1.0f) {
            this.f12182L = this.f12183M;
            if (this.U == 1.0f) {
                setState(vVar);
            }
        } else {
            this.f12182L = -1;
            setState(v.f19944t);
        }
        if (this.f12174H == null) {
            return;
        }
        this.f12193a0 = true;
        this.f12192W = f3;
        this.T = f3;
        this.f12191V = -1L;
        this.R = -1L;
        this.f12176I = null;
        this.f12194b0 = true;
        invalidate();
    }

    public void setScene(A a9) {
        L l10;
        this.f12174H = a9;
        boolean zK = k();
        a9.f19830o = zK;
        z zVar = a9.f19820c;
        if (zVar != null && (l10 = zVar.f19974l) != null) {
            l10.b(zK);
        }
        x();
    }

    public void setState(v vVar) {
        v vVar2 = v.f19945u;
        if (vVar == vVar2 && this.f12182L == -1) {
            return;
        }
        v vVar3 = this.f12181K0;
        this.f12181K0 = vVar;
        v vVar4 = v.f19944t;
        if (vVar3 == vVar4 && vVar == vVar4) {
            q();
        }
        int iOrdinal = vVar3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && vVar == vVar2) {
                r();
                return;
            }
            return;
        }
        if (vVar == vVar4) {
            q();
        }
        if (vVar == vVar2) {
            r();
        }
    }

    public void setTransition(int i10) {
        z zVar;
        float f3;
        A a9 = this.f12174H;
        if (a9 != null) {
            ArrayList arrayList = a9.f19821d;
            int size = arrayList.size();
            int i11 = 0;
            do {
                if (i11 >= size) {
                    zVar = null;
                    break;
                } else {
                    Object obj = arrayList.get(i11);
                    i11++;
                    zVar = (z) obj;
                }
            } while (zVar.f19965a != i10);
            this.f12180K = zVar.f19968d;
            this.f12183M = zVar.f19967c;
            if (!super.isAttachedToWindow()) {
                if (this.f12179J0 == null) {
                    this.f12179J0 = new t(this);
                }
                t tVar = this.f12179J0;
                tVar.f19939c = this.f12180K;
                tVar.f19940d = this.f12183M;
                return;
            }
            int i12 = this.f12182L;
            if (i12 == this.f12180K) {
                f3 = 0.0f;
            } else {
                f3 = i12 == this.f12183M ? 1.0f : Float.NaN;
            }
            A a10 = this.f12174H;
            a10.f19820c = zVar;
            L l10 = zVar.f19974l;
            if (l10 != null) {
                l10.b(a10.f19830o);
            }
            this.L0.g(this.f12174H.b(this.f12180K), this.f12174H.b(this.f12183M));
            x();
            this.U = Float.isNaN(f3) ? 0.0f : f3;
            if (!Float.isNaN(f3)) {
                setProgress(f3);
                return;
            }
            Log.v("MotionLayout", Y2.a.F() + " transitionToStart ");
            o(0.0f);
        }
    }

    public void setTransitionDuration(int i10) {
        A a9 = this.f12174H;
        if (a9 == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        z zVar = a9.f19820c;
        if (zVar != null) {
            zVar.f19971h = i10;
        } else {
            a9.j = i10;
        }
    }

    public void setTransitionListener(u uVar) {
        this.f12195c0 = uVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f12179J0 == null) {
            this.f12179J0 = new t(this);
        }
        t tVar = this.f12179J0;
        tVar.getClass();
        tVar.f19937a = bundle.getFloat("motion.progress");
        tVar.f19938b = bundle.getFloat("motion.velocity");
        tVar.f19939c = bundle.getInt("motion.StartState");
        tVar.f19940d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.f12179J0.a();
        }
    }

    public final boolean t(float f3, float f7, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (t(view.getLeft() + f3, view.getTop() + f7, viewGroup.getChildAt(i10), motionEvent)) {
                    return true;
                }
            }
        }
        float left = view.getLeft() + f3;
        float top = view.getTop() + f7;
        float right = f3 + view.getRight();
        float bottom = f7 + view.getBottom();
        RectF rectF = this.f12186N0;
        rectF.set(left, top, right, bottom);
        if (motionEvent.getAction() == 0) {
            if (rectF.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent)) {
                return true;
            }
        } else if (view.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return Y2.a.G(context, this.f12180K) + "->" + Y2.a.G(context, this.f12183M) + " (pos:" + this.U + " Dpos/Dt:" + this.f12178J;
    }

    public final void u(AttributeSet attributeSet) {
        A a9;
        isInEditMode();
        int i10 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s1.p.f22045k);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z10 = true;
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 2) {
                    this.f12174H = new A(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.f12182L = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.f12192W = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f12194b0 = true;
                } else if (index == 0) {
                    z10 = typedArrayObtainStyledAttributes.getBoolean(index, z10);
                } else if (index == 5) {
                    if (this.f12196d0 == 0) {
                        this.f12196d0 = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.f12196d0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.f12174H == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z10) {
                this.f12174H = null;
            }
        }
        if (this.f12196d0 != 0) {
            A a10 = this.f12174H;
            if (a10 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int iG = a10.g();
                A a11 = this.f12174H;
                l lVarB = a11.b(a11.g());
                String strG = Y2.a.G(getContext(), iG);
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    int id = childAt.getId();
                    if (id == -1) {
                        StringBuilder sbD = android.support.v4.media.session.p.D("CHECK: ", strG, " ALL VIEWS SHOULD HAVE ID's ");
                        sbD.append(childAt.getClass().getName());
                        sbD.append(" does not!");
                        Log.w("MotionLayout", sbD.toString());
                    }
                    HashMap map = lVarB.f22023c;
                    if ((map.containsKey(Integer.valueOf(id)) ? (s1.g) map.get(Integer.valueOf(id)) : null) == null) {
                        StringBuilder sbD2 = android.support.v4.media.session.p.D("CHECK: ", strG, " NO CONSTRAINTS for ");
                        sbD2.append(Y2.a.H(childAt));
                        Log.w("MotionLayout", sbD2.toString());
                    }
                }
                Integer[] numArr = (Integer[]) lVarB.f22023c.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i13 = 0; i13 < length; i13++) {
                    iArr[i13] = numArr[i13].intValue();
                }
                for (int i14 = 0; i14 < length; i14++) {
                    int i15 = iArr[i14];
                    String strG2 = Y2.a.G(getContext(), i15);
                    if (findViewById(iArr[i14]) == null) {
                        Log.w("MotionLayout", "CHECK: " + strG + " NO View matches id " + strG2);
                    }
                    if (lVarB.g(i15).f21936d.f21967d == -1) {
                        Log.w("MotionLayout", p123m2.c.t("CHECK: ", strG, "(", strG2, ") no LAYOUT_HEIGHT"));
                    }
                    if (lVarB.g(i15).f21936d.f21965c == -1) {
                        Log.w("MotionLayout", p123m2.c.t("CHECK: ", strG, "(", strG2, ") no LAYOUT_HEIGHT"));
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                ArrayList arrayList = this.f12174H.f19821d;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    z zVar = (z) obj;
                    if (zVar == this.f12174H.f19820c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    StringBuilder sb = new StringBuilder("CHECK: transition = ");
                    Context context = getContext();
                    String resourceEntryName = zVar.f19968d == -1 ? "null" : context.getResources().getResourceEntryName(zVar.f19968d);
                    sb.append(zVar.f19967c == -1 ? android.support.v4.media.session.p.z(resourceEntryName, " -> null") : resourceEntryName + " -> " + context.getResources().getResourceEntryName(zVar.f19967c));
                    Log.v("MotionLayout", sb.toString());
                    Log.v("MotionLayout", "CHECK: transition.setDuration = " + zVar.f19971h);
                    if (zVar.f19968d == zVar.f19967c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i16 = zVar.f19968d;
                    int i17 = zVar.f19967c;
                    String strG3 = Y2.a.G(getContext(), i16);
                    String strG4 = Y2.a.G(getContext(), i17);
                    if (sparseIntArray.get(i16) == i17) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + strG3 + "->" + strG4);
                    }
                    if (sparseIntArray2.get(i17) == i16) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + strG3 + "->" + strG4);
                    }
                    sparseIntArray.put(i16, i17);
                    sparseIntArray2.put(i17, i16);
                    if (this.f12174H.b(i16) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + strG3);
                    }
                    if (this.f12174H.b(i17) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + strG3);
                    }
                }
            }
        }
        if (this.f12182L != -1 || (a9 = this.f12174H) == null) {
            return;
        }
        this.f12182L = a9.g();
        this.f12180K = this.f12174H.g();
        z zVar2 = this.f12174H.f19820c;
        this.f12183M = zVar2 != null ? zVar2.f19967c : -1;
    }

    public final void v() {
        z zVar;
        L l10;
        View viewFindViewById;
        A a9 = this.f12174H;
        if (a9 == null) {
            return;
        }
        if (a9.a(this, this.f12182L)) {
            requestLayout();
            return;
        }
        int i10 = this.f12182L;
        if (i10 != -1) {
            A a10 = this.f12174H;
            ArrayList arrayList = a10.f19823f;
            ArrayList arrayList2 = a10.f19821d;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                z zVar2 = (z) obj;
                if (zVar2.f19975m.size() > 0) {
                    ArrayList arrayList3 = zVar2.f19975m;
                    int size2 = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj2 = arrayList3.get(i12);
                        i12++;
                        ((y) obj2).b(this);
                    }
                }
            }
            int size3 = arrayList.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList.get(i13);
                i13++;
                z zVar3 = (z) obj3;
                if (zVar3.f19975m.size() > 0) {
                    ArrayList arrayList4 = zVar3.f19975m;
                    int size4 = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size4) {
                        Object obj4 = arrayList4.get(i14);
                        i14++;
                        ((y) obj4).b(this);
                    }
                }
            }
            int size5 = arrayList2.size();
            int i15 = 0;
            while (i15 < size5) {
                Object obj5 = arrayList2.get(i15);
                i15++;
                z zVar4 = (z) obj5;
                if (zVar4.f19975m.size() > 0) {
                    ArrayList arrayList5 = zVar4.f19975m;
                    int size6 = arrayList5.size();
                    int i16 = 0;
                    while (i16 < size6) {
                        Object obj6 = arrayList5.get(i16);
                        i16++;
                        ((y) obj6).a(this, i10, zVar4);
                    }
                }
            }
            int size7 = arrayList.size();
            int i17 = 0;
            while (i17 < size7) {
                Object obj7 = arrayList.get(i17);
                i17++;
                z zVar5 = (z) obj7;
                if (zVar5.f19975m.size() > 0) {
                    ArrayList arrayList6 = zVar5.f19975m;
                    int size8 = arrayList6.size();
                    int i18 = 0;
                    while (i18 < size8) {
                        Object obj8 = arrayList6.get(i18);
                        i18++;
                        ((y) obj8).a(this, i10, zVar5);
                    }
                }
            }
        }
        if (!this.f12174H.l() || (zVar = this.f12174H.f19820c) == null || (l10 = zVar.f19974l) == null) {
            return;
        }
        MotionLayout motionLayout = l10.f19863o;
        int i19 = l10.f19854d;
        if (i19 != -1) {
            viewFindViewById = motionLayout.findViewById(i19);
            if (viewFindViewById == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + Y2.a.G(motionLayout.getContext(), l10.f19854d));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new U7.b(1));
            nestedScrollView.setOnScrollChangeListener(new D(8));
        }
    }

    public final void w() {
        ArrayList arrayList;
        if (this.f12195c0 == null && ((arrayList = this.f12212t0) == null || arrayList.isEmpty())) {
            return;
        }
        ArrayList arrayList2 = this.f12190P0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            Integer num = (Integer) obj;
            u uVar = this.f12195c0;
            if (uVar != null) {
                num.intValue();
                uVar.getClass();
            }
            ArrayList arrayList3 = this.f12212t0;
            if (arrayList3 != null) {
                int size2 = arrayList3.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    num.intValue();
                    ((u) obj2).getClass();
                }
            }
        }
        arrayList2.clear();
    }

    public final void x() {
        this.L0.h();
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    public final void y(float f3, float f7, int i10) {
        boolean z10;
        L l10;
        float f10;
        float f11;
        float f12;
        z zVar;
        float f13;
        L l11;
        if (this.f12174H == null || this.U == f3) {
            return;
        }
        this.f12198f0 = true;
        this.R = getNanoTime();
        A a9 = this.f12174H;
        z zVar2 = a9.f19820c;
        float f14 = (zVar2 != null ? zVar2.f19971h : a9.j) / 1000.0f;
        this.S = f14;
        this.f12192W = f3;
        this.f12194b0 = true;
        g gVar = this.f12199g0;
        float f15 = 0.0f;
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            if (i10 == 1) {
                f3 = 0.0f;
            } else if (i10 == 2) {
                f3 = 1.0f;
            }
            float f16 = this.U;
            float f17 = a9.f();
            z zVar3 = this.f12174H.f19820c;
            if (zVar3 != null && (l10 = zVar3.f19974l) != null) {
                f15 = l10.f19864p;
            }
            float f18 = f15;
            gVar.f19514l = f16;
            z10 = f16 > f3;
            gVar.f19513k = z10;
            if (z10) {
                gVar.c(-f7, f16 - f3, f17, f18, f14);
            } else {
                gVar.c(f7, f3 - f16, f17, f18, f14);
            }
            int i11 = this.f12182L;
            this.f12192W = f3;
            this.f12182L = i11;
            this.f12176I = gVar;
        } else {
            q qVar = this.f12200h0;
            if (i10 == 4) {
                float f19 = this.U;
                float f20 = a9.f();
                qVar.f19919a = f7;
                qVar.f19920b = f19;
                qVar.f19921c = f20;
                this.f12176I = qVar;
            } else if (i10 == 5) {
                float f21 = this.U;
                float f22 = a9.f();
                if (f7 > 0.0f) {
                    float f23 = f7 / f22;
                    if (((f7 * f23) - (((f22 * f23) * f23) / 2.0f)) + f21 > 1.0f) {
                        float f24 = this.U;
                        float f25 = this.f12174H.f();
                        qVar.f19919a = f7;
                        qVar.f19920b = f24;
                        qVar.f19921c = f25;
                        this.f12176I = qVar;
                    } else {
                        f10 = this.U;
                        f11 = this.S;
                        f12 = this.f12174H.f();
                        zVar = this.f12174H.f19820c;
                        if (zVar != null || (l11 = zVar.f19974l) == null) {
                            f13 = 0.0f;
                        } else {
                            f13 = l11.f19864p;
                        }
                        gVar.f19514l = f10;
                        z10 = f10 > f3;
                        gVar.f19513k = z10;
                        if (z10) {
                            gVar.c(-f7, f10 - f3, f12, f13, f11);
                        } else {
                            gVar.c(f7, f3 - f10, f12, f13, f11);
                        }
                        this.f12178J = 0.0f;
                        int i12 = this.f12182L;
                        this.f12192W = f3;
                        this.f12182L = i12;
                        this.f12176I = gVar;
                    }
                } else {
                    float f26 = (-f7) / f22;
                    if ((((f22 * f26) * f26) / 2.0f) + (f7 * f26) + f21 < 0.0f) {
                        float f27 = this.U;
                        float f28 = this.f12174H.f();
                        qVar.f19919a = f7;
                        qVar.f19920b = f27;
                        qVar.f19921c = f28;
                        this.f12176I = qVar;
                    } else {
                        f10 = this.U;
                        f11 = this.S;
                        f12 = this.f12174H.f();
                        zVar = this.f12174H.f19820c;
                        if (zVar != null) {
                            f13 = 0.0f;
                        } else {
                            f13 = 0.0f;
                        }
                        gVar.f19514l = f10;
                        if (f10 > f3) {
                        }
                        gVar.f19513k = z10;
                        if (z10) {
                            gVar.c(-f7, f10 - f3, f12, f13, f11);
                        } else {
                            gVar.c(f7, f3 - f10, f12, f13, f11);
                        }
                        this.f12178J = 0.0f;
                        int i13 = this.f12182L;
                        this.f12192W = f3;
                        this.f12182L = i13;
                        this.f12176I = gVar;
                    }
                }
            }
        }
        this.f12193a0 = false;
        this.R = getNanoTime();
        invalidate();
    }

    public final void z(int i10) {
        Da.r rVar;
        Object obj;
        if (!super.isAttachedToWindow()) {
            if (this.f12179J0 == null) {
                this.f12179J0 = new t(this);
            }
            this.f12179J0.f19940d = i10;
            return;
        }
        A a9 = this.f12174H;
        if (a9 != null && (rVar = a9.f19819b) != null) {
            int i11 = this.f12182L;
            float f3 = -1;
            s1.q qVar = (s1.q) ((SparseArray) rVar.f1388t).get(i10);
            if (qVar != null) {
                ArrayList arrayList = qVar.f22057b;
                int i12 = qVar.f22058c;
                if (f3 != -1.0f && f3 != -1.0f) {
                    int size = arrayList.size();
                    s1.r rVar2 = null;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size) {
                            if (rVar2 != null) {
                                i11 = rVar2.f22063e;
                                break;
                            } else {
                                i11 = i12;
                                break;
                            }
                        }
                        Object obj2 = arrayList.get(i13);
                        i13++;
                        s1.r rVar3 = (s1.r) obj2;
                        if (rVar3.a(f3, f3)) {
                            if (i11 == rVar3.f22063e) {
                                break;
                            } else {
                                rVar2 = rVar3;
                            }
                        }
                    }
                } else if (i12 != i11) {
                    int size2 = arrayList.size();
                    int i14 = 0;
                    do {
                        if (i14 >= size2) {
                            i11 = i12;
                            break;
                        } else {
                            obj = arrayList.get(i14);
                            i14++;
                        }
                    } while (i11 != ((s1.r) obj).f22063e);
                }
            } else {
                i11 = i10;
            }
            if (i11 != -1) {
                i10 = i11;
            }
        }
        int i15 = this.f12182L;
        if (i15 == i10) {
            return;
        }
        if (this.f12180K == i10) {
            o(0.0f);
            return;
        }
        if (this.f12183M == i10) {
            o(1.0f);
            return;
        }
        this.f12183M = i10;
        if (i15 != -1) {
            setTransition(i15, i10);
            o(1.0f);
            this.U = 0.0f;
            o(1.0f);
            return;
        }
        this.f12198f0 = false;
        this.f12192W = 1.0f;
        this.T = 0.0f;
        this.U = 0.0f;
        this.f12191V = getNanoTime();
        this.R = getNanoTime();
        this.f12193a0 = false;
        this.f12176I = null;
        A a10 = this.f12174H;
        z zVar = a10.f19820c;
        this.S = (zVar != null ? zVar.f19971h : a10.j) / 1000.0f;
        this.f12180K = -1;
        a10.k(-1, this.f12183M);
        this.f12174H.g();
        int childCount = getChildCount();
        HashMap map = this.Q;
        map.clear();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            map.put(childAt, new n(childAt));
        }
        this.f12194b0 = true;
        l lVarB = this.f12174H.b(i10);
        a aVar = this.L0;
        aVar.g(null, lVarB);
        x();
        aVar.c();
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt(i17);
            n nVar = (n) map.get(childAt2);
            if (nVar != null) {
                w wVar = nVar.f19898d;
                wVar.f19954t = 0.0f;
                wVar.f19955u = 0.0f;
                float x9 = childAt2.getX();
                float y10 = childAt2.getY();
                float width = childAt2.getWidth();
                float height = childAt2.getHeight();
                wVar.f19956v = x9;
                wVar.f19957w = y10;
                wVar.f19958x = width;
                wVar.f19959y = height;
                m mVar = nVar.f19900f;
                mVar.getClass();
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                mVar.f19888t = childAt2.getVisibility();
                mVar.f19886r = childAt2.getVisibility() != 0 ? 0.0f : childAt2.getAlpha();
                mVar.f19889u = childAt2.getElevation();
                mVar.f19890v = childAt2.getRotation();
                mVar.f19891w = childAt2.getRotationX();
                mVar.f19892x = childAt2.getRotationY();
                mVar.f19893y = childAt2.getScaleX();
                mVar.f19894z = childAt2.getScaleY();
                mVar.f19878A = childAt2.getPivotX();
                mVar.f19879B = childAt2.getPivotY();
                mVar.f19880C = childAt2.getTranslationX();
                mVar.f19881D = childAt2.getTranslationY();
                mVar.f19882E = childAt2.getTranslationZ();
            }
        }
        getWidth();
        getHeight();
        for (int i18 = 0; i18 < childCount; i18++) {
            n nVar2 = (n) map.get(getChildAt(i18));
            this.f12174H.e(nVar2);
            nVar2.e(getNanoTime());
        }
        z zVar2 = this.f12174H.f19820c;
        float f7 = zVar2 != null ? zVar2.f19972i : 0.0f;
        if (f7 != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i19 = 0; i19 < childCount; i19++) {
                w wVar2 = ((n) map.get(getChildAt(i19))).f19899e;
                float f10 = wVar2.f19957w + wVar2.f19956v;
                fMin = Math.min(fMin, f10);
                fMax = Math.max(fMax, f10);
            }
            for (int i20 = 0; i20 < childCount; i20++) {
                n nVar3 = (n) map.get(getChildAt(i20));
                w wVar3 = nVar3.f19899e;
                float f11 = wVar3.f19956v;
                float f12 = wVar3.f19957w;
                nVar3.f19904l = 1.0f / (1.0f - f7);
                nVar3.f19903k = f7 - ((((f11 + f12) - fMin) * f7) / (fMax - fMin));
            }
        }
        this.T = 0.0f;
        this.U = 0.0f;
        this.f12194b0 = true;
        invalidate();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i10, int i11, int i12) {
        setState(v.f19943s);
        this.f12182L = i10;
        this.f12180K = -1;
        this.f12183M = -1;
        c0 c0Var = this.f12269B;
        if (c0Var != null) {
            c0Var.d(i11, i12, i10);
            return;
        }
        A a9 = this.f12174H;
        if (a9 != null) {
            a9.b(i10).b(this);
        }
    }

    public void setProgress(float f3, float f7) {
        if (!super.isAttachedToWindow()) {
            if (this.f12179J0 == null) {
                this.f12179J0 = new t(this);
            }
            t tVar = this.f12179J0;
            tVar.f19937a = f3;
            tVar.f19938b = f7;
            return;
        }
        setProgress(f3);
        setState(v.f19944t);
        this.f12178J = f7;
        o(1.0f);
    }

    public void setTransition(z zVar) {
        L l10;
        A a9 = this.f12174H;
        a9.f19820c = zVar;
        if (zVar != null && (l10 = zVar.f19974l) != null) {
            l10.b(a9.f19830o);
        }
        setState(v.f19943s);
        int i10 = this.f12182L;
        z zVar2 = this.f12174H.f19820c;
        if (i10 == (zVar2 == null ? -1 : zVar2.f19967c)) {
            this.U = 1.0f;
            this.T = 1.0f;
            this.f12192W = 1.0f;
        } else {
            this.U = 0.0f;
            this.T = 0.0f;
            this.f12192W = 0.0f;
        }
        this.f12191V = (zVar.f19980r & 1) != 0 ? -1L : getNanoTime();
        int iG = this.f12174H.g();
        A a10 = this.f12174H;
        z zVar3 = a10.f19820c;
        int i11 = zVar3 != null ? zVar3.f19967c : -1;
        if (iG == this.f12180K && i11 == this.f12183M) {
            return;
        }
        this.f12180K = iG;
        this.f12183M = i11;
        a10.k(iG, i11);
        l lVarB = this.f12174H.b(this.f12180K);
        l lVarB2 = this.f12174H.b(this.f12183M);
        a aVar = this.L0;
        aVar.g(lVarB, lVarB2);
        int i12 = this.f12180K;
        int i13 = this.f12183M;
        aVar.f16335a = i12;
        aVar.f16336b = i13;
        aVar.h();
        x();
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12178J = 0.0f;
        this.f12180K = -1;
        this.f12182L = -1;
        this.f12183M = -1;
        this.f12185N = 0;
        this.f12187O = 0;
        this.f12189P = true;
        this.Q = new HashMap();
        this.R = 0L;
        this.S = 1.0f;
        this.T = 0.0f;
        this.U = 0.0f;
        this.f12192W = 0.0f;
        this.f12194b0 = false;
        this.f12196d0 = 0;
        this.f12198f0 = false;
        this.f12199g0 = new g();
        this.f12200h0 = new q(this);
        this.f12204l0 = false;
        this.f12209q0 = false;
        this.f12210r0 = null;
        this.f12211s0 = null;
        this.f12212t0 = null;
        this.f12213u0 = 0;
        this.f12214v0 = -1L;
        this.f12215w0 = 0.0f;
        this.f12216x0 = 0;
        this.f12217y0 = 0.0f;
        this.f12218z0 = false;
        this.f12175H0 = new s();
        this.f12177I0 = false;
        this.f12181K0 = v.f19942r;
        this.L0 = new a(this);
        this.f12184M0 = false;
        this.f12186N0 = new RectF();
        this.f12188O0 = null;
        this.f12190P0 = new ArrayList();
        u(attributeSet);
    }

    public void setTransition(int i10, int i11) {
        if (!super.isAttachedToWindow()) {
            if (this.f12179J0 == null) {
                this.f12179J0 = new t(this);
            }
            t tVar = this.f12179J0;
            tVar.f19939c = i10;
            tVar.f19940d = i11;
            return;
        }
        A a9 = this.f12174H;
        if (a9 != null) {
            this.f12180K = i10;
            this.f12183M = i11;
            a9.k(i10, i11);
            this.L0.g(this.f12174H.b(i10), this.f12174H.b(i11));
            x();
            this.U = 0.0f;
            o(0.0f);
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12178J = 0.0f;
        this.f12180K = -1;
        this.f12182L = -1;
        this.f12183M = -1;
        this.f12185N = 0;
        this.f12187O = 0;
        this.f12189P = true;
        this.Q = new HashMap();
        this.R = 0L;
        this.S = 1.0f;
        this.T = 0.0f;
        this.U = 0.0f;
        this.f12192W = 0.0f;
        this.f12194b0 = false;
        this.f12196d0 = 0;
        this.f12198f0 = false;
        this.f12199g0 = new g();
        this.f12200h0 = new q(this);
        this.f12204l0 = false;
        this.f12209q0 = false;
        this.f12210r0 = null;
        this.f12211s0 = null;
        this.f12212t0 = null;
        this.f12213u0 = 0;
        this.f12214v0 = -1L;
        this.f12215w0 = 0.0f;
        this.f12216x0 = 0;
        this.f12217y0 = 0.0f;
        this.f12218z0 = false;
        this.f12175H0 = new s();
        this.f12177I0 = false;
        this.f12181K0 = v.f19942r;
        this.L0 = new a(this);
        this.f12184M0 = false;
        this.f12186N0 = new RectF();
        this.f12188O0 = null;
        this.f12190P0 = new ArrayList();
        u(attributeSet);
    }
}

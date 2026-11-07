package M;

import H0.InterfaceC0219s;
import I1.AbstractC0272z;
import U0.I;
import U0.K;
import Z0.s;
import Z0.y;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import p180s0.A;
import p180s0.F;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f5624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f5625b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5629f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5631i;
    public y j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public I f5632k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s f5633l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p171r0.e f5634m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p171r0.e f5635n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5626c = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f5636o = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f5637p = A.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Matrix f5638q = new Matrix();

    public m(b bVar, k kVar) {
        this.f5624a = bVar;
        this.f5625b = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01b7  */
    public final void a() {
        k kVar = this.f5625b;
        InputMethodManager inputMethodManagerS = kVar.s();
        View view = (View) kVar.f5618s;
        if (!inputMethodManagerS.isActive(view) || this.j == null || this.f5633l == null || this.f5632k == null || this.f5634m == null || this.f5635n == null) {
            return;
        }
        float[] fArr = this.f5637p;
        A.d(fArr);
        InterfaceC0219s interfaceC0219s = (InterfaceC0219s) this.f5624a.f5591z.f5623I.getValue();
        if (interfaceC0219s != null) {
            if (!interfaceC0219s.C()) {
                interfaceC0219s = null;
            }
            if (interfaceC0219s != null) {
                interfaceC0219s.D(fArr);
            }
        }
        p171r0.e eVar = this.f5635n;
        p251z9.j.b(eVar);
        float f3 = -eVar.f21389a;
        p171r0.e eVar2 = this.f5635n;
        p251z9.j.b(eVar2);
        A.f(fArr, f3, -eVar2.f21390b);
        Matrix matrix = this.f5638q;
        F.p(matrix, fArr);
        y yVar = this.j;
        p251z9.j.b(yVar);
        long j = yVar.f10954b;
        s sVar = this.f5633l;
        p251z9.j.b(sVar);
        I i10 = this.f5632k;
        p251z9.j.b(i10);
        p171r0.e eVar3 = this.f5634m;
        p251z9.j.b(eVar3);
        p171r0.e eVar4 = this.f5635n;
        p251z9.j.b(eVar4);
        boolean z10 = this.f5629f;
        boolean z11 = this.g;
        boolean z12 = this.f5630h;
        boolean z13 = this.f5631i;
        CursorAnchorInfo.Builder builder = this.f5636o;
        builder.reset();
        builder.setMatrix(matrix);
        K k7 = yVar.f10955c;
        int iE = K.e(j);
        builder.setSelectionRange(iE, K.d(j));
        p055f1.j jVar = p055f1.j.f15910s;
        if (z10 && iE >= 0) {
            int iB = sVar.b(iE);
            p171r0.e eVarC = i10.c(iB);
            float fK = B0.c.k(eVarC.f21389a, 0.0f, (int) (i10.f8025c >> 32));
            boolean zJ = u0.j(eVar3, fK, eVarC.f21390b);
            boolean zJ2 = u0.j(eVar3, fK, eVarC.f21392d);
            boolean z14 = i10.a(iB) == jVar;
            int i11 = (zJ || zJ2) ? 1 : 0;
            if (!zJ || !zJ2) {
                i11 |= 2;
            }
            if (z14) {
                i11 |= 4;
            }
            float f7 = eVarC.f21390b;
            float f10 = eVarC.f21392d;
            builder.setInsertionMarkerLocation(fK, f7, f10, f10, i11);
        }
        if (z11) {
            int iE2 = k7 != null ? K.e(k7.f8035a) : -1;
            int iD = k7 != null ? K.d(k7.f8035a) : -1;
            if (iE2 >= 0 && iE2 < iD) {
                builder.setComposingText(iE2, yVar.f10953a.f8060s.subSequence(iE2, iD));
                int iB2 = sVar.b(iE2);
                int iB3 = sVar.b(iD);
                float[] fArr2 = new float[(iB3 - iB2) * 4];
                i10.f8024b.a(va.g.e(iB2, iB3), fArr2);
                while (iE2 < iD) {
                    int iB4 = sVar.b(iE2);
                    int i12 = (iB4 - iB2) * 4;
                    float f11 = fArr2[i12];
                    float f12 = fArr2[i12 + 1];
                    int i13 = iD;
                    float f13 = fArr2[i12 + 2];
                    float f14 = fArr2[i12 + 3];
                    int i14 = iB2;
                    int i15 = (eVar3.f21389a < f13 ? 1 : 0) & (f11 < eVar3.f21391c ? 1 : 0) & (eVar3.f21390b < f14 ? 1 : 0) & (f12 < eVar3.f21392d ? 1 : 0);
                    if (!u0.j(eVar3, f11, f12) || !u0.j(eVar3, f13, f14)) {
                        i15 |= 2;
                    }
                    if (i10.a(iB4) == jVar) {
                        i15 |= 4;
                    }
                    int i16 = iE2;
                    builder.addCharacterBounds(i16, f11, f12, f13, f14, i15);
                    iE2 = i16 + 1;
                    iD = i13;
                    iB2 = i14;
                }
            }
        }
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 33 && z12) {
            E1.a.i(builder, eVar4);
        }
        if (i17 >= 34 && z13) {
            AbstractC0272z.a(builder, i10, eVar3);
        }
        kVar.s().updateCursorAnchorInfo(view, builder.build());
        this.f5628e = false;
    }
}

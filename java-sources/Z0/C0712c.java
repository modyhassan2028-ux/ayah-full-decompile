package Z0;

import I1.AbstractC0272z;
import U0.I;
import U0.K;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: Z0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0712c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f10903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.support.v4.media.session.r f10904b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10908f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10910i;
    public y j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public I f10911k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s f10912l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p171r0.e f10914n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p171r0.e f10915o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10905c = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p251z9.k f10913m = C0711b.f10897t;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f10916p = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float[] f10917q = p180s0.A.a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Matrix f10918r = new Matrix();

    public C0712c(AndroidComposeView androidComposeView, android.support.v4.media.session.r rVar) {
        this.f10903a = androidComposeView;
        this.f10904b = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0183  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k9.g] */
    /* JADX WARN: Type inference failed for: r3v3, types: [y9.c, z9.k] */
    public final void a() {
        android.support.v4.media.session.r rVar = this.f10904b;
        ?? r10 = rVar.f11365t;
        InputMethodManager inputMethodManager = (InputMethodManager) r10.getValue();
        View view = (View) rVar.f11364s;
        if (inputMethodManager.isActive(view)) {
            ?? r11 = this.f10913m;
            float[] fArr = this.f10917q;
            r11.e(new p180s0.A(fArr));
            this.f10903a.v(fArr);
            Matrix matrix = this.f10918r;
            p180s0.F.p(matrix, fArr);
            y yVar = this.j;
            p251z9.j.b(yVar);
            long j = yVar.f10954b;
            s sVar = this.f10912l;
            p251z9.j.b(sVar);
            I i10 = this.f10911k;
            p251z9.j.b(i10);
            p171r0.e eVar = this.f10914n;
            p251z9.j.b(eVar);
            p171r0.e eVar2 = this.f10915o;
            p251z9.j.b(eVar2);
            boolean z10 = this.f10908f;
            boolean z11 = this.g;
            boolean z12 = this.f10909h;
            boolean z13 = this.f10910i;
            CursorAnchorInfo.Builder builder = this.f10916p;
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
                boolean zQ = B0.c.q(eVar, fK, eVarC.f21390b);
                boolean zQ2 = B0.c.q(eVar, fK, eVarC.f21392d);
                boolean z14 = i10.a(iB) == jVar;
                int i11 = (zQ || zQ2) ? 1 : 0;
                if (!zQ || !zQ2) {
                    i11 |= 2;
                }
                if (z14) {
                    i11 |= 4;
                }
                float f3 = eVarC.f21390b;
                float f7 = eVarC.f21392d;
                builder.setInsertionMarkerLocation(fK, f3, f7, f7, i11);
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
                        float f10 = fArr2[i12];
                        float f11 = fArr2[i12 + 1];
                        int i13 = iD;
                        float f12 = fArr2[i12 + 2];
                        float f13 = fArr2[i12 + 3];
                        int i14 = iB2;
                        int i15 = (eVar.f21389a < f12 ? 1 : 0) & (f10 < eVar.f21391c ? 1 : 0) & (eVar.f21390b < f13 ? 1 : 0) & (f11 < eVar.f21392d ? 1 : 0);
                        if (!B0.c.q(eVar, f10, f11) || !B0.c.q(eVar, f12, f13)) {
                            i15 |= 2;
                        }
                        if (i10.a(iB4) == jVar) {
                            i15 |= 4;
                        }
                        int i16 = iE2;
                        builder.addCharacterBounds(i16, f10, f11, f12, f13, i15);
                        iE2 = i16 + 1;
                        iD = i13;
                        iB2 = i14;
                    }
                }
            }
            int i17 = Build.VERSION.SDK_INT;
            if (i17 >= 33 && z12) {
                E1.a.j(builder, eVar2);
            }
            if (i17 >= 34 && z13) {
                AbstractC0272z.b(builder, i10, eVar);
            }
            ((InputMethodManager) r10.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.f10907e = false;
        }
    }
}

package R0;

import J0.I;
import U0.C0515g;
import androidx.compose.ui.platform.AndroidComposeView;
import u.A;
import u.AbstractC1355j;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f7122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f7123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC1355j f7124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f7125d = new A(2);

    public q(I i10, d dVar, u.t tVar) {
        this.f7122a = i10;
        this.f7123b = dVar;
        this.f7124c = tVar;
    }

    public final p a() {
        return new p(this.f7123b, false, this.f7122a, new j());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    public final void b(I i10, j jVar) {
        String str;
        A a9 = this.f7125d;
        Object[] objArr = a9.f22650a;
        int i11 = a9.f22651b;
        for (int i12 = 0; i12 < i11; i12++) {
            p122m0.d dVar = (p122m0.d) ((k) objArr[i12]);
            u.u uVar = dVar.f19468h;
            AndroidComposeView androidComposeView = dVar.f19464c;
            N0.a aVar = dVar.f19462a;
            j jVarW = i10.w();
            int i13 = i10.f3926s;
            String str2 = null;
            if (jVar != null) {
                Object objG = jVar.f7108r.g(s.f7145C);
                if (objG == null) {
                    objG = null;
                }
                C0515g c0515g = (C0515g) objG;
                if (c0515g != null) {
                    str = c0515g.f8060s;
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
            if (jVarW != null) {
                Object objG2 = jVarW.f7108r.g(s.f7145C);
                if (objG2 == null) {
                    objG2 = null;
                }
                C0515g c0515g2 = (C0515g) objG2;
                if (c0515g2 != null) {
                    str2 = c0515g2.f8060s;
                }
            }
            if (str != str2) {
                if (str == null) {
                    aVar.g(androidComposeView, i13, true);
                } else if (str2 == null) {
                    aVar.g(androidComposeView, i13, false);
                } else if (p251z9.j.a((p122m0.e) B9.a.D(jVarW, s.f7170q), p122m0.m.f19473a)) {
                    aVar.d(androidComposeView, i13, p122m0.h.a(str2.toString()));
                }
            }
            boolean z10 = jVar != null && jVar.f7108r.b(s.f7169p);
            boolean z11 = jVarW != null && jVarW.f7108r.b(s.f7169p);
            if (z10 != z11) {
                if (z11) {
                    uVar.a(i13);
                } else {
                    uVar.e(i13);
                }
            }
        }
    }
}

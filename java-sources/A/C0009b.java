package A;

import G.C0178l;
import K9.InterfaceC0388f;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: A.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0009b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p011b0.e f188a;

    public C0009b(int i10) {
        switch (i10) {
            case 1:
                this.f188a = new p011b0.e(new C0178l[16]);
                break;
            default:
                this.f188a = new p011b0.e(new C0021h[16]);
                break;
        }
    }

    public void a(CancellationException cancellationException) {
        p011b0.e eVar = this.f188a;
        int i10 = eVar.f13127t;
        InterfaceC0388f[] interfaceC0388fArr = new InterfaceC0388f[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            interfaceC0388fArr[i11] = ((C0021h) eVar.f13125r[i11]).f247b;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            interfaceC0388fArr[i12].h(cancellationException);
        }
        if (eVar.f13127t == 0) {
            return;
        }
        C.a.c("uncancelled requests present");
    }

    public void b() {
        p011b0.e eVar = this.f188a;
        E9.d dVarI0 = B0.c.i0(0, eVar.f13127t);
        int i10 = dVarI0.f1995r;
        int i11 = dVarI0.f1996s;
        if (i10 <= i11) {
            while (true) {
                ((C0021h) eVar.f13125r[i10]).f247b.resumeWith(p110k9.y.f19095a);
                if (i10 == i11) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        eVar.g();
    }
}

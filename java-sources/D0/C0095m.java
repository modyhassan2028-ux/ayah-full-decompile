package D0;

import H0.InterfaceC0219s;
import com.google.android.gms.internal.measurement.J1;
import u.C1360o;

/* JADX INFO: renamed from: D0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0095m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p011b0.e f1117a = new p011b0.e(new C0094l[16]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u.A f1118b = new u.A(10);

    public boolean a(C1360o c1360o, InterfaceC0219s interfaceC0219s, J1 j10, boolean z10) {
        p011b0.e eVar = this.f1117a;
        Object[] objArr = eVar.f13125r;
        int i10 = eVar.f13127t;
        boolean z11 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            z11 = ((C0094l) objArr[i11]).a(c1360o, interfaceC0219s, j10, z10) || z11;
        }
        return z11;
    }

    public void b(J1 j10) {
        p011b0.e eVar = this.f1117a;
        int i10 = eVar.f13127t;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            }
            if (((C0094l) eVar.f13125r[i10]).f1112d.f1387s == 0) {
                eVar.l(i10);
            }
        }
    }
}

package G;

import A.C0041r0;
import K9.InterfaceC0402u;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: G.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0188w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p063g1.a f2753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2755d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2757f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.b f2758h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0185t[] f2752a = AbstractC0190y.f2761a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2756e = 1;

    public C0188w(androidx.compose.foundation.lazy.layout.b bVar) {
        this.f2758h = bVar;
    }

    public static void b(C0188w c0188w, F.s sVar, InterfaceC0402u interfaceC0402u, p180s0.v vVar, int i10, int i11) {
        c0188w.f2758h.getClass();
        c0188w.a(sVar, interfaceC0402u, vVar, i10, i11, (int) (sVar.a(0) >> 32));
    }

    public final void a(F.s sVar, InterfaceC0402u interfaceC0402u, p180s0.v vVar, int i10, int i11, int i12) {
        C0185t[] c0185tArr = this.f2752a;
        int length = c0185tArr.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                this.f2757f = i10;
                this.g = i11;
                break;
            } else {
                C0185t c0185t = c0185tArr[i13];
                if (c0185t != null && c0185t.g) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        List list = sVar.f2111b;
        int length2 = this.f2752a.length;
        for (int size = list.size(); size < length2; size++) {
            C0185t c0185t2 = this.f2752a[size];
            if (c0185t2 != null) {
                c0185t2.c();
            }
        }
        if (this.f2752a.length != list.size()) {
            Object[] objArrCopyOf = Arrays.copyOf(this.f2752a, list.size());
            p251z9.j.d(objArrCopyOf, "copyOf(...)");
            this.f2752a = (C0185t[]) objArrCopyOf;
        }
        this.f2753b = new p063g1.a(sVar.f2119l);
        this.f2754c = i12;
        this.f2755d = 0;
        this.f2756e = 1;
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            Object objI = ((H0.U) list.get(i14)).i();
            C0177k c0177k = objI instanceof C0177k ? (C0177k) objI : null;
            if (c0177k == null) {
                C0185t c0185t3 = this.f2752a[i14];
                if (c0185t3 != null) {
                    c0185t3.c();
                }
                this.f2752a[i14] = null;
            } else {
                C0185t c0185t4 = this.f2752a[i14];
                if (c0185t4 == null) {
                    c0185t4 = new C0185t(interfaceC0402u, vVar, new C0041r0(4, this.f2758h));
                    this.f2752a[i14] = c0185t4;
                }
                c0185t4.f2737d = c0177k.f2705F;
                c0185t4.f2738e = c0177k.f2706G;
                c0185t4.f2739f = c0177k.f2707H;
            }
        }
    }
}

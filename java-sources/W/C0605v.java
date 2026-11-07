package W;

import D.AbstractC0066i;
import D.C0061d;
import D.InterfaceC0062e;
import D.InterfaceC0064g;

/* JADX INFO: renamed from: W.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0605v extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ H0.U f9414r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f9415s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ H0.U f9416t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0062e f9417u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f9418v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ H0.U f9419w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ H0.K f9420x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0064g f9421y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0605v(H0.U u8, int i10, H0.U u10, InterfaceC0062e interfaceC0062e, long j, H0.U u11, H0.K k7, InterfaceC0064g interfaceC0064g, int i11) {
        super(1);
        this.f9414r = u8;
        this.f9415s = i10;
        this.f9416t = u10;
        this.f9417u = interfaceC0062e;
        this.f9418v = j;
        this.f9419w = u11;
        this.f9420x = k7;
        this.f9421y = interfaceC0064g;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        int iH;
        int iH2;
        H0.T t2 = (H0.T) obj;
        H0.U u8 = this.f9414r;
        int i10 = u8.f3169s;
        int i11 = this.f9415s;
        int i12 = 0;
        H0.T.g(t2, u8, 0, (i11 - i10) / 2);
        C0061d c0061d = AbstractC0066i.f981e;
        InterfaceC0062e interfaceC0062e = this.f9417u;
        boolean zA = p251z9.j.a(interfaceC0062e, c0061d);
        H0.U u10 = this.f9419w;
        H0.U u11 = this.f9416t;
        long j = this.f9418v;
        if (zA) {
            int iH3 = p063g1.a.h(j);
            int i13 = u11.f3168r;
            iH = (iH3 - i13) / 2;
            int i14 = u8.f3168r;
            if (iH < i14) {
                iH2 = i14 - iH;
            } else if (i13 + iH > p063g1.a.h(j) - u10.f3168r) {
                iH2 = (p063g1.a.h(j) - u10.f3168r) - (u11.f3168r + iH);
            }
            iH += iH2;
        } else {
            iH = p251z9.j.a(interfaceC0062e, AbstractC0066i.f978b) ? (p063g1.a.h(j) - u11.f3168r) - u10.f3168r : Math.max(this.f9420x.E(AbstractC0614y.f9462b), u8.f3168r);
        }
        InterfaceC0064g interfaceC0064g = this.f9421y;
        if (p251z9.j.a(interfaceC0064g, c0061d)) {
            i12 = (i11 - u11.f3169s) / 2;
        } else if (p251z9.j.a(interfaceC0064g, AbstractC0066i.f980d)) {
            i12 = i11 - u11.f3169s;
        }
        H0.T.g(t2, u11, iH, i12);
        H0.T.g(t2, u10, p063g1.a.h(j) - u10.f3168r, (i11 - u10.f3169s) / 2);
        return p110k9.y.f19095a;
    }
}

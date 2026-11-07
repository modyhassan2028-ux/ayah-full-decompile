package D;

import H0.InterfaceC0215n;
import java.util.List;

/* JADX INFO: renamed from: D.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0070m implements H0.I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0070m f999b = new C0070m(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0070m f1000c = new C0070m(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1001a;

    public /* synthetic */ C0070m(int i10) {
        this.f1001a = i10;
    }

    @Override // H0.I
    public final H0.J a(H0.K k7, List list, long j) {
        switch (this.f1001a) {
            case 0:
                return k7.g0(p063g1.a.j(j), p063g1.a.i(j), p120l9.s.f19441r, C0069l.f995s);
            default:
                return k7.g0(p063g1.a.f(j) ? p063g1.a.h(j) : 0, p063g1.a.e(j) ? p063g1.a.g(j) : 0, p120l9.s.f19441r, C0069l.f997u);
        }
    }

    @Override // H0.I
    public final /* synthetic */ int b(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int i11 = this.f1001a;
        return p245z2.a.m(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final /* synthetic */ int c(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int i11 = this.f1001a;
        return p245z2.a.j(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final /* synthetic */ int e(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int i11 = this.f1001a;
        return p245z2.a.g(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final /* synthetic */ int i(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int i11 = this.f1001a;
        return p245z2.a.d(this, interfaceC0215n, list, i10);
    }
}

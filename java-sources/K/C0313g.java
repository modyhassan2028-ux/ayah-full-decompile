package K;

import H0.InterfaceC0215n;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: K.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0313g implements H0.I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0313g f4641b = new C0313g(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0313g f4642c = new C0313g(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4643a;

    public /* synthetic */ C0313g(int i10) {
        this.f4643a = i10;
    }

    @Override // H0.I
    public final H0.J a(H0.K k7, List list, long j) {
        switch (this.f4643a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(((H0.H) list.get(i10)).a(j));
                }
                return k7.g0(p063g1.a.h(j), p063g1.a.g(j), p120l9.s.f19441r, new H0.X(1, arrayList));
            default:
                return k7.g0(p063g1.a.h(j), p063g1.a.g(j), p120l9.s.f19441r, C0317k.f4671v);
        }
    }

    @Override // H0.I
    public final /* synthetic */ int b(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int i11 = this.f4643a;
        return p245z2.a.m(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final /* synthetic */ int c(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int i11 = this.f4643a;
        return p245z2.a.j(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final /* synthetic */ int e(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int i11 = this.f4643a;
        return p245z2.a.g(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final /* synthetic */ int i(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int i11 = this.f4643a;
        return p245z2.a.d(this, interfaceC0215n, list, i10);
    }
}

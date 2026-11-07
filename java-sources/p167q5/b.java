package p167q5;

import N9.InterfaceC0415h;
import Z.C0672b;
import Z.C0698o;
import com.ayah.feature.navigator.NavigationWrapper;
import java.text.NumberFormat;
import p110k9.y;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21308r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ NavigationWrapper f21309s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0415h f21310t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ NumberFormat f21311u;

    public /* synthetic */ b(NavigationWrapper navigationWrapper, InterfaceC0415h interfaceC0415h, NumberFormat numberFormat, int i10, int i11) {
        this.f21308r = i11;
        this.f21309s = navigationWrapper;
        this.f21310t = interfaceC0415h;
        this.f21311u = numberFormat;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f21308r;
        y yVar = y.f19095a;
        NumberFormat numberFormat = this.f21311u;
        InterfaceC0415h interfaceC0415h = this.f21310t;
        NavigationWrapper navigationWrapper = this.f21309s;
        C0698o c0698o = (C0698o) obj;
        ((Integer) obj2).getClass();
        int i11 = NavigationWrapper.f13816u;
        switch (i10) {
            case 0:
                navigationWrapper.a(interfaceC0415h, numberFormat, c0698o, C0672b.y(1));
                break;
            default:
                navigationWrapper.b(interfaceC0415h, numberFormat, c0698o, C0672b.y(1));
                break;
        }
        return yVar;
    }
}

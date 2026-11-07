package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: androidx.lifecycle.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0759h implements InterfaceC0769s {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f12657r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f12658s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f12659t;

    public C0759h(InterfaceC0757f interfaceC0757f, InterfaceC0769s interfaceC0769s) {
        p251z9.j.e(interfaceC0757f, "defaultLifecycleObserver");
        this.f12658s = interfaceC0757f;
        this.f12659t = interfaceC0769s;
    }

    @Override // androidx.lifecycle.InterfaceC0769s
    public final void n(InterfaceC0771u interfaceC0771u, EnumC0766o enumC0766o) {
        switch (this.f12657r) {
            case 0:
                InterfaceC0757f interfaceC0757f = (InterfaceC0757f) this.f12658s;
                switch (AbstractC0758g.f12656a[enumC0766o.ordinal()]) {
                    case 1:
                        interfaceC0757f.i(interfaceC0771u);
                        break;
                    case 2:
                        interfaceC0757f.w(interfaceC0771u);
                        break;
                    case 3:
                        interfaceC0757f.b(interfaceC0771u);
                        break;
                    case 4:
                        interfaceC0757f.s(interfaceC0771u);
                        break;
                    case 5:
                        interfaceC0757f.A(interfaceC0771u);
                        break;
                    case 6:
                        interfaceC0757f.e(interfaceC0771u);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new A6.a();
                }
                InterfaceC0769s interfaceC0769s = (InterfaceC0769s) this.f12659t;
                if (interfaceC0769s != null) {
                    interfaceC0769s.n(interfaceC0771u, enumC0766o);
                    return;
                }
                return;
            case 1:
                if (enumC0766o == EnumC0766o.ON_START) {
                    ((w) this.f12658s).f(this);
                    ((L5.c) this.f12659t).M();
                    return;
                }
                return;
            default:
                HashMap map = ((C0753b) this.f12659t).f12647a;
                List list = (List) map.get(enumC0766o);
                Object obj = this.f12658s;
                C0753b.a(list, interfaceC0771u, enumC0766o, obj);
                C0753b.a((List) map.get(EnumC0766o.ON_ANY), interfaceC0771u, enumC0766o, obj);
                return;
        }
    }

    public C0759h(InterfaceC0770t interfaceC0770t) {
        this.f12658s = interfaceC0770t;
        C0755d c0755d = C0755d.f12651c;
        Class<?> cls = interfaceC0770t.getClass();
        C0753b c0753b = (C0753b) c0755d.f12652a.get(cls);
        this.f12659t = c0753b == null ? c0755d.a(cls, null) : c0753b;
    }

    public C0759h(L5.c cVar, w wVar) {
        this.f12658s = wVar;
        this.f12659t = cVar;
    }
}

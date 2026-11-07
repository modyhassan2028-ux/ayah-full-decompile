package C4;

import K9.InterfaceC0402u;
import N9.InterfaceC0415h;
import N9.InterfaceC0416i;
import java.util.concurrent.atomic.AtomicInteger;
import p110k9.y;
import p218w3.j;

/* JADX INFO: loaded from: classes.dex */
public final class h extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f746r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f747s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f748t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f749u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f750v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f751w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, int i10, p150o9.c cVar) {
        super(2, cVar);
        this.f751w = iVar;
        this.f748t = i10;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f746r) {
            case 0:
                h hVar = new h((i) this.f751w, this.f748t, cVar);
                hVar.f750v = obj;
                return hVar;
            default:
                return new h((InterfaceC0415h[]) this.f749u, this.f748t, (AtomicInteger) this.f750v, (M9.e) this.f751w, cVar);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f746r) {
            case 0:
                return ((h) create((InterfaceC0416i) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            default:
                return ((h) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f746r) {
            case 0:
                InterfaceC0416i interfaceC0416i = (InterfaceC0416i) this.f750v;
                int i10 = this.f747s;
                p161p9.a aVar = p161p9.a.f21156r;
                if (i10 != 0) {
                    if (i10 == 1) {
                        interfaceC0416i = (InterfaceC0416i) this.f749u;
                        p110k9.a.e(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj);
                    }
                    return y.f19095a;
                }
                p110k9.a.e(obj);
                j jVar = ((i) this.f751w).f753b;
                this.f750v = null;
                this.f749u = interfaceC0416i;
                this.f747s = 1;
                obj = jVar.b(this.f748t, this);
                if (obj == aVar) {
                    return aVar;
                }
                Object obj2 = ((p124m3.a) obj).f19536l;
                this.f750v = null;
                this.f749u = null;
                this.f747s = 2;
                if (interfaceC0416i.b(obj2, this) == aVar) {
                    return aVar;
                }
                return y.f19095a;
            default:
                AtomicInteger atomicInteger = (AtomicInteger) this.f750v;
                M9.e eVar = (M9.e) this.f751w;
                int i11 = this.f747s;
                try {
                    if (i11 == 0) {
                        p110k9.a.e(obj);
                        InterfaceC0415h[] interfaceC0415hArr = (InterfaceC0415h[]) this.f749u;
                        int i12 = this.f748t;
                        InterfaceC0415h interfaceC0415h = interfaceC0415hArr[i12];
                        G5.b bVar = new G5.b(i12, 5, eVar);
                        this.f747s = 1;
                        Object objD = interfaceC0415h.d(bVar, this);
                        p161p9.a aVar2 = p161p9.a.f21156r;
                        if (objD == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        eVar.j(null);
                    }
                    return y.f19095a;
                } catch (Throwable th) {
                    if (atomicInteger.decrementAndGet() == 0) {
                        eVar.j(null);
                    }
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InterfaceC0415h[] interfaceC0415hArr, int i10, AtomicInteger atomicInteger, M9.e eVar, p150o9.c cVar) {
        super(2, cVar);
        this.f749u = interfaceC0415hArr;
        this.f748t = i10;
        this.f750v = atomicInteger;
        this.f751w = eVar;
    }
}

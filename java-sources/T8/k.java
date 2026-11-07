package T8;

import N9.InterfaceC0416i;
import io.realm.CollectionUtils;
import java.util.concurrent.atomic.AtomicReference;
import p110k9.y;
import p207v2.N;
import p207v2.e0;
import p251z9.C1472a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements InterfaceC0416i, p251z9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7960r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f7961s;

    public /* synthetic */ k(int i10, Object obj) {
        this.f7960r = i10;
        this.f7961s = obj;
    }

    @Override // N9.InterfaceC0416i
    public final Object b(Object obj, p150o9.c cVar) {
        int i10 = this.f7960r;
        y yVar = y.f19095a;
        Object obj2 = this.f7961s;
        switch (i10) {
            case 0:
                ((AtomicReference) obj2).set((g) obj);
                return yVar;
            default:
                Object objD = ((e0) obj2).f23228r.d((N) obj, cVar);
                return objD == p161p9.a.f21156r ? objD : yVar;
        }
    }

    @Override // p251z9.f
    public final p110k9.e c() {
        switch (this.f7960r) {
            case 0:
                return new C1472a(2, 4, AtomicReference.class, (AtomicReference) this.f7961s, CollectionUtils.SET_TYPE, "set(Ljava/lang/Object;)V");
            default:
                return new p251z9.h(2, (e0) this.f7961s, e0.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f7960r) {
            case 0:
                if ((obj instanceof InterfaceC0416i) && (obj instanceof p251z9.f)) {
                    return c().equals(((p251z9.f) obj).c());
                }
                return false;
            default:
                if ((obj instanceof InterfaceC0416i) && (obj instanceof p251z9.f)) {
                    return c().equals(((p251z9.f) obj).c());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f7960r) {
            case 0:
                break;
        }
        return c().hashCode();
    }
}

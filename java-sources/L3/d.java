package L3;

import j$.time.LocalTime;
import java.util.Iterator;
import java.util.List;
import k3.h;
import p110k9.y;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e f5498r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Iterator f5499s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5500t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f5501u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f5502v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f5503w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, p150o9.c cVar) {
        super(2, cVar);
        this.f5503w = eVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        d dVar = new d(this.f5503w, cVar);
        dVar.f5502v = obj;
        return dVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((List) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        e eVar;
        Iterator it;
        List list = (List) this.f5502v;
        int i11 = this.f5501u;
        if (i11 == 0) {
            p110k9.a.e(obj);
            Iterator it2 = list.iterator();
            i10 = 0;
            eVar = this.f5503w;
            it = it2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f5500t;
            it = this.f5499s;
            eVar = this.f5498r;
            p110k9.a.e(obj);
        }
        while (it.hasNext()) {
            k3.b bVar = (k3.b) it.next();
            h hVar = bVar.f18966a;
            if (hVar instanceof k3.f) {
                p208v3.c cVar = eVar.f5504a;
                k3.a aVar = ((k3.f) hVar).f18973a;
                boolean z10 = bVar.f18968c;
                LocalTime localTime = bVar.f18967b;
                this.f5502v = null;
                this.f5498r = eVar;
                this.f5499s = it;
                this.f5500t = i10;
                this.f5501u = 1;
                Object objA = cVar.a(aVar, z10, localTime, this);
                p161p9.a aVar2 = p161p9.a.f21156r;
                if (objA == aVar2) {
                    return aVar2;
                }
            }
        }
        return y.f19095a;
    }
}

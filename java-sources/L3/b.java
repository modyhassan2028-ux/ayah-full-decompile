package L3;

import N9.InterfaceC0416i;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0416i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0416i f5493r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f5494s;

    public b(InterfaceC0416i interfaceC0416i, e eVar) {
        this.f5493r = interfaceC0416i;
        this.f5494s = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // N9.InterfaceC0416i
    public final Object b(Object obj, p150o9.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i10 = aVar.f5491s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f5491s = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object obj2 = aVar.f5490r;
        int i11 = aVar.f5491s;
        if (i11 == 0) {
            p110k9.a.e(obj2);
            if (!this.f5494s.f5506c.canScheduleExactAlarms()) {
                aVar.f5491s = 1;
                Object objB = this.f5493r.b(obj, aVar);
                p161p9.a aVar2 = p161p9.a.f21156r;
                if (objB == aVar2) {
                    return aVar2;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj2);
        }
        return y.f19095a;
    }
}

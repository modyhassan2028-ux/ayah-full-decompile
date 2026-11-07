package P5;

import p110k9.y;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6700r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f6701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f6702t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f6700r = i10;
        this.f6702t = gVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f6700r) {
            case 0:
                f fVar = new f(this.f6702t, cVar, 0);
                fVar.f6701s = obj;
                return fVar;
            default:
                f fVar2 = new f(this.f6702t, cVar, 1);
                fVar2.f6701s = obj;
                return fVar2;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        i6.g gVar = (i6.g) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f6700r) {
            case 0:
                f fVar = (f) create(gVar, cVar);
                y yVar = y.f19095a;
                fVar.invokeSuspend(yVar);
                return yVar;
            default:
                f fVar2 = (f) create(gVar, cVar);
                y yVar2 = y.f19095a;
                fVar2.invokeSuspend(yVar2);
                return yVar2;
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6700r) {
            case 0:
                i6.g gVar = (i6.g) this.f6701s;
                p110k9.a.e(obj);
                g.a(this.f6702t, ((p155p3.b) gVar.b()).f20981b, ((p155p3.b) gVar.b()).f20982c, gVar);
                break;
            default:
                i6.g gVar2 = (i6.g) this.f6701s;
                p110k9.a.e(obj);
                g.a(this.f6702t, ((p155p3.b) gVar2.b()).f20981b, ((p155p3.b) gVar2.b()).f20982c, gVar2);
                break;
        }
        return y.f19095a;
    }
}

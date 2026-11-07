package L2;

import H2.o;
import p110k9.y;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5444r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5445s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f5446t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, p150o9.c cVar, p241y9.c cVar2) {
        super(2, cVar);
        this.f5444r = i10;
        this.f5446t = cVar2;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f5444r) {
            case 0:
                a aVar = new a(0, cVar, this.f5446t);
                aVar.f5445s = obj;
                return aVar;
            case 1:
                a aVar2 = new a(1, cVar, this.f5446t);
                aVar2.f5445s = obj;
                return aVar2;
            default:
                a aVar3 = new a(this.f5446t, cVar);
                aVar3.f5445s = obj;
                return aVar3;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5444r) {
            case 0:
                return ((a) create((o) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            case 1:
                return ((a) create((o) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            default:
                a aVar = (a) create((X1.b) obj, (p150o9.c) obj2);
                y yVar = y.f19095a;
                aVar.invokeSuspend(yVar);
                return yVar;
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f5444r;
        p241y9.c cVar = this.f5446t;
        switch (i10) {
            case 0:
                p110k9.a.e(obj);
                o oVar = (o) this.f5445s;
                j.c(oVar, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return cVar.e(oVar.c());
            case 1:
                p110k9.a.e(obj);
                o oVar2 = (o) this.f5445s;
                j.c(oVar2, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return cVar.e(oVar2.c());
            default:
                p110k9.a.e(obj);
                cVar.e((X1.b) this.f5445s);
                return y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p241y9.c cVar, p150o9.c cVar2) {
        super(2, cVar2);
        this.f5444r = 2;
        this.f5446t = cVar;
    }
}

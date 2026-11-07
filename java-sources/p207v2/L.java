package p207v2;

import p110k9.y;
import p223x.C1411c;
import p241y9.a;
import p241y9.c;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class L extends i implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23158r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f23159s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(Object obj, p150o9.c cVar, int i10) {
        super(1, cVar);
        this.f23158r = i10;
        this.f23159s = obj;
    }

    @Override // q9.a
    public final p150o9.c create(p150o9.c cVar) {
        switch (this.f23158r) {
            case 0:
                return new L((a) this.f23159s, cVar, 0);
            default:
                return new L((C1411c) this.f23159s, cVar, 1);
        }
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        p150o9.c cVar = (p150o9.c) obj;
        switch (this.f23158r) {
            case 0:
                return ((L) create(cVar)).invokeSuspend(y.f19095a);
            default:
                L l10 = (L) create(cVar);
                y yVar = y.f19095a;
                l10.invokeSuspend(yVar);
                return yVar;
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f23158r;
        Object obj2 = this.f23159s;
        switch (i10) {
            case 0:
                p110k9.a.e(obj);
                return ((a) obj2).invoke();
            default:
                p110k9.a.e(obj);
                C1411c.b((C1411c) obj2);
                return y.f19095a;
        }
    }
}

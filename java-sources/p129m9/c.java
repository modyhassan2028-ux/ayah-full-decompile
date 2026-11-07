package p129m9;

import A9.a;
import I1.F;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends F implements Iterator, a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f19701v;

    public c(e eVar, int i10) {
        this.f19701v = i10;
        j.e(eVar, "map");
        this.f3680u = eVar;
        this.f3678s = -1;
        this.f3679t = eVar.f19717y;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f19701v) {
            case 0:
                b();
                int i10 = this.f3677r;
                e eVar = (e) this.f3680u;
                if (i10 >= eVar.f19715w) {
                    throw new NoSuchElementException();
                }
                this.f3677r = i10 + 1;
                this.f3678s = i10;
                d dVar = new d(eVar, i10);
                e();
                return dVar;
            case 1:
                b();
                int i11 = this.f3677r;
                e eVar2 = (e) this.f3680u;
                if (i11 >= eVar2.f19715w) {
                    throw new NoSuchElementException();
                }
                this.f3677r = i11 + 1;
                this.f3678s = i11;
                Object obj = eVar2.f19710r[i11];
                e();
                return obj;
            default:
                b();
                int i12 = this.f3677r;
                e eVar3 = (e) this.f3680u;
                if (i12 >= eVar3.f19715w) {
                    throw new NoSuchElementException();
                }
                this.f3677r = i12 + 1;
                this.f3678s = i12;
                Object[] objArr = eVar3.f19711s;
                j.b(objArr);
                Object obj2 = objArr[this.f3678s];
                e();
                return obj2;
        }
    }
}

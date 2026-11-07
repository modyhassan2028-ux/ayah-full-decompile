package p187t0;

import B0.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f22552r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f22553s;

    public /* synthetic */ m(q qVar, int i10) {
        this.f22552r = i10;
        this.f22553s = qVar;
    }

    @Override // p187t0.i
    public final double b(double d5) {
        switch (this.f22552r) {
            case 0:
                q qVar = this.f22553s;
                return c.j(qVar.f22566k.b(d5), qVar.f22562e, qVar.f22563f);
            default:
                q qVar2 = this.f22553s;
                return qVar2.f22569n.b(c.j(d5, qVar2.f22562e, qVar2.f22563f));
        }
    }
}

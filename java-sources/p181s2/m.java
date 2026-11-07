package p181s2;

import Z.C0698o;
import p074h0.d;
import p085i0.c;
import p110k9.y;
import p173r2.j;
import p173r2.v;
import p214w.C1395h;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final class m implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f22080r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f22081s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f22082t;

    public /* synthetic */ m(int i10, Object obj, Object obj2) {
        this.f22080r = i10;
        this.f22081s = obj;
        this.f22082t = obj2;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22080r) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0698o.x()) {
                    c0698o.N();
                } else {
                    ((p) this.f22081s).f22089x.d((j) this.f22082t, c0698o, 0);
                }
                break;
            case 1:
                C0698o c0698o2 = (C0698o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0698o2.x()) {
                    c0698o2.N();
                } else {
                    r.b((c) this.f22081s, (d) this.f22082t, c0698o2, 0);
                }
                break;
            default:
                C0698o c0698o3 = (C0698o) obj;
                int iIntValue = ((Number) obj2).intValue();
                j jVar = (j) this.f22082t;
                if ((iIntValue & 3) == 2 && c0698o3.x()) {
                    c0698o3.N();
                } else {
                    v vVar = jVar.f21442s;
                    p251z9.j.c(vVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                    ((h) vVar).f22071w.i((C1395h) this.f22081s, jVar, c0698o3, 0);
                }
                break;
        }
        return y.f19095a;
    }

    public m(j jVar, C1395h c1395h) {
        this.f22080r = 2;
        this.f22082t = jVar;
        this.f22081s = c1395h;
    }
}

package Z;

/* JADX INFO: loaded from: classes.dex */
public final class S implements p150o9.g, F0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ S f10639s = new S(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final S f10640t = new S(1);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final S f10641u = new S(2);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final S f10642v = new S(3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final S f10643w = new S(4);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10644r;

    public /* synthetic */ S(int i10) {
        this.f10644r = i10;
    }

    public static final void b(S s10) {
        N9.k0 k0Var;
        p021c0.b bVar;
        p054f0.b bVar2;
        N9.k0 k0Var2 = s0.f10786x;
        do {
            k0Var = s0.f10786x;
            bVar = (p021c0.b) k0Var.getValue();
            bVar2 = (p054f0.b) bVar;
            p042e0.c cVarA = bVar2.f15893t;
            p054f0.a aVar = (p054f0.a) cVarA.get(s10);
            if (aVar != null) {
                Object obj = aVar.f15888a;
                Object obj2 = aVar.f15889b;
                p042e0.m mVar = cVarA.f15717r;
                p042e0.m mVarV = mVar.v(s10 != null ? s10.hashCode() : 0, 0, s10);
                if (mVar != mVarV) {
                    cVarA = mVarV == null ? p042e0.c.f15716t : new p042e0.c(mVarV, cVarA.f15718s - 1);
                }
                p062g0.b bVar3 = p062g0.b.f16245a;
                if (obj != bVar3) {
                    Object obj3 = cVarA.get(obj);
                    p251z9.j.b(obj3);
                    cVarA = cVarA.a(obj, new p054f0.a(((p054f0.a) obj3).f15888a, obj2));
                }
                if (obj2 != bVar3) {
                    Object obj4 = cVarA.get(obj2);
                    p251z9.j.b(obj4);
                    cVarA = cVarA.a(obj2, new p054f0.a(obj, ((p054f0.a) obj4).f15889b));
                }
                Object obj5 = obj != bVar3 ? bVar2.f15891r : obj2;
                if (obj2 != bVar3) {
                    obj = bVar2.f15892s;
                }
                bVar2 = new p054f0.b(obj5, obj, cVarA);
            }
            if (bVar == bVar2) {
                return;
            }
        } while (!k0Var.l(bVar, bVar2));
    }

    @Override // Z.F0
    public boolean a(Object obj, Object obj2) {
        switch (this.f10644r) {
            case 1:
                return false;
            case 2:
                return obj == obj2;
            default:
                return p251z9.j.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f10644r) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            case 5:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case 6:
                return "Empty";
        }
    }
}

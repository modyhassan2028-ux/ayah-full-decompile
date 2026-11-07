package Ga;

/* JADX INFO: loaded from: classes.dex */
public final class y extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final y f3103s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final y f3104t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3105r;

    static {
        int i10 = 2;
        f3103s = new y(i10, 0);
        f3104t = new y(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i10, int i11) {
        super(i10);
        this.f3105r = i11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3105r) {
            case 0:
                p171r0.e eVar = (p171r0.e) obj;
                p171r0.e eVar2 = (p171r0.e) obj2;
                p251z9.j.e(eVar, "draggingItem");
                p251z9.j.e(eVar2, "item");
                float f3 = eVar.f21390b;
                float f7 = eVar.f21392d;
                float fE = p171r0.c.e(eVar2.b());
                return Boolean.valueOf(fE >= f3 && fE < f7);
            default:
                p171r0.e eVar3 = (p171r0.e) obj;
                p171r0.e eVar4 = (p171r0.e) obj2;
                p251z9.j.e(eVar3, "draggingItem");
                p251z9.j.e(eVar4, "item");
                float f10 = eVar3.f21389a;
                float f11 = eVar3.f21391c;
                float fD = p171r0.c.d(eVar4.b());
                return Boolean.valueOf(fD >= f10 && fD < f11);
        }
    }
}

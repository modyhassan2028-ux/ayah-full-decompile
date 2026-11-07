package W;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class O extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final O f8731A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final O f8732s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final O f8733t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final O f8734u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final O f8735v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final O f8736w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final O f8737x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final O f8738y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final O f8739z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8740r;

    static {
        int i10 = 1;
        f8732s = new O(i10, 0);
        f8733t = new O(i10, 1);
        f8734u = new O(i10, 2);
        f8735v = new O(i10, 3);
        f8736w = new O(i10, 4);
        f8737x = new O(i10, 5);
        f8738y = new O(i10, 6);
        f8739z = new O(i10, 7);
        f8731A = new O(i10, 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(int i10, int i11) {
        super(i10);
        this.f8740r = i11;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        int i10 = this.f8740r;
        p110k9.y yVar = p110k9.y.f19095a;
        switch (i10) {
            case 0:
                return Boolean.TRUE;
            case 1:
                R0.u.e((R0.j) obj, 0);
                return yVar;
            case 2:
                return yVar;
            case 3:
                F9.f[] fVarArr = R0.u.f7181a;
                R0.v vVar = R0.s.f7165l;
                F9.f fVar = R0.u.f7181a[5];
                vVar.a((R0.j) obj, Boolean.TRUE);
                return yVar;
            case 4:
                return yVar;
            case 5:
                F9.f[] fVarArr2 = R0.u.f7181a;
                ((R0.j) obj).e(R0.s.f7160e, yVar);
                return yVar;
            case 6:
                return yVar;
            case 7:
                R0.u.g((R0.j) obj);
                return yVar;
            case 8:
                List list = (List) obj;
                Object obj2 = list.get(0);
                p251z9.j.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                p251z9.j.c(obj3, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((Integer) obj3).intValue();
                Object obj4 = list.get(2);
                p251z9.j.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                return new D2(iIntValue, iIntValue2, ((Boolean) obj4).booleanValue());
            case 9:
                R0.j jVar = (R0.j) obj;
                F9.f[] fVarArr3 = R0.u.f7181a;
                R0.v vVar2 = R0.s.j;
                F9.f fVar2 = R0.u.f7181a[3];
                vVar2.a(jVar, new R0.e());
                jVar.e(R0.i.f7102u, new R0.a(null, new C0564h0(0, 14)));
                return yVar;
            default:
                ((C0612x0) obj).getClass();
                return true;
        }
    }
}

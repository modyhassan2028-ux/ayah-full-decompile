package p200u5;

import Z.C0672b;
import Z.C0698o;
import Z.X;
import l0.r;
import p074h0.d;
import p110k9.y;
import p180s0.J;
import p223x.I;
import p232y.j0;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ d f22939A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f22940r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f22941s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ I f22942t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ X f22943u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j0 f22944v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ J f22945w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f22946x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f22947y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f22948z;

    public /* synthetic */ a(r rVar, I i10, X x9, j0 j0Var, J j, long j10, float f3, float f7, d dVar) {
        this.f22941s = rVar;
        this.f22942t = i10;
        this.f22943u = x9;
        this.f22944v = j0Var;
        this.f22945w = j;
        this.f22946x = j10;
        this.f22947y = f3;
        this.f22948z = f7;
        this.f22939A = dVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22940r) {
            case 0:
                ((Integer) obj2).getClass();
                b.a(this.f22941s, this.f22942t, this.f22943u, this.f22944v, this.f22945w, this.f22946x, this.f22947y, this.f22948z, this.f22939A, (C0698o) obj, C0672b.y(385));
                break;
            default:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b.a(this.f22941s, this.f22942t, this.f22943u, this.f22944v, this.f22945w, this.f22946x, this.f22947y, this.f22948z, this.f22939A, c0698o, 384);
                } else {
                    c0698o.N();
                }
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ a(r rVar, I i10, X x9, j0 j0Var, J j, long j10, float f3, float f7, d dVar, int i11) {
        this.f22941s = rVar;
        this.f22942t = i10;
        this.f22943u = x9;
        this.f22944v = j0Var;
        this.f22945w = j;
        this.f22946x = j10;
        this.f22947y = f3;
        this.f22948z = f7;
        this.f22939A = dVar;
    }
}

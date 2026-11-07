package K;

import U0.C0515g;
import Z.C0672b;
import Z.C0698o;
import java.util.Map;

/* JADX INFO: renamed from: K.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0322p extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Map f4739A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f4740B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4741r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0515g f4742s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0.r f4743t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ U0.L f4744u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f4745v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f4746w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f4747x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f4748y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f4749z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0322p(C0515g c0515g, l0.r rVar, U0.L l10, p241y9.c cVar, int i10, boolean z10, int i11, int i12, Map map, int i13, int i14) {
        super(2);
        this.f4741r = i14;
        this.f4742s = c0515g;
        this.f4743t = rVar;
        this.f4744u = l10;
        this.f4745v = cVar;
        this.f4746w = i10;
        this.f4747x = z10;
        this.f4748y = i11;
        this.f4749z = i12;
        this.f4739A = map;
        this.f4740B = i13;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4741r) {
            case 0:
                ((Number) obj2).intValue();
                T.a(this.f4742s, this.f4743t, this.f4744u, this.f4745v, this.f4746w, this.f4747x, this.f4748y, this.f4749z, this.f4739A, (C0698o) obj, C0672b.y(this.f4740B | 1));
                break;
            default:
                ((Number) obj2).intValue();
                T.b(this.f4742s, this.f4743t, this.f4744u, this.f4745v, this.f4746w, this.f4747x, this.f4748y, this.f4749z, this.f4739A, (C0698o) obj, C0672b.y(this.f4740B | 1));
                break;
        }
        return p110k9.y.f19095a;
    }
}

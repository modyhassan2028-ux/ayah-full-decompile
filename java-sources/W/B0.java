package W;

import Z.C0672b;
import Z.C0698o;
import p224x0.C1442f;

/* JADX INFO: loaded from: classes.dex */
public final class B0 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8464r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f8465s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0.r f8466t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f8467u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f8468v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8469w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f8470x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B0(Object obj, String str, l0.r rVar, long j, int i10, int i11, int i12) {
        super(2);
        this.f8464r = i12;
        this.f8470x = obj;
        this.f8465s = str;
        this.f8466t = rVar;
        this.f8467u = j;
        this.f8468v = i10;
        this.f8469w = i11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8464r) {
            case 0:
                ((Number) obj2).intValue();
                C1442f c1442f = (C1442f) this.f8470x;
                C0.b(c1442f, this.f8465s, this.f8466t, this.f8467u, (C0698o) obj, C0672b.y(this.f8468v | 1), this.f8469w);
                break;
            default:
                ((Number) obj2).intValue();
                p215w0.b bVar = (p215w0.b) this.f8470x;
                C0.a(bVar, this.f8465s, this.f8466t, this.f8467u, (C0698o) obj, C0672b.y(this.f8468v | 1), this.f8469w);
                break;
        }
        return p110k9.y.f19095a;
    }
}

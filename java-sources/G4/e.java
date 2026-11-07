package G4;

import Z.C0672b;
import Z.C0698o;
import java.text.NumberFormat;
import l0.r;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2809r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f2810s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f2811t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2812u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2813v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2814w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2815x;

    public /* synthetic */ e(E4.a aVar, p241y9.c cVar, p241y9.a aVar2, p241y9.c cVar2, r rVar, int i10) {
        this.f2813v = aVar;
        this.f2810s = cVar;
        this.f2814w = aVar2;
        this.f2811t = cVar2;
        this.f2815x = rVar;
        this.f2812u = i10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2809r) {
            case 0:
                ((Integer) obj2).getClass();
                n.b((E4.a) this.f2813v, this.f2810s, (p241y9.a) this.f2814w, this.f2811t, (r) this.f2815x, (C0698o) obj, C0672b.y(this.f2812u | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                X4.a.d((p095j3.a) this.f2813v, (T4.b) this.f2814w, this.f2810s, this.f2811t, (NumberFormat) this.f2815x, (C0698o) obj, C0672b.y(this.f2812u | 1));
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ e(p095j3.a aVar, T4.b bVar, p241y9.c cVar, p241y9.c cVar2, NumberFormat numberFormat, int i10) {
        this.f2813v = aVar;
        this.f2814w = bVar;
        this.f2810s = cVar;
        this.f2811t = cVar2;
        this.f2815x = numberFormat;
        this.f2812u = i10;
    }
}

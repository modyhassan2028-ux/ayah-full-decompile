package G4;

import Z.C0672b;
import Z.C0698o;
import j$.time.LocalTime;
import j$.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import l0.r;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2844r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f2845s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f2846t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2847u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2848v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2849w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2850x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f2851y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f2852z;

    public /* synthetic */ l(E4.a aVar, p241y9.c cVar, p241y9.a aVar2, r rVar, boolean z10, NumberFormat numberFormat, int i10, int i11) {
        this.f2848v = aVar;
        this.f2849w = cVar;
        this.f2850x = aVar2;
        this.f2851y = rVar;
        this.f2845s = z10;
        this.f2852z = numberFormat;
        this.f2846t = i10;
        this.f2847u = i11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2844r) {
            case 0:
                ((Integer) obj2).getClass();
                n.c((E4.a) this.f2848v, (p241y9.c) this.f2849w, (p241y9.a) this.f2850x, (r) this.f2851y, this.f2845s, (NumberFormat) this.f2852z, (C0698o) obj, C0672b.y(this.f2846t | 1), this.f2847u);
                break;
            default:
                ((Integer) obj2).getClass();
                p015b4.f.k((LocalTime) this.f2848v, this.f2845s, this.f2846t, (k3.j) this.f2849w, (k3.h) this.f2850x, (p241y9.f) this.f2851y, (DateTimeFormatter) this.f2852z, (C0698o) obj, C0672b.y(this.f2847u | 1));
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ l(LocalTime localTime, boolean z10, int i10, k3.j jVar, k3.h hVar, p241y9.f fVar, DateTimeFormatter dateTimeFormatter, int i11) {
        this.f2848v = localTime;
        this.f2845s = z10;
        this.f2846t = i10;
        this.f2849w = jVar;
        this.f2850x = hVar;
        this.f2851y = fVar;
        this.f2852z = dateTimeFormatter;
        this.f2847u = i11;
    }
}

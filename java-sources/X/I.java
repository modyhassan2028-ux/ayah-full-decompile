package X;

import Z.C0672b;
import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public final class I extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f9691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ U0.L f9692s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p241y9.e f9693t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9694u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(long j, U0.L l10, p241y9.e eVar, int i10) {
        super(2);
        this.f9691r = j;
        this.f9692s = l10;
        this.f9693t = eVar;
        this.f9694u = i10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        t.b(this.f9691r, this.f9692s, this.f9693t, (C0698o) obj, C0672b.y(this.f9694u | 1));
        return p110k9.y.f19095a;
    }
}

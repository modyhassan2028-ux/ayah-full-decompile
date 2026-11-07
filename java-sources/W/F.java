package W;

import Z.C0698o;

/* JADX INFO: loaded from: classes.dex */
public final class F extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l0.r f8534r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f8535s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f8536t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p074h0.d f8537u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(l0.r rVar, long j, long j10, p074h0.d dVar) {
        super(2);
        this.f8534r = rVar;
        this.f8535s = j;
        this.f8536t = j10;
        this.f8537u = dVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        C0698o c0698o = (C0698o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0698o.x()) {
            c0698o.N();
        } else {
            C1.a(this.f8534r, null, this.f8535s, this.f8536t, 0.0f, 0.0f, null, this.f8537u, c0698o, 0, 114);
        }
        return p110k9.y.f19095a;
    }
}

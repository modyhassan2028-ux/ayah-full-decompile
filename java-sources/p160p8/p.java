package p160p8;

import p178r8.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21109r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f21110s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f21111t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f21112u;

    public /* synthetic */ p(r rVar, long j, String str, int i10) {
        this.f21109r = i10;
        this.f21110s = rVar;
        this.f21111t = j;
        this.f21112u = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21109r) {
            case 0:
                r rVar = this.f21110s;
                rVar.f21126o.f21346b.a(new p(rVar, this.f21111t, this.f21112u, 1));
                break;
            default:
                m mVar = this.f21110s.g;
                t tVar = mVar.f21100n;
                if (tVar == null || !tVar.f21137e.get()) {
                    ((d) mVar.f21096i.f21616s).m(this.f21111t, this.f21112u);
                }
                break;
        }
    }
}

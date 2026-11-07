package p013b2;

import java.nio.ByteBuffer;
import p023c2.a;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13176a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f13177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f13178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u f13179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13181f;

    public r(u uVar) {
        this.f13177b = uVar;
        this.f13178c = uVar;
    }

    public final void a() {
        this.f13176a = 1;
        this.f13178c = this.f13177b;
        this.f13181f = 0;
    }

    public final boolean b() {
        a aVarB = this.f13178c.f13191b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarB.f3680u).get(iA + aVarB.f3677r) == 0) || this.f13180e == 65039;
    }
}

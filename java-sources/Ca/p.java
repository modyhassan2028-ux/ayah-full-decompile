package Ca;

/* JADX INFO: loaded from: classes.dex */
public final class p extends Da.l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f839s;

    @Override // Da.y
    public final long o(long j, Da.h hVar) {
        p251z9.j.e(hVar, "sink");
        long jO = this.f1367r.o(8192L, hVar);
        if (jO == -1) {
            return -1L;
        }
        this.f839s += jO;
        return jO;
    }
}

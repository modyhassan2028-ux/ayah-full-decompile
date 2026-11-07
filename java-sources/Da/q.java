package Da;

/* JADX INFO: loaded from: classes.dex */
public final class q implements y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f1380r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h f1381s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public u f1382t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1383u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1384v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f1385w;

    public q(j jVar) {
        this.f1380r = jVar;
        h hVarA = jVar.a();
        this.f1381s = hVarA;
        u uVar = hVarA.f1361r;
        this.f1382t = uVar;
        this.f1383u = uVar != null ? uVar.f1396b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1384v = true;
    }

    @Override // Da.y
    public final A d() {
        return this.f1380r.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r9 == r0.f1396b) goto L13;
     */
    @Override // Da.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long o(long r9, Da.h r11) {
        /*
            r8 = this;
            java.lang.String r9 = "sink"
            p251z9.j.e(r11, r9)
            boolean r9 = r8.f1384v
            if (r9 != 0) goto L5c
            Da.u r9 = r8.f1382t
            Da.h r10 = r8.f1381s
            if (r9 == 0) goto L25
            Da.u r0 = r10.f1361r
            if (r9 != r0) goto L1d
            int r9 = r8.f1383u
            p251z9.j.b(r0)
            int r0 = r0.f1396b
            if (r9 != r0) goto L1d
            goto L25
        L1d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L25:
            long r0 = r8.f1385w
            r2 = 1
            long r0 = r0 + r2
            Da.j r9 = r8.f1380r
            boolean r9 = r9.request(r0)
            if (r9 != 0) goto L35
            r9 = -1
            return r9
        L35:
            Da.u r9 = r8.f1382t
            if (r9 != 0) goto L43
            Da.u r9 = r10.f1361r
            if (r9 == 0) goto L43
            r8.f1382t = r9
            int r9 = r9.f1396b
            r8.f1383u = r9
        L43:
            long r9 = r10.f1362s
            long r0 = r8.f1385w
            long r9 = r9 - r0
            r0 = 8192(0x2000, double:4.0474E-320)
            long r6 = java.lang.Math.min(r0, r9)
            Da.h r2 = r8.f1381s
            long r4 = r8.f1385w
            r3 = r11
            r2.b(r3, r4, r6)
            long r9 = r8.f1385w
            long r9 = r9 + r6
            r8.f1385w = r9
            return r6
        L5c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Da.q.o(long, Da.h):long");
    }
}

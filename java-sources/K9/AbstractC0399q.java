package K9;

/* JADX INFO: renamed from: K9.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0399q extends p150o9.a implements p150o9.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0398p f5389s = new C0398p(p150o9.d.f20379r, new G9.m(1));

    public AbstractC0399q() {
        super(p150o9.d.f20379r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (((p150o9.f) r3.f5387r.e(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (p150o9.d.f20379r == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        return p150o9.i.f20380r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return r2;
     */
    @Override // p150o9.a, p150o9.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p150o9.h A(p150o9.g r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            p251z9.j.e(r3, r0)
            boolean r0 = r3 instanceof K9.C0398p
            if (r0 == 0) goto L20
            K9.p r3 = (K9.C0398p) r3
            o9.g r0 = r2.f20376r
            if (r0 == r3) goto L15
            o9.g r1 = r3.f5388s
            if (r1 != r0) goto L14
            goto L15
        L14:
            return r2
        L15:
            y9.c r3 = r3.f5387r
            java.lang.Object r3 = r3.e(r2)
            o9.f r3 = (p150o9.f) r3
            if (r3 == 0) goto L27
            goto L24
        L20:
            o9.d r0 = p150o9.d.f20379r
            if (r0 != r3) goto L27
        L24:
            o9.i r3 = p150o9.i.f20380r
            return r3
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: K9.AbstractC0399q.A(o9.g):o9.h");
    }

    public abstract void c0(p150o9.h hVar, Runnable runnable);

    public void d0(p150o9.h hVar, Runnable runnable) {
        P9.b.i(this, hVar, runnable);
    }

    public boolean e0(p150o9.h hVar) {
        return !(this instanceof u0);
    }

    public AbstractC0399q f0(int i10) {
        P9.b.a(i10);
        return new P9.h(this, i10);
    }

    @Override // p150o9.a, p150o9.h
    public final p150o9.f i(p150o9.g gVar) {
        p150o9.f fVar;
        p251z9.j.e(gVar, "key");
        if (!(gVar instanceof C0398p)) {
            if (p150o9.d.f20379r == gVar) {
                return this;
            }
            return null;
        }
        C0398p c0398p = (C0398p) gVar;
        p150o9.g gVar2 = this.f20376r;
        if ((gVar2 == c0398p || c0398p.f5388s == gVar2) && (fVar = (p150o9.f) c0398p.f5387r.e(this)) != null) {
            return fVar;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0405x.p(this);
    }
}

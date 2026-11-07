package Z;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements Iterable, A9.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public HashMap f10852A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public u.t f10853B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10855s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10857u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10858v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10860x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10861y;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int[] f10854r = new int[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object[] f10856t = new Object[0];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f10859w = new Object();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList f10862z = new ArrayList();

    public final int b(C0670a c0670a) {
        if (this.f10860x) {
            AbstractC0700p.c("Use active SlotWriter to determine anchor location instead");
        }
        if (!c0670a.a()) {
            AbstractC0689j0.a("Anchor refers to a group that was removed");
        }
        return c0670a.f10648a;
    }

    public final void c() {
        this.f10852A = new HashMap();
    }

    public final w0 d() {
        if (this.f10860x) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f10858v++;
        return new w0(this);
    }

    public final A0 e() {
        if (this.f10860x) {
            AbstractC0700p.c("Cannot start a writer when another writer is pending");
        }
        if (this.f10858v > 0) {
            AbstractC0700p.c("Cannot start a writer when a reader is pending");
        }
        this.f10860x = true;
        this.f10861y++;
        return new A0(this);
    }

    public final boolean f(C0670a c0670a) {
        int iE;
        return c0670a.a() && (iE = z0.e(this.f10862z, c0670a.f10648a, this.f10855s)) >= 0 && p251z9.j.a(this.f10862z.get(iE), c0670a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new J(this, 0, this.f10855s);
    }
}

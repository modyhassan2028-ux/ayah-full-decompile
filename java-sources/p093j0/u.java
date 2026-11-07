package p093j0;

import A.R0;
import A6.a;
import C6.b;
import Z.AbstractC0689j0;
import Z.AbstractC0700p;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p011b0.e;
import p074h0.i;
import p085i0.f;
import p120l9.m;
import p241y9.c;
import p251z9.j;
import p251z9.k;
import p251z9.y;
import u.z;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f18686a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18688c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f18692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t f18693i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f18687b = new AtomicReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R0 f18689d = new R0(18, this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f18690e = new f(1, this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f18691f = new e(new t[16]);
    public final Object g = new Object();
    public long j = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public u(c cVar) {
        this.f18686a = (k) cVar;
    }

    public static final boolean a(u uVar) {
        boolean z10;
        Set set;
        Set set2;
        synchronized (uVar.g) {
            z10 = uVar.f18688c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            AtomicReference atomicReference = uVar.f18687b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        AbstractC0700p.d("Unexpected notification");
                        throw new a();
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                do {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z11;
            }
            synchronized (uVar.g) {
                e eVar = uVar.f18691f;
                Object[] objArr = eVar.f13125r;
                int i10 = eVar.f13127t;
                for (int i11 = 0; i11 < i10; i11++) {
                    z11 = ((t) objArr[i11]).b(set) || z11;
                }
            }
        }
    }

    public final void b() {
        synchronized (this.g) {
            e eVar = this.f18691f;
            Object[] objArr = eVar.f13125r;
            int i10 = eVar.f13127t;
            for (int i11 = 0; i11 < i10; i11++) {
                t tVar = (t) objArr[i11];
                tVar.f18680e.a();
                tVar.f18681f.a();
                tVar.f18684k.a();
                tVar.f18685l.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0073 A[Catch: all -> 0x0093, LOOP:1: B:12:0x002e->B:23:0x0073, LOOP_END, TryCatch #0 {all -> 0x0093, blocks: (B:4:0x0007, B:6:0x000f, B:24:0x007a, B:29:0x0085, B:34:0x0095, B:31:0x008a, B:9:0x0022, B:12:0x002e, B:14:0x0043, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:23:0x0073, B:35:0x009b), top: B:40:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x007a A[EDGE_INSN: B:47:0x007a->B:24:0x007a BREAK  A[LOOP:1: B:12:0x002e->B:23:0x0073], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final void c(Object obj) {
        int i10;
        synchronized (this.g) {
            try {
                e eVar = this.f18691f;
                int i11 = eVar.f13127t;
                int i12 = 0;
                int i13 = 0;
                while (i12 < i11) {
                    t tVar = (t) eVar.f13125r[i12];
                    z zVar = (z) tVar.f18681f.j(obj);
                    if (zVar == null) {
                        i10 = i12;
                    } else {
                        Object[] objArr = zVar.f22785b;
                        int[] iArr = zVar.f22786c;
                        long[] jArr = zVar.f22784a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i14 = 0;
                            while (true) {
                                long j = jArr[i14];
                                i10 = i12;
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                                    for (int i16 = 0; i16 < i15; i16++) {
                                        if ((j & 255) < 128) {
                                            int i17 = (i14 << 3) + i16;
                                            Object obj2 = objArr[i17];
                                            int i18 = iArr[i17];
                                            tVar.d(obj, obj2);
                                        }
                                        j >>= 8;
                                    }
                                    if (i15 != 8) {
                                        break;
                                    }
                                    if (i14 != length) {
                                        break;
                                    }
                                    i14++;
                                    i12 = i10;
                                } else if (i14 != length) {
                                    break;
                                    break;
                                } else {
                                    i14++;
                                    i12 = i10;
                                }
                            }
                        } else {
                            i10 = i12;
                        }
                    }
                    if (!(tVar.f18681f.f22673e != 0)) {
                        i13++;
                    } else if (i13 > 0) {
                        Object[] objArr2 = eVar.f13125r;
                        objArr2[i10 - i13] = objArr2[i10];
                    }
                    i12 = i10 + 1;
                }
                int i19 = i11 - i13;
                Arrays.fill(eVar.f13125r, i19, i11, (Object) null);
                eVar.f13127t = i19;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj, c cVar, p241y9.a aVar) {
        Object obj2;
        t tVar;
        synchronized (this.g) {
            e eVar = this.f18691f;
            Object[] objArr = eVar.f13125r;
            int i10 = eVar.f13127t;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i11];
                if (((t) obj2).f18676a == cVar) {
                    break;
                } else {
                    i11++;
                }
            }
            tVar = (t) obj2;
            if (tVar == null) {
                j.c(cVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                y.b(1, cVar);
                tVar = new t(cVar);
                eVar.b(tVar);
            }
        }
        t tVar2 = this.f18693i;
        long j = this.j;
        if (j != -1 && j != p074h0.j.b()) {
            AbstractC0689j0.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + p074h0.j.b() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.f18693i = tVar;
            this.j = p074h0.j.b();
            tVar.a(obj, this.f18690e, aVar);
        } finally {
            this.f18693i = tVar2;
            this.j = j;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final void e() {
        R0 r10 = this.f18689d;
        i iVar = n.f18660a;
        n.f(C1213a.f18623t);
        synchronized (n.f18661b) {
            n.g = m.r0(n.g, r10);
        }
        this.f18692h = new b(17, r10);
    }
}

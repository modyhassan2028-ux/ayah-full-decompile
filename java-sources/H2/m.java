package H2;

import E2.A;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.concurrent.locks.ReentrantLock;
import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p241y9.a f3298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f3299c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g[] f3302f;
    public final S9.h g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A f3303h;

    public m(int i10, p241y9.a aVar) {
        this.f3297a = i10;
        this.f3298b = aVar;
        this.f3302f = new g[i10];
        int i11 = S9.i.f7544a;
        this.g = new S9.h(i10, 0);
        A a9 = new A(6);
        if (i10 < 1) {
            p204v.a.c("capacity must be >= 1");
            throw null;
        }
        if (i10 > 1073741824) {
            p204v.a.c("capacity must be <= 2^30");
            throw null;
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        a9.f1436d = i10 - 1;
        a9.f1437e = new Object[i10];
        this.f3303h = a9;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(q9.c cVar) {
        k kVar;
        m mVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i10 = kVar.f3289u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f3289u = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object obj = kVar.f3287s;
        int i11 = kVar.f3289u;
        if (i11 == 0) {
            p110k9.a.e(obj);
            kVar.f3286r = this;
            kVar.f3289u = 1;
            Object objA = this.g.a(kVar);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objA == aVar) {
                return aVar;
            }
            mVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = kVar.f3286r;
            p110k9.a.e(obj);
        }
        try {
            ReentrantLock reentrantLock = mVar.f3299c;
            A a9 = mVar.f3303h;
            reentrantLock.lock();
            try {
                if (mVar.f3301e) {
                    u0.F(21, "Connection pool is closed");
                    throw null;
                }
                if (a9.f1434b == a9.f1435c && mVar.f3300d < mVar.f3297a) {
                    g gVar = new g((Q2.a) mVar.f3298b.invoke());
                    g[] gVarArr = mVar.f3302f;
                    int i12 = mVar.f3300d;
                    mVar.f3300d = i12 + 1;
                    gVarArr[i12] = gVar;
                    a9.b(gVar);
                }
                int i13 = a9.f1434b;
                if (i13 == a9.f1435c) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                Object[] objArr = (Object[]) a9.f1437e;
                Object obj2 = objArr[i13];
                objArr[i13] = null;
                a9.f1434b = a9.f1436d & (i13 + 1);
                g gVar2 = (g) obj2;
                reentrantLock.unlock();
                return gVar2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            mVar.g.d();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #1 {all -> 0x007e, blocks: (B:20:0x0041, B:22:0x005c, B:28:0x0071, B:29:0x0078), top: B:51:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0069 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071 A[Catch: all -> 0x007e, TRY_ENTER, TryCatch #1 {all -> 0x007e, blocks: (B:20:0x0041, B:22:0x005c, B:28:0x0071, B:29:0x0078), top: B:51:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0089 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:34:0x0085, B:36:0x0089, B:40:0x0091, B:44:0x0098), top: B:49:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0091 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:34:0x0085, B:36:0x0089, B:40:0x0091, B:44:0x0098), top: B:49:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0098 A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #0 {all -> 0x008d, blocks: (B:34:0x0085, B:36:0x0089, B:40:0x0091, B:44:0x0098), top: B:49:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006a -> B:27:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:18:0x0038
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(long r11, H2.d r13, q9.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof H2.l
            if (r0 == 0) goto L13
            r0 = r14
            H2.l r0 = (H2.l) r0
            int r1 = r0.f3296x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3296x = r1
            goto L18
        L13:
            H2.l r0 = new H2.l
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f3294v
            int r1 = r0.f3296x
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            long r11 = r0.f3293u
            z9.v r13 = r0.f3292t
            y9.a r1 = r0.f3291s
            H2.m r4 = r0.f3290r
            p110k9.a.e(r14)     // Catch: java.lang.Throwable -> L2e
            goto L6c
        L2e:
            r14 = move-exception
            goto L80
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            p110k9.a.e(r14)
            r4 = r10
        L3c:
            z9.v r14 = new z9.v
            r14.<init>()
            A.q r1 = new A.q     // Catch: java.lang.Throwable -> L7e
            r5 = 12
            r1.<init>(r14, r4, r3, r5)     // Catch: java.lang.Throwable -> L7e
            r0.f3290r = r4     // Catch: java.lang.Throwable -> L7e
            r0.f3291s = r13     // Catch: java.lang.Throwable -> L7e
            r0.f3292t = r14     // Catch: java.lang.Throwable -> L7e
            r0.f3293u = r11     // Catch: java.lang.Throwable -> L7e
            r0.f3296x = r2     // Catch: java.lang.Throwable -> L7e
            long r5 = K9.AbstractC0405x.F(r11)     // Catch: java.lang.Throwable -> L7e
            r7 = 0
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 <= 0) goto L71
            K9.s0 r7 = new K9.s0     // Catch: java.lang.Throwable -> L7e
            r7.<init>(r5, r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r1 = K9.AbstractC0405x.D(r7, r1)     // Catch: java.lang.Throwable -> L7e
            p9.a r5 = p161p9.a.f21156r
            if (r1 != r5) goto L6a
            return r5
        L6a:
            r1 = r13
            r13 = r14
        L6c:
            r14 = r13
            r13 = r1
            r1 = r0
            r0 = r3
            goto L85
        L71:
            K9.r0 r1 = new K9.r0     // Catch: java.lang.Throwable -> L7e
            java.lang.String r5 = "Timed out immediately"
            r1.<init>(r5, r3)     // Catch: java.lang.Throwable -> L7e
            throw r1     // Catch: java.lang.Throwable -> L7e
        L79:
            r9 = r1
            r1 = r13
            r13 = r14
            r14 = r9
            goto L80
        L7e:
            r1 = move-exception
            goto L79
        L80:
            r9 = r14
            r14 = r13
            r13 = r1
            r1 = r0
            r0 = r9
        L85:
            boolean r5 = r0 instanceof K9.r0     // Catch: java.lang.Throwable -> L8d
            if (r5 == 0) goto L8f
            r13.invoke()     // Catch: java.lang.Throwable -> L8d
            goto L96
        L8d:
            r11 = move-exception
            goto L99
        L8f:
            if (r0 != 0) goto L98
            java.lang.Object r14 = r14.f24886r     // Catch: java.lang.Throwable -> L8d
            if (r14 == 0) goto L96
            return r14
        L96:
            r0 = r1
            goto L3c
        L98:
            throw r0     // Catch: java.lang.Throwable -> L8d
        L99:
            java.lang.Object r12 = r14.f24886r
            H2.g r12 = (H2.g) r12
            if (r12 == 0) goto La2
            r4.e(r12)
        La2:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.m.b(long, H2.d, q9.c):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f3299c;
        reentrantLock.lock();
        try {
            this.f3301e = true;
            for (g gVar : this.f3302f) {
                if (gVar != null) {
                    gVar.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(StringBuilder sb) {
        A a9 = this.f3303h;
        ReentrantLock reentrantLock = this.f3299c;
        reentrantLock.lock();
        try {
            p129m9.b bVar = new p129m9.b(10);
            int i10 = (a9.f1435c - a9.f1434b) & a9.f1436d;
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 >= 0) {
                    int i12 = a9.f1435c;
                    int i13 = a9.f1434b;
                    int i14 = a9.f1436d;
                    if (i11 < ((i12 - i13) & i14)) {
                        Object obj = ((Object[]) a9.f1437e)[(i13 + i11) & i14];
                        p251z9.j.b(obj);
                        bVar.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            p129m9.b bVarO = AbstractC0813f2.o(bVar);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.f3297a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            S9.h hVar = this.g;
            hVar.getClass();
            sb2.append(Math.max(S9.g.f7541x.get(hVar), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + bVarO.b() + ")[" + p120l9.m.l0(bVarO, null, null, null, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            g[] gVarArr = this.f3302f;
            int length = gVarArr.length;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                g gVar = gVarArr[i16];
                i15++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i15);
                sb3.append("] - ");
                sb3.append(gVar != null ? gVar.f3270r.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (gVar != null) {
                    gVar.i(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(g gVar) {
        p251z9.j.e(gVar, "connection");
        ReentrantLock reentrantLock = this.f3299c;
        reentrantLock.lock();
        try {
            this.f3303h.b(gVar);
            reentrantLock.unlock();
            this.g.d();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

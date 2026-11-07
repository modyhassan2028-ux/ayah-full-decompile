package Z;

/* JADX INFO: loaded from: classes.dex */
public final class B extends p093j0.x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f10582h = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u.z f10585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f10586f;
    public int g;

    public B(long j) {
        super(j);
        u.z zVar = u.J.f22695a;
        p251z9.j.c(zVar, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f10585e = zVar;
        this.f10586f = f10582h;
    }

    @Override // p093j0.x
    public final void a(p093j0.x xVar) {
        p251z9.j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        B b5 = (B) xVar;
        this.f10585e = b5.f10585e;
        this.f10586f = b5.f10586f;
        this.g = b5.g;
    }

    @Override // p093j0.x
    public final p093j0.x b(long j) {
        return new B(j);
    }

    public final boolean c(C c10, p093j0.i iVar) {
        boolean z10;
        boolean z11;
        Object obj = p093j0.n.f18661b;
        synchronized (obj) {
            z10 = true;
            z11 = (this.f10583c == iVar.g() && this.f10584d == iVar.h()) ? false : true;
        }
        if (this.f10586f == f10582h || (z11 && this.g != d(c10, iVar))) {
            z10 = false;
        }
        if (!z10 || !z11) {
            return z10;
        }
        synchronized (obj) {
            this.f10583c = iVar.g();
            this.f10584d = iVar.h();
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d7 A[LOOP:4: B:48:0x00d5->B:49:0x00d7, LOOP_END] */
    public final int d(C c10, p093j0.i iVar) throws Throwable {
        u.z zVar;
        int i10;
        Object[] objArr;
        int i11;
        int i12;
        long[] jArr;
        int i13;
        int i14;
        int i15;
        p093j0.x xVarG;
        synchronized (p093j0.n.f18661b) {
            zVar = this.f10585e;
        }
        int i16 = 7;
        if (zVar.f22788e == 0) {
            return 7;
        }
        p011b0.e eVarN = C0672b.n();
        Object[] objArr2 = eVarN.f13125r;
        int i17 = eVarN.f13127t;
        for (int i18 = 0; i18 < i17; i18++) {
            ((C0696n) objArr2[i18]).b();
        }
        try {
            Object[] objArr3 = zVar.f22785b;
            int[] iArr = zVar.f22786c;
            long[] jArr2 = zVar.f22784a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                i10 = 7;
                int i19 = 0;
                while (true) {
                    long j = jArr2[i19];
                    if ((((~j) << i16) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i20 = 8;
                        int i21 = 8 - ((~(i19 - length)) >>> 31);
                        int i22 = 0;
                        while (i22 < i21) {
                            if ((j & 255) < 128) {
                                int i23 = (i19 << 3) + i22;
                                Object obj = objArr3[i23];
                                i14 = i16;
                                int i24 = iArr[i23];
                                i15 = i20;
                                p093j0.v vVar = (p093j0.v) obj;
                                if (i24 == 1) {
                                    if (vVar instanceof C) {
                                        try {
                                            C c11 = (C) vVar;
                                            xVarG = c11.g((B) p093j0.n.j(c11.f10590u, iVar), iVar, false, c11.f10588s);
                                        } catch (Throwable th) {
                                            th = th;
                                            Object[] objArr4 = eVarN.f13125r;
                                            int i25 = eVarN.f13127t;
                                            for (int i26 = 0; i26 < i25; i26++) {
                                                ((C0696n) objArr4[i26]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        xVarG = p093j0.n.j(vVar.b(), iVar);
                                    }
                                    int iIdentityHashCode = ((i10 * 31) + System.identityHashCode(xVarG)) * 31;
                                    long j10 = xVarG.f18695a;
                                    i10 = iIdentityHashCode + ((int) (j10 ^ (j10 >>> 32)));
                                }
                            } else {
                                i14 = i16;
                                i15 = i20;
                            }
                            j >>= i15;
                            i22++;
                            i16 = i14;
                            jArr2 = jArr2;
                            i20 = i15;
                        }
                        jArr = jArr2;
                        i13 = i16;
                        if (i21 != i20) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                        i13 = i16;
                    }
                    if (i19 != length) {
                        i19++;
                        i16 = i13;
                        jArr2 = jArr;
                    } else {
                        i16 = i10;
                    }
                }
                objArr = eVarN.f13125r;
                i11 = eVarN.f13127t;
                for (i12 = 0; i12 < i11; i12++) {
                    ((C0696n) objArr[i12]).a();
                }
                return i10;
            }
            i10 = i16;
            objArr = eVarN.f13125r;
            i11 = eVarN.f13127t;
            while (i12 < i11) {
                ((C0696n) objArr[i12]).a();
            }
            return i10;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}

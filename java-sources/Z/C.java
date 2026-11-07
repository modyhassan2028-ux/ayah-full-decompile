package Z;

/* JADX INFO: loaded from: classes.dex */
public final class C extends p093j0.w implements L0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p241y9.a f10588s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final F0 f10589t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public B f10590u = new B(p093j0.n.k().g());

    public C(p241y9.a aVar, F0 f3) {
        this.f10588s = aVar;
        this.f10589t = f3;
    }

    @Override // p093j0.v
    public final p093j0.x b() {
        return this.f10590u;
    }

    @Override // p093j0.v
    public final void d(p093j0.x xVar) {
        p251z9.j.c(xVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f10590u = (B) xVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009e A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x009e, LOOP_END, TryCatch #0 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x005c, B:20:0x0068, B:22:0x0072, B:24:0x008a, B:26:0x0090, B:30:0x009e, B:31:0x00a3), top: B:84:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x00a3 A[EDGE_INSN: B:92:0x00a3->B:31:0x00a3 BREAK  A[LOOP:1: B:16:0x0049->B:30:0x009e], SYNTHETIC] */
    public final B g(B b5, p093j0.i iVar, boolean z10, p241y9.a aVar) {
        B b10;
        F0 f3;
        int i10;
        if (b5.c(this, iVar)) {
            if (z10) {
                p011b0.e eVarN = C0672b.n();
                Object[] objArr = eVarN.f13125r;
                int i11 = eVarN.f13127t;
                for (int i12 = 0; i12 < i11; i12++) {
                    ((C0696n) objArr[i12]).b();
                }
                try {
                    u.z zVar = b5.f10585e;
                    p074h0.i iVar2 = G0.f10597a;
                    p074h0.e eVar = (p074h0.e) iVar2.n();
                    if (eVar == null) {
                        eVar = new p074h0.e();
                        iVar2.D(eVar);
                    }
                    int i13 = eVar.f16416a;
                    Object[] objArr2 = zVar.f22785b;
                    int[] iArr = zVar.f22786c;
                    long[] jArr = zVar.f22784a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j = jArr[i14];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i14 != length) {
                                    break;
                                    break;
                                }
                                i14++;
                            } else {
                                int i15 = 8;
                                int i16 = 8 - ((~(i14 - length)) >>> 31);
                                int i17 = 0;
                                while (i17 < i16) {
                                    if ((j & 255) < 128) {
                                        int i18 = (i14 << 3) + i17;
                                        i10 = i15;
                                        p093j0.v vVar = (p093j0.v) objArr2[i18];
                                        eVar.f16416a = i13 + iArr[i18];
                                        p241y9.c cVarE = iVar.e();
                                        if (cVarE != null) {
                                            cVarE.e(vVar);
                                        }
                                    } else {
                                        i10 = i15;
                                    }
                                    j >>= i10;
                                    i17++;
                                    i15 = i10;
                                }
                                if (i16 != i15) {
                                    break;
                                }
                                if (i14 != length) {
                                    break;
                                }
                                i14++;
                            }
                        }
                    }
                    eVar.f16416a = i13;
                } finally {
                    Object[] objArr3 = eVarN.f13125r;
                    int i19 = eVarN.f13127t;
                    for (int i20 = 0; i20 < i19; i20++) {
                        ((C0696n) objArr3[i20]).a();
                    }
                }
            }
            return b5;
        }
        u.z zVar2 = new u.z();
        p074h0.i iVar3 = G0.f10597a;
        p074h0.e eVar2 = (p074h0.e) iVar3.n();
        if (eVar2 == null) {
            eVar2 = new p074h0.e();
            iVar3.D(eVar2);
        }
        int i21 = eVar2.f16416a;
        p011b0.e eVarN2 = C0672b.n();
        Object[] objArr4 = eVarN2.f13125r;
        int i22 = eVarN2.f13127t;
        for (int i23 = 0; i23 < i22; i23++) {
            ((C0696n) objArr4[i23]).b();
        }
        try {
            eVar2.f16416a = i21 + 1;
            Object objE = p093j0.s.e(new D.V(this, eVar2, zVar2, i21, 4), aVar);
            eVar2.f16416a = i21;
            Object[] objArr5 = eVarN2.f13125r;
            int i24 = eVarN2.f13127t;
            for (int i25 = 0; i25 < i24; i25++) {
                ((C0696n) objArr5[i25]).a();
            }
            Object obj = p093j0.n.f18661b;
            synchronized (obj) {
                try {
                    p093j0.i iVarK = p093j0.n.k();
                    Object obj2 = b5.f10586f;
                    if (obj2 == B.f10582h || (f3 = this.f10589t) == null || !f3.a(objE, obj2)) {
                        b10 = (B) p093j0.n.n(this.f10590u, this, iVarK);
                        b10.f10585e = zVar2;
                        b10.g = b10.d(this, iVarK);
                        b10.f10586f = objE;
                    } else {
                        b5.f10585e = zVar2;
                        b5.g = b5.d(this, iVarK);
                        b10 = b5;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            p074h0.e eVar3 = (p074h0.e) G0.f10597a.n();
            if (eVar3 == null || eVar3.f16416a != 0) {
                return b10;
            }
            p093j0.n.k().m();
            synchronized (obj) {
                p093j0.i iVarK2 = p093j0.n.k();
                b10.f10583c = iVarK2.g();
                b10.f10584d = iVarK2.h();
            }
            return b10;
        } catch (Throwable th2) {
            Object[] objArr6 = eVarN2.f13125r;
            int i26 = eVarN2.f13127t;
            for (int i27 = 0; i27 < i26; i27++) {
                ((C0696n) objArr6[i27]).a();
            }
            throw th2;
        }
    }

    @Override // Z.L0
    public final Object getValue() {
        p241y9.c cVarE = p093j0.n.k().e();
        if (cVarE != null) {
            cVarE.e(this);
        }
        p093j0.i iVarK = p093j0.n.k();
        return g((B) p093j0.n.j(this.f10590u, iVarK), iVarK, true, this.f10588s).f10586f;
    }

    public final B h() {
        p093j0.i iVarK = p093j0.n.k();
        return g((B) p093j0.n.j(this.f10590u, iVarK), iVarK, false, this.f10588s);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        B b5 = (B) p093j0.n.i(this.f10590u);
        sb.append(b5.c(this, p093j0.n.k()) ? String.valueOf(b5.f10586f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}

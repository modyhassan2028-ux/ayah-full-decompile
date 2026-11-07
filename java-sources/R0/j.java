package R0;

import K0.P;
import java.util.Iterator;
import u.C1352g;
import u.C1362q;
import u.E;
import u.M;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Iterable, A9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final E f7108r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1362q f7109s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7110t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7111u;

    public j() {
        long[] jArr = M.f22699a;
        this.f7108r = new E();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005f A[LOOP:0: B:5:0x0028->B:15:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[EDGE_INSN: B:18:0x0062->B:16:0x0062 BREAK  A[LOOP:0: B:5:0x0028->B:15:0x005f], SYNTHETIC] */
    public final j b() {
        j jVar = new j();
        jVar.f7110t = this.f7110t;
        jVar.f7111u = this.f7111u;
        E e10 = jVar.f7108r;
        e10.getClass();
        E e11 = this.f7108r;
        p251z9.j.e(e11, "from");
        Object[] objArr = e11.f22670b;
        Object[] objArr2 = e11.f22671c;
        long[] jArr = e11.f22669a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            int i13 = (i10 << 3) + i12;
                            e10.l(objArr[i13], objArr2[i13]);
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return jVar;
    }

    public final Object c(v vVar) {
        Object objG = this.f7108r.g(vVar);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + vVar + " - consider getOrElse or getOrNull");
    }

    public final void d(j jVar) {
        E e10 = jVar.f7108r;
        Object[] objArr = e10.f22670b;
        Object[] objArr2 = e10.f22671c;
        long[] jArr = e10.f22669a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Object obj2 = objArr2[i13];
                        v vVar = (v) obj;
                        E e11 = this.f7108r;
                        Object objG = e11.g(vVar);
                        p251z9.j.c(vVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objInvoke = vVar.f7183b.invoke(objG, obj2);
                        if (objInvoke != null) {
                            e11.l(vVar, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void e(v vVar, Object obj) {
        boolean z10 = obj instanceof a;
        E e10 = this.f7108r;
        if (!z10 || !e10.c(vVar)) {
            e10.l(vVar, obj);
            return;
        }
        Object objG = e10.g(vVar);
        p251z9.j.c(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        a aVar = (a) objG;
        a aVar2 = (a) obj;
        String str = aVar2.f7068a;
        if (str == null) {
            str = aVar.f7068a;
        }
        p110k9.e eVar = aVar2.f7069b;
        if (eVar == null) {
            eVar = aVar.f7069b;
        }
        e10.l(vVar, new a(str, eVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p251z9.j.a(this.f7108r, jVar.f7108r) && this.f7110t == jVar.f7110t && this.f7111u == jVar.f7111u;
    }

    public final int hashCode() {
        return (((this.f7108r.hashCode() * 31) + (this.f7110t ? 1231 : 1237)) * 31) + (this.f7111u ? 1231 : 1237);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1362q c1362q = this.f7109s;
        if (c1362q == null) {
            E e10 = this.f7108r;
            e10.getClass();
            C1362q c1362q2 = new C1362q(e10);
            this.f7109s = c1362q2;
            c1362q = c1362q2;
        }
        return ((C1352g) c1362q.entrySet()).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f7110t) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f7111u) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        E e10 = this.f7108r;
        Object[] objArr = e10.f22670b;
        Object[] objArr2 = e10.f22671c;
        long[] jArr = e10.f22669a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            Object obj2 = objArr2[i13];
                            sb.append(str);
                            sb.append(((v) obj).f7182a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return P.s(this) + "{ " + ((Object) sb) + " }";
    }
}

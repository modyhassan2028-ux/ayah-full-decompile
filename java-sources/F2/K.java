package F2;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f2241l = {"INSERT", "UPDATE", "DELETE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f2242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E5.c f2246e;
    public final String[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Ca.r f2248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p248z6.c f2249i;
    public final AtomicBoolean j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p241y9.a f2250k = new Ba.b(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f2247f = new LinkedHashMap();

    public K(u uVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z10, E5.c cVar) {
        String lowerCase;
        this.f2242a = uVar;
        this.f2243b = linkedHashMap;
        this.f2244c = linkedHashMap2;
        this.f2245d = z10;
        this.f2246e = cVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            p251z9.j.d(lowerCase2, "toLowerCase(...)");
            this.f2247f.put(lowerCase2, Integer.valueOf(i10));
            String str2 = (String) this.f2243b.get(strArr[i10]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                p251z9.j.d(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i10] = lowerCase2;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.f2243b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            p251z9.j.d(lowerCase3, "toLowerCase(...)");
            if (this.f2247f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                p251z9.j.d(lowerCase4, "toLowerCase(...)");
                LinkedHashMap linkedHashMap3 = this.f2247f;
                linkedHashMap3.put(lowerCase4, p120l9.w.f0(lowerCase3, linkedHashMap3));
            }
        }
        this.f2248h = new Ca.r(this.g.length);
        this.f2249i = new p248z6.c(this.g.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(K k7, m mVar, q9.c cVar) {
        B b5;
        k7.getClass();
        if (cVar instanceof B) {
            b5 = (B) cVar;
            int i10 = b5.f2189u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                b5.f2189u = i10 - Integer.MIN_VALUE;
            } else {
                b5 = new B(k7, cVar);
            }
        } else {
            b5 = new B(k7, cVar);
        }
        Object objD = b5.f2187s;
        int i11 = b5.f2189u;
        p161p9.a aVar = p161p9.a.f21156r;
        if (i11 == 0) {
            p110k9.a.e(objD);
            A3.d dVar = new A3.d(26);
            b5.f2186r = mVar;
            b5.f2189u = 1;
            objD = mVar.d("SELECT * FROM room_table_modification_log WHERE invalidated = 1", dVar, b5);
            if (objD != aVar) {
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Set set = (Set) b5.f2186r;
            p110k9.a.e(objD);
            return set;
        }
        mVar = (m) b5.f2186r;
        p110k9.a.e(objD);
        Set set2 = (Set) objD;
        if (!set2.isEmpty()) {
            b5.f2186r = set2;
            b5.f2189u = 2;
            if (A3.f.c(mVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", b5) == aVar) {
                return aVar;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object b(K k7, q9.c cVar) throws Throwable {
        E e10;
        M.k kVar;
        Object objK;
        Throwable th;
        M.k kVar2;
        u uVar = k7.f2242a;
        if (cVar instanceof E) {
            e10 = (E) cVar;
            int i10 = e10.f2204v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                e10.f2204v = i10 - Integer.MIN_VALUE;
            } else {
                e10 = new E(k7, cVar);
            }
        } else {
            e10 = new E(k7, cVar);
        }
        Object obj = e10.f2202t;
        int i11 = e10.f2204v;
        if (i11 == 0) {
            p110k9.a.e(obj);
            kVar = uVar.g;
            boolean zH = kVar.h();
            p120l9.t tVar = p120l9.t.f19442r;
            if (!zH) {
                return tVar;
            }
            try {
                if (!k7.j.compareAndSet(true, false)) {
                    kVar.K();
                    return tVar;
                }
                if (!((Boolean) k7.f2250k.invoke()).booleanValue()) {
                    kVar.K();
                    return tVar;
                }
                F f3 = new F(k7, null, 1);
                e10.f2200r = k7;
                e10.f2201s = kVar;
                e10.f2204v = 1;
                objK = uVar.k(false, f3, e10);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objK == aVar) {
                    return aVar;
                }
            } catch (Throwable th2) {
                M.k kVar3 = kVar;
                th = th2;
                kVar2 = kVar3;
                kVar2.K();
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar2 = e10.f2201s;
            K k10 = e10.f2200r;
            try {
                p110k9.a.e(obj);
                kVar = kVar2;
                k7 = k10;
                objK = obj;
            } catch (Throwable th3) {
                th = th3;
                kVar2.K();
                throw th;
            }
        }
        Set set = (Set) objK;
        if (!set.isEmpty()) {
            k7.f2249i.J(set);
            k7.f2246e.e(set);
        }
        kVar.K();
        return set;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0082  */
    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    /* JADX WARN: Code duplicated, block: B:24:0x008b  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        if (A3.f.c(r13, r15, r0) == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00db, code lost:
    
        if (r15 == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dd, code lost:
    
        r13 = r13;
        return r4;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00db -> B:28:0x00de). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(F2.K r12, F2.A r13, int r14, q9.c r15) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.K.c(F2.K, F2.A, int, q9.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:18:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0082 -> B:19:0x0085). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(F2.K r7, F2.A r8, int r9, q9.c r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof F2.H
            if (r0 == 0) goto L16
            r0 = r10
            F2.H r0 = (F2.H) r0
            int r1 = r0.f2226y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f2226y = r1
            goto L1b
        L16:
            F2.H r0 = new F2.H
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.f2224w
            int r1 = r0.f2226y
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            int r7 = r0.f2223v
            int r8 = r0.f2222u
            java.lang.String[] r9 = r0.f2221t
            java.lang.String r1 = r0.f2220s
            F2.m r3 = r0.f2219r
            p110k9.a.e(r10)
            r10 = r9
            r9 = r3
            goto L85
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            p110k9.a.e(r10)
            java.lang.String[] r7 = r7.g
            r7 = r7[r9]
            java.lang.String[] r9 = F2.K.f2241l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4e:
            if (r8 >= r7) goto L87
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = p245z2.a.A(r5, r4, r3)
            r0.f2219r = r9
            r0.f2220s = r1
            r0.f2221t = r10
            r0.f2222u = r8
            r0.f2223v = r7
            r0.f2226y = r2
            java.lang.Object r3 = A3.f.c(r9, r3, r0)
            p9.a r4 = p161p9.a.f21156r
            if (r3 != r4) goto L85
            return r4
        L85:
            int r8 = r8 + r2
            goto L4e
        L87:
            k9.y r7 = p110k9.y.f19095a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.K.d(F2.K, F2.A, int, q9.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(q9.c cVar) throws Throwable {
        I i10;
        M.k kVar;
        if (cVar instanceof I) {
            i10 = (I) cVar;
            int i11 = i10.f2230u;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                i10.f2230u = i11 - Integer.MIN_VALUE;
            } else {
                i10 = new I(this, cVar);
            }
        } else {
            i10 = new I(this, cVar);
        }
        Object obj = i10.f2228s;
        int i12 = i10.f2230u;
        if (i12 == 0) {
            p110k9.a.e(obj);
            u uVar = this.f2242a;
            M.k kVar2 = uVar.g;
            if (kVar2.h()) {
                try {
                    F f3 = new F(this, null, 2);
                    i10.f2227r = kVar2;
                    i10.f2230u = 1;
                    Object objK = uVar.k(false, f3, i10);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (objK == aVar) {
                        return aVar;
                    }
                    kVar = kVar2;
                    kVar.K();
                } catch (Throwable th) {
                    th = th;
                    kVar = kVar2;
                    kVar.K();
                    throw th;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = i10.f2227r;
            try {
                p110k9.a.e(obj);
                kVar.K();
            } catch (Throwable th2) {
                th = th2;
                kVar.K();
                throw th;
            }
        }
        return p110k9.y.f19095a;
    }
}

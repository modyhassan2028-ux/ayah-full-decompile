package A;

import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import Q8.C0464k;
import Q8.C0478z;
import Q8.EnumC0463j;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class J extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Object f67A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f68r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f69s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f70t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f71u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f72v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f73w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f74x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f75y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f76z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(T t2, D0.z zVar, M m10, C0023i c0023i, L l10, L l11, K k7, p150o9.c cVar) {
        super(2, cVar);
        this.f71u = t2;
        this.f72v = zVar;
        this.f73w = m10;
        this.f74x = c0023i;
        this.f75y = l10;
        this.f76z = l11;
        this.f67A = k7;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f68r) {
            case 0:
                J j = new J((T) this.f71u, (D0.z) this.f72v, (M) this.f73w, (C0023i) this.f74x, (L) this.f75y, (L) this.f76z, (K) this.f67A, cVar);
                j.f70t = obj;
                return j;
            default:
                return new J((Q8.V) this.f76z, (Q8.P) this.f67A, cVar);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f68r) {
            case 0:
                break;
        }
        return ((J) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0095  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00de  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:38:0x0106  */
    /* JADX WARN: Code duplicated, block: B:39:0x010b  */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0402u interfaceC0402u;
        Object objA;
        Object objA2;
        C0478z c0478z;
        Q8.S s10;
        p050e8.f fVar;
        Q8.P p10;
        T8.j jVar;
        Object objB;
        Q8.S s11;
        T8.j jVar2;
        p160p8.j jVar3;
        EnumC0463j enumC0463j;
        EnumC0463j enumC0463j2;
        EnumC0463j enumC0463j3;
        EnumC0463j enumC0463j4;
        p160p8.j jVar4;
        EnumC0463j enumC0463j5;
        int i10 = this.f68r;
        p110k9.y yVar = p110k9.y.f19095a;
        Object obj2 = this.f67A;
        p161p9.a aVar = p161p9.a.f21156r;
        Object obj3 = this.f76z;
        switch (i10) {
            case 0:
                T t2 = (T) this.f71u;
                int i11 = this.f69s;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    InterfaceC0402u interfaceC0402u2 = (InterfaceC0402u) this.f70t;
                    try {
                        EnumC0047u0 enumC0047u0 = t2.f141H;
                        D0.z zVar = (D0.z) this.f72v;
                        M m10 = (M) this.f73w;
                        C0023i c0023i = (C0023i) this.f74x;
                        L l10 = (L) this.f75y;
                        K k7 = (K) obj2;
                        this.f70t = interfaceC0402u2;
                        this.f69s = 1;
                        float f3 = I.f62a;
                        Object objC = V0.c(zVar, new F((L) obj3, new p251z9.u(), enumC0047u0, m10, k7, l10, c0023i, null), this);
                        if (objC != aVar) {
                            objC = yVar;
                        }
                        return objC == aVar ? aVar : yVar;
                    } catch (CancellationException e10) {
                        e = e10;
                        interfaceC0402u = interfaceC0402u2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC0402u = (InterfaceC0402u) this.f70t;
                    try {
                        p110k9.a.e(obj);
                        return yVar;
                    } catch (CancellationException e11) {
                        e = e11;
                    }
                }
                M9.e eVar = t2.f145L;
                if (eVar != null) {
                    eVar.k(C0044t.f415a);
                }
                if (AbstractC0405x.u(interfaceC0402u)) {
                    return yVar;
                }
                throw e;
            default:
                Q8.V v10 = (Q8.V) obj3;
                int i12 = this.f69s;
                if (i12 == 0) {
                    p110k9.a.e(obj);
                    this.f69s = 1;
                    objA = Q8.V.a(v10, this);
                    if (objA != aVar) {
                    }
                    return aVar;
                }
                if (i12 == 1) {
                    p110k9.a.e(obj);
                    objA = obj;
                } else {
                    if (i12 == 2) {
                        p110k9.a.e(obj);
                        objA2 = obj;
                        c0478z = (C0478z) objA2;
                        s10 = Q8.S.f6912a;
                        fVar = v10.f6919a;
                        p10 = (Q8.P) obj2;
                        jVar = v10.f6921c;
                        R8.c cVar = R8.c.f7404a;
                        this.f70t = c0478z;
                        this.f71u = v10;
                        this.f72v = s10;
                        this.f73w = fVar;
                        this.f74x = p10;
                        this.f75y = jVar;
                        this.f69s = 3;
                        objB = cVar.b(this);
                        if (objB != aVar) {
                            s11 = s10;
                            jVar2 = jVar;
                        }
                        return aVar;
                    }
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar2 = (T8.j) this.f75y;
                    p10 = (Q8.P) this.f74x;
                    fVar = (p050e8.f) this.f73w;
                    s11 = (Q8.S) this.f72v;
                    v10 = (Q8.V) this.f71u;
                    c0478z = (C0478z) this.f70t;
                    p110k9.a.e(obj);
                    objB = obj;
                }
                Map map = (Map) objB;
                String str = c0478z.f7066a;
                String str2 = c0478z.f7067b;
                s11.getClass();
                p251z9.j.e(fVar, "firebaseApp");
                p251z9.j.e(p10, "sessionDetails");
                p251z9.j.e(jVar2, "sessionsSettings");
                p251z9.j.e(map, "subscribers");
                p251z9.j.e(str2, "firebaseAuthenticationToken");
                String str3 = p10.f6906a;
                String str4 = p10.f6907b;
                int i13 = p10.f6908c;
                long j = p10.f6909d;
                jVar3 = (p160p8.j) map.get(R8.d.f7407s);
                enumC0463j = EnumC0463j.COLLECTION_DISABLED;
                enumC0463j2 = EnumC0463j.COLLECTION_ENABLED;
                enumC0463j3 = EnumC0463j.COLLECTION_SDK_NOT_INSTALLED;
                if (jVar3 == null) {
                    enumC0463j4 = enumC0463j3;
                } else if (jVar3.f21078a.a()) {
                    enumC0463j4 = enumC0463j2;
                } else {
                    enumC0463j4 = enumC0463j;
                }
                jVar4 = (p160p8.j) map.get(R8.d.f7406r);
                if (jVar4 == null) {
                    enumC0463j5 = enumC0463j3;
                } else if (jVar4.f21078a.a()) {
                    enumC0463j5 = enumC0463j2;
                } else {
                    enumC0463j5 = enumC0463j;
                }
                Q8.Q q10 = new Q8.Q(new Q8.Z(str3, str4, i13, j, new C0464k(enumC0463j4, enumC0463j5, jVar2.a()), str, str2), Q8.S.a(fVar));
                int i14 = Q8.V.g;
                v10.getClass();
                try {
                    v10.f6922d.a(q10);
                    Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                    return yVar;
                } catch (RuntimeException e12) {
                    Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e12);
                    return yVar;
                }
                if (!((Boolean) objA).booleanValue()) {
                    return yVar;
                }
                J8.e eVar2 = v10.f6920b;
                this.f69s = 2;
                objA2 = C0478z.f7065c.a(eVar2, this);
                if (objA2 != aVar) {
                    c0478z = (C0478z) objA2;
                    s10 = Q8.S.f6912a;
                    fVar = v10.f6919a;
                    p10 = (Q8.P) obj2;
                    jVar = v10.f6921c;
                    R8.c cVar2 = R8.c.f7404a;
                    this.f70t = c0478z;
                    this.f71u = v10;
                    this.f72v = s10;
                    this.f73w = fVar;
                    this.f74x = p10;
                    this.f75y = jVar;
                    this.f69s = 3;
                    objB = cVar2.b(this);
                    if (objB != aVar) {
                        s11 = s10;
                        jVar2 = jVar;
                        Map map2 = (Map) objB;
                        String str5 = c0478z.f7066a;
                        String str6 = c0478z.f7067b;
                        s11.getClass();
                        p251z9.j.e(fVar, "firebaseApp");
                        p251z9.j.e(p10, "sessionDetails");
                        p251z9.j.e(jVar2, "sessionsSettings");
                        p251z9.j.e(map2, "subscribers");
                        p251z9.j.e(str6, "firebaseAuthenticationToken");
                        String str7 = p10.f6906a;
                        String str8 = p10.f6907b;
                        int i15 = p10.f6908c;
                        long j10 = p10.f6909d;
                        jVar3 = (p160p8.j) map2.get(R8.d.f7407s);
                        enumC0463j = EnumC0463j.COLLECTION_DISABLED;
                        enumC0463j2 = EnumC0463j.COLLECTION_ENABLED;
                        enumC0463j3 = EnumC0463j.COLLECTION_SDK_NOT_INSTALLED;
                        if (jVar3 == null) {
                            enumC0463j4 = enumC0463j3;
                        } else if (jVar3.f21078a.a()) {
                            enumC0463j4 = enumC0463j2;
                        } else {
                            enumC0463j4 = enumC0463j;
                        }
                        jVar4 = (p160p8.j) map2.get(R8.d.f7406r);
                        if (jVar4 == null) {
                            enumC0463j5 = enumC0463j3;
                        } else if (jVar4.f21078a.a()) {
                            enumC0463j5 = enumC0463j2;
                        } else {
                            enumC0463j5 = enumC0463j;
                        }
                        Q8.Q q11 = new Q8.Q(new Q8.Z(str7, str8, i15, j10, new C0464k(enumC0463j4, enumC0463j5, jVar2.a()), str5, str6), Q8.S.a(fVar));
                        int i16 = Q8.V.g;
                        v10.getClass();
                        v10.f6922d.a(q11);
                        Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                        return yVar;
                    }
                }
                return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(Q8.V v10, Q8.P p10, p150o9.c cVar) {
        super(2, cVar);
        this.f76z = v10;
        this.f67A = p10;
    }
}

package L;

import D0.N;
import G.a0;
import K.g0;
import p110k9.y;
import p241y9.e;
import q9.h;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h implements e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5420s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5421t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f5422u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f5423v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f5424w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f5425x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, p150o9.c cVar) {
        super(2, cVar);
        this.f5425x = bVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f5420s) {
            case 0:
                a aVar = new a((b) this.f5425x, cVar);
                aVar.f5422u = obj;
                return aVar;
            default:
                a aVar2 = new a((O8.c) this.f5423v, (a0) this.f5424w, (g0) this.f5425x, cVar);
                aVar2.f5422u = obj;
                return aVar2;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        N n6 = (N) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f5420s) {
            case 0:
                break;
        }
        return ((a) create(n6, cVar)).invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:193:0x031f  */
    /* JADX WARN: Code duplicated, block: B:204:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x018d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0 A[PHI: r9
      0x00f0: PHI (r9v1 p9.a) = (r9v0 p9.a), (r9v2 p9.a) binds: [B:48:0x00ee, B:73:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0163 A[PHI: r2 r9 r10 r11 r12
      0x0163: PHI (r2v6 D0.o) = (r2v5 D0.o), (r2v15 D0.o) binds: [B:73:0x0160, B:45:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r9v3 p9.a) = (r9v2 p9.a), (r9v0 p9.a) binds: [B:73:0x0160, B:45:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r10v4 D0.v) = (r10v3 D0.v), (r10v11 D0.v) binds: [B:73:0x0160, B:45:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r11v20 D0.N) = (r11v19 D0.N), (r11v25 D0.N) binds: [B:73:0x0160, B:45:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r12v3 java.lang.Object) = (r12v2 java.lang.Object), (r12v27 java.lang.Object) binds: [B:73:0x0160, B:45:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x016e  */
    /* JADX WARN: Code duplicated, block: B:79:0x017e  */
    /* JADX WARN: Code duplicated, block: B:89:0x019f  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b8  */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v33, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v38, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:176:0x02e5 -> B:178:0x02e9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0160 -> B:75:0x0163). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(O8.c cVar, a0 a0Var, g0 g0Var, p150o9.c cVar2) {
        super(2, cVar2);
        this.f5423v = cVar;
        this.f5424w = a0Var;
        this.f5425x = g0Var;
    }
}

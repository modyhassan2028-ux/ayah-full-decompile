package i6;

import M9.s;
import java.io.File;
import p085i0.n;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class h extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16777r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16778s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f16779t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ File f16780u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f16781v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f16782w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f16783x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(File file, Object obj, String str, n nVar, p150o9.c cVar) {
        super(2, cVar);
        this.f16780u = file;
        this.f16781v = obj;
        this.f16782w = str;
        this.f16783x = nVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        h hVar = new h(this.f16780u, this.f16781v, this.f16782w, this.f16783x, cVar);
        hVar.f16779t = obj;
        return hVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((s) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ad A[PHI: r2 r6
      0x00ad: PHI (r2v10 int) = (r2v9 int), (r2v22 int) binds: [B:23:0x00aa, B:9:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r6v9 java.lang.Object) = (r6v8 java.lang.Object), (r6v13 java.lang.Object) binds: [B:23:0x00aa, B:9:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        if (((M9.r) r1).f5883u.d(r2, r17) == r15) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (((M9.r) r1).f5883u.d(r2, r17) == r15) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d8, code lost:
    
        if (((M9.r) r1).f5883u.d(r4, r17) == r15) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fa, code lost:
    
        if (((M9.r) r1).f5883u.d(r6, r17) == r15) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0112, code lost:
    
        if (va.g.i(r1, r2, r17) == r15) goto L45;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00aa -> B:25:0x00ad). Please report as a decompilation issue!!! */
    @Override // q9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

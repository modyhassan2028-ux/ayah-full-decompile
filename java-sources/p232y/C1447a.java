package p232y;

import A.C0053x0;
import B.j;
import K9.InterfaceC0402u;
import p110k9.y;
import p150o9.c;
import p241y9.e;
import q9.i;

/* JADX INFO: renamed from: y.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1447a extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f24466r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f24467s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f24468t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0053x0 f24469u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f24470v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f24471w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AbstractC1450d f24472x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1447a(C0053x0 c0053x0, long j, j jVar, AbstractC1450d abstractC1450d, c cVar) {
        super(2, cVar);
        this.f24469u = c0053x0;
        this.f24470v = j;
        this.f24471w = jVar;
        this.f24472x = abstractC1450d;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        C1447a c1447a = new C1447a(this.f24469u, this.f24470v, this.f24471w, this.f24472x, cVar);
        c1447a.f24468t = obj;
        return c1447a;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1447a) create((InterfaceC0402u) obj, (c) obj2)).invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (r14.a(r1, r17) == r9) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        if (r14.a(r2, r17) == r9) goto L40;
     */
    @Override // q9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p232y.C1447a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package A;

import D0.EnumC0097o;

/* JADX INFO: renamed from: A.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0012c0 extends q9.h implements p241y9.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f204s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f205t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f206u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f207v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f208w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0012c0(EnumC0097o enumC0097o, p251z9.v vVar, p150o9.c cVar) {
        super(2, cVar);
        this.f204s = 2;
        this.f207v = enumC0097o;
        this.f208w = vVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [q9.h, y9.e] */
    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f204s) {
            case 0:
                C0012c0 c0012c0 = new C0012c0((p150o9.h) this.f207v, (p241y9.e) this.f208w, cVar);
                c0012c0.f205t = obj;
                return c0012c0;
            case 1:
                C0012c0 c0012c1 = new C0012c0((C0041r0) this.f208w, cVar, 1);
                c0012c1.f207v = obj;
                return c0012c1;
            case 2:
                C0012c0 c0012c2 = new C0012c0((EnumC0097o) this.f207v, (p251z9.v) this.f208w, cVar);
                c0012c2.f205t = obj;
                return c0012c2;
            default:
                C0012c0 c0012c3 = new C0012c0((K.g0) this.f208w, cVar, 3);
                c0012c3.f205t = obj;
                return c0012c3;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f204s) {
            case 0:
                return ((C0012c0) create((D0.N) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 1:
                return ((C0012c0) create((G9.j) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 2:
                return ((C0012c0) create((D0.N) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            default:
                return ((C0012c0) create((D0.N) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01de A[Catch: CancellationException -> 0x01c5, TRY_ENTER, TryCatch #0 {CancellationException -> 0x01c5, blocks: (B:104:0x01de, B:107:0x01ed, B:93:0x01c1, B:98:0x01cc), top: B:118:0x01a4 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v8, types: [q9.h, y9.e] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x01f5 -> B:102:0x01d8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x0206 -> B:102:0x01d8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005f -> B:19:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0126 -> B:60:0x0129). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0190 -> B:81:0x0191). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.C0012c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0012c0(Object obj, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f204s = i10;
        this.f208w = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0012c0(p150o9.h hVar, p241y9.e eVar, p150o9.c cVar) {
        super(2, cVar);
        this.f204s = 0;
        this.f207v = hVar;
        this.f208w = (q9.h) eVar;
    }
}

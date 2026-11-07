package i6;

import Da.j;
import K9.InterfaceC0402u;
import O9.y;
import java.io.Closeable;
import java.io.File;
import p085i0.n;
import p251z9.r;
import p251z9.u;
import p251z9.v;

/* JADX INFO: loaded from: classes.dex */
public final class i extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public u f16784A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Closeable f16785B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public j f16786C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f16787D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f16788E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f16789F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f16790G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f16791H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f16792I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final /* synthetic */ String f16793J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final /* synthetic */ String f16794K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final /* synthetic */ n f16795L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final /* synthetic */ Object f16796M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final /* synthetic */ y f16797N;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public File f16798r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public v f16799s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r f16800t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Closeable f16801u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n f16802v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f16803w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p241y9.e f16804x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f16805y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Da.i f16806z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, String str2, n nVar, Object obj, y yVar, p150o9.c cVar) {
        super(2, cVar);
        this.f16793J = str;
        this.f16794K = str2;
        this.f16795L = nVar;
        this.f16796M = obj;
        this.f16797N = yVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        return new i(this.f16793J, this.f16794K, this.f16795L, this.f16796M, this.f16797N, cVar);
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x017f -> B:48:0x018c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x020a -> B:56:0x0214). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 8231. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

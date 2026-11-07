package p027c6;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p095j3.a;
import p110k9.j;
import p110k9.y;
import p124m3.d;
import p150o9.c;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i implements p241y9.i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f13503A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f13504B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f13505C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f13506D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public /* synthetic */ d f13507E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public /* synthetic */ j f13508F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public /* synthetic */ p088i3.e f13509G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public /* synthetic */ z3.j f13510H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public /* synthetic */ j f13511I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final /* synthetic */ f f13512J;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f13513r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Map f13514s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a f13515t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public f f13516u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f f13517v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Collection f13518w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Iterator f13519x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Collection f13520y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f13521z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, c cVar) {
        super(6, cVar);
        this.f13512J = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0145 A[EDGE_INSN: B:170:0x0145->B:45:0x0145 BREAK  A[LOOP:1: B:38:0x012c->B:43:0x0140], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0132  */
    /* JADX WARN: Code duplicated, block: B:43:0x0140 A[LOOP:1: B:38:0x012c->B:43:0x0140, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [c6.f, java.lang.Throwable, java.util.List, k9.j, z3.j] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x02e2 -> B:132:0x02eb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c6.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p241y9.i
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
        e eVar = new e(this.f13512J, (c) serializable);
        eVar.f13507E = (d) obj;
        eVar.f13508F = (j) obj2;
        eVar.f13509G = (p088i3.e) obj3;
        eVar.f13510H = (z3.j) obj4;
        eVar.f13511I = (j) obj5;
        return eVar.invokeSuspend(y.f19095a);
    }
}

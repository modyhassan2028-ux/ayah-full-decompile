package p218w3;

import com.ayah.common.data.source.json.model.booklist.BookType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p110k9.y;
import p150o9.c;
import p241y9.f;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class k extends i implements f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ List f23679A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ n f23680B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ int f23681C;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n f23682r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Collection f23683s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Iterator f23684t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public BookType f23685u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Collection f23686v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f23687w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f23688x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f23689y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f23690z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, int i10, c cVar) {
        super(3, cVar);
        this.f23680B = nVar;
        this.f23681C = i10;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        k kVar = new k(this.f23680B, this.f23681C, (c) obj3);
        kVar.f23679A = (List) obj;
        return kVar.invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005e  */
    /* JADX WARN: Code duplicated, block: B:13:0x006f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0073  */
    /* JADX WARN: Code duplicated, block: B:18:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x00a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a5 -> B:20:0x00ab). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.util.List r0 = r14.f23679A
            int r1 = r14.f23690z
            int r2 = r14.f23681C
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 != r3) goto L27
            int r0 = r14.f23689y
            int r1 = r14.f23688x
            int r4 = r14.f23687w
            java.util.Collection r5 = r14.f23686v
            java.util.Collection r5 = (java.util.Collection) r5
            com.ayah.common.data.source.json.model.booklist.BookType r6 = r14.f23685u
            java.util.Iterator r7 = r14.f23684t
            java.util.Collection r8 = r14.f23683s
            java.util.Collection r8 = (java.util.Collection) r8
            w3.n r9 = r14.f23682r
            p110k9.a.e(r15)
            r13 = r7
            r7 = r4
            r4 = r13
            goto Lab
        L27:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L2f:
            p110k9.a.e(r15)
            w3.n r15 = r14.f23680B
            android.content.Context r1 = r15.f23705a
            com.ayah.common.data.source.json.model.booklist.BookType r1 = com.google.android.gms.internal.measurement.B1.E(r1)
            java.util.List r1 = com.google.android.gms.internal.measurement.AbstractC0813f2.K(r1)
            java.util.ArrayList r0 = p120l9.m.q0(r1, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r4 = 10
            int r4 = p120l9.n.a0(r0, r4)
            r1.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
            r6 = r15
            r15 = r1
            r8 = r2
            r1 = r4
            r4 = r0
            r0 = r1
        L58:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb9
            java.lang.Object r5 = r4.next()
            r7 = r5
            com.ayah.common.data.source.json.model.booklist.BookType r7 = (com.ayah.common.data.source.json.model.booklist.BookType) r7
            java.lang.String r5 = r7.f13685a
            java.lang.String r9 = "quran-text"
            boolean r5 = p251z9.j.a(r5, r9)
            if (r5 == 0) goto L73
            java.util.List r5 = p218w3.n.f23703h
        L71:
            r10 = r5
            goto L76
        L73:
            java.util.List r5 = p218w3.n.f23704i
            goto L71
        L76:
            r5 = 0
            r14.f23679A = r5
            r14.f23682r = r6
            r5 = r15
            java.util.Collection r5 = (java.util.Collection) r5
            r14.f23683s = r5
            r14.f23684t = r4
            r14.f23685u = r7
            r14.f23686v = r5
            r14.f23687w = r8
            r14.f23688x = r1
            r14.f23689y = r0
            r14.f23690z = r3
            r6.getClass()
            R9.e r5 = K9.H.f5322a
            R9.d r12 = R9.d.f7436t
            w3.l r5 = new w3.l
            r11 = 0
            r9 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.Object r5 = K9.AbstractC0405x.I(r12, r5, r14)
            p9.a r9 = p161p9.a.f21156r
            if (r5 != r9) goto La5
            return r9
        La5:
            r9 = r6
            r6 = r7
            r7 = r8
            r8 = r15
            r15 = r5
            r5 = r8
        Lab:
            java.util.List r15 = (java.util.List) r15
            z3.m r10 = new z3.m
            r10.<init>(r6, r15)
            r5.add(r10)
            r15 = r8
            r6 = r9
            r8 = r7
            goto L58
        Lb9:
            java.util.List r15 = (java.util.List) r15
            z3.n r0 = new z3.n
            r0.<init>(r2, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p218w3.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

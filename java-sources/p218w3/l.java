package p218w3;

import K9.InterfaceC0402u;
import com.ayah.common.data.source.json.model.booklist.BookType;
import java.util.List;
import p110k9.y;
import p150o9.c;
import p241y9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class l extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f23691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f23692s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ BookType f23693t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f23694u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f23695v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f23696w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, BookType bookType, int i10, int i11, List list, c cVar) {
        super(2, cVar);
        this.f23692s = nVar;
        this.f23693t = bookType;
        this.f23694u = i10;
        this.f23695v = i11;
        this.f23696w = list;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        return new l(this.f23692s, this.f23693t, this.f23694u, this.f23695v, this.f23696w, cVar);
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((InterfaceC0402u) obj, (c) obj2)).invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r9 == r5) goto L19;
     */
    @Override // q9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f23691r
            r1 = 0
            r2 = 2
            com.ayah.common.data.source.json.model.booklist.BookType r3 = r8.f23693t
            r4 = 1
            p9.a r5 = p161p9.a.f21156r
            if (r0 == 0) goto L1f
            if (r0 == r4) goto L1b
            if (r0 != r2) goto L13
            p110k9.a.e(r9)
            goto L4d
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            p110k9.a.e(r9)
            goto L2f
        L1f:
            p110k9.a.e(r9)
            w3.n r9 = r8.f23692s
            r3.l r9 = r9.f23709e
            r8.f23691r = r4
            java.lang.Object r9 = r9.d(r3, r8)
            if (r9 != r5) goto L2f
            goto L4c
        L2f:
            com.ayah.common.data.source.database.BookDatabase r9 = (com.ayah.common.data.source.database.BookDatabase) r9
            if (r9 == 0) goto L99
            A3.c r9 = r9.l()
            if (r9 == 0) goto L99
            r8.f23691r = r2
            F2.u r0 = r9.f489a
            A3.a r2 = new A3.a
            int r6 = r8.f23694u
            int r7 = r8.f23695v
            r2.<init>(r6, r7, r9)
            java.lang.Object r9 = B9.a.R(r0, r4, r1, r2, r8)
            if (r9 != r5) goto L4d
        L4c:
            return r5
        L4d:
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L99
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L5a:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L75
            java.lang.Object r2 = r9.next()
            r4 = r2
            E3.a r4 = (E3.a) r4
            java.lang.String r4 = r4.f1832b
            java.util.List r5 = r8.f23696w
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L5a
            r0.add(r2)
            goto L5a
        L75:
            java.util.ArrayList r9 = new java.util.ArrayList
            r2 = 10
            int r2 = p120l9.n.a0(r0, r2)
            r9.<init>(r2)
            int r2 = r0.size()
        L84:
            if (r1 >= r2) goto L98
            java.lang.Object r4 = r0.get(r1)
            int r1 = r1 + 1
            E3.a r4 = (E3.a) r4
            java.lang.String r5 = r3.g
            n3.i r4 = p017b7.g.c0(r4, r5)
            r9.add(r4)
            goto L84
        L98:
            return r9
        L99:
            n3.c r9 = new n3.c
            r9.<init>(r3)
            java.util.List r9 = com.google.android.gms.internal.measurement.AbstractC0813f2.K(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p218w3.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

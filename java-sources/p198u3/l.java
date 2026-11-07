package p198u3;

import C4.g;
import K9.AbstractC0405x;
import N9.AbstractC0419l;
import N9.C0414g;
import N9.U;
import N9.k0;
import P9.d;
import com.ayah.common.data.dao.bookmark.BookmarkType;
import p151p.C1256n;
import p197u2.b;
import p218w3.a;
import p218w3.c;
import p218w3.f;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f22924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f22925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1256n f22926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f22927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k0 f22928e;

    public l(d dVar, c cVar, f fVar, C1256n c1256n, a aVar) {
        j.e(dVar, "bookmarksModel");
        j.e(cVar, "jumpModel");
        j.e(fVar, "pageModel");
        j.e(aVar, "currentPageModel");
        this.f22924a = dVar;
        this.f22925b = fVar;
        this.f22926c = c1256n;
        this.f22927d = aVar;
        d dVarB = AbstractC0405x.b(AbstractC0405x.e());
        this.f22928e = AbstractC0419l.c(new p077h3.d("", BookmarkType.RED));
        AbstractC0419l.u(new g(dVar.f22892c, this, 23), dVarB);
        AbstractC0419l.u(new g(new C0414g(AbstractC0419l.n(new U(cVar.f23656e), 1), new b(4)), this, 24), dVarB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (b((p124m3.d) r8, r7, r0) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r6, com.ayah.common.data.dao.bookmark.BookmarkType r7, q9.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p198u3.j
            if (r0 == 0) goto L13
            r0 = r8
            u3.j r0 = (p198u3.j) r0
            int r1 = r0.f22916v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22916v = r1
            goto L18
        L13:
            u3.j r0 = new u3.j
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f22914t
            int r1 = r0.f22916v
            r2 = 2
            r3 = 1
            p9.a r4 = p161p9.a.f21156r
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            p110k9.a.e(r8)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            int r6 = r0.f22912r
            com.ayah.common.data.dao.bookmark.BookmarkType r7 = r0.f22913s
            p110k9.a.e(r8)
            goto L4c
        L3a:
            p110k9.a.e(r8)
            r0.f22913s = r7
            r0.f22912r = r6
            r0.f22916v = r3
            w3.f r8 = r5.f22925b
            java.lang.Object r8 = r8.a(r6, r0)
            if (r8 != r4) goto L4c
            goto L5b
        L4c:
            m3.d r8 = (p124m3.d) r8
            r1 = 0
            r0.f22913s = r1
            r0.f22912r = r6
            r0.f22916v = r2
            java.lang.Object r6 = r5.b(r8, r7, r0)
            if (r6 != r4) goto L5c
        L5b:
            return r4
        L5c:
            k9.y r6 = p110k9.y.f19095a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p198u3.l.a(int, com.ayah.common.data.dao.bookmark.BookmarkType, q9.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0117, code lost:
    
        if (r13 == r5) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(p124m3.d r11, com.ayah.common.data.dao.bookmark.BookmarkType r12, q9.c r13) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p198u3.l.b(m3.d, com.ayah.common.data.dao.bookmark.BookmarkType, q9.c):java.lang.Object");
    }
}

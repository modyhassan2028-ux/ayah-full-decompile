package p093j0;

import G9.j;
import p110k9.y;
import p150o9.c;
import p241y9.e;
import q9.h;

/* JADX INFO: loaded from: classes.dex */
public final class l extends h implements e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long[] f18649s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f18650t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f18651u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18652v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f18653w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f18654x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, c cVar) {
        super(2, cVar);
        this.f18654x = mVar;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        l lVar = new l(this.f18654x, cVar);
        lVar.f18653w = obj;
        return lVar;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((j) obj, (c) obj2)).invokeSuspend(y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0080 -> B:26:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bd -> B:37:0x00bf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x0097
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            j0.m r1 = r0.f18654x
            long r2 = r1.f18656r
            long r4 = r1.f18658t
            long r6 = r1.f18657s
            int r8 = r0.f18652v
            r9 = 0
            r12 = 3
            r13 = 2
            r14 = 64
            r16 = 0
            r18 = 1
            r10 = 1
            p9.a r11 = p161p9.a.f21156r
            if (r8 == 0) goto L4d
            if (r8 == r10) goto L3e
            if (r8 == r13) goto L34
            if (r8 != r12) goto L2c
            int r1 = r0.f18650t
            java.lang.Object r6 = r0.f18653w
            G9.j r6 = (G9.j) r6
            p110k9.a.e(r23)
            r7 = r12
            goto Lbf
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            int r1 = r0.f18650t
            java.lang.Object r8 = r0.f18653w
            G9.j r8 = (G9.j) r8
            p110k9.a.e(r23)
            goto L95
        L3e:
            int r1 = r0.f18651u
            int r8 = r0.f18650t
            long[] r15 = r0.f18649s
            java.lang.Object r12 = r0.f18653w
            G9.j r12 = (G9.j) r12
            p110k9.a.e(r23)
            int r8 = r8 + r10
            goto L5b
        L4d:
            p110k9.a.e(r23)
            java.lang.Object r8 = r0.f18653w
            r12 = r8
            G9.j r12 = (G9.j) r12
            long[] r15 = r1.f18659u
            if (r15 == 0) goto L72
            int r1 = r15.length
            r8 = 0
        L5b:
            if (r8 >= r1) goto L72
            r2 = r15[r8]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r0.f18653w = r12
            r0.f18649s = r15
            r0.f18650t = r8
            r0.f18651u = r1
            r0.f18652v = r10
            r12.b(r4, r0)
            return r11
        L72:
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L98
            r8 = r12
            r1 = 0
        L78:
            if (r1 >= r14) goto L97
            long r20 = r18 << r1
            long r20 = r6 & r20
            int r12 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r12 == 0) goto L95
            long r2 = (long) r1
            long r4 = r4 + r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r0.f18653w = r8
            r0.f18649s = r9
            r0.f18650t = r1
            r0.f18652v = r13
            r8.b(r2, r0)
            return r11
        L95:
            int r1 = r1 + r10
            goto L78
        L97:
            r12 = r8
        L98:
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc2
            r6 = r12
            r15 = 0
        L9e:
            if (r15 >= r14) goto Lc2
            long r7 = r18 << r15
            long r7 = r7 & r2
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbd
            long r1 = (long) r15
            long r4 = r4 + r1
            long r1 = (long) r14
            long r4 = r4 + r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0.f18653w = r6
            r0.f18649s = r9
            r0.f18650t = r15
            r7 = 3
            r0.f18652v = r7
            r6.b(r1, r0)
            return r11
        Lbd:
            r7 = 3
            r1 = r15
        Lbf:
            int r15 = r1 + 1
            goto L9e
        Lc2:
            k9.y r1 = p110k9.y.f19095a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p093j0.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

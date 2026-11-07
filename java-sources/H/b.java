package H;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p011b0.e f3115a = new p011b0.e(new c[16]);

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0062 -> B:19:0x0065). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(p171r0.e r9, q9.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof H.a
            if (r0 == 0) goto L13
            r0 = r10
            H.a r0 = (H.a) r0
            int r1 = r0.f3114x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3114x = r1
            goto L18
        L13:
            H.a r0 = new H.a
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f3112v
            int r1 = r0.f3114x
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            int r9 = r0.f3111u
            int r1 = r0.f3110t
            java.lang.Object[] r3 = r0.f3109s
            r0.e r4 = r0.f3108r
            p110k9.a.e(r10)
            r10 = r4
            goto L65
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            p110k9.a.e(r10)
            b0.e r10 = r8.f3115a
            java.lang.Object[] r1 = r10.f13125r
            int r10 = r10.f13127t
            r3 = 0
            r7 = r10
            r10 = r9
            r9 = r7
            r7 = r3
            r3 = r1
            r1 = r7
        L46:
            if (r1 >= r9) goto L67
            r4 = r3[r1]
            H.c r4 = (H.c) r4
            A.r0 r5 = new A.r0
            r6 = 5
            r5.<init>(r6, r10)
            r0.f3108r = r10
            r0.f3109s = r3
            r0.f3110t = r1
            r0.f3111u = r9
            r0.f3114x = r2
            java.lang.Object r4 = p185s8.u0.e(r4, r5, r0)
            p9.a r5 = p161p9.a.f21156r
            if (r4 != r5) goto L65
            return r5
        L65:
            int r1 = r1 + r2
            goto L46
        L67:
            k9.y r9 = p110k9.y.f19095a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: H.b.a(r0.e, q9.c):java.lang.Object");
    }
}

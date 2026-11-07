package T8;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f7958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f7959b;

    public j(o oVar, o oVar2) {
        p251z9.j.e(oVar, "localOverrideSettings");
        p251z9.j.e(oVar2, "remoteSettings");
        this.f7958a = oVar;
        this.f7959b = oVar2;
    }

    public final double a() {
        Double dB = this.f7958a.b();
        if (dB != null) {
            double dDoubleValue = dB.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double dB2 = this.f7959b.b();
        if (dB2 != null) {
            double dDoubleValue2 = dB2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r6.c(r0) == r4) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(q9.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof T8.i
            if (r0 == 0) goto L13
            r0 = r6
            T8.i r0 = (T8.i) r0
            int r1 = r0.f7957u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7957u = r1
            goto L18
        L13:
            T8.i r0 = new T8.i
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f7955s
            int r1 = r0.f7957u
            r2 = 2
            r3 = 1
            p9.a r4 = p161p9.a.f21156r
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            p110k9.a.e(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            T8.j r1 = r0.f7954r
            p110k9.a.e(r6)
            goto L49
        L38:
            p110k9.a.e(r6)
            r0.f7954r = r5
            r0.f7957u = r3
            T8.o r6 = r5.f7958a
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r4) goto L48
            goto L56
        L48:
            r1 = r5
        L49:
            T8.o r6 = r1.f7959b
            r1 = 0
            r0.f7954r = r1
            r0.f7957u = r2
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r4) goto L57
        L56:
            return r4
        L57:
            k9.y r6 = p110k9.y.f19095a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: T8.j.b(q9.c):java.lang.Object");
    }
}

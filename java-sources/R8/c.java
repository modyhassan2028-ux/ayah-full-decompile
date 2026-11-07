package R8;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f7404a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f7405b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    public static a a(d dVar) {
        Map map = f7405b;
        j.d(map, "dependencies");
        Object obj = map.get(dVar);
        if (obj != null) {
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
    /* JADX WARN: Code duplicated, block: B:19:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0092 -> B:21:0x0093). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(q9.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof R8.b
            if (r0 == 0) goto L13
            r0 = r10
            R8.b r0 = (R8.b) r0
            int r1 = r0.f7403z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7403z = r1
            goto L18
        L13:
            R8.b r0 = new R8.b
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f7401x
            int r1 = r0.f7403z
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r1 = r0.f7400w
            java.util.Map r3 = r0.f7399v
            S9.c r4 = r0.f7398u
            R8.d r5 = r0.f7397t
            java.util.Iterator r6 = r0.f7396s
            java.util.Map r7 = r0.f7395r
            p110k9.a.e(r10)
            goto L93
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L39:
            p110k9.a.e(r10)
            java.lang.String r10 = "dependencies"
            java.util.Map r1 = R8.c.f7405b
            p251z9.j.d(r1, r10)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            int r3 = r1.size()
            int r3 = p120l9.w.g0(r3)
            r10.<init>(r3)
            java.util.Set r1 = r1.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = r10
            r6 = r1
        L5c:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto Lc7
            java.lang.Object r10 = r6.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r1 = r10.getKey()
            java.lang.Object r4 = r10.getKey()
            r5 = r4
            R8.d r5 = (R8.d) r5
            java.lang.Object r10 = r10.getValue()
            R8.a r10 = (R8.a) r10
            S9.c r4 = r10.f7393a
            r0.f7395r = r3
            r0.f7396s = r6
            r0.f7397t = r5
            r0.f7398u = r4
            r0.f7399v = r3
            r0.f7400w = r1
            r0.f7403z = r2
            java.lang.Object r10 = r4.e(r0)
            p9.a r7 = p161p9.a.f21156r
            if (r10 != r7) goto L92
            return r7
        L92:
            r7 = r3
        L93:
            r10 = 0
            java.lang.String r8 = "subscriberName"
            p251z9.j.e(r5, r8)     // Catch: java.lang.Throwable -> Lc2
            R8.a r8 = a(r5)     // Catch: java.lang.Throwable -> Lc2
            p8.j r8 = r8.f7394b     // Catch: java.lang.Throwable -> Lc2
            if (r8 == 0) goto La9
            r4.b(r10)
            r3.put(r1, r8)
            r3 = r7
            goto L5c
        La9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = "Subscriber "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc2
            r1.append(r5)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = " has not been registered."
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc2
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc2
            throw r0     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r0 = move-exception
            r4.b(r10)
            throw r0
        Lc7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: R8.c.b(q9.c):java.lang.Object");
    }
}

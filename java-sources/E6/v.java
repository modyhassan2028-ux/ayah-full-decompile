package E6;

import K0.RunnableC0354l;
import android.content.Context;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile l f1965e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N6.a f1966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N6.a f1967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J6.e f1968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D6.s f1969d;

    public v(N6.a aVar, N6.a aVar2, J6.e eVar, D6.s sVar, Aa.a aVar3) {
        this.f1966a = aVar;
        this.f1967b = aVar2;
        this.f1968c = eVar;
        this.f1969d = sVar;
        ((Executor) aVar3.f554r).execute(new RunnableC0354l(2, aVar3));
    }

    public static v a() {
        l lVar = f1965e;
        if (lVar != null) {
            return (v) lVar.f1946w.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f1965e == null) {
            synchronized (v.class) {
                try {
                    if (f1965e == null) {
                        k kVar = new k();
                        context.getClass();
                        kVar.f1940a = context;
                        f1965e = kVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final t c(m mVar) {
        byte[] bytes;
        Set setUnmodifiableSet = mVar != null ? DesugarCollections.unmodifiableSet(C6.a.f765d) : Collections.singleton(new B6.b("proto"));
        android.support.v4.media.session.r rVarA = j.a();
        mVar.getClass();
        rVarA.f11364s = "cct";
        C6.a aVar = (C6.a) mVar;
        String str = aVar.f768a;
        String str2 = aVar.f769b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        rVarA.f11365t = bytes;
        return new t(setUnmodifiableSet, rVarA.x(), this);
    }
}

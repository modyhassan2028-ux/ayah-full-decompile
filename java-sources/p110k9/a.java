package p110k9;

import F9.n;
import java.lang.reflect.Method;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p161p9.a f19066a = p161p9.a.f21156r;

    public static void a(Throwable th, Throwable th2) {
        j.e(th, "<this>");
        j.e(th2, "exception");
        if (th != th2) {
            Integer num = p195t9.a.f22647a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = p186s9.a.f22492a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final l b(Throwable th) {
        j.e(th, "exception");
        return new l(th);
    }

    public static g c(h hVar, p241y9.a aVar) {
        v vVar = v.f19092a;
        int iOrdinal = hVar.ordinal();
        if (iOrdinal == 0) {
            return new o(aVar);
        }
        if (iOrdinal == 1) {
            n nVar = new n();
            nVar.f19081r = aVar;
            nVar.f19082s = vVar;
            return nVar;
        }
        if (iOrdinal != 2) {
            throw new A6.a();
        }
        z zVar = new z();
        zVar.f19096r = aVar;
        zVar.f19097s = vVar;
        return zVar;
    }

    public static o d(p241y9.a aVar) {
        j.e(aVar, "initializer");
        return new o(aVar);
    }

    public static final void e(Object obj) {
        if (obj instanceof l) {
            throw ((l) obj).f19079r;
        }
    }

    public static final double f(long j) {
        return ((j >>> 11) * ((double) 2048)) + (j & 2047);
    }

    public static final String g(long j, int i10) {
        if (j >= 0) {
            n.n(i10);
            String string = Long.toString(j, i10);
            j.d(string, "toString(...)");
            return string;
        }
        long j10 = i10;
        long j11 = ((j >>> 1) / j10) << 1;
        long j12 = j - (j11 * j10);
        if (j12 >= j10) {
            j12 -= j10;
            j11++;
        }
        n.n(i10);
        String string2 = Long.toString(j11, i10);
        j.d(string2, "toString(...)");
        n.n(i10);
        String string3 = Long.toString(j12, i10);
        j.d(string3, "toString(...)");
        return string2.concat(string3);
    }
}

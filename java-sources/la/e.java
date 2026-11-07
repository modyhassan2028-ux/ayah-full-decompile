package la;

import Da.h;
import Da.k;
import Da.y;
import H9.o;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import ka.l;
import ka.n;
import ka.r;
import ka.u;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f19451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f19452b;

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        j.b(timeZone);
        f19451a = timeZone;
        f19452b = o.k1(o.j1(r.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(n nVar, n nVar2) {
        j.e(nVar, "<this>");
        j.e(nVar2, "other");
        return j.a(nVar.f19189d, nVar2.f19189d) && nVar.f19190e == nVar2.f19190e && j.a(nVar.f19186a, nVar2.f19186a);
    }

    public static final void b(Socket socket) {
        j.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!j.a(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String c(String str, Object... objArr) {
        j.e(str, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final long d(u uVar) {
        String strB = uVar.f19278w.b("Content-Length");
        if (strB == null) {
            return -1L;
        }
        byte[] bArr = c.f19448a;
        try {
            return Long.parseLong(strB);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final boolean e(y yVar, int i10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        j.e(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = yVar.d().e() ? yVar.d().c() - jNanoTime : Long.MAX_VALUE;
        yVar.d().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            h hVar = new h();
            while (yVar.o(8192L, hVar) != -1) {
                hVar.skip(hVar.f1362s);
            }
            if (jC == Long.MAX_VALUE) {
                yVar.d().a();
                return true;
            }
            yVar.d().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                yVar.d().a();
                return false;
            }
            yVar.d().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                yVar.d().a();
            } else {
                yVar.d().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final l f(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ra.d dVar = (ra.d) it.next();
            k kVar = dVar.f21656a;
            k kVar2 = dVar.f21657b;
            String strK = kVar.k();
            String strK2 = kVar2.k();
            arrayList.add(strK);
            arrayList.add(o.t1(strK2).toString());
        }
        return new l((String[]) arrayList.toArray(new String[0]));
    }

    public static final String g(n nVar, boolean z10) {
        int i10;
        j.e(nVar, "<this>");
        int i11 = nVar.f19190e;
        String strA = nVar.f19189d;
        if (o.V0(strA, ":")) {
            strA = p245z2.a.A(']', "[", strA);
        }
        if (!z10) {
            String str = nVar.f19186a;
            j.e(str, "scheme");
            if (str.equals("http")) {
                i10 = 80;
            } else {
                i10 = str.equals("https") ? 443 : -1;
            }
            if (i11 == i10) {
                return strA;
            }
        }
        return strA + ':' + i11;
    }

    public static final List h(List list) {
        j.e(list, "<this>");
        if (list.isEmpty()) {
            return p120l9.r.f19440r;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            j.d(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        Object[] array = list.toArray();
        j.d(array, "toArray(...)");
        List listUnmodifiableList = DesugarCollections.unmodifiableList(p120l9.l.S(array));
        j.d(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final List i(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return p120l9.r.f19440r;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            j.d(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(p120l9.l.S((Object[]) objArr.clone()));
        j.d(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }
}

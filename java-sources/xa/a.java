package xa;

import Da.k;
import E6.u;
import G9.c;
import G9.d;
import G9.i;
import G9.l;
import H9.o;
import R7.f;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import i7.D;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p120l9.m;
import p120l9.r;
import p251z9.j;
import ua.e;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f24405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f24406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f24407d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f24408a;

    static {
        byte[] bArrCopyOf = Arrays.copyOf(new byte[]{42}, 1);
        j.d(bArrCopyOf, "copyOf(...)");
        f24405b = new k(bArrCopyOf);
        f24406c = AbstractC0813f2.K("*");
        f24407d = new a(new u());
    }

    public a(u uVar) {
        this.f24408a = uVar;
    }

    public static List b(String str) {
        List listM1 = o.m1(str, new char[]{'.'});
        if (!j.a(m.m0(listM1), "")) {
            return listM1;
        }
        int size = listM1.size() - 1;
        return m.z0(size >= 0 ? size : 0, listM1);
    }

    public final String a(String str) {
        String strN;
        String strN2;
        String strN3;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        j.b(unicode);
        List listB = b(unicode);
        List listM1 = r.f19440r;
        u uVar = this.f24408a;
        if (((AtomicBoolean) uVar.f1960b).get() || !((AtomicBoolean) uVar.f1960b).compareAndSet(false, true)) {
            try {
                ((CountDownLatch) uVar.f1962d).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z10 = false;
            while (true) {
                try {
                    try {
                        try {
                            uVar.w();
                            break;
                        } catch (IOException e10) {
                            e eVar = e.f22996a;
                            e.f22996a.j("Failed to read public suffix list", 5, e10);
                            if (z10) {
                            }
                        }
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z10 = true;
                    }
                } catch (Throwable th) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        if (((k) uVar.f1963e) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(uVar.f1961c);
            sb.append(" resource.");
            throw new IllegalStateException(sb.toString().toString());
        }
        int size3 = listB.size();
        k[] kVarArr = new k[size3];
        for (int i10 = 0; i10 < size3; i10++) {
            k kVar = k.f1363u;
            kVarArr[i10] = f.m((String) listB.get(i10));
        }
        int i11 = 0;
        while (true) {
            if (i11 >= size3) {
                strN = null;
                break;
            }
            k kVar2 = (k) this.f24408a.f1963e;
            if (kVar2 == null) {
                j.k("bytes");
                throw null;
            }
            strN = D.n(kVar2, kVarArr, i11);
            if (strN != null) {
                break;
            }
            i11++;
        }
        if (size3 <= 1) {
            strN2 = null;
            break;
        }
        k[] kVarArr2 = (k[]) kVarArr.clone();
        int length = kVarArr2.length - 1;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                strN2 = null;
                break;
            }
            kVarArr2[i12] = f24405b;
            k kVar3 = (k) this.f24408a.f1963e;
            if (kVar3 == null) {
                j.k("bytes");
                throw null;
            }
            strN2 = D.n(kVar3, kVarArr2, i12);
            if (strN2 != null) {
                break;
            }
            i12++;
        }
        if (strN2 == null) {
            strN3 = null;
            break;
        }
        int i13 = size3 - 1;
        int i14 = 0;
        while (true) {
            if (i14 >= i13) {
                strN3 = null;
                break;
            }
            k kVar4 = (k) this.f24408a.f1964f;
            if (kVar4 == null) {
                j.k("exceptionBytes");
                throw null;
            }
            strN3 = D.n(kVar4, kVarArr, i14);
            if (strN3 != null) {
                break;
            }
            i14++;
        }
        if (strN3 != null) {
            listM1 = o.m1("!".concat(strN3), new char[]{'.'});
        } else if (strN == null && strN2 == null) {
            listM1 = f24406c;
        } else {
            List listM2 = strN != null ? o.m1(strN, new char[]{'.'}) : listM1;
            if (strN2 != null) {
                listM1 = o.m1(strN2, new char[]{'.'});
            }
            if (listM2.size() > listM1.size()) {
                listM1 = listM2;
            }
        }
        if (listB.size() == listM1.size() && ((String) listM1.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM1.get(0)).charAt(0) == '!') {
            size = listB.size();
            size2 = listM1.size();
        } else {
            size = listB.size();
            size2 = listM1.size() + 1;
        }
        int i15 = size - size2;
        i lVar = new l(2, b(str));
        if (i15 < 0) {
            throw new IllegalArgumentException(p245z2.a.B(i15, "Requested element count ", " is less than zero.").toString());
        }
        if (i15 != 0) {
            lVar = lVar instanceof d ? ((d) lVar).a(i15) : new c(lVar, i15);
        }
        return G9.k.c0(lVar, ".");
    }
}

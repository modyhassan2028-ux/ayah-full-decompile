package va;

import android.os.Build;
import i7.C;
import i7.D;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public class e implements n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C f23400f = new C(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f23401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f23402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f23403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f23404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f23405e;

    public e(Class cls) throws NoSuchMethodException {
        this.f23401a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        p251z9.j.d(declaredMethod, "getDeclaredMethod(...)");
        this.f23402b = declaredMethod;
        this.f23403c = cls.getMethod("setHostname", String.class);
        this.f23404d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f23405e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // va.n
    public final String a(SSLSocket sSLSocket) {
        if (this.f23401a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f23404d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, H9.a.f3610a);
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                Throwable cause = e11.getCause();
                if (!(cause instanceof NullPointerException) || !p251z9.j.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e11);
                }
            }
        }
        return null;
    }

    @Override // va.n
    public final boolean b(SSLSocket sSLSocket) {
        return this.f23401a.isInstance(sSLSocket);
    }

    @Override // va.n
    public final boolean c() {
        boolean z10 = ua.c.f22993e;
        return ua.c.f22993e;
    }

    @Override // va.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        p251z9.j.e(list, "protocols");
        if (this.f23401a.isInstance(sSLSocket)) {
            try {
                this.f23402b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null && Build.VERSION.SDK_INT <= 23) {
                    this.f23403c.invoke(sSLSocket, str);
                }
                Method method = this.f23405e;
                ua.e eVar = ua.e.f22996a;
                method.invoke(sSLSocket, D.p(list));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}

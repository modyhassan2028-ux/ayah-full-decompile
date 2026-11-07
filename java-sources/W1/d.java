package W1;

import E2.A;
import W.AbstractC0607v1;
import androidx.datastore.preferences.protobuf.AbstractC0744s;
import androidx.datastore.preferences.protobuf.AbstractC0746u;
import androidx.datastore.preferences.protobuf.C0735i;
import androidx.datastore.preferences.protobuf.C0739m;
import androidx.datastore.preferences.protobuf.C0745t;
import androidx.datastore.preferences.protobuf.C0750y;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.W;
import androidx.datastore.preferences.protobuf.c0;
import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0746u {
    private static final d DEFAULT_INSTANCE;
    private static volatile Q PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private H preferences_ = H.f12383s;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        AbstractC0746u.j(d.class, dVar);
    }

    public static H l(d dVar) {
        H h7 = dVar.preferences_;
        if (!h7.f12384r) {
            dVar.preferences_ = h7.b();
        }
        return dVar.preferences_;
    }

    public static b n() {
        return (b) ((AbstractC0744s) DEFAULT_INSTANCE.c(5));
    }

    public static d o(FileInputStream fileInputStream) throws C0750y {
        d dVar = DEFAULT_INSTANCE;
        C0735i c0735i = new C0735i(fileInputStream);
        C0739m c0739mA = C0739m.a();
        AbstractC0746u abstractC0746uI = dVar.i();
        try {
            T t2 = T.f12406c;
            t2.getClass();
            W wA = t2.a(abstractC0746uI.getClass());
            A a9 = (A) c0735i.f3713s;
            if (a9 == null) {
                a9 = new A(c0735i);
            }
            wA.a(abstractC0746uI, a9, c0739mA);
            wA.e(abstractC0746uI);
            if (AbstractC0746u.f(abstractC0746uI, true)) {
                return (d) abstractC0746uI;
            }
            throw new C0750y(new c0().getMessage());
        } catch (c0 e10) {
            throw new C0750y(e10.getMessage());
        } catch (C0750y e11) {
            if (e11.f12520r) {
                throw new C0750y(e11.getMessage(), e11);
            }
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof C0750y) {
                throw ((C0750y) e12.getCause());
            }
            throw new C0750y(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof C0750y) {
                throw ((C0750y) e13.getCause());
            }
            throw e13;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0746u
    public final Object c(int i10) {
        Q c0745t;
        switch (AbstractC0607v1.b(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", c.f9500a});
            case 3:
                return new d();
            case 4:
                return new b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q q10 = PARSER;
                if (q10 != null) {
                    return q10;
                }
                synchronized (d.class) {
                    try {
                        c0745t = PARSER;
                        if (c0745t == null) {
                            c0745t = new C0745t();
                            PARSER = c0745t;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c0745t;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map m() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
    }
}

package W1;

import W.AbstractC0607v1;
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0728b;
import androidx.datastore.preferences.protobuf.AbstractC0744s;
import androidx.datastore.preferences.protobuf.AbstractC0746u;
import androidx.datastore.preferences.protobuf.AbstractC0748w;
import androidx.datastore.preferences.protobuf.C0733g;
import androidx.datastore.preferences.protobuf.C0745t;
import androidx.datastore.preferences.protobuf.InterfaceC0747v;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.V;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0746u {
    private static final f DEFAULT_INSTANCE;
    private static volatile Q PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0747v strings_ = U.f12409u;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC0746u.j(f.class, fVar);
    }

    public static void l(f fVar, Iterable iterable) {
        InterfaceC0747v interfaceC0747v = fVar.strings_;
        if (!((AbstractC0728b) interfaceC0747v).f12433r) {
            U u8 = (U) interfaceC0747v;
            int i10 = u8.f12411t;
            fVar.strings_ = u8.d(i10 == 0 ? 10 : i10 * 2);
        }
        RandomAccess randomAccess = fVar.strings_;
        Charset charset = AbstractC0748w.f12518a;
        if (iterable instanceof A) {
            List listK = ((A) iterable).k();
            if (randomAccess != null) {
                throw new ClassCastException();
            }
            ((U) randomAccess).getClass();
            Iterator it = listK.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof C0733g) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                C0733g.d(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof S) {
            ((AbstractC0728b) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((U) randomAccess).f12411t);
        }
        U u10 = (U) randomAccess;
        int i11 = u10.f12411t;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (u10.f12411t - i11) + " is null.";
                for (int i12 = u10.f12411t - 1; i12 >= i11; i12--) {
                    u10.remove(i12);
                }
                throw new NullPointerException(str);
            }
            u10.add(obj);
        }
    }

    public static f m() {
        return DEFAULT_INSTANCE;
    }

    public static e o() {
        return (e) ((AbstractC0744s) DEFAULT_INSTANCE.c(5));
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
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new f();
            case 4:
                return new e(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q q10 = PARSER;
                if (q10 != null) {
                    return q10;
                }
                synchronized (f.class) {
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

    public final InterfaceC0747v n() {
        return this.strings_;
    }
}

package R6;

import U6.t;
import U6.y;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends p038d7.a implements t {
    public final int g;

    public m(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        y.a(bArr.length == 25);
        this.g = Arrays.hashCode(bArr);
    }

    public static byte[] F0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // p038d7.a
    public final boolean E0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            a7.a aVarB = b();
            parcel2.writeNoException();
            p049e7.a.c(parcel2, aVarB);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.g);
        return true;
    }

    public abstract byte[] G0();

    @Override // U6.t
    public final a7.a b() {
        return new a7.b(G0());
    }

    public final boolean equals(Object obj) {
        a7.a aVarB;
        if (obj != null && (obj instanceof t)) {
            try {
                t tVar = (t) obj;
                if (tVar.h() == this.g && (aVarB = tVar.b()) != null) {
                    return Arrays.equals(G0(), (byte[]) a7.b.G0(aVarB));
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    @Override // U6.t
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        return this.g;
    }
}

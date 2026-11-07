package K8;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import p050e8.f;
import p050e8.h;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f5313c = {"*", "FCM", "GCM", ""};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f5314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5315b;

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public c(f fVar) {
        fVar.a();
        this.f5314a = fVar.f15843a.getSharedPreferences("com.google.android.gms.appid", 0);
        fVar.a();
        h hVar = fVar.f15845c;
        String str = hVar.f15860e;
        if (str == null) {
            fVar.a();
            str = hVar.f15857b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.f5315b = str;
    }

    public final String a() {
        String string;
        synchronized (this.f5314a) {
            string = this.f5314a.getString("|S|id", null);
        }
        return string;
    }

    public final String b() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f5314a) {
            String strEncodeToString = null;
            String string = this.f5314a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
                Log.w("ContentValues", "Invalid key stored " + e10);
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return strEncodeToString;
        }
    }
}

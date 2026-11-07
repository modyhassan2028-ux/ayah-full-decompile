package R6;

import U6.y;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f7257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f7259c;

    public /* synthetic */ k(boolean z10, String str, n nVar) {
        this.f7257a = z10;
        this.f7258b = str;
        this.f7259c = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z10 = this.f7257a;
        String str = this.f7258b;
        n nVar = this.f7259c;
        String str2 = (z10 || !p.b(str, nVar, true, false).f7275a) ? "not allowed" : "debug cert rejected";
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
                if (messageDigest != null) {
                    break;
                }
                i10++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        y.f(messageDigest);
        byte[] bArrDigest = messageDigest.digest(nVar.f7262h);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i11 = 0;
        for (byte b5 : bArrDigest) {
            char[] cArr2 = Y6.b.f10439b;
            cArr[i11] = cArr2[(b5 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b5 & 15];
            i11 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z10 + ", ver=12451000.false";
    }
}

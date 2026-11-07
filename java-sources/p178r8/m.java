package p178r8;

import Da.r;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import p160p8.g;

/* JADX INFO: loaded from: classes.dex */
public final class m implements d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Charset f21632t = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final File f21633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public l f21634s;

    public m(File file) {
        this.f21633r = file;
    }

    public final void a() {
        File file = this.f21633r;
        if (this.f21634s == null) {
            try {
                this.f21634s = new l(file);
            } catch (IOException e10) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e10);
            }
        }
    }

    @Override // p178r8.d
    public final void c() {
        g.b(this.f21634s, "There was a problem closing the Crashlytics log file.");
        this.f21634s = null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @Override // p178r8.d
    public final String f() {
        r rVar;
        byte[] bArr;
        if (this.f21633r.exists()) {
            a();
            l lVar = this.f21634s;
            if (lVar == null) {
                rVar = null;
            } else {
                int[] iArr = {0};
                byte[] bArr2 = new byte[lVar.L()];
                try {
                    this.f21634s.n(new f(bArr2, iArr));
                } catch (IOException e10) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e10);
                }
                rVar = new r(iArr[0], 9, bArr2);
            }
        } else {
            rVar = null;
        }
        if (rVar == null) {
            bArr = null;
        } else {
            int i10 = rVar.f1387s;
            bArr = new byte[i10];
            System.arraycopy((byte[]) rVar.f1388t, 0, bArr, 0, i10);
        }
        if (bArr != null) {
            return new String(bArr, f21632t);
        }
        return null;
    }

    @Override // p178r8.d
    public final void m(long j, String str) {
        a();
        if (this.f21634s == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.f21634s.b(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f21632t));
            while (!this.f21634s.s() && this.f21634s.L() > 65536) {
                this.f21634s.E();
            }
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e10);
        }
    }
}

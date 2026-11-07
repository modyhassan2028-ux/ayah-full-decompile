package p056f2;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class V extends Writer {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final StringBuilder f16036s = new StringBuilder(128);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f16035r = "FragmentManager";

    public final void b() {
        StringBuilder sb = this.f16036s;
        if (sb.length() > 0) {
            Log.d(this.f16035r, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        b();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                b();
            } else {
                this.f16036s.append(c10);
            }
        }
    }
}

package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0748w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f12518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f12519b;

    static {
        Charset.forName("US-ASCII");
        f12518a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f12519b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0734h(bArr, 0, 0, false).i(0);
        } catch (C0750y e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}

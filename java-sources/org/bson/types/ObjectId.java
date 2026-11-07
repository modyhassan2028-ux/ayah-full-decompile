package org.bson.types;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import p017b7.g;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public final class ObjectId implements Comparable<ObjectId>, Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f20496v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final short f20497w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final AtomicInteger f20498x = new AtomicInteger(new SecureRandom().nextInt());

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final char[] f20499y = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f20500r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f20501s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f20502t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final short f20503u;

    static {
        try {
            SecureRandom secureRandom = new SecureRandom();
            f20496v = secureRandom.nextInt(16777216);
            f20497w = (short) secureRandom.nextInt(32768);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ObjectId(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        int length = str.length();
        if (length == 24) {
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ((cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'f') || (cCharAt >= 'A' && cCharAt <= 'F'))) {
                }
            }
            byte[] bArr = new byte[12];
            for (int i11 = 0; i11 < 12; i11++) {
                int i12 = i11 * 2;
                bArr[i11] = (byte) Integer.parseInt(str.substring(i12, i12 + 2), 16);
            }
            this(bArr);
            return;
        }
        throw new IllegalArgumentException(a.D("invalid hexadecimal representation of an ObjectId: [", str, "]"));
    }

    public static int a(byte b5, byte b10, byte b11, byte b12) {
        return (b5 << 24) | ((b10 & 255) << 16) | ((b11 & 255) << 8) | (b12 & 255);
    }

    public final byte[] b() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        g.j0(byteBufferAllocate, "buffer");
        if (byteBufferAllocate.remaining() < 12) {
            throw new IllegalArgumentException("state should be: buffer.remaining() >=12");
        }
        int i10 = this.f20500r;
        byteBufferAllocate.put((byte) (i10 >> 24));
        byteBufferAllocate.put((byte) (i10 >> 16));
        byteBufferAllocate.put((byte) (i10 >> 8));
        byteBufferAllocate.put((byte) i10);
        int i11 = this.f20502t;
        byteBufferAllocate.put((byte) (i11 >> 16));
        byteBufferAllocate.put((byte) (i11 >> 8));
        byteBufferAllocate.put((byte) i11);
        short s10 = this.f20503u;
        byteBufferAllocate.put((byte) (s10 >> 8));
        byteBufferAllocate.put((byte) s10);
        int i12 = this.f20501s;
        byteBufferAllocate.put((byte) (i12 >> 16));
        byteBufferAllocate.put((byte) (i12 >> 8));
        byteBufferAllocate.put((byte) i12);
        return byteBufferAllocate.array();
    }

    @Override // java.lang.Comparable
    public final int compareTo(ObjectId objectId) {
        ObjectId objectId2 = objectId;
        objectId2.getClass();
        byte[] bArrB = b();
        byte[] bArrB2 = objectId2.b();
        for (int i10 = 0; i10 < 12; i10++) {
            byte b5 = bArrB[i10];
            byte b10 = bArrB2[i10];
            if (b5 != b10) {
                return (b5 & 255) < (b10 & 255) ? -1 : 1;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ObjectId.class != obj.getClass()) {
            return false;
        }
        ObjectId objectId = (ObjectId) obj;
        return this.f20501s == objectId.f20501s && this.f20500r == objectId.f20500r && this.f20502t == objectId.f20502t && this.f20503u == objectId.f20503u;
    }

    public final int hashCode() {
        return (((((this.f20500r * 31) + this.f20501s) * 31) + this.f20502t) * 31) + this.f20503u;
    }

    public final String toString() {
        char[] cArr = new char[24];
        int i10 = 0;
        for (byte b5 : b()) {
            int i11 = i10 + 1;
            char[] cArr2 = f20499y;
            cArr[i10] = cArr2[(b5 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b5 & 15];
        }
        return new String(cArr);
    }

    public ObjectId() {
        this(new Date());
    }

    @Deprecated
    public ObjectId(int i10, int i11, short s10, int i12) {
        this(i10, i11, s10, i12, true);
    }

    public ObjectId(int i10, int i11) {
        this(i10, i11, true);
    }

    private ObjectId(int i10, int i11, boolean z10) {
        this(i10, f20496v, f20497w, i11, z10);
    }

    private ObjectId(int i10, int i11, short s10, int i12, boolean z10) {
        if ((i11 & (-16777216)) != 0) {
            throw new IllegalArgumentException("The machine identifier must be between 0 and 16777215 (it must fit in three bytes).");
        }
        if (z10 && (i12 & (-16777216)) != 0) {
            throw new IllegalArgumentException("The counter must be between 0 and 16777215 (it must fit in three bytes).");
        }
        this.f20500r = i10;
        this.f20501s = 16777215 & i12;
        this.f20502t = i11;
        this.f20503u = s10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectId(byte[] bArr) {
        this(ByteBuffer.wrap(bArr));
        g.j0(bArr, "bytes");
        if (bArr.length != 12) {
            throw new IllegalArgumentException("state should be: bytes has length of 12");
        }
    }

    public ObjectId(ByteBuffer byteBuffer) {
        g.j0(byteBuffer, "buffer");
        if (byteBuffer.remaining() >= 12) {
            this.f20500r = a(byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
            this.f20502t = a((byte) 0, byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
            this.f20503u = (short) (((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255));
            this.f20501s = a((byte) 0, byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
            return;
        }
        throw new IllegalArgumentException("state should be: buffer.remaining() >=12");
    }

    public ObjectId(int i10, int i11, int i12) {
        this(new byte[]{(byte) (i10 >> 24), (byte) (i10 >> 16), (byte) (i10 >> 8), (byte) i10, (byte) (i11 >> 24), (byte) (i11 >> 16), (byte) (i11 >> 8), (byte) i11, (byte) (i12 >> 24), (byte) (i12 >> 16), (byte) (i12 >> 8), (byte) i12});
    }

    public ObjectId(Date date) {
        this((int) (date.getTime() / 1000), f20498x.getAndIncrement() & 16777215, false);
    }

    public ObjectId(Date date, int i10) {
        this((int) (date.getTime() / 1000), i10, true);
    }

    @Deprecated
    public ObjectId(Date date, int i10, short s10, int i11) {
        this((int) (date.getTime() / 1000), i10, s10, i11);
    }
}

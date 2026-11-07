package p178r8;

import G1.f;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Closeable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Logger f21625x = Logger.getLogger(l.class.getName());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RandomAccessFile f21626r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f21627s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f21628t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i f21629u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i f21630v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final byte[] f21631w;

    public l(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f21631w = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    V(bArr2, i10, iArr[i11]);
                    i10 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f21626r = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iA = A(0, bArr);
        this.f21627s = iA;
        if (iA > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f21627s + ", Actual length: " + randomAccessFile2.length());
        }
        this.f21628t = A(4, bArr);
        int iA2 = A(8, bArr);
        int iA3 = A(12, bArr);
        this.f21629u = w(iA2);
        this.f21630v = w(iA3);
    }

    public static int A(int i10, byte[] bArr) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    public static void V(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public final synchronized void E() {
        try {
            if (s()) {
                throw new NoSuchElementException();
            }
            if (this.f21628t == 1) {
                e();
            } else {
                i iVar = this.f21629u;
                int iN = N(iVar.f21620a + 4 + iVar.f21621b);
                F(iN, this.f21631w, 0, 4);
                int iA = A(0, this.f21631w);
                O(this.f21627s, this.f21628t - 1, iN, this.f21630v.f21620a);
                this.f21628t--;
                this.f21629u = new i(iN, iA);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void F(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iN = N(i10);
        int i13 = iN + i12;
        int i14 = this.f21627s;
        RandomAccessFile randomAccessFile = this.f21626r;
        if (i13 <= i14) {
            randomAccessFile.seek(iN);
            randomAccessFile.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iN;
        randomAccessFile.seek(iN);
        randomAccessFile.readFully(bArr, i11, i15);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i11 + i15, i12 - i15);
    }

    public final void H(byte[] bArr, int i10, int i11) throws IOException {
        int iN = N(i10);
        int i12 = iN + i11;
        int i13 = this.f21627s;
        RandomAccessFile randomAccessFile = this.f21626r;
        if (i12 <= i13) {
            randomAccessFile.seek(iN);
            randomAccessFile.write(bArr, 0, i11);
            return;
        }
        int i14 = i13 - iN;
        randomAccessFile.seek(iN);
        randomAccessFile.write(bArr, 0, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i14, i11 - i14);
    }

    public final int L() {
        if (this.f21628t == 0) {
            return 16;
        }
        i iVar = this.f21630v;
        int i10 = iVar.f21620a;
        int i11 = this.f21629u.f21620a;
        return i10 >= i11 ? (i10 - i11) + 4 + iVar.f21621b + 16 : (((i10 + 4) + iVar.f21621b) + this.f21627s) - i11;
    }

    public final int N(int i10) {
        int i11 = this.f21627s;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public final void O(int i10, int i11, int i12, int i13) throws IOException {
        int[] iArr = {i10, i11, i12, i13};
        int i14 = 0;
        int i15 = 0;
        while (true) {
            byte[] bArr = this.f21631w;
            if (i14 >= 4) {
                RandomAccessFile randomAccessFile = this.f21626r;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                V(bArr, i15, iArr[i14]);
                i15 += 4;
                i14++;
            }
        }
    }

    public final void b(byte[] bArr) {
        int iN;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    i(length);
                    boolean zS = s();
                    if (zS) {
                        iN = 16;
                    } else {
                        i iVar = this.f21630v;
                        iN = N(iVar.f21620a + 4 + iVar.f21621b);
                    }
                    i iVar2 = new i(iN, length);
                    V(this.f21631w, 0, length);
                    H(this.f21631w, iN, 4);
                    H(bArr, iN + 4, length);
                    O(this.f21627s, this.f21628t + 1, zS ? iN : this.f21629u.f21620a, iN);
                    this.f21630v = iVar2;
                    this.f21628t++;
                    if (zS) {
                        this.f21629u = iVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f21626r.close();
    }

    public final synchronized void e() {
        O(4096, 0, 0, 0);
        this.f21628t = 0;
        i iVar = i.f21619c;
        this.f21629u = iVar;
        this.f21630v = iVar;
        if (this.f21627s > 4096) {
            RandomAccessFile randomAccessFile = this.f21626r;
            randomAccessFile.setLength(4096);
            randomAccessFile.getChannel().force(true);
        }
        this.f21627s = 4096;
    }

    public final void i(int i10) throws IOException {
        int i11 = i10 + 4;
        int iL = this.f21627s - L();
        if (iL >= i11) {
            return;
        }
        int i12 = this.f21627s;
        do {
            iL += i12;
            i12 <<= 1;
        } while (iL < i11);
        RandomAccessFile randomAccessFile = this.f21626r;
        randomAccessFile.setLength(i12);
        randomAccessFile.getChannel().force(true);
        i iVar = this.f21630v;
        int iN = N(iVar.f21620a + 4 + iVar.f21621b);
        if (iN < this.f21629u.f21620a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f21627s);
            long j = iN - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f21630v.f21620a;
        int i14 = this.f21629u.f21620a;
        if (i13 < i14) {
            int i15 = (this.f21627s + i13) - 16;
            O(i12, this.f21628t, i14, i15);
            this.f21630v = new i(i15, this.f21630v.f21621b);
        } else {
            O(i12, this.f21628t, i14, i13);
        }
        this.f21627s = i12;
    }

    public final synchronized void n(k kVar) {
        int iN = this.f21629u.f21620a;
        for (int i10 = 0; i10 < this.f21628t; i10++) {
            i iVarW = w(iN);
            kVar.a(new j(this, iVarW), iVarW.f21621b);
            iN = N(iVarW.f21620a + 4 + iVarW.f21621b);
        }
    }

    public final synchronized boolean s() {
        return this.f21628t == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(l.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f21627s);
        sb.append(", size=");
        sb.append(this.f21628t);
        sb.append(", first=");
        sb.append(this.f21629u);
        sb.append(", last=");
        sb.append(this.f21630v);
        sb.append(", element lengths=[");
        try {
            n(new f((Object) sb, false));
        } catch (IOException e10) {
            f21625x.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final i w(int i10) throws IOException {
        if (i10 == 0) {
            return i.f21619c;
        }
        RandomAccessFile randomAccessFile = this.f21626r;
        randomAccessFile.seek(i10);
        return new i(i10, randomAccessFile.readInt());
    }
}

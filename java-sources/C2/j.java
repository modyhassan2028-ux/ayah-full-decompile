package C2;

import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f715d;

    public j(int i10, int i11, long j, long j10) {
        this.f712a = i10;
        this.f713b = i11;
        this.f714c = j;
        this.f715d = j10;
    }

    public static j a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            j jVar = new j(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return jVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f712a);
            dataOutputStream.writeInt(this.f713b);
            dataOutputStream.writeLong(this.f714c);
            dataOutputStream.writeLong(this.f715d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof j)) {
            j jVar = (j) obj;
            if (this.f713b == jVar.f713b && this.f714c == jVar.f714c && this.f712a == jVar.f712a && this.f715d == jVar.f715d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f713b), Long.valueOf(this.f714c), Integer.valueOf(this.f712a), Long.valueOf(this.f715d));
    }
}

package Da;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public interface i extends x, WritableByteChannel {
    i D();

    i T(String str);

    long W(y yVar);

    h a();

    @Override // Da.x, java.io.Flushable
    void flush();

    i h(String str, int i10, int i11);

    i v(k kVar);

    i write(byte[] bArr);

    i writeByte(int i10);

    i writeInt(int i10);

    i writeShort(int i10);
}

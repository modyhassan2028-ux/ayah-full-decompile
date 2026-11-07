package Da;

import java.nio.channels.ReadableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public interface j extends y, ReadableByteChannel {
    String G(long j);

    long K(k kVar);

    int Q(p pVar);

    void S(long j);

    long Y();

    h a();

    long g(k kVar);

    k k(long j);

    t peek();

    byte readByte();

    int readInt();

    short readShort();

    boolean request(long j);

    void skip(long j);

    String u();

    boolean y();
}

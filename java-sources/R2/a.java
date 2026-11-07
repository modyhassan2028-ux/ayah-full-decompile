package R2;

import S2.i;
import android.database.Cursor;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface a extends Closeable {
    Cursor B(O8.c cVar);

    void J();

    void M();

    void beginTransaction();

    void f();

    boolean isOpen();

    void l(String str);

    i q(String str);

    void x();

    boolean z();
}

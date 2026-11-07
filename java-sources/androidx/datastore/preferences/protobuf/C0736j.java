package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0736j extends IOException {
    public /* synthetic */ C0736j(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0736j(long j, long j10, int i10, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j + ", limit: " + j10 + ", len: " + i10), indexOutOfBoundsException);
        Locale locale = Locale.US;
    }
}
